package practicafinal.sonido;

import javax.sound.sampled.LineListener;

/**
 *
 * @author Jesus Chamorro
 */
public interface SMPlayer {
    
    public void setLineListener(LineListener lineListener);
    public void play();
    public void stop();
}
