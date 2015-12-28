
package practicafinal.dibujo;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Crear la forma GOMA.
 *
 * @author Rubén Martín
 */
public class Goma extends Forma{
    
    /**
     * Constructor de goma.
     * @param ini punto de creación en el lienzo
     */
    public Goma(Point2D ini){
        figura = new Rectangle2D.Double(ini.getX()-10, ini.getY()-10, 20, 20);
    }
}
