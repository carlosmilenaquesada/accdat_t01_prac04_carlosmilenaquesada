package modelo;

import java.time.LocalDate;

public class Alumno {

    //El numMatricula también hace de id en el fichero raf
    private int numMatricula;
    //EL nombre es un string, pero se guarda en el fichero raf como 100 chars.
    private String nombre;
    //La fecha es un LocalDate, pero se guarda en el fichero raf como 3 int (año, mes, día)
    private LocalDate fecNac;//LocalDate.of(2023, 12, 31)
    private float nota;

    public Alumno() {
        this.numMatricula = Integer.MIN_VALUE;
        this.nombre = "";
        this.fecNac = LocalDate.MIN;
        this.nota = Float.MIN_VALUE;
    }

    public Alumno(int numMatricula, String nombre, LocalDate fecNac, float nota) {
        this.numMatricula = numMatricula;
        this.setNombre(nombre);
        this.fecNac = fecNac;
        this.nota = nota;
    }

    public int getNumMatricula() {
        return this.numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 100) {            
            this.nombre = nombre.substring(0, 100);
        }else{
            this.nombre = nombre.concat(new String(new char[100 - nombre.length()]));
        }
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public int hashCode() {
        return this.numMatricula;
    }

    @Override
    public boolean equals(Object obj) {
        boolean esIgual = false;
        if (obj instanceof Alumno) {
            Alumno alumno = (Alumno) obj;
            if (alumno.getNumMatricula() == this.getNumMatricula()) {
                esIgual = true;
            }
        }
        return esIgual;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numMatricula=" + numMatricula + ", nombre=" + nombre + ", fecNac=" + fecNac + ", nota=" + nota + '}';
    }

}
