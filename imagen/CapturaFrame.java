
package practicafinal.imagen;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.media.Buffer;
import javax.media.Player;
import javax.media.control.FrameGrabbingControl;
import javax.media.format.VideoFormat;
import javax.media.util.BufferToImage;

/**
 * Realiza una captura de un vídeo con BufferToImage.
 *
 * @author Rubén Martín
 */
public class CapturaFrame {
    
    /**
     * Crea una imagen con una captura actual de la reproducción de un vídeo.
     * @param player reproducción de vídeo
     * @return imagen de la captura
     */
    public BufferedImage getFrame(Player player){   
        FrameGrabbingControl fgc = (FrameGrabbingControl)player.getControl("javax.media.control.FrameGrabbingControl"); 
        Buffer bufferFrame = fgc.grabFrame(); 
        BufferToImage imagen = new BufferToImage((VideoFormat)bufferFrame.getFormat()); 
        Image img = imagen.createImage(bufferFrame); 
        return (BufferedImage)img; 
    } 
}
