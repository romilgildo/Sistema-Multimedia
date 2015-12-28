
package practicafinal.dibujo;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Crea la forma ELIPSE.
 *
 * @author Rubén Martín
 */
public class Elipse extends Forma{
    double xini, xfin, yini, yfin;
    
    /**
     * Constructor de elipse.
     * @param ini punto de creación en el lienzo
     */
    public Elipse(Point2D ini){
        xini = ini.getX();
        yini = ini.getY();
        figura = new Ellipse2D.Double(xini, yini, 0, 0);
    }
    
    /**
     * Actualiza el punto final de la elipse.
     * @param fin punto final en el lienzo
     */
    public void setElipse(Point2D fin){        
        xfin = fin.getX();
        yfin = fin.getY();   
        ((Ellipse2D)figura).setFrameFromDiagonal(min(xini, xfin), min(yini, yfin), max(xini, xfin), max(yini, yfin));
    }    
}
