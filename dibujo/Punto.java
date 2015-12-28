
package practicafinal.dibujo;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Crea la forma PUNTO.
 * 
 * @author Rubén Martín
 */
public class Punto extends Forma{
    
    /**
     * Constructor del punto.
     * @param ini punto de creación en el lienzo
     */
    public Punto(Point2D ini){
        figura = new Line2D.Double(ini.getX(), ini.getY(), ini.getX(), ini.getY()); 
    }
}
