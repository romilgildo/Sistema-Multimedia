
package practicafinal.dibujo;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;

/**
 * Contiene las variables y métodos necesarios para controlar el movimiento
 * de una figura.
 * 
 * @author Rubén Martín
 */

public class Movimiento {
    private boolean mover; // almacena si la opción mover está seleccionada
    private static Shape objeto = null; // almacena el objeto a mover
    private static Point2D pinicial; // contiene el punto donde se pincha para mover
    
    /**
     * Constructor del movimiento. Comienza con la opción desactivada.
     */
    public Movimiento(){
        mover = false;
    }
    
    /**
     * Devuelve si la opción está activada o no.
     * @return está la opción mover activa??
     */
    public boolean getMovimiento(){
        return mover;
    }
    
    /**
     * Activa el movimiento cuando el usuario pincha sobre el botón de mover.
     * @param movimiento true si el botón está seleccionado, o false en caso contrario
     */
    public void setMovimiento(boolean movimiento){
        mover = movimiento;
    }
    
    /**
     * Devuelve el objeto a mover.
     * @return el objeto que vamos a arrastrar
     */
    public Shape getObjeto(){
        return objeto;
    }
    
    /**
     * Comprueba si una línea está cercana a donde hemos pinchado.
     * @param line línea a comprobar si está cerca
     * @param p punto donde hemos pinchado en el lienzo
     * @return true si la línea está cerca, o false en caso contrario
     */
    public boolean isNear(Line2D line, Point2D p){  
        return line.ptSegDist(p)<=3.0; // 3.0 es el valor de cercanía que le he dado
    } 
    
    /**
     * Comprueba si un objeto contiene al punto donde hemos pinchado.
     * @param forma objeto a comprobar si contiene al punto
     * @param p punto donde hemos pinchado en el lienzo
     * @return true si el objeto contiene al punto, o false en caso contrario
     */
    public boolean contains(Shape forma, Point2D p){
        return forma.contains(p); // llama al contains de Shape
    }   
    
    /**
     * Obtiene el objeto que está cercano o que contiene al punto.
     * @param p punto donde hemos pinchado en el lienzo
     * @param vForma array de formas dibujadas
     */
     public void getSelectedShape(Point2D p, ArrayList<Forma> vForma){ 
        pinicial = p; // guardamos el punto de partida del movimiento
        Shape s;
        /* Recorre el array de formas buscando alguna que contenga al punto
        Recorre el vector al revés para mover primero las figuras que están dibujadas por encima */        
        for(int i=vForma.size()-1; i>=0; i--){ 
            s = vForma.get(i).getFigura();
            if (s instanceof Line2D){ // si es linea usa el isNear          
                if(isNear((Line2D)s,p)){ 
                    objeto = s; // almacena en la variable objeto, la forma a mover
                    return;
                }                
            }else if (contains(s,p)){ // si es cualquier otra forma comprueba si contiene al punto
                objeto = s;         
                return;
            }
        }
        objeto = null; 
    } 
        
     /**
      * Actualiza la nueva posición del objeto que estamos moviendo.
      * @param objeto objeto a mover
      * @param p nuevo punto a donde mover la forma
      */
    public void setLocation(Shape objeto, Point2D p){  
        /* Calculamos la distancia entre el punto inicial y la nueva posición */
        double dx = p.getX() - pinicial.getX();
        double dy = p.getY() - pinicial.getY();
        
        /* Actualizamos los objetos pasándole como parámetros los nuevos valores de x e y */
        if(objeto instanceof Line2D){
            ((Line2D)objeto).setLine(((Line2D)objeto).getX1()+dx, ((Line2D)objeto).getY1()+dy, ((Line2D)objeto).getX2()+dx, 
                    ((Line2D)objeto).getY2()+dy);
        }
        else if(objeto instanceof Rectangle2D){
            ((Rectangle2D)objeto).setFrame(((Rectangle2D)objeto).getX()+dx, ((Rectangle2D)objeto).getY()+dy, ((Rectangle2D)objeto).getWidth(), 
                    ((Rectangle2D)objeto).getHeight());
        }
        else if(objeto instanceof RoundRectangle2D){
            ((RoundRectangle2D)objeto).setFrame(((RoundRectangle2D)objeto).getX()+dx, ((RoundRectangle2D)objeto).getY()+dy, 
                    ((RoundRectangle2D)objeto).getWidth(), ((RoundRectangle2D)objeto).getHeight());
        }
        else if(objeto instanceof Ellipse2D){
            ((Ellipse2D)objeto).setFrame(((Ellipse2D)objeto).getX()+dx, ((Ellipse2D)objeto).getY()+dy, ((Ellipse2D)objeto).getWidth(), 
                    ((Ellipse2D)objeto).getHeight());
        }
        else if(objeto instanceof QuadCurve2D){
            ((QuadCurve2D)objeto).setCurve(((QuadCurve2D)objeto).getX1()+dx, ((QuadCurve2D)objeto).getY1()+dy, ((QuadCurve2D)objeto).getCtrlX()+dx, 
                    ((QuadCurve2D)objeto).getCtrlY()+dy, ((QuadCurve2D)objeto).getX2()+dx, ((QuadCurve2D)objeto).getY2()+dy);
        }
        pinicial = p; // para que vaya actualizando el dibujo conforme se mueve la figura
    }  
}
