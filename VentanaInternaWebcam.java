
package practicafinal;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.Vector;
import javax.media.CaptureDeviceInfo;
import javax.media.CaptureDeviceManager;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;
import javax.media.format.YUVFormat;

/**
 * La ventana interna de Webcam contiene un reproductor de video 
 * en el que se mostrará la captura de vídeo de la webcam en tiempo real.
 * 
 * @author Rubén Martín
 */

public class VentanaInternaWebcam extends javax.swing.JInternalFrame {
    
    Player player; // reproductor del vídeo capturado
    
    /**
     * Creación de la ventana interna de Webcam.
     */
    public VentanaInternaWebcam(){ 
        initComponents();
        this.setSize(320, 240);
        try {  
            /* deviceList es la lista de dispositivos de captura de video que hay disponibles */
            CaptureDeviceInfo deviceInfo;  
            Vector<CaptureDeviceInfo> deviceList = CaptureDeviceManager.getDeviceList(new YUVFormat());  
            deviceInfo = deviceList.get(0); 
           
            MediaLocator ml = deviceInfo.getLocator();  
            player = Manager.createRealizedPlayer(ml); // reproduce la captura del dispositivo seleccionado
            Component areaVisual = player.getVisualComponent(); 
            if(areaVisual!=null)                
                this.add(areaVisual,BorderLayout.CENTER); // se agrega el video capturado al centro de la ventana interna
            this.play(); // reproduce el contenido de la ventana interna
        } catch(Exception e) {            
            player = null;
        }  
    } 
    
    /**
     * Devuelve una instancia de ventana interna de webcam.
     * @return instancia de ventana interna de webcam
     */
    public static VentanaInternaWebcam getInstance(){
        VentanaInternaWebcam v = new VentanaInternaWebcam();
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
     * Inicia la reproducción.
     */
    private void play(){
        player.start();
    }
    
    /**
     * Finaliza la reproducción.
     */
    private void close(){
        player.close();
        player = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Webcam");
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
     * @param evt acción de cerrar la ventana interna de webcam
     */
    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        if(player!=null) this.close();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
