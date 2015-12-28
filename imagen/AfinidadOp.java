
package practicafinal.imagen;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

/**
 * Realiza la operación de escalado y rotación sobre una imagen con AffineTransformOp.
 *
 * @author Rubén Martín
 */
public class AfinidadOp {

    /**
     * Rota una imagen un número de grados en sentido de las agujas de reloj.
     * @param imgOriginal imagen a rotar
     * @param grados número de grados
     * @return imagen rotada
     */
    public BufferedImage rotarImagen(BufferedImage imgOriginal, int grados){
        BufferedImage imgDestino = null;
        if(imgOriginal != null){
            AffineTransform at = AffineTransform.getRotateInstance(Math.toRadians(grados), imgOriginal.getWidth()/2, imgOriginal.getHeight()/2);
            AffineTransformOp atop = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
            imgDestino = atop.filter(imgOriginal,null);
        }
        return imgDestino;        
    }
    
    /**
     * Escala una imagen a una escala superior o inferior de la original.
     * @param imgOriginal imagen a escalar
     * @param escala valor al que escalar
     * @return imagen escalada
     */
    public BufferedImage escalarImagen(BufferedImage imgOriginal, double escala){
        BufferedImage imgDestino = null;
        if(imgOriginal != null){
            AffineTransform at = AffineTransform.getScaleInstance(escala, escala);
            AffineTransformOp atop = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
            imgDestino = atop.filter(imgOriginal,null);
        }
        return imgDestino;         
    }
}
