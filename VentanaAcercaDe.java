
package practicafinal;

import java.awt.Dimension;

/**
 * Crea una ventana Acerca de con información básica sobre el software.
 * 
 * @author Rubén Martín
 */

public class VentanaAcercaDe extends javax.swing.JDialog {

    /**
     * Constructor
     */
    public VentanaAcercaDe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setMinimumSize(new Dimension(220, 160));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAcercaDe = new javax.swing.JScrollPane();
        TextoAcercaDe = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(160, 121));

        TextoAcercaDe.setEditable(false);
        TextoAcercaDe.setBackground(new java.awt.Color(240, 240, 240));
        TextoAcercaDe.setColumns(20);
        TextoAcercaDe.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        TextoAcercaDe.setRows(5);
        TextoAcercaDe.setText("Práctica Final SM\n\nVersión: 15 Julio 2014\n\nAutor: Rubén Martín");
        TextoAcercaDe.setBorder(null);
        PanelAcercaDe.setViewportView(TextoAcercaDe);

        getContentPane().add(PanelAcercaDe, java.awt.BorderLayout.CENTER);

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
            java.util.logging.Logger.getLogger(VentanaAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaAcercaDe dialog = new VentanaAcercaDe(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PanelAcercaDe;
    private javax.swing.JTextArea TextoAcercaDe;
    // End of variables declaration//GEN-END:variables
}
