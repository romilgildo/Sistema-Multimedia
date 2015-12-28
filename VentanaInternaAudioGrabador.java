
package practicafinal;

import java.io.File;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import practicafinal.sonido.SMRecorder;
import practicafinal.sonido.SMSoundRecorder;

/**
 * Crea una ventana interna de grabador de audio.
 * 
 * @author Rubén Martín
 */

public class VentanaInternaAudioGrabador extends javax.swing.JInternalFrame {
    SMRecorder recorder; //grabador
    File sonido;

    /**
     * Constructor de la ventana interna grabador.
     * @param f archivo en el que se grabará el audio
     */
    public VentanaInternaAudioGrabador(File f) {
        sonido = f;
        initComponents();      
        recorder = new SMSoundRecorder(f); 
        LineListener lineListener = new LineListener(){ 
            /* Controlamos los inicios y paradas de la grabación para cambiar los botones de forma dinámica */
            public void update(LineEvent event) { 
                if(event.getType()==LineEvent.Type.START) { 
                    botonRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/RecordDisabled_48x48.png")));
                    botonStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/StopNormalRed_48x48.png")));
                } 
                if(event.getType()==LineEvent.Type.STOP) { 
                    botonStop.setSelected(true);
                    botonStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/StopDisabled_48x48.png")));
                    botonRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/RecordPressed_48x48.png")));
                } 
            }
        };
        recorder.setLineListener(lineListener);
    } 
    
    /**
     * Devuelve el nombre de un archivo.
     * @param f archivo del que queremos obtener nombre
     * @return nombre del archivo
     */
    private String getNombreSonido(File f){
        return f.getName();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonesGrabadorAudio = new javax.swing.ButtonGroup();
        botonRecord = new javax.swing.JToggleButton();
        botonStop = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle(this.getNombreSonido(sonido));
        getContentPane().setLayout(new java.awt.FlowLayout());

        BotonesGrabadorAudio.add(botonRecord);
        botonRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/RecordPressed_48x48.png"))); // NOI18N
        botonRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecordActionPerformed(evt);
            }
        });
        getContentPane().add(botonRecord);

        BotonesGrabadorAudio.add(botonStop);
        botonStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/StopDisabled_48x48.png"))); // NOI18N
        botonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStopActionPerformed(evt);
            }
        });
        getContentPane().add(botonStop);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Comienza la grabación del audio.
     * @param evt acción de pulsar el botón Record
     */
    private void botonRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecordActionPerformed
        if(recorder!=null) recorder.record(); 
    }//GEN-LAST:event_botonRecordActionPerformed

    /**
     * Finaliza la grabación del audio.
     * @param evt acción de pulsar el botón Stop
     */
    private void botonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStopActionPerformed
        if(recorder!=null) recorder.stop(); 
    }//GEN-LAST:event_botonStopActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BotonesGrabadorAudio;
    private javax.swing.JToggleButton botonRecord;
    private javax.swing.JToggleButton botonStop;
    // End of variables declaration//GEN-END:variables
}
