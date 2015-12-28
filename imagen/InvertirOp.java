
package practicafinal.imagen;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import sm.image.BufferedImageOpAdapter;
import sm.image.BufferedImageSampleIterator;

/**
 * Invierte la imagen de derecha a izquierda.
 *
 * @author Rubén Martín
 */
public class InvertirOp extends BufferedImageOpAdapter{
    
    /**
     * Aplica el efecto espejo sobre la imagen destino.
     * @param src imagen original
     * @param dest imagen final donde se guarda la modificación
     * @return imagen modificada
     */
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        if (dest == null) { 
            dest = createCompatibleDestImage(src, null); 
        } 
        WritableRaster destRaster = dest.getRaster(); 
        
        int ncolumnas = src.getWidth()-1; // guarda el número de columnas de la imagen -1
 
        for (BufferedImageSampleIterator it = new BufferedImageSampleIterator(src); it.hasNext();) { 
            BufferedImageSampleIterator.SampleData sample = it.next() ; 
            destRaster.setSample(ncolumnas - sample.col, sample.row, sample.band, sample.value); // almacena el valor de los píxeles en las columnas inversas
        } 
        return dest;     
    }    
}
