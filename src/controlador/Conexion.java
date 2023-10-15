package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class Conexion {

    private String pathFichero;
    private RandomAccessFile raf = null;

    private Conexion(){}
    
    public Conexion(String pathFichero) {
        File file = new File(pathFichero);
        if (file.exists() && file.isFile()) {
            try {
                this.raf = new RandomAccessFile(file, "rw");
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Archivo no encontrado.");
            } catch (SecurityException ex) {
                JOptionPane.showMessageDialog(null, "No tiene permiso para modificar el archivo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe elegir un archivo compatible.");
        }
    }

    public RandomAccessFile getRaf() {
        return this.raf;
    }
}
