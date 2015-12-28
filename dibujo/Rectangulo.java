
package practicafinal.dibujo;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Crea la forma RECTANGULO o RECTANGULO REDONDEADO.
 *
 * @author Rubén Martín
 */
public class Rectangulo extends Forma{
    double xini, xfin, yini, yfin;
    boolean redondeo;
    
    /**
     * Constructor de rectángulo.
     * @param ini punto de creación en el lienzo
     * @param redondear rectangulo redondeado??
     */
    public Rectangulo(Point2D ini, boolean redondear){
        redondeo = redondear;
        xini = ini.getX();
        yini = ini.getY();
        if(!redondear)
            figura = new Rectangle2D.Double(xini, yini, 0, 0);
        else
            figura = new RoundRectangle2D.Double(xini, yini, 0, 0, 50, 50);
    }
    
    /**
     * Actualiza el punto final del rectángulo.
     * @param fin punto final en el lienzo
     */
    public void setRectangulo(Point2D fin){        
        xfin = fin.getX();
        yfin = fin.getY();     
        if(!redondeo)
            ((Rectangle2D)figura).setFrameFromDiagonal(min(xini, xfin), min(yini, yfin), max(xini, xfin), max(yini, yfin));
        else
            ((RoundRectangle2D)figura).setFrameFromDiagonal(min(xini, xfin), min(yini, yfin), max(xini, xfin), max(yini, yfin));
    }
}
