
package practicafinal.dibujo;

/**
 * Crea un diálogo de selección de color de entre una larga lista.
 * Mantiene colores recientes y se le puede meter el color RGB manualmente.
 *
 * @author Rubén Martín
 */
 
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
 

public class ColorChooser extends JPanel implements ChangeListener {
 
    protected JColorChooser tcc;
    protected JLabel banner;
 
    /**
     * Constructor de seleccción de color.
     */
    public ColorChooser() {
        super(new BorderLayout());
 
        /* Configura el banner de la cabecera para ver un ejemplo del color seleccionado */
        banner = new JLabel("Elige el color", JLabel.CENTER);
        banner.setForeground(Color.yellow);
        banner.setBackground(Color.blue);
        banner.setOpaque(true);
        banner.setFont(new Font("SansSerif", Font.BOLD, 24));
        banner.setPreferredSize(new Dimension(100, 65));
 
        JPanel bannerPanel = new JPanel(new BorderLayout());
        bannerPanel.add(banner, BorderLayout.CENTER);
        bannerPanel.setBorder(BorderFactory.createTitledBorder("Banner"));
 
        /* Almacena el color seleccionado en la variable tcc */
        tcc = new JColorChooser(banner.getForeground());
        tcc.getSelectionModel().addChangeListener(this);
        tcc.setBorder(BorderFactory.createTitledBorder("Choose Text Color"));
        
        add(bannerPanel, BorderLayout.CENTER);
        add(tcc, BorderLayout.PAGE_END);
    }
 
    /**
     * Cambia el fondo del banner con el nuevo color seleccionado.
     * @param e acción de cambiar de color
     */
    public void stateChanged(ChangeEvent e) {
        Color newColor = tcc.getColor();
        banner.setForeground(newColor);
    }
    
    /**
     * Devuelve el color seleccionado.
     * @return color de fondo del banner
     */
    public Paint seleccionColor(){
        return banner.getForeground();
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Elección de color");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new ColorChooser();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
