
package practicafinal.dibujo;

import java.awt.Color;
import java.awt.Shape;
import java.awt.Stroke;

/**
 * Guarda los tipos de formas que se pueden dibujar y sus propiedades.
 * 
 * @author Rubén Martín
 */

public class Forma { 
    
    /* Variables para identificar la forma seleccionada */
    public final static String PUNTO = "Punto";
    public final static String LINEA = "Línea";
    public final static String RECTANGULO = "Rectángulo";
    public final static String RECTANGULO_REDONDEADO = "Rectángulo redondeado";
    public final static String ELIPSE = "Elipse";
    public final static String CURVA = "Curva";
    public final static String TRAZO_LIBRE = "Trazo Libre";
    public final static String GOMA = "Goma";
    
    /* Variables de figura y sus propiedades */
    Shape figura;
    Color color;
    Stroke trazo;
    Relleno relleno;
    
    /**
     * Devuelve la forma dibujada.
     * @return figura dibujada
     */
    public Shape getFigura(){
        return figura;
    }
    
    /**
     * Configura las propiedades de la forma, que normalmente serán las actuales en el lienzo.
     * @param color color primario
     * @param trazo trazo 
     * @param relleno relleno
     */
    public void setPropiedades(Color color, Stroke trazo, Relleno relleno){
        this.color = color;
        this.trazo = trazo;
        this.relleno = relleno;
    }
    
    /**
     * Devuelve el color primario de la forma.
     * @return color primario
     */
    public Color getColor(){
        return color;
    }
    
    /**
     * Devuelve el trazo de la forma.
     * @return trazo
     */
    public Stroke getTrazo(){
        return trazo;
    }
    
    /**
     * Devuelve el relleno de la forma.
     * @return relleno
     */
    public Relleno getRelleno(){
        return relleno;
    }
    
    /**
     * Configura el color primario de la forma.
     * @param color color primario
     */
    public void setColor(Color color){
        this.color = color;
    }
    
    /**
     * Configura el trazo de la forma.
     * @param trazo trazo
     */
    public void setTrazo(Stroke trazo){
        this.trazo = trazo;
    }
    
    /**
     * Configura el relleno de la forma.
     * @param relleno relleno
     */
    public void setRelleno(Relleno relleno){
        this.relleno = relleno;
    }
    
}
