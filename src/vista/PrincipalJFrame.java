/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Administrador
 */
public class PrincipalJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalJFrame
     */
    public PrincipalJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jScrollPaneTabla = new javax.swing.JScrollPane();
        jTableTabla = new javax.swing.JTable();

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

        jLabelAlta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelAlta.setText("Alta");
        jPanelAlta.add(jLabelAlta);
        jLabelAlta.setBounds(8, 8, 65, 16);

        jLabelAltaMatricula.setText("Nº Matricula");
        jPanelAlta.add(jLabelAltaMatricula);
        jLabelAltaMatricula.setBounds(8, 30, 65, 14);

        jLabelAltaNombre.setText("Nombre");
        jPanelAlta.add(jLabelAltaNombre);
        jLabelAltaNombre.setBounds(8, 53, 65, 14);

        jLabelAltaFecNac.setText("Fecha nac.");
        jPanelAlta.add(jLabelAltaFecNac);
        jLabelAltaFecNac.setBounds(8, 76, 65, 14);

        jLabelAltaNota.setText("Nota");
        jPanelAlta.add(jLabelAltaNota);
        jLabelAltaNota.setBounds(8, 99, 65, 14);
        jPanelAlta.add(jTextFieldAltaMatricula);
        jTextFieldAltaMatricula.setBounds(77, 27, 128, 20);
        jPanelAlta.add(jTextFieldAltaNombre);
        jTextFieldAltaNombre.setBounds(77, 50, 128, 20);
        jPanelAlta.add(jTextFieldAltaFecNac);
        jTextFieldAltaFecNac.setBounds(77, 73, 128, 20);
        jPanelAlta.add(jTextFieldAltaNota);
        jTextFieldAltaNota.setBounds(77, 96, 128, 20);

        jButtonAlta.setText("Alta");
        jPanelAlta.add(jButtonAlta);
        jButtonAlta.setBounds(130, 124, 75, 23);

        getContentPane().add(jPanelAlta);
        jPanelAlta.setBounds(10, 10, 220, 160);

        jPanelBaja.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBaja.setLayout(null);

        jLabelBaja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelBaja.setText("Baja");
        jPanelBaja.add(jLabelBaja);
        jLabelBaja.setBounds(8, 8, 65, 16);

        jLabelBajaMatricula.setText("Nº Matricula");
        jPanelBaja.add(jLabelBajaMatricula);
        jLabelBajaMatricula.setBounds(8, 30, 65, 14);

        jLabelBajaNombre.setText("Nombre");
        jPanelBaja.add(jLabelBajaNombre);
        jLabelBajaNombre.setBounds(8, 53, 65, 14);

        jLabelBajaFecNac.setText("Fecha nac.");
        jPanelBaja.add(jLabelBajaFecNac);
        jLabelBajaFecNac.setBounds(8, 73, 65, 14);

        jLabelBajaNota.setText("Nota");
        jPanelBaja.add(jLabelBajaNota);
        jLabelBajaNota.setBounds(8, 99, 65, 14);
        jPanelBaja.add(jTextFieldBajaMatricula);
        jTextFieldBajaMatricula.setBounds(77, 27, 128, 20);
        jPanelBaja.add(jTextFieldBajaNombre);
        jTextFieldBajaNombre.setBounds(77, 50, 128, 20);
        jPanelBaja.add(jTextFieldBajaFecNac);
        jTextFieldBajaFecNac.setBounds(77, 73, 128, 20);
        jPanelBaja.add(jTextFieldBajaNota);
        jTextFieldBajaNota.setBounds(77, 96, 128, 20);

        jButtonBaja.setText("Baja");
        jPanelBaja.add(jButtonBaja);
        jButtonBaja.setBounds(130, 124, 75, 23);

        getContentPane().add(jPanelBaja);
        jPanelBaja.setBounds(10, 180, 220, 160);

        jPanelModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelModificar.setLayout(null);

        jLabelModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelModificar.setText("Modificar");
        jPanelModificar.add(jLabelModificar);
        jLabelModificar.setBounds(8, 8, 65, 16);

        jLabelModificarMatricula.setText("Nº Matricula");
        jPanelModificar.add(jLabelModificarMatricula);
        jLabelModificarMatricula.setBounds(8, 30, 65, 14);

        jLabelModificarNombre.setText("Nombre");
        jPanelModificar.add(jLabelModificarNombre);
        jLabelModificarNombre.setBounds(8, 50, 65, 14);

        jLabelModificarEdad.setText("Fecha nac.");
        jPanelModificar.add(jLabelModificarEdad);
        jLabelModificarEdad.setBounds(8, 70, 65, 14);

        jLabelModificarNota.setText("Nota");
        jPanelModificar.add(jLabelModificarNota);
        jLabelModificarNota.setBounds(8, 90, 65, 14);
        jPanelModificar.add(jTextFieldModificarMatricula);
        jTextFieldModificarMatricula.setBounds(77, 27, 128, 20);
        jPanelModificar.add(jTextFieldModificarNombre);
        jTextFieldModificarNombre.setBounds(77, 50, 128, 20);
        jPanelModificar.add(jTextFieldModificarFecNac);
        jTextFieldModificarFecNac.setBounds(77, 73, 128, 20);
        jPanelModificar.add(jTextFieldModificarNota);
        jTextFieldModificarNota.setBounds(77, 96, 128, 20);

        jButtonModificar.setText("Modificar");
        jPanelModificar.add(jButtonModificar);
        jButtonModificar.setBounds(130, 124, 75, 23);

        getContentPane().add(jPanelModificar);
        jPanelModificar.setBounds(10, 350, 220, 160);

        jPanelBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBuscar.setLayout(null);

        jLabelBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelBuscar.setText("Buscar");
        jPanelBuscar.add(jLabelBuscar);
        jLabelBuscar.setBounds(8, 8, 65, 16);

        jLabelBuscarMatricula.setText("Nº Matricula");
        jPanelBuscar.add(jLabelBuscarMatricula);
        jLabelBuscarMatricula.setBounds(8, 30, 65, 14);

        jLabelBuscarNombre.setText("Nombre");
        jPanelBuscar.add(jLabelBuscarNombre);
        jLabelBuscarNombre.setBounds(8, 50, 65, 14);

        jLabelBuscarEdad.setText("Fecha nac.");
        jPanelBuscar.add(jLabelBuscarEdad);
        jLabelBuscarEdad.setBounds(8, 70, 65, 14);

        jLabelBuscarNota.setText("Nota");
        jPanelBuscar.add(jLabelBuscarNota);
        jLabelBuscarNota.setBounds(8, 90, 65, 14);
        jPanelBuscar.add(jTextFieldBuscarMatricula);
        jTextFieldBuscarMatricula.setBounds(77, 27, 128, 20);
        jPanelBuscar.add(jTextFieldBuscarNombre);
        jTextFieldBuscarNombre.setBounds(77, 50, 128, 20);
        jPanelBuscar.add(jTextFieldBuscarFecNac);
        jTextFieldBuscarFecNac.setBounds(77, 73, 128, 20);
        jPanelBuscar.add(jTextFieldBuscarNota);
        jTextFieldBuscarNota.setBounds(77, 96, 128, 20);

        jButtonBuscar.setText("Buscar");
        jPanelBuscar.add(jButtonBuscar);
        jButtonBuscar.setBounds(130, 124, 75, 23);

        getContentPane().add(jPanelBuscar);
        jPanelBuscar.setBounds(10, 520, 220, 160);

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
        jScrollPaneTabla.setBounds(240, 10, 300, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonBaja;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabelAlta;
    private javax.swing.JLabel jLabelAltaFecNac;
    private javax.swing.JLabel jLabelAltaMatricula;
    private javax.swing.JLabel jLabelAltaNombre;
    private javax.swing.JLabel jLabelAltaNota;
    private javax.swing.JLabel jLabelBaja;
    private javax.swing.JLabel jLabelBajaFecNac;
    private javax.swing.JLabel jLabelBajaMatricula;
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
