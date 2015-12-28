
package practicafinal.imagen;

import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

/**
 * Aplica un filtro de convolución sobre una imagen.
 *
 * @author Rubén Martín
 */
public class FiltroOp {
    private int filtro; // filtro a aplicar
    
    /**
     * Constructor con filtro asociado.
     * @param filtro filtro a aplicar
     */
    public FiltroOp(int filtro){
        this.filtro = filtro;
    }
        
    /**
     * Aplica un filtro sobre la imagen original con ConvolveOp.
     * @param imgOriginal imagen original
     * @return imagen modificada
     */
    public BufferedImage aplicarFiltro(BufferedImage imgOriginal){
        BufferedImage imgDestino = null;
        if(imgOriginal != null){
            ConversorImg conversor = new ConversorImg();
            imgOriginal = conversor.convertImageType(imgOriginal, BufferedImage.TYPE_INT_RGB);
            KernelProducer kernel = null;
            Kernel k = kernel.createKernel(filtro); 
            ConvolveOp cop = new ConvolveOp( k );
            imgDestino = cop.filter(imgOriginal,null);
        }
        return imgDestino;          
    }
}
