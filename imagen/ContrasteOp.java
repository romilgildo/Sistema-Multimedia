
package practicafinal.imagen;

import java.awt.image.BufferedImage;
import java.awt.image.LookupOp;
import java.awt.image.LookupTable;

/**
 * Modifica el contraste de la imagen original mediante LookupOp.
 *
 * @author Rubén Martín
 */
public class ContrasteOp {
    BufferedImage imgDestino;
 
    /**
     * Aplica el tipo de contraste según la elección del usuario.
     * @param imgOriginal imagen original
     * @param tipo tipo de contraste
     */
    public void aplicarContraste(BufferedImage imgOriginal, int tipo){
        if(imgOriginal != null){
            ConversorImg conversor = new ConversorImg();
            imgOriginal = conversor.convertImageType(imgOriginal, BufferedImage.TYPE_INT_RGB);
            LookupTable slt = LookupTableProducer.createLookupTable(tipo);
            LookupOp lop = new LookupOp(slt, null);
            imgDestino = lop.filter(imgOriginal,null);
        }    
    }
     
    /**
     * Aplica el cálculo de contraste normal sobre la imagen.
     * @param imgOriginal imagen original
     * @return imagen modificada
     */
    public BufferedImage contrasteNormal(BufferedImage imgOriginal){
        aplicarContraste(imgOriginal, LookupTableProducer.TYPE_SFUNCION);
        return imgDestino;
    }
    
    /**
     * Aplica el cálculo de contraste iluminado sobre la imagen.
     * @param imgOriginal imagen original
     * @return imagen modificada
     */    
    public BufferedImage contrasteIluminado(BufferedImage imgOriginal){
        aplicarContraste(imgOriginal, LookupTableProducer.TYPE_GAMMA_CORRECTION);
        return imgDestino;        
    }
    
    /**
     * Aplica el cálculo de contraste oscurecido sobre la imagen.
     * @param imgOriginal imagen original
     * @return imagen modificada
     */    
    public BufferedImage contrasteOscurecido(BufferedImage imgOriginal){
        aplicarContraste(imgOriginal, LookupTableProducer.TYPE_POWER);
        return imgDestino;        
    }   
    
}
