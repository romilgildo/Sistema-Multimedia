
package practicafinal.dibujo;

import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;

/**
 * Crea la forma CURVA.
 *
 * @author Rubén Martín
 */
public class Curva extends Forma{
    double xini, yini;
    
    /**
     * Constructor de curva.
     * @param ini punto de creación en el lienzo
     */
    public Curva(Point2D ini){
        xini = ini.getX();
        yini = ini.getY();
        figura = new QuadCurve2D.Double(); 
        ((QuadCurve2D)figura).setCurve(xini, yini, xini, yini, xini, yini);
    }
        
    /**
     * Actualiza el punto final de la curva.
     * @param fin punto final en el lienzo
     */
    public void setCurva(Point2D fin){
        ((QuadCurve2D)figura).setCurve(((QuadCurve2D)figura).getP1(), fin, fin);
    }
    
    /**
     * Termina de crear la curva mediante el punto de control.
     * @param pcontrol punto de control de la curva
     */
    public void setControl(Point2D pcontrol){
        ((QuadCurve2D)figura).setCurve(((QuadCurve2D)figura).getP1(), pcontrol, ((QuadCurve2D)figura).getP2());
    }
}
