
package practicafinal.dibujo;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Crea la forma LINEA.
 *
 * @author Rubén Martín
 */
public class Linea extends Forma{
    
    /**
     * Constructor de línea.
     * @param ini punto de creación en el lienzo
     */
    public Linea(Point2D ini){
        figura = new Line2D.Double(ini.getX(), ini.getY(), ini.getX(), ini.getY()); 
    }
        
    /**
     * Actualiza el punto final de la línea.
     * @param fin punto final en el lienzo
     */
    public void setLinea(Point2D fin){
        ((Line2D)figura).setLine(((Line2D)figura).getP1(), fin);
    }
}
