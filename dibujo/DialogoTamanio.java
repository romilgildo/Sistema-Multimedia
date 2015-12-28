
package practicafinal.dibujo;

/**
 * Crea un diálogo para introducir el tamaño en píxeles de
 * la nueva imagen. Se introduce anchura y altura. Se le debe
 * dar a Aceptar para crear la imagen.
 * 
 * @author Rubén Martín
 */

public class DialogoTamanio extends javax.swing.JDialog {
    boolean aceptar; // almacena si el usuario da en Aceptar

    /**
     * Constructor del diálogo.
     */
    public DialogoTamanio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        aceptar = false;
        this.setLocationRelativeTo(null); // muestra el diálogo en el centro de la pantalla
        this.setTitle("Tamaño imagen");
    }

    /**
     * Devuelve la anchura introducida en el campo de texto.
     * @return anchura introducida pasado a entero
     */
    public int getAnchura(){
        return Integer.parseInt(anchuraLienzo.getText()); 
    }
    
    /**
     * Devuelve la altura introducida en el campo de texto.
     * @return altura introducida pasado a entero
     */
    public int getAltura(){
        return Integer.parseInt(alturaLienzo.getText());
    }    
        
    /**
     * Devuelve si el usuario dio en Aceptar.
     * @return el usuario aceptó?
     */
    public boolean getAceptar(){
        return aceptar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anchuraLienzo = new javax.swing.JTextField();
        alturaLienzo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EnviarTamanio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        anchuraLienzo.setText("800");

        alturaLienzo.setText("600");

        jLabel1.setText("Anchura");

        jLabel2.setText("Altura");

        EnviarTamanio.setText("Aceptar");
        EnviarTamanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarTamanioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EnviarTamanio)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(anchuraLienzo)
                            .addComponent(alturaLienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anchuraLienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alturaLienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(EnviarTamanio)
                .addGap(33, 33, 33))
        );

        getAccessibleContext().setAccessibleName("Tamaño Lienzo");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Esconde la ventana cuando el usuario acepta.
     * @param evt acción de dar en Aceptar
     */
    private void EnviarTamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarTamanioActionPerformed
        aceptar = true; // el usuario ha aceptado 
        this.setVisible(false);
    }//GEN-LAST:event_EnviarTamanioActionPerformed

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
            java.util.logging.Logger.getLogger(DialogoTamanio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogoTamanio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogoTamanio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogoTamanio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogoTamanio dialog = new DialogoTamanio(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton EnviarTamanio;
    private javax.swing.JTextField alturaLienzo;
    private javax.swing.JTextField anchuraLienzo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
