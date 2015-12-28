package practicafinal.sonido;

import javax.sound.sampled.LineListener;

/**
 *
 * @author Jesus Chamorro
 */
public interface SMRecorder {
    public void record();
    public void stop();

    public void setLineListener(LineListener lineListener);
}
