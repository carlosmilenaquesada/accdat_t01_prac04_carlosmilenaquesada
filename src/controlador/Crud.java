package controlador;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import modelo.Alumno;

public class Crud {
    private Conexion conexion = null;

    private final int TAMANIO_REGISTRO = 220;

    private Crud(){}
    
    public Crud(File pathFile) {
        this.conexion = new Conexion(pathFile);
    }

    public void alta(Alumno alumno) throws IOException {
        this.situarPunteroEnId(alumno.getNumMatricula());
        this.conexion.getRaf().writeInt(alumno.getNumMatricula());
        this.conexion.getRaf().writeChars(alumno.getNombre());
        this.conexion.getRaf().writeInt(alumno.getFecNac().getYear());
        this.conexion.getRaf().writeInt(alumno.getFecNac().getMonthValue());
        this.conexion.getRaf().writeInt(alumno.getFecNac().getDayOfMonth());
        this.conexion.getRaf().writeFloat(alumno.getNota());
    }

    public void baja(int numMatricula) throws IOException {
        this.situarPunteroEnId(numMatricula);
       this.conexion.getRaf().writeInt(0);
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
            alumno.setNumMatricula(this.conexion.getRaf().readInt());
            StringBuilder nombre = new StringBuilder();
            for (int i = 0; i < 200; i++) {
                nombre.append(this.conexion.getRaf().readChar());
            }
            alumno.setNombre(nombre.toString());
            alumno.setFecNac(LocalDate.of(this.conexion.getRaf().readInt(), this.conexion.getRaf().readInt(), this.conexion.getRaf().readInt()));
            alumno.setNota(this.conexion.getRaf().readFloat());
        }
        return alumno;
    }

    public boolean alumnoExiste(int numMatricula) throws IOException {
        this.situarPunteroEnId(numMatricula);
        return this.conexion.getRaf().readInt() == numMatricula;
    }

    private void situarPunteroEnId(int numMatricula) throws IOException {
        this.conexion.getRaf().seek((numMatricula - 1) * TAMANIO_REGISTRO);
    }

}
