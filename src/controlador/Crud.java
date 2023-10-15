package controlador;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import modelo.Alumno;

public class Crud {
    private String pathArchivo;
    private Conexion conexion = null;
    private RandomAccessFile raf = null;

    private final int TAMANIO_REGISTRO = 220;

    private Crud(){}
    public Crud(String pathArchivo) {
        this.conexion = new Conexion(pathArchivo);
        this.raf = conexion.getRaf();
    }

    public void alta(Alumno alumno) throws IOException {
        this.situarPunteroEnId(alumno.getNumMatricula());
        this.raf.writeInt(alumno.getNumMatricula());
        this.raf.writeChars(alumno.getNombre());
        this.raf.writeInt(alumno.getFecNac().getYear());
        this.raf.writeInt(alumno.getFecNac().getMonthValue());
        this.raf.writeInt(alumno.getFecNac().getDayOfMonth());
        this.raf.writeFloat(alumno.getNota());
    }

    public void baja(int numMatricula) throws IOException {
        this.situarPunteroEnId(numMatricula);
        this.raf.writeInt(0);
    }

    public void modificar(Alumno alumno) throws IOException {
        //Modificar realmente es como dar de alta, pero al id ya existe, y si 
        //no existe, se preguntará si se quiere crear, pero esa funcionalidad
        //de preguntar la voy a implementar en la parte de la vista        
        this.alta(alumno);
    }

    public Alumno buscar(int numMatricula) throws IOException {
        Alumno alumno = new Alumno();
        if (this.alumnoExiste(numMatricula)) {
            this.situarPunteroEnId(numMatricula);
            alumno.setNumMatricula(this.raf.readInt());
            StringBuilder nombre = new StringBuilder();
            for (int i = 0; i < 200; i++) {
                nombre.append(this.raf.readChar());
            }
            alumno.setNombre(nombre.toString());
            alumno.setFecNac(LocalDate.of(this.raf.readInt(), this.raf.readInt(), this.raf.readInt()));
            alumno.setNota(this.raf.readFloat());
        }
        return alumno;
    }

    public boolean alumnoExiste(int numMatricula) throws IOException {
        this.situarPunteroEnId(numMatricula);
        return this.raf.readInt() == numMatricula;
    }

    private void situarPunteroEnId(int numMatricula) throws IOException {
        this.raf.seek((numMatricula - 1) * TAMANIO_REGISTRO);
    }

}
