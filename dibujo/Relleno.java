
package practicafinal.dibujo;

import java.awt.Color;
import java.awt.Paint;

/**
 * Contiene las variables y métodos necesarios para controlar el relleno de las formas.
 * 
 * @author Rubén Martín
 */

public class Relleno {
    public enum Degradado {liso, horizontal, vertical}; // tipo de degradado
    private boolean relleno;
    private Degradado tipoDegradado = Degradado.horizontal;
    private Paint colorFondo = new Color(255,255,255);    
    
    /**
     * Constructor. Comienza sin relleno.
     */
    public Relleno(){
        relleno = false;
    }
    
    /**
     * Constructor pasándole si está relleno o no
     * @param estaRelleno está activa la opción de relleno?
     */
    public Relleno (boolean estaRelleno){
        relleno = estaRelleno;
    }
    
    /**
     * Constructor si está seleccionado el relleno degradado.
     * @param tipo tipo de degradado
     * @param colorSecundario color de fondo
     */
    public Relleno (Degradado tipo, Color colorSecundario){
        relleno = true;
        tipoDegradado = tipo;
        colorFondo = colorSecundario;        
    }
    
    /**
     * Devuelve si el relleno está activado.
     * @return true si la opción está activa
     */
    public boolean estaRelleno(){
        return relleno;
    }
    
    /**
     * Activa el relleno si se ha seleccionado la opción.
     * @param estaRelleno está seleccionada la opción?
     */
    public void setRelleno(boolean estaRelleno){
        relleno = estaRelleno;
    }
    
    /**
     * Configura el tipo de degradado.
     * @param tipo tipo de degradado seleccionado
     */
    public void setDegradado(Degradado tipo){
        relleno = true;
        tipoDegradado = tipo;
    }

    /**
     * Configura el tipo de degradado cambiando también el color de fondo.
     * @param tipo tipo de degradado seleccionado
     * @param colorSecundario color de fondo seleccionado
     */
    public void setRelleno (Degradado tipo, Color colorSecundario){
        relleno = true;
        tipoDegradado = tipo;
        colorFondo = colorSecundario;
    }
    
    /**
     * Devuelve el tipo de degradado seleccionado.
     * @return tipo de degradado
     */
    public Degradado getDegradado(){
        return tipoDegradado;
    }
    
    /**
     * Cambia el color de fondo del relleno.
     * @param colorSecundario color de fondo seleccionado
     */
    public void setColorFondo(Color colorSecundario){
        colorFondo = colorSecundario;
    }
        
    /**
     * Devuelve el color de fondo del relleno.
     * @return color de fondo del relleno
     */
    public Paint getColorFondo(){
        return colorFondo;
    }
}
