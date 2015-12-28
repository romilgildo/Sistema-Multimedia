
package practicafinal.dibujo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import practicafinal.dibujo.Relleno.Degradado;

/**
 * El lienzo donde dibujamos las formas. También puede contener imágenes y
 * trabajar con ellas.
 * 
 * @author Rubén Martín
 */

public class Lienzo extends javax.swing.JPanel {

    private static String herramienta = null; // forma seleccionada
    private static Paint color1 = new Color(0,0,0); // color principal o frente
    private static Relleno relleno = new Relleno(); // relleno de la forma
    private Relleno mirelleno; // uso otra variable relleno porque con la variable estática, se cambian todos los valores del array de rellenos
    private static Movimiento mover = new Movimiento(); // opción de mover
    private static Seleccion seleccionar = new Seleccion(); // opción de editar
    private static boolean discontinuo = false; // discontinuidad del trazo
    private static float grosor = 3.0f; // grosor del trazo
    private static Stroke trazo = new BasicStroke(grosor); // trazo del dibujo
    private ArrayList<Forma> vForma = new ArrayList(); // vector de formas
    private Forma figura;

    double xinicio, yinicio; // puntos iniciales de las formas 
    boolean terminarCurva = false; // almacena si estamos realizando una curva
    static float dash[] = {10}; // para la discontinuidad
    GradientPaint gradiente; // mezcla de los colores del relleno degradado
    private BufferedImage img; // imagen del lienzo

    /**
     * Constructor del lienzo, iniciado con una anchura y altura
     * dependiendo de lo que haya introducido el usuario en el diálogo.
     * @param anchura anchura en píxeles del lienzo
     * @param altura altura en píxeles del lienzo
     */
    public Lienzo(int anchura, int altura) {
        initComponents();
        this.setBackground(new java.awt.Color(225,225,225)); // el fondo en gris delimitará el lienzo
        /* Crea una imagen en blanco donde poder dibujar */
        img = new BufferedImage(anchura, altura, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = img.createGraphics();  
        g2d.setPaint(Color.white); 
        g2d.fill(new Rectangle2D.Float(0,0,img.getWidth(),img.getHeight())); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 300));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja el evento de presionar el ratón sobre el lienzo.
     * Deberá crear las formas correspondientes, mover o editar según el caso.
     * @param evt presionar el ratón sobre el lienzo
     */
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if(mover.getMovimiento()) // obtenemos la figura a mover
            mover.getSelectedShape(evt.getPoint(), vForma);
        else if(seleccionar.getSeleccionar()) // obtenemos la figura a editar
            seleccionar.getSelectedShape(evt.getPoint(), vForma);        
        else if(terminarCurva == true && herramienta == Forma.CURVA){ // comprueba si estamos realizando una curva y ademas no se cambió de forma
            this.updateCurve(evt.getPoint());        
            terminarCurva = false;
        }
        else{ // en caso contrario se crea la forma seleccionada
            this.createShape(evt.getPoint());
        }              
        this.repaint(); // pinta el vector de formas
    }//GEN-LAST:event_formMousePressed

    /**
     * Maneja el evento de arrastrar el ratón sobre el lienzo.
     * Deberá redimensionar las formas correspondientes o moverlas según el caso.
     * @param evt arrastrar el ratón sobre el lienzo
     */
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        if(mover.getMovimiento()){ // si queremos mover, actualiza la nueva posición de la figura
            if(mover.getObjeto()!=null)
                mover.setLocation(mover.getObjeto(), evt.getPoint());
        }  
        else if(herramienta == Forma.TRAZO_LIBRE){ // si estamos con trazo libre, va uniendo lineas conforme se arrastra el ratón
            this.updateShape(evt.getPoint());
            this.createShape(evt.getPoint());            
        }
        else if(herramienta == Forma.GOMA) // si tenemos la goma, va creando rectángulos blancos por donde vamos arrastrando
            this.createShape(evt.getPoint());
           
        else    this.updateShape(evt.getPoint()); // en caso contrario, actualiza la forma con el nuevo tamaño
        this.repaint(); // pinta el vector de formas
    }//GEN-LAST:event_formMouseDragged

    
    /**
     * Pinta lo del padre, y además el vector de formas sobre el lienzo.
     * @param g donde se dibuja
     */
    public void paint(Graphics g){ 
        super.paint(g); 
        paintShapes(g);        
    }
      
    /**
     * Pinta el vector de formas sobre el lienzo.
     * @param g donde se dibuja
     */    
    public void paintShapes(Graphics g){
        Graphics2D g2d = (Graphics2D)g; 
        if(img!=null) g2d.drawImage(img,0,0,this);
        
        for(Forma f:vForma) { // recorre el vector de formas
            g2d.setStroke(f.getTrazo());
            if(f.getRelleno().estaRelleno()){
                /* colorea el relleno según el tipo */
                switch(f.getRelleno().getDegradado()){
                    case liso:
                        g2d.setPaint((Color)f.getRelleno().getColorFondo()); 
                        g2d.fill(f.getFigura());
                        g2d.setPaint(f.getColor()); //configuramos el color del borde
                        break;
                    case horizontal:
                        gradiente = new GradientPaint(0, 0, (Color)f.getColor(), getWidth(), 0, (Color)f.getRelleno().getColorFondo());
                        g2d.setPaint(gradiente);
                        g2d.fill(f.getFigura());
                        break;
                    case vertical:
                        gradiente = new GradientPaint(0, 0, (Color)f.getColor(), 0, getHeight(), (Color)f.getRelleno().getColorFondo());
                        g2d.setPaint(gradiente);
                        g2d.fill(f.getFigura());
                        break;
                }                   
            } 
            else // en caso de no haber relleno, solo dibujamos el contorno de la figura
                g2d.setPaint(f.getColor()); 
            g2d.draw(f.getFigura()); 
        }     
    }

    /**
     * Crea la figura seleccionada.
     * @param ini punto inicial a partir del cual crear la figura
     */
    public void createShape(Point2D ini){
        if(herramienta!=null){
            switch (herramienta){
                case Forma.PUNTO: 
                    figura = new Punto(ini);
                    break;   
                case Forma.LINEA: 
                    figura = new Linea(ini);
                    break;        
                case Forma.RECTANGULO:
                    figura = new Rectangulo(ini, false);
                    break;
                case Forma.RECTANGULO_REDONDEADO:
                    figura = new Rectangulo(ini, true);
                    break;          
                case Forma.ELIPSE:
                    figura = new Elipse(ini);
                    break;                    
                case Forma.CURVA:
                    figura = new Curva(ini);
                    terminarCurva = true;
                    break;
                case Forma.TRAZO_LIBRE:
                    figura = new Linea(ini); 
                    break;
                case Forma.GOMA:
                    figura = new Goma(ini);
                    break;
            }
            if(herramienta == Forma.GOMA){ // si queremos usar la goma, dibujamos un rectángulo pequeño en blanco
                mirelleno = new Relleno(Degradado.liso, Color.WHITE);
                figura.setPropiedades(Color.WHITE, new BasicStroke(grosor), mirelleno);
                vForma.add(figura);
            }
            else{
                if(relleno.estaRelleno())
                    mirelleno = new Relleno(relleno.getDegradado(), (Color)relleno.getColorFondo());
                else
                    mirelleno = new Relleno(false);
                figura.setPropiedades((Color)color1, trazo, mirelleno); // guarda las propiedades de la figura
                vForma.add(figura); // añade la forma al vector
            }
        }
    }
    
    /**
     * Actualiza el tamaño de la forma.
     * @param fin punto final de la figura
     */
    public void updateShape(Point2D fin){
        if(herramienta!=null){
            switch (herramienta){
                case Forma.LINEA:
                    ((Linea)figura).setLinea(fin);
                    break;        
                case Forma.RECTANGULO:
                    ((Rectangulo)figura).setRectangulo(fin);
                    break;         
                case Forma.RECTANGULO_REDONDEADO:
                    ((Rectangulo)figura).setRectangulo(fin);
                    break;      
                case Forma.ELIPSE:
                    ((Elipse)figura).setElipse(fin);
                    break;              
                case Forma.CURVA:
                    ((Curva)figura).setCurva(fin);
                    terminarCurva = true;
                    break;
                case Forma.TRAZO_LIBRE:
                    ((Linea)figura).setLinea(fin);
                    break;
            }
        }
    }
    
    /**
     * Termina de dibujar la curva al marcar el punto de control.
     * @param pcontrol punto de control sobre el lienzo
     */
    public void updateCurve(Point2D pcontrol){
        ((Curva)figura).setControl(pcontrol);        
    }
    
    /**
     * Devuelve la forma seleccionada.
     * @return forma seleccionada en la ventana principal
     */
    public static String getForma(){
        return herramienta;
    }
    
    /**
     * Cambia la forma seleccionada.
     * @param forma nueva fomra seleccionada en la ventana principal
     */
    public static void setForma(String forma){
        herramienta = forma;
        // si elegimos forma quitamos la opcion de mover y seleccionar
        setMover(false);
        setSeleccionar(false);
    }
    
    /**
     * Traduce la elección de un color de tipo String a tipo Color.
     * @param colorElegido color en tipo String
     * @return color en tipo Color
     */
    public static Paint getColor(String colorElegido){
        Paint color = new Color(0,0,0);
        switch(colorElegido){
            case "Negro":
                color = Color.BLACK;
                break;
            case "Blanco":
                color = Color.WHITE;
                break;
            case "Rojo":
                color = Color.RED;
                break;
            case "Amarillo":
                color = Color.YELLOW;
                break;
            case "Azul":
                color = Color.BLUE;
                break;
            case "Verde":
                color = Color.GREEN;
                break;                
        };
        return color;
    }
    
    /**
     * Devuelve el color principal del lienzo.
     * @return color principal
     */
    public static Paint getColorFrente(){
        return color1;
    }
    
    /**
     * Cambia el color principal del lienzo.
     * @param nuevoColor nuevo color principal
     */
    public static void setColorFrente(Paint nuevoColor){
        color1 = nuevoColor;
    }
    
    /**
     * Devuelve el color de fondo del lienzo.
     * @return color de fondo
     */ 
    public static Paint getColorFondo(){
        return relleno.getColorFondo();
    }
    
    /**
     * Cambia el color de fondo del lienzo.
     * @param nuevoColor nuevo color de fondo
     */    
    public static void setColorFondo(Paint nuevoColor){
        relleno.setColorFondo((Color)nuevoColor);
    }
    
    /**
     * Devuelve si la discontinuidad está activa.
     * @return true si la discontinuidad del trazo está activa
     */
    public static boolean getDiscontinuidad(){
        return discontinuo;
    }
    
    /**
     * Configura la discontinuidad del trazo.
     * @param discontinuidad está seleccionada la discontinuidad?
     */
    public static void setDiscontinuidad(boolean discontinuidad){
        discontinuo = discontinuidad;
    }
    
    /**
     * Devuelve el grosor del trazo.
     * @return grosor del trazo
     */
    public static float getGrosor(){
        return grosor;
    }
    
    /**
     * Configura el trazo con el grosor y discontinuidad.
     * @param nuevoGrosor nuevo valor de grosor
     * @param discontinuidad está activa la discontinuidad?
     */
    public static void setStroke(float nuevoGrosor, boolean discontinuidad){
        setDiscontinuidad(discontinuidad);
        if(discontinuidad)
            trazo = new BasicStroke(nuevoGrosor,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,5.0f, dash, 0.0f);
        else
            trazo = new BasicStroke (nuevoGrosor);
        grosor = nuevoGrosor;        
    }
    
    /**
     * Configura el relleno de las formas.
     * @param nuevoRelleno está activo el relleno?
     */
    public static void setRelleno(boolean nuevoRelleno){
        relleno.setRelleno(nuevoRelleno);
    }
    
    /**
     * Configura el relleno con el tipo de degradado.
     * @param tipo tipo de degradado
     */
    public static void setRelleno(Degradado tipo){
        relleno.setDegradado(tipo);
    }
    
    /**
     * Configura el relleno con el tipo de degradado y el color segundario.
     * @param tipo tipo de degradado
     * @param colorSecundario color de fondo
     */
    public static void setRelleno(Degradado tipo, Color colorSecundario){
        relleno.setRelleno(tipo, colorSecundario);
    }
    
    /**
     * Configura la opción mover.
     * @param nuevoMover está activa la opción mover?
     */
    public static void setMover(boolean nuevoMover){
        mover.setMovimiento(nuevoMover);
        if(nuevoMover)
            seleccionar.setSeleccionar(false);
    }
    
    /**
     * Configura la opción editar.
     * @param nuevaSeleccion está activa la opción editar?
     */
    public static void setSeleccionar(boolean nuevaSeleccion){
        seleccionar.setSeleccionar(nuevaSeleccion);
        if(nuevaSeleccion)
            mover.setMovimiento(false);
    }
    
    /**
     * Devuelve el estado de la opción editar.
     * @return true si la opción editar está activa
     */
    public static boolean getSeleccionar(){
        return seleccionar.getSeleccionar();
    }
    
    /**
     * Devuelve la posición de la figura a editar.
     * @return posición en el vector de formas
     */
    public static int getSelecccion(){
        return seleccionar.getFigura();
    }
    
    /**
     * Añade una imagen al lienzo.
     * @param img imagen 
     */
    public void setImage(BufferedImage img){
        this.img = img;
        setPreferredSize(new Dimension(img.getWidth(),img.getHeight())); // redimensiona el lienzo al tamaño de la imagen
    }
    
    /**
     * Devuelve la imagen del lienzo.
     * @return imagen
     */
    public BufferedImage getImage(){
        return this.img;        
    }
            
    /**
     * Edita el color de la forma seleecionada.
     */    
    public void editarColor(){
        vForma.get(seleccionar.getFigura()).setColor((Color)color1);
    }
    
    /**
     * Edita el trazo de la forma seleecionada.
     */
    public void editarTrazo(){
        vForma.get(seleccionar.getFigura()).setTrazo(trazo); //edita el trazo de la figura seleccionada
    }
    
    /**
     * Edita el relleno de la forma seleecionada.
     */    
    public void editarRelleno(){
        if(relleno.estaRelleno())
            mirelleno = new Relleno(relleno.getDegradado(), (Color)relleno.getColorFondo());
        else
            mirelleno = new Relleno(false);
        vForma.get(seleccionar.getFigura()).setRelleno(mirelleno);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
