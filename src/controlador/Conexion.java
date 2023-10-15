package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class Conexion {

    private final String PATH_FICHERO = "";
    private File file = null;
    private RandomAccessFile raf = null;

    public Conexion() {
        this.file = new File(PATH_FICHERO);
        if (this.file.exists() && this.file.isFile()) {
            try {
                raf = new RandomAccessFile(this.file, "rw");
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
