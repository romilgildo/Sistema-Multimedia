
package practicafinal.imagen;

import java.awt.Color;
import java.awt.Paint;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import static java.lang.Math.abs;
import sm.image.BufferedImageOpAdapter;
import sm.image.BufferedImageSampleIterator;

/**
 * Aplica umbralización sobre la imagen. Puede modificarse el umbral de 0 a 255
 * y elegir entre umbral sobre niveles de gris o sobre color.
 * 
 * @author Rubén Martín
 */

public class UmbralizacionOp extends BufferedImageOpAdapter{ 
    private int umbral; 
    private Color color;
    private tipoUmbral tipo;
    public enum tipoUmbral {gris, color};
    
    /**
     * Constructor
     */
    public UmbralizacionOp(){
        color = Color.BLACK;
        tipo = tipoUmbral.gris;
    }

    /**
     * Modifica el valor del umbral.
     * @param umbral nuevo valor de umbral
     */
    public void setUmbral(int umbral) { 
      this.umbral = umbral; 
    } 
    
    /**
     * Cambia el color de umbralización.
     * @param color nuevo color
     */
    public void setColor(Paint color){
        this.color = (Color)color;
    }

    /**
     * Cambia el tipo de umbralización.
     * @param tipo tipo de umbralización
     */
    public void setTipo(tipoUmbral tipo){
        this.tipo = tipo;
    }
    
    /**
     * Devuelve el tipo de umbralización actual.
     * @return tipo de umbralización
     */
    public tipoUmbral getTipo(){
        return tipo;
    }
    
    /**
     * Aplica la umbralización de niveles de gris sobre la imagen original y la guarda en la imagen destino.
     * @param src imagen original
     * @param dest imagen destino
     * @return imagen modificada
     */
    public BufferedImage filter(BufferedImage src, BufferedImage dest){ 
        if (dest == null) { 
            dest = createCompatibleDestImage(src, null); 
        } 
        WritableRaster destRaster = dest.getRaster(); 
 
        for (BufferedImageSampleIterator it = new BufferedImageSampleIterator(src); it.hasNext();) { 
            BufferedImageSampleIterator.SampleData sample = it.next() ; 
            if(sample.value >= umbral) // comprueba si el valor RGB es mayor al umbral
                sample.value = 255;
            else
                sample.value = 0;
            destRaster.setSample(sample.col, sample.row, sample.band, sample.value); 
        } 
        return dest; 
    } 
    
    /**
     * Aplica la umbralización de color sobre la imagen original y la guarda en la imagen destino.
     * @param src imagen original
     * @param dest imagen destino
     * @return imagen modificada
     */    
    public BufferedImage filterColor(BufferedImage src, BufferedImage dest){ 
        if (dest == null) { 
            dest = createCompatibleDestImage(src, null); 
        } 
        boolean aux = false;
 
        for (BufferedImageSampleIterator it = new BufferedImageSampleIterator(src); it.hasNext();) { 
            BufferedImageSampleIterator.SampleData sample = it.next() ; 
            switch(sample.band){
                case 0: 
                    if(abs(color.getRed() - sample.value) > umbral)
                        aux = true;
                    break;
                case 1:
                    if(abs(color.getGreen() - sample.value) > umbral)
                        aux = true;
                    break;
                case 2:
                    if(abs(color.getBlue() - sample.value) > umbral)
                        aux = true;
                    break;
            }
            if(sample.band == 2){
                if(aux == true){
                    dest.setRGB(sample.col, sample.row, Color.black.getRGB()); // colorea negro si el valor RGB es mayor del umbral
                    aux = false;
                }
                else
                    dest.setRGB(sample.col, sample.row, Color.white.getRGB()); // colorea blanco si el valor RGB es menor o igual del umbral
            }
            
        } 
        return dest; 
    } 
} 
