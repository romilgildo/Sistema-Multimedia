
package practicafinal.imagen;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * Cambia el tipo de una imagen a otro indicado.
 *
 * @author Rubén Martín
 */

public class ConversorImg {
    
    /**
     * Convierte el tipo de la imagen.
     * @param img imagen original
     * @param type nuevo tipo de imagen
     * @return imagen con nuevo tipo
     */
    public BufferedImage convertImageType(BufferedImage img, int type){ 
        if(img==null) return null; 
        BufferedImage imgOut = new BufferedImage(img.getWidth(), img.getHeight(), type); 
        Graphics2D g2d = imgOut.createGraphics(); 
        g2d.drawImage(img,0,0,null); 
        return imgOut; 
    } 
}
