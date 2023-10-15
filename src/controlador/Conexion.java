package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class Conexion {

    private File pathFile;
    private RandomAccessFile raf = null;

    private Conexion() {
    }

    protected Conexion(File pathFile) {
        this.pathFile = pathFile;
        if (pathFile.exists() && pathFile.isFile()) {
            try {
                this.raf = new RandomAccessFile(pathFile, "rw");
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Archivo no encontrado.");
            } catch (SecurityException ex) {
                JOptionPane.showMessageDialog(null, "No tiene permiso para modificar el archivo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe elegir un archivo compatible.");
        }
    }

    protected RandomAccessFile getRaf() {
        return this.raf;
    }
}
