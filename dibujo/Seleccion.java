
package practicafinal.dibujo;

import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * Contiene las variables y métodos necesarios para controlar 
 * la edición de los parámetros de las formas.
 * 
 * @author Rubén Martín
 */

public class Seleccion {
    private boolean seleccionar;
    private int figura; // indica la posición en vShape de la figura a editar
    
    /**
     * Constructor. Comienza con la opción activada, pero sin figura a editar.
     */
    public Seleccion(){
        seleccionar = true;
        figura = -1;
    }
    
    /**
     * Activa o desactiva la opción.
     * @param seleccionar está el botón Editar seleccionado?
     */
    public void setSeleccionar(boolean seleccionar){
        this.seleccionar = seleccionar;
    }
    
    /**
     * Devuelve si la opción está activada.
     * @return true si la opción Editar está activa
     */
    public boolean getSeleccionar(){
        return seleccionar;
    }
    
    /**
     * Almacena la posición de la figura a editar.
     * @param posicion lugar en el array de formas
     */
    public void setFigura(int posicion){
        figura = posicion;
    }
    
    /**
     * Devuelve la posición de la figura a editar.
     * @return lugar en el array de formas
     */
    public int getFigura(){
        return figura;
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
        Shape s;
        /* Recorre el array de formas buscando alguna que contenga al punto
        Recorre el vector al revés para editar primero las figuras que están dibujadas por encima */          
        for(int i=vForma.size()-1; i>=0; i--){ 
            s = vForma.get(i).getFigura();
            if (s instanceof Line2D){ // si es linea usa el isNear           
                if(isNear((Line2D)s,p)){ 
                    figura = i; // almacena la posición del objeto
                    return;
                }                
            }else if (contains(s,p)){ // si es cualquier otra forma comprueba si contiene al punto
                figura = i;         
                return;
            }
        }
        figura = -1; 
    } 
}
