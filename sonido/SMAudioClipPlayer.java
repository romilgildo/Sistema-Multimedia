package practicafinal.sonido;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.sound.sampled.LineListener;

/**
 * Reproductor de audio basado en la clase AudioClip
 * @author Jesus Chamorro
 */
public class SMAudioClipPlayer implements SMPlayer{
    
    private AudioClip audio;
    private URL url;
    
    /**
     *  Constructor 
     */
    public SMAudioClipPlayer(File f){
        try {
            url = new URL("file:"+f.getAbsolutePath());
        } catch (MalformedURLException ex) {
            url=null;
        }
    }
       
    /**
     *  Lanza el proceso de reproducción 
     */
    @Override
    public void play() {
        try{    
            audio = Applet.newAudioClip(url);
            audio.play();
        } catch (Exception e) {
            System.err.println("SMAudioClipPlayer: "+e);
        }   
    } 
    
    /**
     *  Detiene el proceso de reproducción 
     */
    @Override
    public void stop(){
        audio.stop();
    }

    @Override
    public void setLineListener(LineListener lineListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
