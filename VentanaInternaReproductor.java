
package practicafinal;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.io.File;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;

/**
 * La ventana interna reproductor reproduce archivos de audio y vídeo.
 * 
 * @author Rubén Martín
 */

public class VentanaInternaReproductor extends javax.swing.JInternalFrame {
    
    Player player;
    File archivo;
    
    /**
     * Constructor de ventana interna reproductor.
     * @param f archivo a reproducir
     */
    public VentanaInternaReproductor(File f){ 
        archivo = f;
        initComponents();
        try {  
            MediaLocator ml = new MediaLocator("file:" + f.getAbsolutePath());  
            player = Manager.createRealizedPlayer(ml); // reproducimos el fichero introducido
            Component areaVisual = player.getVisualComponent(); 
            if(areaVisual!=null)                
                this.add(areaVisual,BorderLayout.CENTER); // si el archivo es vídeo, lo reproducimos en el centro de la ventana interna
            else
                setPreferredSize(new Dimension(250, 50)); // si el archivo es audio, adaptamos el tamaño de la ventana interna
            Component panelControl = player.getControlPanelComponent(); 
            if(panelControl!=null) this.add(panelControl,BorderLayout.SOUTH);
            this.pack();
            this.play(); 
        } catch(Exception e) {            
            player = null;
        }  
    } 
    
    /**
     * Devuelve una instancia de la ventana interna reproductor.
     * @param f fichero a reproducir en la instancia
     * @return instancia de ventana interna reproductor
     */
    public static VentanaInternaReproductor getInstance(File f){
        VentanaInternaReproductor v = new VentanaInternaReproductor(f);
        return (v.player!=null)?v:null;
    } 
    
    /**
     * Devuelve el reproductor.
     * @return reproductor
     */
    public Player getPlayer(){
        return player;
    }
    
    /**
     * Inicia la reproducción del archivo.
     */
    private void play(){
        player.start();
    }
    
    /**
     * Finaliza la reproducción del archivo.
     */
    private void close(){
        player.close();
        player = null;
    }
    
    /**
     * Devuelve el nombre de un archivo.
     * @param f archivo del que queremos obtener nombre
     * @return nombre del archivo
     */
    private String getNombreArchivo(File f){
        return f.getName();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(this.getNombreArchivo(archivo)
        );
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Finaliza la reproducción al cerrar la ventana interna.
     * @param evt cerrar la ventana interna reproductor
     */
    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        if(player!=null) this.close();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
