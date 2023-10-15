package vista;

import controlador.Crud;
import java.awt.Color;
import java.time.DateTimeException;
import java.time.LocalDate;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Alumno;

public class PrincipalJFrame extends javax.swing.JFrame {

    //Constantes
    private static final String REGEX_MATRICULA = "^[1-9]\\d{0,8}$";//Solo permite números enteros positivos de 9 dígitos o menos
    private static final String REGEX_NOMBRE = "^.{0,100}$";//Solo permite cadenas de texto de una longitud de entre 0 y 100 caracteres.
    private static final String REGEX_FECHA = "\\d{4}-\\d{2}-\\d{2}";//Solo permite fechas con formato yyyy-mm-dd
    private static final String REGEX_NOTA = "^(10(\\.0{1,2})?|[0-9](\\.\\d{1,2})?)$";//Solo permite números del 0 al 10 enteros o no más de 2 decimales

    private static final Color COLOR_ERROR = Color.RED;
    private static final Color COLOR_POR_DEFECTO = Color.WHITE;

    //CRUD
    private Crud crud = null;

    public PrincipalJFrame() {
        initMenuInicial();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAlta = new javax.swing.JPanel();
        jLabelAlta = new javax.swing.JLabel();
        jLabelAltaMatricula = new javax.swing.JLabel();
        jLabelAltaNombre = new javax.swing.JLabel();
        jLabelAltaFecNac = new javax.swing.JLabel();
        jLabelAltaNota = new javax.swing.JLabel();
        jTextFieldAltaMatricula = new javax.swing.JTextField();
        jTextFieldAltaNombre = new javax.swing.JTextField();
        jTextFieldAltaFecNac = new javax.swing.JTextField();
        jTextFieldAltaNota = new javax.swing.JTextField();
        jLabelAltaMensaje = new javax.swing.JLabel();
        jButtonAlta = new javax.swing.JButton();
        jPanelBaja = new javax.swing.JPanel();
        jLabelBaja = new javax.swing.JLabel();
        jLabelBajaMatricula = new javax.swing.JLabel();
        jLabelBajaNombre = new javax.swing.JLabel();
        jLabelBajaFecNac = new javax.swing.JLabel();
        jLabelBajaNota = new javax.swing.JLabel();
        jTextFieldBajaMatricula = new javax.swing.JTextField();
        jTextFieldBajaNombre = new javax.swing.JTextField();
        jTextFieldBajaFecNac = new javax.swing.JTextField();
        jTextFieldBajaNota = new javax.swing.JTextField();
        jLabelBajaMensaje = new javax.swing.JLabel();
        jButtonBaja = new javax.swing.JButton();
        jPanelModificar = new javax.swing.JPanel();
        jLabelModificar = new javax.swing.JLabel();
        jLabelModificarMatricula = new javax.swing.JLabel();
        jLabelModificarNombre = new javax.swing.JLabel();
        jLabelModificarEdad = new javax.swing.JLabel();
        jLabelModificarNota = new javax.swing.JLabel();
        jTextFieldModificarMatricula = new javax.swing.JTextField();
        jTextFieldModificarNombre = new javax.swing.JTextField();
        jTextFieldModificarFecNac = new javax.swing.JTextField();
        jTextFieldModificarNota = new javax.swing.JTextField();
        jLabelModificarMensaje = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jPanelBuscar = new javax.swing.JPanel();
        jLabelBuscar = new javax.swing.JLabel();
        jLabelBuscarMatricula = new javax.swing.JLabel();
        jLabelBuscarNombre = new javax.swing.JLabel();
        jLabelBuscarEdad = new javax.swing.JLabel();
        jLabelBuscarNota = new javax.swing.JLabel();
        jTextFieldBuscarMatricula = new javax.swing.JTextField();
        jTextFieldBuscarNombre = new javax.swing.JTextField();
        jTextFieldBuscarFecNac = new javax.swing.JTextField();
        jTextFieldBuscarNota = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        jTableTabla = new javax.swing.JTable();
        jButtonActualizarTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de alumnos");
        setBounds(new java.awt.Rectangle(0, 0, 560, 700));
        setMaximumSize(new java.awt.Dimension(560, 700));
        setMinimumSize(new java.awt.Dimension(560, 700));
        setPreferredSize(new java.awt.Dimension(560, 700));
        setSize(new java.awt.Dimension(560, 700));
        getContentPane().setLayout(null);

        jPanelAlta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelAlta.setLayout(null);

        jLabelAlta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelAlta.setText("Alta");
        jPanelAlta.add(jLabelAlta);
        jLabelAlta.setBounds(10, 8, 200, 25);

        jLabelAltaMatricula.setText("Nº Matricula");
        jPanelAlta.add(jLabelAltaMatricula);
        jLabelAltaMatricula.setBounds(10, 33, 65, 25);

        jLabelAltaNombre.setText("Nombre");
        jPanelAlta.add(jLabelAltaNombre);
        jLabelAltaNombre.setBounds(10, 58, 65, 25);

        jLabelAltaFecNac.setText("Fecha nac.");
        jPanelAlta.add(jLabelAltaFecNac);
        jLabelAltaFecNac.setBounds(10, 83, 65, 25);

        jLabelAltaNota.setText("Nota");
        jPanelAlta.add(jLabelAltaNota);
        jLabelAltaNota.setBounds(10, 108, 65, 25);
        jPanelAlta.add(jTextFieldAltaMatricula);
        jTextFieldAltaMatricula.setBounds(82, 33, 128, 25);
        jPanelAlta.add(jTextFieldAltaNombre);
        jTextFieldAltaNombre.setBounds(82, 58, 128, 25);
        jPanelAlta.add(jTextFieldAltaFecNac);
        jTextFieldAltaFecNac.setBounds(82, 83, 128, 25);
        jPanelAlta.add(jTextFieldAltaNota);
        jTextFieldAltaNota.setBounds(82, 108, 128, 25);

        jLabelAltaMensaje.setText("placeholderplaceholderplaceholder");
        jPanelAlta.add(jLabelAltaMensaje);
        jLabelAltaMensaje.setBounds(10, 138, 200, 25);

        jButtonAlta.setText("Alta");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });
        jPanelAlta.add(jButtonAlta);
        jButtonAlta.setBounds(130, 167, 80, 23);

        getContentPane().add(jPanelAlta);
        jPanelAlta.setBounds(10, 10, 220, 200);

        jPanelBaja.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBaja.setLayout(null);

        jLabelBaja.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelBaja.setText("Baja");
        jPanelBaja.add(jLabelBaja);
        jLabelBaja.setBounds(10, 8, 200, 25);

        jLabelBajaMatricula.setText("Nº Matricula");
        jPanelBaja.add(jLabelBajaMatricula);
        jLabelBajaMatricula.setBounds(10, 33, 65, 25);

        jLabelBajaNombre.setText("Nombre");
        jPanelBaja.add(jLabelBajaNombre);
        jLabelBajaNombre.setBounds(10, 58, 65, 25);

        jLabelBajaFecNac.setText("Fecha nac.");
        jPanelBaja.add(jLabelBajaFecNac);
        jLabelBajaFecNac.setBounds(10, 83, 65, 25);

        jLabelBajaNota.setText("Nota");
        jPanelBaja.add(jLabelBajaNota);
        jLabelBajaNota.setBounds(10, 108, 65, 25);
        jPanelBaja.add(jTextFieldBajaMatricula);
        jTextFieldBajaMatricula.setBounds(82, 33, 128, 25);
        jPanelBaja.add(jTextFieldBajaNombre);
        jTextFieldBajaNombre.setBounds(82, 58, 128, 25);
        jPanelBaja.add(jTextFieldBajaFecNac);
        jTextFieldBajaFecNac.setBounds(82, 83, 128, 25);
        jPanelBaja.add(jTextFieldBajaNota);
        jTextFieldBajaNota.setBounds(82, 108, 128, 25);

        jLabelBajaMensaje.setText("placeholderplaceholderplaceholder");
        jPanelBaja.add(jLabelBajaMensaje);
        jLabelBajaMensaje.setBounds(10, 138, 200, 25);

        jButtonBaja.setText("Baja");
        jPanelBaja.add(jButtonBaja);
        jButtonBaja.setBounds(130, 167, 80, 23);

        getContentPane().add(jPanelBaja);
        jPanelBaja.setBounds(10, 220, 220, 200);

        jPanelModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelModificar.setLayout(null);

        jLabelModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelModificar.setText("Modificar");
        jPanelModificar.add(jLabelModificar);
        jLabelModificar.setBounds(10, 8, 200, 25);

        jLabelModificarMatricula.setText("Nº Matricula");
        jPanelModificar.add(jLabelModificarMatricula);
        jLabelModificarMatricula.setBounds(10, 33, 65, 25);

        jLabelModificarNombre.setText("Nombre");
        jPanelModificar.add(jLabelModificarNombre);
        jLabelModificarNombre.setBounds(10, 58, 65, 25);

        jLabelModificarEdad.setText("Fecha nac.");
        jPanelModificar.add(jLabelModificarEdad);
        jLabelModificarEdad.setBounds(10, 83, 65, 25);

        jLabelModificarNota.setText("Nota");
        jPanelModificar.add(jLabelModificarNota);
        jLabelModificarNota.setBounds(10, 108, 65, 25);
        jPanelModificar.add(jTextFieldModificarMatricula);
        jTextFieldModificarMatricula.setBounds(82, 33, 128, 25);
        jPanelModificar.add(jTextFieldModificarNombre);
        jTextFieldModificarNombre.setBounds(82, 58, 128, 25);
        jPanelModificar.add(jTextFieldModificarFecNac);
        jTextFieldModificarFecNac.setBounds(82, 83, 128, 25);
        jPanelModificar.add(jTextFieldModificarNota);
        jTextFieldModificarNota.setBounds(82, 108, 128, 25);

        jLabelModificarMensaje.setText("placeholderplaceholderplaceholder");
        jPanelModificar.add(jLabelModificarMensaje);
        jLabelModificarMensaje.setBounds(10, 138, 200, 25);

        jButtonModificar.setText("Modificar");
        jPanelModificar.add(jButtonModificar);
        jButtonModificar.setBounds(130, 167, 80, 23);

        getContentPane().add(jPanelModificar);
        jPanelModificar.setBounds(10, 430, 220, 200);

        jPanelBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBuscar.setLayout(null);

        jLabelBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelBuscar.setText("Buscar");
        jPanelBuscar.add(jLabelBuscar);
        jLabelBuscar.setBounds(10, 8, 200, 25);

        jLabelBuscarMatricula.setText("Nº Matricula");
        jPanelBuscar.add(jLabelBuscarMatricula);
        jLabelBuscarMatricula.setBounds(10, 33, 65, 25);

        jLabelBuscarNombre.setText("Nombre");
        jPanelBuscar.add(jLabelBuscarNombre);
        jLabelBuscarNombre.setBounds(10, 58, 65, 25);

        jLabelBuscarEdad.setText("Fecha nac.");
        jPanelBuscar.add(jLabelBuscarEdad);
        jLabelBuscarEdad.setBounds(10, 83, 65, 25);

        jLabelBuscarNota.setText("Nota");
        jPanelBuscar.add(jLabelBuscarNota);
        jLabelBuscarNota.setBounds(10, 108, 65, 25);
        jPanelBuscar.add(jTextFieldBuscarMatricula);
        jTextFieldBuscarMatricula.setBounds(82, 33, 128, 25);
        jPanelBuscar.add(jTextFieldBuscarNombre);
        jTextFieldBuscarNombre.setBounds(82, 58, 128, 25);
        jPanelBuscar.add(jTextFieldBuscarFecNac);
        jTextFieldBuscarFecNac.setBounds(82, 83, 128, 25);
        jPanelBuscar.add(jTextFieldBuscarNota);
        jTextFieldBuscarNota.setBounds(82, 108, 128, 25);

        jButtonBuscar.setText("Buscar");
        jPanelBuscar.add(jButtonBuscar);
        jButtonBuscar.setBounds(130, 167, 80, 23);

        jLabel4.setText("placeholderplaceholderplaceholder");
        jPanelBuscar.add(jLabel4);
        jLabel4.setBounds(10, 138, 200, 25);

        getContentPane().add(jPanelBuscar);
        jPanelBuscar.setBounds(10, 640, 220, 200);

        jTableTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneTabla.setViewportView(jTableTabla);

        getContentPane().add(jScrollPaneTabla);
        jScrollPaneTabla.setBounds(240, 10, 300, 800);

        jButtonActualizarTabla.setText("Refrescar");
        getContentPane().add(jButtonActualizarTabla);
        jButtonActualizarTabla.setBounds(430, 820, 110, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initMenuInicial() {
        int eleccion = JOptionPane.showOptionDialog(null, "¿Qué desea hacer?", "Menú inicio Base de Datos",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Abrir Base de Datos existente", "Crear nueva Base de Datos", "Salir del programa"},
                "Abrir Base de Datos existente");

        if (eleccion == 2 || eleccion == -1) {
            System.exit(0);
        }

        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setAcceptAllFileFilterUsed(false);
        jfc.setFileFilter(new FileNameExtensionFilter("Compatibles Random Access File (*.txt; *.text; *.dat)", "txt", "text", "dat"));

        if (eleccion == 0/*Abrir Base de Datos existente*/) {
            jfc.showOpenDialog(null);
        } else {
            if (eleccion == 1/*Crear nueva Base de Datos*/) {
                jfc.showSaveDialog(null);
            }
        }
    }

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        Alumno alumno = new Alumno();
        StringBuilder mensaje = new StringBuilder();
        if (jTextFieldAltaMatricula.getText().matches(REGEX_MATRICULA)) {
            jTextFieldAltaMatricula.setBackground(COLOR_POR_DEFECTO);
            alumno.setNumMatricula(Integer.parseInt(jTextFieldAltaMatricula.getText()));
        } else {
            jTextFieldAltaMatricula.setBackground(COLOR_ERROR);
            mensaje.append("\t- El número de matrícula debe ser un número entero de no más de 9 dígitos.\n");
        }

        if (jTextFieldAltaNombre.getText().matches(REGEX_NOMBRE)) {
            jTextFieldAltaNombre.setBackground(COLOR_POR_DEFECTO);
            alumno.setNombre(jTextFieldAltaNombre.getText());
        } else {
            jTextFieldAltaNombre.setBackground(COLOR_ERROR);
            mensaje.append("\t- El nombre debe tener entre 0 y 100 caracteres.\n");
        }

        if (jTextFieldAltaFecNac.getText().matches(REGEX_FECHA)) {
            jTextFieldAltaFecNac.setBackground(COLOR_POR_DEFECTO);
            String fecha = jTextFieldAltaFecNac.getText();
            try {
                LocalDate ld = LocalDate.of(Integer.parseInt(fecha.substring(0, 4)), Integer.parseInt(fecha.substring(5, 7)), Integer.parseInt(fecha.substring(8, 10)));
                alumno.setFecNac(ld);
            } catch (DateTimeException e) {
                jTextFieldAltaFecNac.setBackground(COLOR_ERROR);
                mensaje.append("\t- La fecha presenta incongruencias: ").append(e.getMessage()).append("\n");
            }
        } else {
            jTextFieldAltaFecNac.setBackground(COLOR_ERROR);
            mensaje.append("\t- Solo se admiten fechas con formato yyyy-mm-dd.\n");
        }

        if (jTextFieldAltaNota.getText().matches(REGEX_NOTA)) {
            jTextFieldAltaNota.setBackground(COLOR_POR_DEFECTO);
            alumno.setNota(Float.parseFloat(jTextFieldAltaNota.getText()));
        } else {
            jTextFieldAltaNota.setBackground(COLOR_ERROR);
            mensaje.append("\t- La nota debe ser un número entre 0 y 10, hasta dos decimales y punto como separación.\n");
        }

        //Si el texto mensaje no ha recopilado fallos, la operación habrá sido un éxito,
        //y por lo tanto, el mensaje será un aviso indicando que la operación ser ha realizado
        if (mensaje.length() == 0) {
            mensaje.append("Operación de alta realizada con éxito.\n").append(alumno.toString());
        } else {
            mensaje.insert(0, "Ocurrieron algunos problemas:\n");
        }

        JOptionPane.showMessageDialog(null, mensaje);


    }//GEN-LAST:event_jButtonAltaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarTabla;
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonBaja;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAlta;
    private javax.swing.JLabel jLabelAltaFecNac;
    private javax.swing.JLabel jLabelAltaMatricula;
    private javax.swing.JLabel jLabelAltaMensaje;
    private javax.swing.JLabel jLabelAltaNombre;
    private javax.swing.JLabel jLabelAltaNota;
    private javax.swing.JLabel jLabelBaja;
    private javax.swing.JLabel jLabelBajaFecNac;
    private javax.swing.JLabel jLabelBajaMatricula;
    private javax.swing.JLabel jLabelBajaMensaje;
    private javax.swing.JLabel jLabelBajaNombre;
    private javax.swing.JLabel jLabelBajaNota;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelBuscarEdad;
    private javax.swing.JLabel jLabelBuscarMatricula;
    private javax.swing.JLabel jLabelBuscarNombre;
    private javax.swing.JLabel jLabelBuscarNota;
    private javax.swing.JLabel jLabelModificar;
    private javax.swing.JLabel jLabelModificarEdad;
    private javax.swing.JLabel jLabelModificarMatricula;
    private javax.swing.JLabel jLabelModificarMensaje;
    private javax.swing.JLabel jLabelModificarNombre;
    private javax.swing.JLabel jLabelModificarNota;
    private javax.swing.JPanel jPanelAlta;
    private javax.swing.JPanel jPanelBaja;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JPanel jPanelModificar;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JTable jTableTabla;
    private javax.swing.JTextField jTextFieldAltaFecNac;
    private javax.swing.JTextField jTextFieldAltaMatricula;
    private javax.swing.JTextField jTextFieldAltaNombre;
    private javax.swing.JTextField jTextFieldAltaNota;
    private javax.swing.JTextField jTextFieldBajaFecNac;
    private javax.swing.JTextField jTextFieldBajaMatricula;
    private javax.swing.JTextField jTextFieldBajaNombre;
    private javax.swing.JTextField jTextFieldBajaNota;
    private javax.swing.JTextField jTextFieldBuscarFecNac;
    private javax.swing.JTextField jTextFieldBuscarMatricula;
    private javax.swing.JTextField jTextFieldBuscarNombre;
    private javax.swing.JTextField jTextFieldBuscarNota;
    private javax.swing.JTextField jTextFieldModificarFecNac;
    private javax.swing.JTextField jTextFieldModificarMatricula;
    private javax.swing.JTextField jTextFieldModificarNombre;
    private javax.swing.JTextField jTextFieldModificarNota;
    // End of variables declaration//GEN-END:variables
}
