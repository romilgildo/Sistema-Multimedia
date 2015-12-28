
package practicafinal.imagen;

import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

/**
 * Modifica el brillo de una imagen con RescaleOp.
 * 
 * @author Rubén Martín
 */
public class BrilloOp {
    private int brillo;
    
    /**
     * Constructor con el nuevo brillo.
     * @param brillo nuevo brillo
     */
    public BrilloOp(int brillo) { 
      this.brillo = brillo; 
    } 
    
    /**
     * Crea una imagen con el nuevo brillo de la imagen original.
     * @param imgOriginal imagen a modificar
     * @return imagen modificada
     */
    public BufferedImage calcularBrillo(BufferedImage imgOriginal){
        BufferedImage imgDestino = null;
        if(imgOriginal != null){
            ConversorImg conversor = new ConversorImg();
            imgOriginal = conversor.convertImageType(imgOriginal,BufferedImage.TYPE_INT_RGB); 
            RescaleOp rop = new RescaleOp(1.0F, brillo, null);
            imgDestino = rop.filter(imgOriginal, null);   
        }
        return imgDestino;
    }
}
