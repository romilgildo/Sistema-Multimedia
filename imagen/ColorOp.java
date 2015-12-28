
package practicafinal.imagen;

import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.BandCombineOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.LookupOp;
import java.awt.image.LookupTable;
import java.awt.image.WritableRaster;

/**
 * Realiza operaciones que modifican el color de la imagen.
 *
 * @author Rubén Martín
 */
public class ColorOp {
    private int efecto; // efecto a aplicar
    BufferedImage imgDestino = null;
    
    // distintas matrices para la combinación de bandas
    final float [][] m0 = {{1.0F,0.0F,0.0F},{1.0F,0.0F,0.0F},{1.0F,0.0F,0.0F}};
    final float [][] m1 = {{1.0F,0.0F,0.0F},{1.0F,0.0F,0.0F},{0.0F,1.0F,0.0F}};
    final float [][] m2 = {{1.0F,0.0F,0.0F},{1.0F,0.0F,0.0F},{0.0F,0.0F,1.0F}};
    final float [][] m3 = {{1.0F,0.0F,0.0F},{0.0F,1.0F,0.0F},{1.0F,0.0F,0.0F}};
    final float [][] m4 = {{1.0F,0.0F,0.0F},{0.0F,1.0F,0.0F},{0.0F,1.0F,0.0F}};
    final float [][] m5 = {{1.0F,0.0F,0.0F},{0.0F,0.0F,1.0F},{1.0F,0.0F,0.0F}};
    final float [][] m6 = {{1.0F,0.0F,0.0F},{0.0F,0.0F,1.0F},{0.0F,1.0F,0.0F}};
    final float [][] m7 = {{1.0F,0.0F,0.0F},{0.0F,0.0F,1.0F},{0.0F,0.0F,1.0F}};
    final float [][] m8 = {{0.0F,1.0F,0.0F},{1.0F,0.0F,0.0F},{1.0F,0.0F,0.0F}};
    final float [][] m9 = {{0.0F,1.0F,0.0F},{1.0F,0.0F,0.0F},{0.0F,1.0F,0.0F}};
    final float [][] m10 = {{0.0F,1.0F,0.0F},{1.0F,0.0F,0.0F},{0.0F,0.0F,1.0F}};
    final float [][] m11 = {{0.0F,1.0F,0.0F},{0.0F,1.0F,0.0F},{1.0F,0.0F,0.0F}};
    final float [][] m12 = {{0.0F,1.0F,0.0F},{0.0F,1.0F,0.0F},{0.0F,1.0F,0.0F}};    
    final float [][] minter = {{1.0F,0.0F,0.0F},{0.0F,1.0F,0.0F},{0.0F,0.0F,1.0F}};
    final float [][] m14 = {{0.0F,1.0F,0.0F},{0.0F,1.0F,0.0F},{0.0F,0.0F,1.0F}};
    final float [][] m15 = {{0.0F,1.0F,0.0F},{0.0F,0.0F,1.0F},{1.0F,0.0F,0.0F}};
    final float [][] m16 = {{0.0F,1.0F,0.0F},{0.0F,0.0F,1.0F},{0.0F,1.0F,0.0F}};
    final float [][] m17 = {{0.0F,1.0F,0.0F},{0.0F,0.0F,1.0F},{0.0F,0.0F,1.0F}};
    final float [][] m18 = {{0.0F,0.0F,1.0F},{1.0F,0.0F,0.0F},{1.0F,0.0F,0.0F}};
    final float [][] m19 = {{0.0F,0.0F,1.0F},{1.0F,0.0F,0.0F},{0.0F,1.0F,0.0F}};
    final float [][] m20 = {{0.0F,0.0F,1.0F},{1.0F,0.0F,0.0F},{0.0F,0.0F,1.0F}};
    final float [][] m21 = {{0.0F,0.0F,1.0F},{0.0F,1.0F,0.0F},{1.0F,0.0F,0.0F}};
    final float [][] m22 = {{0.0F,0.0F,1.0F},{0.0F,1.0F,0.0F},{0.0F,1.0F,0.0F}};
    final float [][] m23 = {{0.0F,0.0F,1.0F},{0.0F,1.0F,0.0F},{0.0F,0.0F,1.0F}};
    final float [][] m24 = {{0.0F,0.0F,1.0F},{0.0F,0.0F,1.0F},{1.0F,0.0F,0.0F}};
    final float [][] m25 = {{0.0F,0.0F,1.0F},{0.0F,0.0F,1.0F},{0.0F,1.0F,0.0F}};
    final float [][] m26 = {{0.0F,0.0F,1.0F},{0.0F,0.0F,1.0F},{0.0F,0.0F,1.0F}};
    
    /**
     * Constructor con un efecto asociado.
     * @param efecto efecto de color
     */
    public ColorOp(int efecto){
        this.efecto = efecto;
    }
    
    /**
     * Aplica el efecto de color correspondiente.
     * @param imgOriginal imagen original
     * @return imagen modificada
     */
    public BufferedImage aplicarEfecto(BufferedImage imgOriginal){
        if(imgOriginal != null){
            ConversorImg conversor = new ConversorImg();
            imgOriginal = conversor.convertImageType(imgOriginal, BufferedImage.TYPE_INT_RGB);
            switch(efecto){
                case 0:
                    Negativo(imgOriginal);
                    break;
                case 1:
                    nivelesGris(imgOriginal);
                    break;            
            }
        }
        return imgDestino;
    }
        
    /**
     * Genera el negativo de la imagen original con LookupOp.
     * @param imgOriginal imagen original
     */
    public void Negativo(BufferedImage imgOriginal){
        LookupTable slt = LookupTableProducer.createLookupTable(LookupTableProducer.TYPE_NEGATIVE);
        LookupOp lop = new LookupOp(slt, null);
        imgDestino = lop.filter(imgOriginal,null);
    }
    
    /**
     * Convierte la imagen a escala de grises con ColorConvertOp.
     * @param imgOriginal imagen original
     */
    public void nivelesGris(BufferedImage imgOriginal){
        ICC_Profile ip = ICC_Profile.getInstance(ColorSpace.CS_GRAY); 
        ColorSpace cs = new ICC_ColorSpace(ip); 
        ColorConvertOp ccop = new ColorConvertOp(cs,null); 
        imgDestino = ccop.filter(imgOriginal,null);
    }   
    
    /**
     * Combina las bandas de color según la combinación dada con BandCombineOp.
     * @param imgOriginal imagen original
     * @param banda combinación de bandas a aplicar
     * @return imagen modificada
     */
    public BufferedImage combinarBandas(BufferedImage imgOriginal, int banda){
        if(imgOriginal != null){
            ConversorImg conversor = new ConversorImg();
            imgOriginal = conversor.convertImageType(imgOriginal, BufferedImage.TYPE_INT_RGB);
            BandCombineOp bcop = new BandCombineOp(minter, null);
            switch(banda){
                case 0: bcop = new BandCombineOp(m0, null); break;
                case 1: bcop = new BandCombineOp(m1, null); break;
                case 2: bcop = new BandCombineOp(m2, null); break;
                case 3: bcop = new BandCombineOp(m3, null); break;
                case 4: bcop = new BandCombineOp(m4, null); break;
                case 5: bcop = new BandCombineOp(m5, null); break;
                case 6: bcop = new BandCombineOp(m6, null); break;
                case 7: bcop = new BandCombineOp(m7, null); break;
                case 8: bcop = new BandCombineOp(m8, null); break;
                case 9: bcop = new BandCombineOp(m9, null); break;
                case 10: bcop = new BandCombineOp(m10, null); break;
                case 11: bcop = new BandCombineOp(m11, null); break;
                case 12: bcop = new BandCombineOp(m12, null); break;
                case 13: bcop = new BandCombineOp(minter, null); break;
                case 14: bcop = new BandCombineOp(m14, null); break;
                case 15: bcop = new BandCombineOp(m15, null); break;
                case 16: bcop = new BandCombineOp(m16, null); break;
                case 17: bcop = new BandCombineOp(m17, null); break;
                case 18: bcop = new BandCombineOp(m18, null); break;
                case 19: bcop = new BandCombineOp(m19, null); break;
                case 20: bcop = new BandCombineOp(m20, null); break;
                case 21: bcop = new BandCombineOp(m21, null); break;
                case 22: bcop = new BandCombineOp(m22, null); break;
                case 23: bcop = new BandCombineOp(m23, null); break;
                case 24: bcop = new BandCombineOp(m24, null); break;
                case 25: bcop = new BandCombineOp(m25, null); break;
                case 26: bcop = new BandCombineOp(m26, null); break;                    
            }            
            WritableRaster  rasterdest = bcop.filter(imgOriginal.getRaster(),null); 
            imgDestino = new BufferedImage(imgOriginal.getColorModel(), rasterdest,false,null);  
        }
        return imgDestino;
    }
}
