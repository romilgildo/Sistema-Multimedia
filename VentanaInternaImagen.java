
package practicafinal;

import java.awt.Dimension;
import practicafinal.dibujo.Lienzo;

/**
 * Crea una ventana interna de Imagen.
 * 
 * @author Rubén Martín
 */

public class VentanaInternaImagen extends javax.swing.JInternalFrame {

    /**
     * Constructor de la ventana interna de imagen.
     * @param anchura anchura en pixeles de la imagen a crear
     * @param altura altura en pixeles de la imagen a crear
     */
    public VentanaInternaImagen(int anchura, int altura){
        miinitComponents(anchura, altura);
        this.setSize(new Dimension(anchura+18, altura+37)); // le sumo un poco más para que se vea todo el lienzo dentro de la ventana
        dibujo.setPreferredSize(new Dimension(anchura, altura));
    }
    
    /**
     * Devuelve el lienzo de la ventana interna
     * @return lienzo de la ventana interna
     */
    public Lienzo getLienzo(){
        return this.dibujo;
    }

    @SuppressWarnings("unchecked")
    /*
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneLienzo = new javax.swing.JScrollPane();
        dibujo = new practicafinal.dibujo.Lienzo();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        javax.swing.GroupLayout dibujoLayout = new javax.swing.GroupLayout(dibujo);
        dibujo.setLayout(dibujoLayout);
        dibujoLayout.setHorizontalGroup(
            dibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );
        dibujoLayout.setVerticalGroup(
            dibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jScrollPaneLienzo.setViewportView(dibujo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    */
    
    /**
     * Inicialización personalizada de los componentes de la ventana interna
     * @param anchura anchura en pixeles de la imagen a crear
     * @param altura altura en pixeles de la imagen a crear
     */
    private void miinitComponents(int anchura, int altura){
        jScrollPaneLienzo = new javax.swing.JScrollPane();
        dibujo = new practicafinal.dibujo.Lienzo(anchura, altura); // creamos un lienzo de la altura y anchura de la nueva imagen

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        javax.swing.GroupLayout dibujoLayout = new javax.swing.GroupLayout(dibujo);
        dibujo.setLayout(dibujoLayout);
        dibujoLayout.setHorizontalGroup(
            dibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );
        dibujoLayout.setVerticalGroup(
            dibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jScrollPaneLienzo.setViewportView(dibujo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );

        pack();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private practicafinal.dibujo.Lienzo dibujo;
    private javax.swing.JScrollPane jScrollPaneLienzo;
    // End of variables declaration//GEN-END:variables
}
