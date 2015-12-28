
package practicafinal;

import practicafinal.imagen.CapturaFrame;
import practicafinal.dibujo.DialogoTamanio;
import practicafinal.dibujo.Lienzo;
import practicafinal.dibujo.Forma;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.filechooser.FileNameExtensionFilter;
import practicafinal.dibujo.ColorChooser;
import practicafinal.dibujo.Relleno.Degradado;
import practicafinal.imagen.AfinidadOp;
import practicafinal.imagen.BrilloOp;
import practicafinal.imagen.ColorOp;
import practicafinal.imagen.ContrasteOp;
import practicafinal.imagen.FiltroOp;
import practicafinal.imagen.InvertirOp;
import practicafinal.imagen.UmbralizacionOp;
import practicafinal.imagen.UmbralizacionOp.tipoUmbral;

/**
 * La ventana principal se encarga de manejar todos los eventos
 * asociados con los controles de navegación del usuario.
 * También deberá crear los distintos tipos de ventanas internas 
 * en el escritorio central.
 * 
 * @author Rubén Martín
 */

public class VentanaPrincipal extends javax.swing.JFrame {
    JFrame dlgColor1, dlgColor2; // los diálogos de color los creamos aquí para que vaya guardando los colores recientes
    JComponent elegirColor1, elegirColor2; // paneles de elección de color
    BufferedImage imgOriginal, imgAnterior; // imgOriginal para operaciones con slider, imgAnterior para poder deshacer la operación
    UmbralizacionOp umbralizacion; // guarda el estado de la umbralización
            
     /**
     * Creación e inicialización de la ventana principal.
     */
    public VentanaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH); // maximiza la ventana principal
        imgOriginal = null;   
        imgAnterior = null;
        umbralizacion = new UmbralizacionOp();
        dlgColor1 = new JFrame("Elección de color"); // título del diálogo de color
        dlgColor2 = new JFrame("Elección de color"); 
        elegirColor1 = new ColorChooser();
        elegirColor2 = new ColorChooser();        
        elegirColor1.setOpaque(true);
        elegirColor2.setOpaque(true);
        dlgColor1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // cuando damos a X se oculta, para que mantenga los colores recientes     
        dlgColor1.setContentPane(elegirColor1); // metemeos en el diálogo, el panel de elección de color
        dlgColor2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        dlgColor2.setContentPane(elegirColor2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesFormas = new javax.swing.ButtonGroup();
        botonesRelleno = new javax.swing.ButtonGroup();
        BarraEstado = new javax.swing.JLabel();
        PanelCentral = new javax.swing.JPanel();
        BarraGeneral = new javax.swing.JToolBar();
        botonNuevaImagenBarra = new javax.swing.JButton();
        botonNuevoAudioBarra = new javax.swing.JButton();
        botonAbrirBarra = new javax.swing.JButton();
        botonGuardarBarra = new javax.swing.JButton();
        SeparadorBotonesGeneral = new javax.swing.JToolBar.Separator();
        botonWebCam = new javax.swing.JButton();
        botonCaptura = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        botonDeshacer = new javax.swing.JButton();
        BarraOperaciones = new javax.swing.JToolBar();
        jSplitPane8 = new javax.swing.JSplitPane();
        jSplitPane6 = new javax.swing.JSplitPane();
        jSplitPane4 = new javax.swing.JSplitPane();
        jSplitPane3 = new javax.swing.JSplitPane();
        PanelEfColor = new javax.swing.JPanel();
        barraBandas = new javax.swing.JSlider();
        botonEfColor = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        PanelUmbralizacion = new javax.swing.JPanel();
        barraUmbral = new javax.swing.JSlider();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        botonTipoUmbral = new javax.swing.JComboBox();
        eleccionColorUmbral = new javax.swing.JComboBox();
        PanelFiltro = new javax.swing.JPanel();
        botonFiltro = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        PanelContraste = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        botonContrasteNormal = new javax.swing.JButton();
        botonOscurecer = new javax.swing.JButton();
        botonIluminacion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        PanelBrillo = new javax.swing.JPanel();
        barraBrillo = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSplitPane5 = new javax.swing.JSplitPane();
        PanelEscalado = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        botonEscalaMenos = new javax.swing.JButton();
        botonEscalaMas = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        PanelRotacion = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        botonRotar90 = new javax.swing.JButton();
        barraRotacion = new javax.swing.JSlider();
        botonRotar180 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSplitPane7 = new javax.swing.JSplitPane();
        botonDuplicar = new javax.swing.JButton();
        botonInvertir = new javax.swing.JButton();
        BarraDibujo = new javax.swing.JToolBar();
        PanelFormas = new javax.swing.JPanel();
        botonPunto = new javax.swing.JToggleButton();
        botonLinea = new javax.swing.JToggleButton();
        botonRectangulo = new javax.swing.JToggleButton();
        botonElipse = new javax.swing.JToggleButton();
        botonCurva = new javax.swing.JToggleButton();
        botonTrazoLibre = new javax.swing.JToggleButton();
        botonGoma = new javax.swing.JToggleButton();
        botonRedondeado = new javax.swing.JToggleButton();
        PanelTrazo = new javax.swing.JPanel();
        botonGrosor = new javax.swing.JSpinner();
        botonDiscontinuidad = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelColor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        eleccionColor1 = new javax.swing.JComboBox();
        eleccionColor2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        botonColor1 = new javax.swing.JButton();
        botonColor2 = new javax.swing.JButton();
        PanelRelleno = new javax.swing.JPanel();
        botonRellenoLiso = new javax.swing.JToggleButton();
        botonRellenoDeg = new javax.swing.JToggleButton();
        botonSinRelleno = new javax.swing.JToggleButton();
        eleccionTipoDeg = new javax.swing.JComboBox();
        PanelEdicion = new javax.swing.JPanel();
        botonMover = new javax.swing.JToggleButton();
        botonEditar = new javax.swing.JToggleButton();
        escritorio = new javax.swing.JDesktopPane();
        MenuPrincipal = new javax.swing.JMenuBar();
        botonArchivo = new javax.swing.JMenu();
        botonMenuImagen = new javax.swing.JMenuItem();
        botonMenuAudio = new javax.swing.JMenuItem();
        SeparadorMenu = new javax.swing.JPopupMenu.Separator();
        botonMenuAbrir = new javax.swing.JMenuItem();
        botonMenuGuardar = new javax.swing.JMenuItem();
        botonVer = new javax.swing.JMenu();
        botonVerGeneral = new javax.swing.JCheckBoxMenuItem();
        botonVerDibujo = new javax.swing.JCheckBoxMenuItem();
        botonVerOperaciones = new javax.swing.JCheckBoxMenuItem();
        botonVerEstado = new javax.swing.JCheckBoxMenuItem();
        botonAyuda = new javax.swing.JMenu();
        botonAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BarraEstado.setText("¡Bienvenido!");
        getContentPane().add(BarraEstado, java.awt.BorderLayout.PAGE_END);

        PanelCentral.setLayout(new java.awt.BorderLayout());

        BarraGeneral.setRollover(true);

        botonNuevaImagenBarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/NuevoBoceto.GIF"))); // NOI18N
        botonNuevaImagenBarra.setToolTipText("Nueva Imagen");
        botonNuevaImagenBarra.setFocusable(false);
        botonNuevaImagenBarra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNuevaImagenBarra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonNuevaImagenBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaImagenBarraActionPerformed(evt);
            }
        });
        BarraGeneral.add(botonNuevaImagenBarra);

        botonNuevoAudioBarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/NuevoAudio.png"))); // NOI18N
        botonNuevoAudioBarra.setToolTipText("Nuevo Audio");
        botonNuevoAudioBarra.setFocusable(false);
        botonNuevoAudioBarra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNuevoAudioBarra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonNuevoAudioBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoAudioBarraActionPerformed(evt);
            }
        });
        BarraGeneral.add(botonNuevoAudioBarra);

        botonAbrirBarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/AbrirMedio.png"))); // NOI18N
        botonAbrirBarra.setToolTipText("Abrir");
        botonAbrirBarra.setFocusable(false);
        botonAbrirBarra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAbrirBarra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAbrirBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbrirBarraActionPerformed(evt);
            }
        });
        BarraGeneral.add(botonAbrirBarra);

        botonGuardarBarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/Guardar.gif"))); // NOI18N
        botonGuardarBarra.setToolTipText("Guardar");
        botonGuardarBarra.setFocusable(false);
        botonGuardarBarra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonGuardarBarra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonGuardarBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarBarraActionPerformed(evt);
            }
        });
        BarraGeneral.add(botonGuardarBarra);
        BarraGeneral.add(SeparadorBotonesGeneral);

        botonWebCam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/Camara.png"))); // NOI18N
        botonWebCam.setToolTipText("Webcam");
        botonWebCam.setFocusable(false);
        botonWebCam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonWebCam.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonWebCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonWebCamActionPerformed(evt);
            }
        });
        BarraGeneral.add(botonWebCam);

        botonCaptura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/Capturar.png"))); // NOI18N
        botonCaptura.setToolTipText("Capturar");
        botonCaptura.setFocusable(false);
        botonCaptura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCaptura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCaptura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCapturaActionPerformed(evt);
            }
        });
        BarraGeneral.add(botonCaptura);
        BarraGeneral.add(jSeparator1);

        botonDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/deshacer.png"))); // NOI18N
        botonDeshacer.setToolTipText("Deshacer operación");
        botonDeshacer.setFocusable(false);
        botonDeshacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDeshacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeshacerActionPerformed(evt);
            }
        });
        BarraGeneral.add(botonDeshacer);

        PanelCentral.add(BarraGeneral, java.awt.BorderLayout.PAGE_START);

        BarraOperaciones.setRollover(true);

        PanelEfColor.setLayout(new java.awt.BorderLayout());

        barraBandas.setMaximum(26);
        barraBandas.setToolTipText("Bandas de color (solo para efecto de combinación)");
        barraBandas.setValue(13);
        barraBandas.setEnabled(false);
        barraBandas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraBandasStateChanged(evt);
            }
        });
        barraBandas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                barraBandasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                barraBandasFocusLost(evt);
            }
        });
        PanelEfColor.add(barraBandas, java.awt.BorderLayout.PAGE_END);

        botonEfColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negativo", "Niveles de gris", "Combinación de bandas" }));
        botonEfColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEfColorActionPerformed(evt);
            }
        });
        PanelEfColor.add(botonEfColor, java.awt.BorderLayout.CENTER);

        jLabel15.setText("Efectos de color");
        jPanel10.add(jLabel15);

        PanelEfColor.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jSplitPane3.setLeftComponent(PanelEfColor);

        PanelUmbralizacion.setLayout(new java.awt.BorderLayout());

        barraUmbral.setMaximum(256);
        barraUmbral.setPaintTicks(true);
        barraUmbral.setToolTipText("Umbral");
        barraUmbral.setValue(128);
        barraUmbral.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraUmbral.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraUmbralStateChanged(evt);
            }
        });
        barraUmbral.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                barraUmbralFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                barraUmbralFocusLost(evt);
            }
        });
        PanelUmbralizacion.add(barraUmbral, java.awt.BorderLayout.CENTER);

        jLabel14.setText("Umbralización");
        jPanel6.add(jLabel14);

        PanelUmbralizacion.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        botonTipoUmbral.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nivel de gris", "Color" }));
        botonTipoUmbral.setToolTipText("Tipo de umbralización");
        botonTipoUmbral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTipoUmbralActionPerformed(evt);
            }
        });
        jPanel11.add(botonTipoUmbral);

        eleccionColorUmbral.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negro", "Blanco", "Rojo", "Amarillo", "Azul", "Verde" }));
        eleccionColorUmbral.setEnabled(false);
        eleccionColorUmbral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionColorUmbralActionPerformed(evt);
            }
        });
        jPanel11.add(eleccionColorUmbral);

        PanelUmbralizacion.add(jPanel11, java.awt.BorderLayout.PAGE_END);

        jSplitPane3.setRightComponent(PanelUmbralizacion);

        jSplitPane4.setRightComponent(jSplitPane3);

        PanelFiltro.setLayout(new java.awt.BorderLayout());

        botonFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Emborronamiento", "Enfoque", "Relieve", "Fronteras" }));
        botonFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiltroActionPerformed(evt);
            }
        });
        PanelFiltro.add(botonFiltro, java.awt.BorderLayout.PAGE_END);

        jLabel7.setText("Filtro");
        jPanel4.add(jLabel7);

        PanelFiltro.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jSplitPane4.setLeftComponent(PanelFiltro);

        jSplitPane6.setRightComponent(jSplitPane4);

        PanelContraste.setLayout(new java.awt.BorderLayout());

        botonContrasteNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/contraste.png"))); // NOI18N
        botonContrasteNormal.setToolTipText("Contraste normal");
        botonContrasteNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContrasteNormalActionPerformed(evt);
            }
        });
        jPanel2.add(botonContrasteNormal);

        botonOscurecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/oscurecer.png"))); // NOI18N
        botonOscurecer.setToolTipText("Contraste con oscurecimiento");
        botonOscurecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOscurecerActionPerformed(evt);
            }
        });
        jPanel2.add(botonOscurecer);

        botonIluminacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/iluminar.png"))); // NOI18N
        botonIluminacion.setToolTipText("Contraste con iluminación");
        botonIluminacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIluminacionActionPerformed(evt);
            }
        });
        jPanel2.add(botonIluminacion);

        PanelContraste.add(jPanel2, java.awt.BorderLayout.CENTER);

        jLabel13.setText("Contraste");
        jPanel3.add(jLabel13);

        PanelContraste.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jSplitPane1.setRightComponent(PanelContraste);

        PanelBrillo.setLayout(new java.awt.BorderLayout());

        barraBrillo.setMaximum(255);
        barraBrillo.setMinimum(-255);
        barraBrillo.setPaintTicks(true);
        barraBrillo.setToolTipText("");
        barraBrillo.setValue(0);
        barraBrillo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraBrillo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraBrilloStateChanged(evt);
            }
        });
        barraBrillo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                barraBrilloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                barraBrilloFocusLost(evt);
            }
        });
        PanelBrillo.add(barraBrillo, java.awt.BorderLayout.CENTER);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/oscurecer.png"))); // NOI18N
        PanelBrillo.add(jLabel8, java.awt.BorderLayout.LINE_START);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/iluminar.png"))); // NOI18N
        PanelBrillo.add(jLabel9, java.awt.BorderLayout.LINE_END);

        jLabel12.setText("Brillo");
        jPanel1.add(jLabel12);

        PanelBrillo.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jSplitPane1.setLeftComponent(PanelBrillo);

        jSplitPane2.setLeftComponent(jSplitPane1);

        PanelEscalado.setLayout(new java.awt.BorderLayout());

        botonEscalaMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/disminuir.png"))); // NOI18N
        botonEscalaMenos.setToolTipText("Escalar a 0.75");
        botonEscalaMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEscalaMenosActionPerformed(evt);
            }
        });
        jPanel8.add(botonEscalaMenos);

        botonEscalaMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/aumentar.png"))); // NOI18N
        botonEscalaMas.setToolTipText("Escalar a 1.25");
        botonEscalaMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEscalaMasActionPerformed(evt);
            }
        });
        jPanel8.add(botonEscalaMas);

        PanelEscalado.add(jPanel8, java.awt.BorderLayout.CENTER);

        jLabel11.setText("Escalado");
        jPanel9.add(jLabel11);

        PanelEscalado.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jSplitPane5.setLeftComponent(PanelEscalado);

        PanelRotacion.setLayout(new java.awt.BorderLayout());

        botonRotar90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/rotacion90.png"))); // NOI18N
        botonRotar90.setToolTipText("Rotar 90º");
        botonRotar90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRotar90ActionPerformed(evt);
            }
        });
        jPanel5.add(botonRotar90);

        barraRotacion.setMaximum(180);
        barraRotacion.setMinimum(-180);
        barraRotacion.setMinorTickSpacing(90);
        barraRotacion.setPaintTicks(true);
        barraRotacion.setToolTipText("");
        barraRotacion.setValue(0);
        barraRotacion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraRotacionStateChanged(evt);
            }
        });
        barraRotacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                barraRotacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                barraRotacionFocusLost(evt);
            }
        });
        jPanel5.add(barraRotacion);

        botonRotar180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/rotacion180.png"))); // NOI18N
        botonRotar180.setToolTipText("Rotar 180º");
        botonRotar180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRotar180ActionPerformed(evt);
            }
        });
        jPanel5.add(botonRotar180);

        PanelRotacion.add(jPanel5, java.awt.BorderLayout.CENTER);

        jLabel10.setText("Rotación");
        jPanel7.add(jLabel10);

        PanelRotacion.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jSplitPane5.setRightComponent(PanelRotacion);

        jSplitPane2.setRightComponent(jSplitPane5);

        jSplitPane6.setLeftComponent(jSplitPane2);

        jSplitPane8.setLeftComponent(jSplitPane6);

        botonDuplicar.setText("Duplicar");
        botonDuplicar.setToolTipText("Realiza una copia de la imagen");
        botonDuplicar.setFocusable(false);
        botonDuplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDuplicar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonDuplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDuplicarActionPerformed(evt);
            }
        });
        jSplitPane7.setRightComponent(botonDuplicar);

        botonInvertir.setText("Invertir");
        botonInvertir.setToolTipText("Invierte la imagen de derecha a izquierda");
        botonInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInvertirActionPerformed(evt);
            }
        });
        jSplitPane7.setLeftComponent(botonInvertir);

        jSplitPane8.setRightComponent(jSplitPane7);

        BarraOperaciones.add(jSplitPane8);

        PanelCentral.add(BarraOperaciones, java.awt.BorderLayout.PAGE_END);

        BarraDibujo.setOrientation(javax.swing.SwingConstants.VERTICAL);
        BarraDibujo.setRollover(true);

        PanelFormas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonesFormas.add(botonPunto);
        botonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/puntaso.png"))); // NOI18N
        botonPunto.setToolTipText("Punto");
        botonPunto.setFocusable(false);
        botonPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPunto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });

        botonesFormas.add(botonLinea);
        botonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/Linea.gif"))); // NOI18N
        botonLinea.setToolTipText("Línea Recta");
        botonLinea.setFocusable(false);
        botonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLineaActionPerformed(evt);
            }
        });

        botonesFormas.add(botonRectangulo);
        botonRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/Rectangulo.gif"))); // NOI18N
        botonRectangulo.setToolTipText("Rectángulo");
        botonRectangulo.setFocusable(false);
        botonRectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRectanguloActionPerformed(evt);
            }
        });

        botonesFormas.add(botonElipse);
        botonElipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/Ovalo.gif"))); // NOI18N
        botonElipse.setToolTipText("Elipse");
        botonElipse.setFocusable(false);
        botonElipse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonElipse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonElipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonElipseActionPerformed(evt);
            }
        });

        botonesFormas.add(botonCurva);
        botonCurva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/curva.png"))); // NOI18N
        botonCurva.setToolTipText("Curva");
        botonCurva.setFocusable(false);
        botonCurva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCurva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCurva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCurvaActionPerformed(evt);
            }
        });

        botonesFormas.add(botonTrazoLibre);
        botonTrazoLibre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/Lapiz.gif"))); // NOI18N
        botonTrazoLibre.setToolTipText("Trazo libre");
        botonTrazoLibre.setFocusable(false);
        botonTrazoLibre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonTrazoLibre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonTrazoLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTrazoLibreActionPerformed(evt);
            }
        });

        botonesFormas.add(botonGoma);
        botonGoma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/Goma.gif"))); // NOI18N
        botonGoma.setToolTipText("Goma");
        botonGoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGomaActionPerformed(evt);
            }
        });

        botonesFormas.add(botonRedondeado);
        botonRedondeado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/circuito.png"))); // NOI18N
        botonRedondeado.setToolTipText("Rectángulo redondeado");
        botonRedondeado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRedondeadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFormasLayout = new javax.swing.GroupLayout(PanelFormas);
        PanelFormas.setLayout(PanelFormasLayout);
        PanelFormasLayout.setHorizontalGroup(
            PanelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormasLayout.createSequentialGroup()
                .addGroup(PanelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelFormasLayout.createSequentialGroup()
                        .addGroup(PanelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFormasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonLinea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(botonCurva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonElipse, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonRedondeado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(PanelFormasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonTrazoLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonGoma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFormasLayout.setVerticalGroup(
            PanelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormasLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(PanelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonRectangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonLinea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonRedondeado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonElipse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCurva, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonTrazoLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGoma, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BarraDibujo.add(PanelFormas);

        PanelTrazo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonGrosor.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        botonGrosor.setValue(Lienzo.getGrosor());
        botonGrosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                botonGrosorStateChanged(evt);
            }
        });

        botonDiscontinuidad.setFocusable(false);
        botonDiscontinuidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDiscontinuidad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonDiscontinuidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDiscontinuidadActionPerformed(evt);
            }
        });

        jLabel1.setText("Grosor");

        jLabel2.setText("Discontinuidad");

        javax.swing.GroupLayout PanelTrazoLayout = new javax.swing.GroupLayout(PanelTrazo);
        PanelTrazo.setLayout(PanelTrazoLayout);
        PanelTrazoLayout.setHorizontalGroup(
            PanelTrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTrazoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelTrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelTrazoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(botonDiscontinuidad))
                    .addGroup(PanelTrazoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(botonGrosor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelTrazoLayout.setVerticalGroup(
            PanelTrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTrazoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGrosor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(PanelTrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonDiscontinuidad)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BarraDibujo.add(PanelTrazo);

        PanelColor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Color frente");

        eleccionColor1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Negro", "Blanco", "Rojo", "Amarillo", "Azul", "Verde" }));
        eleccionColor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionColor1ActionPerformed(evt);
            }
        });

        eleccionColor2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Blanco", "Negro", "Rojo", "Amarillo", "Azul", "Verde" }));
        eleccionColor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionColor2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Color fondo");

        botonColor1.setBackground((Color)Lienzo.getColorFrente());
        botonColor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonColor1ActionPerformed(evt);
            }
        });

        botonColor2.setBackground((Color)Lienzo.getColorFondo());
        botonColor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonColor2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelColorLayout = new javax.swing.GroupLayout(PanelColor);
        PanelColor.setLayout(PanelColorLayout);
        PanelColorLayout.setHorizontalGroup(
            PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(PanelColorLayout.createSequentialGroup()
                        .addGroup(PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColorLayout.createSequentialGroup()
                                .addGroup(PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eleccionColor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eleccionColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelColorLayout.setVerticalGroup(
            PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eleccionColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelColorLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eleccionColor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(PanelColorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(botonColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BarraDibujo.add(PanelColor);

        PanelRelleno.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonesRelleno.add(botonRellenoLiso);
        botonRellenoLiso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/ColorLiso.png"))); // NOI18N
        botonRellenoLiso.setToolTipText("Relleno liso");
        botonRellenoLiso.setFocusable(false);
        botonRellenoLiso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRellenoLiso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRellenoLiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRellenoLisoActionPerformed(evt);
            }
        });

        botonesRelleno.add(botonRellenoDeg);
        botonRellenoDeg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/degradado.png"))); // NOI18N
        botonRellenoDeg.setToolTipText("Relleno degradado");
        botonRellenoDeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRellenoDegActionPerformed(evt);
            }
        });

        botonesRelleno.add(botonSinRelleno);
        botonSinRelleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/Sinborde.png"))); // NOI18N
        botonSinRelleno.setSelected(true);
        botonSinRelleno.setToolTipText("Sin relleno");
        botonSinRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSinRellenoActionPerformed(evt);
            }
        });

        eleccionTipoDeg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Horizontal", "Vertical" }));
        eleccionTipoDeg.setToolTipText("Tipo de degradado");
        eleccionTipoDeg.setEnabled(false);
        eleccionTipoDeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionTipoDegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRellenoLayout = new javax.swing.GroupLayout(PanelRelleno);
        PanelRelleno.setLayout(PanelRellenoLayout);
        PanelRellenoLayout.setHorizontalGroup(
            PanelRellenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRellenoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRellenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eleccionTipoDeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelRellenoLayout.createSequentialGroup()
                        .addComponent(botonSinRelleno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonRellenoLiso, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonRellenoDeg, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelRellenoLayout.setVerticalGroup(
            PanelRellenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRellenoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelRellenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonRellenoDeg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRellenoLiso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSinRelleno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eleccionTipoDeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BarraDibujo.add(PanelRelleno);

        PanelEdicion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonesFormas.add(botonMover);
        botonMover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/mover.png"))); // NOI18N
        botonMover.setToolTipText("Mover figura");
        botonMover.setFocusable(false);
        botonMover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMoverActionPerformed(evt);
            }
        });

        botonesFormas.add(botonEditar);
        botonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal/images/seleccionar.png"))); // NOI18N
        botonEditar.setSelected(true);
        botonEditar.setToolTipText("Editar figura");
        botonEditar.setFocusable(false);
        botonEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEdicionLayout = new javax.swing.GroupLayout(PanelEdicion);
        PanelEdicion.setLayout(PanelEdicionLayout);
        PanelEdicionLayout.setHorizontalGroup(
            PanelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEdicionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMover)
                .addContainerGap())
        );
        PanelEdicionLayout.setVerticalGroup(
            PanelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEdicionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonMover, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEditar, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        BarraDibujo.add(PanelEdicion);

        PanelCentral.add(BarraDibujo, java.awt.BorderLayout.LINE_END);
        PanelCentral.add(escritorio, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanelCentral, java.awt.BorderLayout.CENTER);

        botonArchivo.setText("Archivo");

        botonMenuImagen.setText("Nueva Imagen");
        botonMenuImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuImagenActionPerformed(evt);
            }
        });
        botonArchivo.add(botonMenuImagen);

        botonMenuAudio.setText("Nuevo Audio");
        botonMenuAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuAudioActionPerformed(evt);
            }
        });
        botonArchivo.add(botonMenuAudio);
        botonArchivo.add(SeparadorMenu);

        botonMenuAbrir.setText("Abrir");
        botonMenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuAbrirActionPerformed(evt);
            }
        });
        botonArchivo.add(botonMenuAbrir);

        botonMenuGuardar.setText("Guardar");
        botonMenuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuGuardarActionPerformed(evt);
            }
        });
        botonArchivo.add(botonMenuGuardar);

        MenuPrincipal.add(botonArchivo);

        botonVer.setText("Ver");

        botonVerGeneral.setSelected(true);
        botonVerGeneral.setText("Barra general");
        botonVerGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerGeneralActionPerformed(evt);
            }
        });
        botonVer.add(botonVerGeneral);

        botonVerDibujo.setSelected(true);
        botonVerDibujo.setText("Barra de dibujo");
        botonVerDibujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDibujoActionPerformed(evt);
            }
        });
        botonVer.add(botonVerDibujo);

        botonVerOperaciones.setSelected(true);
        botonVerOperaciones.setText("Barra de operaciones");
        botonVerOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerOperacionesActionPerformed(evt);
            }
        });
        botonVer.add(botonVerOperaciones);

        botonVerEstado.setSelected(true);
        botonVerEstado.setText("Barra de estado");
        botonVerEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerEstadoActionPerformed(evt);
            }
        });
        botonVer.add(botonVerEstado);

        MenuPrincipal.add(botonVer);

        botonAyuda.setText("Ayuda");

        botonAcercaDe.setText("Acerca de");
        botonAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcercaDeActionPerformed(evt);
            }
        });
        botonAyuda.add(botonAcercaDe);

        MenuPrincipal.add(botonAyuda);

        setJMenuBar(MenuPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Muetra la ventana de ACERCA DE del panel de ayuda.
     * @param evt acción de pulsar el botón ACERCA DE
     */
    private void botonAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcercaDeActionPerformed
        VentanaAcercaDe acercade = new VentanaAcercaDe(this, rootPaneCheckingEnabled);
        acercade.setVisible(true);
    }//GEN-LAST:event_botonAcercaDeActionPerformed

    /**
     * Muestra u oculta la barra de estado.
     * @param evt acción de pulsar sobre el botón Ver barra de estado
     */
    private void botonVerEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerEstadoActionPerformed
        if(BarraEstado.isVisible()) BarraEstado.setVisible(false);
        else BarraEstado.setVisible(true); 
    }//GEN-LAST:event_botonVerEstadoActionPerformed

    /**
     * Muestra u oculta la barra general.
     * @param evt acción de pulsar sobre el botón Ver barra general
     */
    private void botonVerGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerGeneralActionPerformed
        verBarra(BarraGeneral);       
    }//GEN-LAST:event_botonVerGeneralActionPerformed

    /**
     * Crea una nueva imagen (lienzo para dibujar).
     * @param evt acción de pulsar el botón de Nueva imagen de la barra de herramientas
     */
    private void botonNuevaImagenBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaImagenBarraActionPerformed
        crearImagen();
    }//GEN-LAST:event_botonNuevaImagenBarraActionPerformed

    /**
     * Muestra u oculta la barra de dibujo.
     * @param evt acción de pulsar sobre el botón Ver barra de dibujo
     */        
    private void botonVerDibujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDibujoActionPerformed
        verBarra(BarraDibujo);      
    }//GEN-LAST:event_botonVerDibujoActionPerformed

    /**
     * Muestra u oculta la barra de operaciones sobre imágenes.
     * @param evt acción de pulsar sobre el botón Ver barra de operaciones
     */        
    private void botonVerOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerOperacionesActionPerformed
        verBarra(BarraOperaciones);   
    }//GEN-LAST:event_botonVerOperacionesActionPerformed

    /**
     * Crea una nueva imagen (lienzo para dibujar).
     * @param evt acción de pulsar el botón de Nueva imagen del menú Archivo
     */    
    private void botonMenuImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuImagenActionPerformed
        crearImagen();
    }//GEN-LAST:event_botonMenuImagenActionPerformed

    /**
     * Crea un nuevo audio.
     * @param evt acción de pulsar el botón de Nuevo audio del menú Archivo
     */    
    private void botonMenuAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuAudioActionPerformed
        crearAudio();
    }//GEN-LAST:event_botonMenuAudioActionPerformed

    /**
     * Crea un nuevo audio.
     * @param evt acción de pulsar el botón de Nuevo audio de la barra de herramientas
     */        
    private void botonNuevoAudioBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoAudioBarraActionPerformed
        crearAudio();
    }//GEN-LAST:event_botonNuevoAudioBarraActionPerformed

    /**
     * Configura el PUNTO como la forma a dibujar en el lienzo.
     * @param evt acción de pulsar el botón de Punto
     */
    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        Lienzo.setForma(Forma.PUNTO);
    }//GEN-LAST:event_botonPuntoActionPerformed

    /**
     * Configura la LÍNEA como la forma a dibujar en el lienzo.
     * @param evt acción de pulsar el botón de Línea
     */    
    private void botonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLineaActionPerformed
        Lienzo.setForma(Forma.LINEA);
    }//GEN-LAST:event_botonLineaActionPerformed

    /**
     * Configura el RECTÁNGULO como la forma a dibujar en el lienzo.
     * @param evt acción de pulsar el botón de Rectángulo
     */        
    private void botonRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRectanguloActionPerformed
        Lienzo.setForma(Forma.RECTANGULO);
    }//GEN-LAST:event_botonRectanguloActionPerformed

    /**
     * Configura la ELIPSE como la forma a dibujar en el lienzo.
     * @param evt acción de pulsar el botón de Elipse
     */        
    private void botonElipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonElipseActionPerformed
        Lienzo.setForma(Forma.ELIPSE);
    }//GEN-LAST:event_botonElipseActionPerformed

    /**
     * Configura la CURVA como la forma a dibujar en el lienzo.
     * @param evt acción de pulsar el botón de Curva
     */        
    private void botonCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCurvaActionPerformed
        Lienzo.setForma(Forma.CURVA);
    }//GEN-LAST:event_botonCurvaActionPerformed

    /**
     * Configura el TRAZO LIBRE como la forma a dibujar en el lienzo.
     * @param evt acción de pulsar el botón de Trazo libre
     */        
    private void botonTrazoLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTrazoLibreActionPerformed
        Lienzo.setForma(Forma.TRAZO_LIBRE);
    }//GEN-LAST:event_botonTrazoLibreActionPerformed

    /**
     * Configura la GOMA como la forma a dibujar en el lienzo.
     * @param evt acción de pulsar el botón de Goma
     */        
    private void botonGomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGomaActionPerformed
        Lienzo.setForma(Forma.GOMA);
    }//GEN-LAST:event_botonGomaActionPerformed

    /**
     * Configura el RECTÁNGULO REDONDEADO como la forma a dibujar en el lienzo.
     * @param evt acción de pulsar el botón de Rectángulo redondeado
     */        
    private void botonRedondeadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRedondeadoActionPerformed
        Lienzo.setForma(Forma.RECTANGULO_REDONDEADO);
    }//GEN-LAST:event_botonRedondeadoActionPerformed

    /**
     * Configura el GROSOR del trazo del lienzo.
     * @param evt acción de cambiar el valor de Grosor
     */
    private void botonGrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_botonGrosorStateChanged
        Lienzo.setStroke(Integer.parseInt(botonGrosor.getValue().toString()), Lienzo.getDiscontinuidad());
        editarTrazo();
    }//GEN-LAST:event_botonGrosorStateChanged

    /**
     * Configura la DISCONTINUIDAD del trazo del lienzo.
     * @param evt acción de activar/desactivar la Discontinuidad
     */    
    private void botonDiscontinuidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDiscontinuidadActionPerformed
        if(botonDiscontinuidad.isSelected())
            Lienzo.setStroke(Lienzo.getGrosor(), true);
        else
            Lienzo.setStroke(Lienzo.getGrosor(), false); 
        editarTrazo();
    }//GEN-LAST:event_botonDiscontinuidadActionPerformed

    /**
     * Configura el RELLENO DEGRADADO del lienzo.
     * @param evt acción seleccionar la opción de Relleno degradado
     */    
    private void botonRellenoDegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRellenoDegActionPerformed
        eleccionTipoDeg.setEnabled(true);
        Lienzo.setRelleno(getTipoDeg());   
        editarRelleno();
    }//GEN-LAST:event_botonRellenoDegActionPerformed

    /**
     * Configura el RELLENO VACÍO del lienzo.
     * @param evt acción seleccionar la opción de Sin relleno
     */        
    private void botonSinRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSinRellenoActionPerformed
        eleccionTipoDeg.setEnabled(false);
        Lienzo.setRelleno(false);
        editarRelleno();
    }//GEN-LAST:event_botonSinRellenoActionPerformed

    /**
     * Configura el RELLENO LISO del lienzo.
     * @param evt acción seleccionar la opción de Relleno liso
     */        
    private void botonRellenoLisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRellenoLisoActionPerformed
        eleccionTipoDeg.setEnabled(false);
        Lienzo.setRelleno(Degradado.liso);
        editarRelleno();
    }//GEN-LAST:event_botonRellenoLisoActionPerformed

    /**
     * Configura la opción MOVER del lienzo.
     * @param evt acción de seleccionar la opción Mover
     */
    private void botonMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMoverActionPerformed
        Lienzo.setMover(true);
    }//GEN-LAST:event_botonMoverActionPerformed

    /**
     * Guarda la imagen de la ventana actual.
     * @param evt acción de pulsar el botón de Guardar de la barra de herramientas
     */
    private void botonGuardarBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarBarraActionPerformed
        guardarImagen();
    }//GEN-LAST:event_botonGuardarBarraActionPerformed

    /**
     * Abre un archivo (imagen, audio o video).
     * @param evt acción de pulsar el botón de Abrir de la barra de herramientas
     */
    private void botonAbrirBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbrirBarraActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_botonAbrirBarraActionPerformed

    /**
     * Abre un archivo (imagen, audio o video).
     * @param evt acción de pulsar el botón de Abrir del menú Archivo
     */    
    private void botonMenuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuAbrirActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_botonMenuAbrirActionPerformed

    /**
     * Guarda la imagen de la ventana actual.
     * @param evt acción de pulsar el botón de Guardar del menú Archivo
     */    
    private void botonMenuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuGuardarActionPerformed
        guardarImagen();
    }//GEN-LAST:event_botonMenuGuardarActionPerformed

    /**
     * Crea una ventana con el vídeo capturado de la webcam.
     * @param evt acción al pulsar el botón de WebCam de la barra de herramientas
     */
    private void botonWebCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonWebCamActionPerformed
        WebCam();
    }//GEN-LAST:event_botonWebCamActionPerformed

    /**
     * Crea una nueva imagen con una captura de vídeo, ya sea de reproducción o webcam.
     * @param evt acción de pulsar el botón de Captura de la barra de herramientas
     */
    private void botonCapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCapturaActionPerformed
        capturarImagen();
    }//GEN-LAST:event_botonCapturaActionPerformed

    /**
     * Selecciona el color principal de una lista predeterminada.
     * @param evt acción de elegir el color principal de la lista de colores básicos
     */
    private void eleccionColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionColor1ActionPerformed
        if(evt.getSource() == eleccionColor1){
            Lienzo.setColorFrente(Lienzo.getColor((String)eleccionColor1.getSelectedItem()));
        }
        botonColor1.setBackground((Color)Lienzo.getColorFrente()); // actualiza el color del botón
        editarColor(); // actualiza el color principal de dibujo
    }//GEN-LAST:event_eleccionColor1ActionPerformed

    /**
     * Selecciona el color de fondo de una lista predeterminada.
     * @param evt acción de elegir el color de fondo de la lista de colores básicos
     */    
    private void eleccionColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionColor2ActionPerformed
        if(evt.getSource() == eleccionColor2){
            Lienzo.setColorFondo(Lienzo.getColor((String)eleccionColor2.getSelectedItem()));
        }
        botonColor2.setBackground((Color)Lienzo.getColorFondo()); // actualiza el color del botón
        editarRelleno(); // actualiza el color del relleno
    }//GEN-LAST:event_eleccionColor2ActionPerformed

    /**
     * Selecciona el tipo de degradado.
     * @param evt acción de elegir tipo de degradado
     */
    private void eleccionTipoDegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionTipoDegActionPerformed
        if(evt.getSource() == eleccionTipoDeg)
            Lienzo.setRelleno(getTipoDeg());
        editarRelleno();
    }//GEN-LAST:event_eleccionTipoDegActionPerformed
    
    /**
     * Selecciona el color principal de la ventana de colores.
     * @param evt acción de pulsar el botón de color principal
     */    
    private void botonColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonColor1ActionPerformed
        /* Abre el diálogo de selección de color y cuando se cierra, actualiza el color */
        dlgColor1.pack();
        dlgColor1.setVisible(true);
        dlgColor1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                Lienzo.setColorFrente((Color)(((ColorChooser)elegirColor1).seleccionColor()));
                botonColor1.setBackground((Color)Lienzo.getColorFrente());
                editarColor();
            }
        });        
    }//GEN-LAST:event_botonColor1ActionPerformed

    /**
     * Selecciona el color de fondo de la ventana de colores.
     * @param evt acción de pulsar el botón de color de fondo
     */      
    private void botonColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonColor2ActionPerformed
        /* Abre el diálogo de selección de color y cuando se cierra, actualiza el color */        
        dlgColor2.pack();
        dlgColor2.setVisible(true);
        dlgColor2.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                Lienzo.setColorFondo((Color)(((ColorChooser)elegirColor2).seleccionColor()));
                botonColor2.setBackground((Color)Lienzo.getColorFondo());
                editarRelleno();
            }
        });        
    }//GEN-LAST:event_botonColor2ActionPerformed

    /**
     * Crea una copia de la imagen actual. Duplica la ventana interna de imagen.
     * @param evt acción de pulsar el botón de Duplicar
     */
    private void botonDuplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDuplicarActionPerformed
        copiarImagen();
    }//GEN-LAST:event_botonDuplicarActionPerformed

    /**
     * Actualiza el brillo de la imagen mediante una barra. Va de -255 a 255.
     * @param evt cambio en el valor de la barra de Brillo
     */
    private void barraBrilloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraBrilloStateChanged
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null && imgOriginal != null) {
            try{
                BrilloOp operacionImg = new BrilloOp(barraBrillo.getValue());
                BufferedImage imgDestino = operacionImg.calcularBrillo(imgOriginal);
                vi.getLienzo().setImage(imgDestino);
                vi.getLienzo().repaint(); // actualiza el lienzo con el nuevo brillo
            }catch(Exception e){
                BarraEstado.setText("Operación de brillo errónea!!");
            }
            BarraEstado.setText("Operación de brillo aplicada");
        }
    }//GEN-LAST:event_barraBrilloStateChanged

    /**
     * Obtiene la imagen actual y la prepara para editar su brillo.
     * @param evt acción de pinchar el foco de la barra de Brillo
     */
    private void barraBrilloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_barraBrilloFocusGained
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null){
            imgOriginal = vi.getLienzo().getImage();
            imgAnterior = vi.getLienzo().getImage(); // almacena una copia de la imagen original para poder deshacer la operación
        }
    }//GEN-LAST:event_barraBrilloFocusGained
    
    /**
     * Actualiza la imagen con el nuevo brillo.
     * @param evt acción de soltar el foco de la barra de Brillo
     */
    private void barraBrilloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_barraBrilloFocusLost
        /* Al perder la imagen original, si volvemos a editar el brillo, lo hará sobre el nuevo valor de brillo */
        imgOriginal = null; 
    }//GEN-LAST:event_barraBrilloFocusLost

    /**
     * Configura la opción EDITAR del lienzo.
     * @param evt acción de seleccionar la opción Editar
     */    
    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        Lienzo.setSeleccionar(true);
    }//GEN-LAST:event_botonEditarActionPerformed

    /**
     * Aplica la mejora de CONTRASTE NORMAL sobre la imagen.
     * @param evt acción de pulsar el botón de Contraste normal
     */
    private void botonContrasteNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContrasteNormalActionPerformed
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null) {            
            imgOriginal = vi.getLienzo().getImage();
            imgAnterior = vi.getLienzo().getImage();
            if(imgOriginal != null){
                try {
                    ContrasteOp operacionImg = new ContrasteOp();
                    BufferedImage imgDestino = operacionImg.contrasteNormal(imgOriginal);
                    vi.getLienzo().setImage(imgDestino);
                    vi.getLienzo().repaint();
                } catch (Exception e) {
                    BarraEstado.setText("Operación de contraste errónea!!");
                }
                BarraEstado.setText("Operación de contraste aplicada");
            }
        }
    }//GEN-LAST:event_botonContrasteNormalActionPerformed

    /**
    * Aplica la mejora de CONTRASTE ILUMINADO sobre la imagen.
    * @param evt acción de pulsar el botón de Contraste iluminado
    */
    private void botonIluminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIluminacionActionPerformed
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null) {            
            imgOriginal = vi.getLienzo().getImage();
            imgAnterior = vi.getLienzo().getImage();
            if(imgOriginal != null){                
                try {
                    ContrasteOp operacionImg = new ContrasteOp();
                    BufferedImage imgDestino = operacionImg.contrasteIluminado(imgOriginal);
                    vi.getLienzo().setImage(imgDestino);
                    vi.getLienzo().repaint();
                } catch (Exception e) {
                    BarraEstado.setText("Operación de contraste errónea!!");
                }
                BarraEstado.setText("Operación de contraste aplicada");
            }
        }
    }//GEN-LAST:event_botonIluminacionActionPerformed

    /**
    * Aplica la mejora de CONTRASTE OSCURECIDO sobre la imagen.
    * @param evt acción de pulsar el botón de Contraste oscurecido
    */    
    private void botonOscurecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOscurecerActionPerformed
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null) {            
            imgOriginal = vi.getLienzo().getImage();
            imgAnterior = vi.getLienzo().getImage();
            if(imgOriginal != null){                
                try {
                    ContrasteOp operacionImg = new ContrasteOp();
                    BufferedImage imgDestino = operacionImg.contrasteOscurecido(imgOriginal);
                    vi.getLienzo().setImage(imgDestino);
                    vi.getLienzo().repaint();
                } catch (Exception e) {
                    BarraEstado.setText("Operación de contraste errónea!!");
                }
                BarraEstado.setText("Operación de contraste aplicada");
            }
        }
    }//GEN-LAST:event_botonOscurecerActionPerformed

    /**
     * Aplica el filtro de convolución seleccionado.
     * @param evt acción de seleccionar un filtro de los disponibles
     */
    private void botonFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiltroActionPerformed
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null) {
            imgOriginal = vi.getLienzo().getImage();
            imgAnterior = vi.getLienzo().getImage();
            if(imgOriginal != null){
                try{
                    FiltroOp operacionImg = new FiltroOp(botonFiltro.getSelectedIndex()); // aplica el filtro seleccionado
                    BufferedImage imgDestino = operacionImg.aplicarFiltro(imgOriginal);
                    vi.getLienzo().setImage(imgDestino);
                    vi.getLienzo().repaint();
                }catch(Exception e){
                    BarraEstado.setText("Operación de filtro errónea!!");
                }
                BarraEstado.setText("Operación de filtro aplicada");
            }
        }
    }//GEN-LAST:event_botonFiltroActionPerformed

    /**
     * Rota la imagen 180 grados.
     * @param evt acción de pulsar el botón de rotación 180
     */
    private void botonRotar180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRotar180ActionPerformed
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null) {
            imgOriginal = vi.getLienzo().getImage();
            imgAnterior = vi.getLienzo().getImage();
            if(imgOriginal != null){                
                try {
                    AfinidadOp operacionImg = new AfinidadOp();
                    BufferedImage imgDestino = operacionImg.rotarImagen(imgOriginal, 180);   
                    barraRotacion.setValue(0);
                    vi.getLienzo().setImage(imgDestino);
                    vi.getLienzo().repaint();
                }catch(Exception e){
                    BarraEstado.setText("Operación de rotación errónea!!");
                }
                BarraEstado.setText("Operación de rotación aplicada");
            }
        }
    }//GEN-LAST:event_botonRotar180ActionPerformed

    /**
     * Rota la imagen 90 grados a la derecha.
     * @param evt acción de pulsar el botón de rotación 90
     */    
    private void botonRotar90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRotar90ActionPerformed
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null) {
            imgOriginal = vi.getLienzo().getImage();
            imgAnterior = vi.getLienzo().getImage();
            if(imgOriginal != null){                
                try {
                    AfinidadOp operacionImg = new AfinidadOp();
                    BufferedImage imgDestino = operacionImg.rotarImagen(imgOriginal, 90);
                    barraRotacion.setValue(0);
                    vi.getLienzo().setImage(imgDestino);
                    vi.getLienzo().repaint();
                }catch(Exception e){
                    BarraEstado.setText("Operación de rotación errónea!!");
                }
                BarraEstado.setText("Operación de rotación aplicada");
            }
        }
    }//GEN-LAST:event_botonRotar90ActionPerformed

    /**
     * Rota la imagen con el valor de la barra de rotación.
     * @param evt cambio del valor de la barra de rotación
     */    
    private void barraRotacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraRotacionStateChanged
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null && imgOriginal != null) {
            try{
                AfinidadOp operacionImg = new AfinidadOp();
                BufferedImage imgDestino = operacionImg.rotarImagen(imgOriginal, barraRotacion.getValue()); 
                vi.getLienzo().setImage(imgDestino);
                vi.getLienzo().repaint();
            }catch(Exception e){
                BarraEstado.setText("Operación de rotación errónea!!");
            }
            BarraEstado.setText("Operación de rotación aplicada");            
        }
    }//GEN-LAST:event_barraRotacionStateChanged

    /**
     * Obtiene la imagen actual y la prepara para rotarla.
     * @param evt acción de pinchar el foco de la barra de Rotación
     */    
    private void barraRotacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_barraRotacionFocusGained
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null){
            imgOriginal = vi.getLienzo().getImage();
            imgAnterior = vi.getLienzo().getImage();
        }
    }//GEN-LAST:event_barraRotacionFocusGained

    /**
     * Actualiza la imagen con la nueva rotación.
     * @param evt acción de soltar el foco de la barra de Rotación
     */    
    private void barraRotacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_barraRotacionFocusLost
        imgOriginal = null;
    }//GEN-LAST:event_barraRotacionFocusLost

    /**
     * Reescala la imagen a un tamaño 75% del tamaño actual.
     * @param evt acción de pulsar el botón de Menor escala
     */
    private void botonEscalaMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEscalaMenosActionPerformed
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null) {
            imgOriginal = vi.getLienzo().getImage();
            imgAnterior = vi.getLienzo().getImage();
            if(imgOriginal != null){                
                try {
                    AfinidadOp operacionImg = new AfinidadOp();
                    BufferedImage imgDestino = operacionImg.escalarImagen(imgOriginal, 0.75);   
                    vi.getLienzo().setImage(imgDestino);
                    vi.getLienzo().repaint();
                }catch(Exception e){
                    BarraEstado.setText("Operación de escalado errónea!!");
                }
                BarraEstado.setText("Operación de escalado aplicada");
            }
        }
    }//GEN-LAST:event_botonEscalaMenosActionPerformed

    /**
     * Reescala la imagen a un tamaño 125% del tamaño actual.
     * @param evt acción de pulsar el botón de Mayor escala
     */    
    private void botonEscalaMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEscalaMasActionPerformed
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null) {
            imgOriginal = vi.getLienzo().getImage();
            imgAnterior = vi.getLienzo().getImage();
            if(imgOriginal != null){                
                try {
                    AfinidadOp operacionImg = new AfinidadOp();
                    BufferedImage imgDestino = operacionImg.escalarImagen(imgOriginal, 1.25);   
                    vi.getLienzo().setImage(imgDestino);
                    vi.getLienzo().repaint();
                }catch(Exception e){
                    BarraEstado.setText("Operación de escalado errónea!!");
                }
                BarraEstado.setText("Operación de escalado aplicada");
            }
        }
    }//GEN-LAST:event_botonEscalaMasActionPerformed

    /**
     * Actualiza el umbral a partir del cual aplicar umbralización sobre la immagen.
     * @param evt cambio del valor de la barra de umbral
     */        
    private void barraUmbralStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraUmbralStateChanged
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null && imgOriginal != null) {
            try{
                umbralizacion.setUmbral(barraUmbral.getValue());
                /* Si el tipo de umbral es Nivel de gris, actua el filter de gris */
                if(umbralizacion.getTipo()==tipoUmbral.gris){
                    BufferedImage imgDestino = umbralizacion.filter(imgOriginal, null);
                    vi.getLienzo().setImage(imgDestino);
                }
                /* Si el tipo de umbral es Color, actua el filter de color */
                else{
                    BufferedImage imgDestino = umbralizacion.filterColor(imgOriginal, null);
                    vi.getLienzo().setImage(imgDestino);                    
                }                     
                vi.getLienzo().repaint();
            }catch(Exception e){
                BarraEstado.setText("Operación de umbralización errónea!!");
            }
            BarraEstado.setText("Operación de umbralización aplicada");
        }
    }//GEN-LAST:event_barraUmbralStateChanged

    /**
     * Obtiene la imagen actual y la prepara para aplicarle umbralización.
     * @param evt acción de pinchar el foco de la barra de Umbral
     */    
    private void barraUmbralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_barraUmbralFocusGained
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null){
            imgOriginal = vi.getLienzo().getImage();
            imgAnterior = vi.getLienzo().getImage();
        }
    }//GEN-LAST:event_barraUmbralFocusGained

    /**
     * Actualiza la imagen con la nueva umbralización.
     * @param evt acción de soltar el foco de la barra de Umbral
     */       
    private void barraUmbralFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_barraUmbralFocusLost
        imgOriginal = null;
    }//GEN-LAST:event_barraUmbralFocusLost

    /**
     * Selecciona un efecto de color a aplicar sobre la imagen.
     * @param evt selección de un efecto de la lista disponible
     */
    private void botonEfColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEfColorActionPerformed
        if(botonEfColor.getSelectedIndex()==2) // si seleccionamos Combinación de bandas, se activa la barra de cambio de bandas
            barraBandas.setEnabled(true);
        else{
            barraBandas.setEnabled(false);
            VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
            if (vi != null) {
                imgOriginal = vi.getLienzo().getImage();
                imgAnterior = vi.getLienzo().getImage();
                if(imgOriginal != null){
                    try{
                        ColorOp operacionImg = new ColorOp(botonEfColor.getSelectedIndex());
                        BufferedImage imgDestino = operacionImg.aplicarEfecto(imgOriginal);
                        vi.getLienzo().setImage(imgDestino);
                        vi.getLienzo().repaint();
                    }catch(Exception e){
                        BarraEstado.setText("Operación de color errónea!!");
                    }
                    BarraEstado.setText("Operación de color aplicada");
                }
            }
        }
    }//GEN-LAST:event_botonEfColorActionPerformed

    /**
     * Obtiene la imagen actual y la prepara para aplicarle la Combinación de bandas.
     * @param evt acción de pinchar el foco de la barra de Bandas
     */    
    private void barraBandasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_barraBandasFocusGained
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null){
            imgOriginal = vi.getLienzo().getImage();
            imgAnterior = vi.getLienzo().getImage();
        }
    }//GEN-LAST:event_barraBandasFocusGained

     /**
     * Modifica las bandas a combinar con el efecto Combinación de bandas.
     * @param evt cambio de valor en la barra de Bandas
     */
    private void barraBandasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraBandasStateChanged
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null && imgOriginal != null) {
            try{
                ColorOp operacionImg = new ColorOp(2);
                BufferedImage imgDestino = operacionImg.combinarBandas(imgOriginal, barraBandas.getValue());
                vi.getLienzo().setImage(imgDestino);
                vi.getLienzo().repaint();
            }catch(Exception e){
                BarraEstado.setText("Operación de color errónea!!");
            }
            BarraEstado.setText("Operación de color aplicada");
        }
    }//GEN-LAST:event_barraBandasStateChanged

    /**
     * Actualiza la imagen con la nueva Combinación de bandas.
     * @param evt acción de soltar el foco de la barra de Bandas
     */           
    private void barraBandasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_barraBandasFocusLost
        imgOriginal = null;
    }//GEN-LAST:event_barraBandasFocusLost

    /**
     * Devuelve la imagen anterior a la última operación aplicada sobre ella.
     * @param evt acción de pulsar el botón Deshacer de la barra de herramientas
     */
    private void botonDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeshacerActionPerformed
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null && imgAnterior != null){
            vi.getLienzo().setImage(imgAnterior); 
            vi.getLienzo().repaint();
        }
    }//GEN-LAST:event_botonDeshacerActionPerformed

    /**
     * Invierte verticalmente la imagen produciendo un efecto espejo.
     * @param evt acción de pulsar el botón de Invertir
     */
    private void botonInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInvertirActionPerformed
        VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
        if (vi != null){
            imgOriginal = vi.getLienzo().getImage();
            imgAnterior = vi.getLienzo().getImage();
            if (imgOriginal != null) {
               try{
                   InvertirOp operacionImg = new InvertirOp();
                   BufferedImage imgDestino = operacionImg.filter(imgOriginal, null);
                   vi.getLienzo().setImage(imgDestino);
                   vi.getLienzo().repaint();
               }catch(Exception e){
                   BarraEstado.setText("Operación de invertir errónea!!");
               }
               BarraEstado.setText("Operación de invertir aplicada");
           }           
        }
    }//GEN-LAST:event_botonInvertirActionPerformed

    /**
     * Selecciona el color de la umbralización sobre color de una lista de colores básicos.
     * @param evt acción de elegir el color de la lista disponible
     */
    private void eleccionColorUmbralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionColorUmbralActionPerformed
        if(evt.getSource() == eleccionColorUmbral)
            umbralizacion.setColor(Lienzo.getColor((String)eleccionColorUmbral.getSelectedItem()));        
    }//GEN-LAST:event_eleccionColorUmbralActionPerformed

    /**
     * Selecciona el tipo de umbralización a aplicar sobre la imagen.
     * @param evt elección del tipo de umbralización tomada de la lista disponible
     */
    private void botonTipoUmbralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTipoUmbralActionPerformed
        if(botonTipoUmbral.getSelectedIndex()==1){
            eleccionColorUmbral.setEnabled(true); // si seleccionamos sobre Color, nos permite seleccionar el color
            umbralizacion.setTipo(getTipoUmbral());
        }else{
            eleccionColorUmbral.setEnabled(false);
            umbralizacion.setTipo(getTipoUmbral());
        }
    }//GEN-LAST:event_botonTipoUmbralActionPerformed

    /** 
    * Crea un lienzo nuevo listo para dibujar.
    * Antes pide al usuario el tamaño del lienzo mediante un diálogo.
    */
    private void crearImagen(){
        DialogoTamanio dialogo = new DialogoTamanio(this, rootPaneCheckingEnabled); // diálogo para introducir tamaño del lienzo
        dialogo.setVisible(true); 
        if (dialogo.getAceptar() == true){ // si el usuario pulsa ACEPTAR creamos el lienzo
            try {
                /* Crea ventana interna de imagen, la añade al escritorio, edita el título, y la muestra por pantalla */
                VentanaInternaImagen vi = new VentanaInternaImagen(dialogo.getAnchura(), dialogo.getAltura()); 
                escritorio.add(vi);
                BarraEstado.setText("Imagen creada"); // actualiza la barra de estado
                vi.setTitle("Nueva imagen");
                vi.setVisible(true);       
            } catch (Exception e) {
                BarraEstado.setText("Error al crear imagen!!");
            } 
        }
    }
    
    /** 
    * Crea una pista de audio para grabar.
    * El usuario debe primero introducir el nombre y lugar del archivo donde se grabará.
    */
    private void crearAudio(){
        /* Crea un diálogo para guardar el archivo en formato WAV o MP3 */
        JFileChooser dlg = new JFileChooser();
        dlg.setFileFilter(new FileNameExtensionFilter("WAV", "wav"));
        dlg.setFileFilter(new FileNameExtensionFilter("MP3", "mp3"));
        int resp = dlg.showSaveDialog(this); 
        if(resp == JFileChooser.APPROVE_OPTION) { 
            try{
                File f = null;
                if(dlg.getFileFilter().getDescription()=="WAV") // si elegimos WAV, añade .wav al fichero
                    f = new File(dlg.getSelectedFile().getAbsolutePath() + ".wav");  
                else if(dlg.getFileFilter().getDescription()=="MP3") // si elegimos MP3, añade .mp3 al fichero
                    f = new File(dlg.getSelectedFile().getAbsolutePath() + ".mp3");  
                /* Crea ventana interna de grabación de audio, la añade al escritorio, y la muestra por pantalla */
                VentanaInternaAudioGrabador vi = new VentanaInternaAudioGrabador(f);
                escritorio.add(vi);
                BarraEstado.setText("Audio creado"); // actualiza la barra de estado
                vi.setVisible(true);
            }catch(Exception e){
                BarraEstado.setText("Error al crear sonido!!"); 
            }
        }
    }
    
    /** 
    * Abre un archivo seleccionado mediante un diálogo de carga
    */
    private void abrirArchivo(){
        /* Crea un diálogo para abrir un archivo en formato PNG, JPG, WAV, MP3 o AVI */
        JFileChooser dlg = new JFileChooser(); 
        dlg.setFileFilter(new FileNameExtensionFilter("PNG", "png"));
        dlg.setFileFilter(new FileNameExtensionFilter("JPG", "jpg"));
        dlg.setFileFilter(new FileNameExtensionFilter("WAV", "wav"));
        dlg.setFileFilter(new FileNameExtensionFilter("MP3", "mp3"));
        dlg.setFileFilter(new FileNameExtensionFilter("AVI", "avi"));
        int resp = dlg.showOpenDialog(this); 
        if(resp == JFileChooser.APPROVE_OPTION) { 
            try{ 
                File f = dlg.getSelectedFile(); // fichero seleccionado
                /* Si el formato es PNG o JPG llamammos al método abrirImagen */
                if(dlg.getFileFilter().getDescription()=="PNG" || dlg.getFileFilter().getDescription()=="JPG")                    
                    abrirImagen(f);     
                /* Si el formato es WAV, MP3 o AVI llamammos al método Reproducir */
                else if(dlg.getFileFilter().getDescription()=="WAV" || dlg.getFileFilter().getDescription()=="MP3" || dlg.getFileFilter().getDescription()=="AVI")
                    Reproducir(f);                  
            }catch(Exception e){ 
                BarraEstado.setText("Error al abrir archivo!!"); 
            } 
        }
    }
    
    /** 
    * Abre la imagen de un fichero y la carga sobre una ventana interna de imagen
    * @param f fichero que contiene la imagen
    */    
    private void abrirImagen(File f){
        try{
            /* Carga la imagen del fichero y la guarda sobre el lienzo de una nueva ventana interna de imagen */
            BufferedImage img = ImageIO.read(f); 
            VentanaInternaImagen vi = new VentanaInternaImagen(img.getWidth(), img.getHeight()); 
            vi.getLienzo().setImage(img); 
            escritorio.add(vi);
            BarraEstado.setText("Imagen abierta");
            vi.setTitle(f.getName()); // la ventana interna pasará a tomar el nombre del fichero
            vi.setVisible(true);           
        }catch(Exception e){ 
            BarraEstado.setText("Error al abrir imagen!!"); 
        }       
    }
        
    /** 
    * Guarda una imagen sobre el fichero que haya seleccionado el usuario en el diálogo
    * de guardado.
    */    
    private void guardarImagen(){
        /* Se puede guardar la imagen en formato PNG o JPG */
        JFileChooser dlg = new JFileChooser(); 
        dlg.setFileFilter(new FileNameExtensionFilter("PNG", "png"));
        dlg.setFileFilter(new FileNameExtensionFilter("JPG", "jpg"));
        VentanaInternaImagen vi = (VentanaInternaImagen)escritorio.getSelectedFrame(); 
        int resp = dlg.showSaveDialog(this); 
        if(resp == JFileChooser.APPROVE_OPTION) {  
            try{ 
                /* Vuelca el contenido de dibujo sobre la imagen y la guarda en el fichero seleccionado */
                vi.getLienzo().paintShapes(vi.getLienzo().getImage().createGraphics()); 
                if(dlg.getFileFilter().getDescription()=="PNG"){
                    File f = new File(dlg.getSelectedFile().getAbsolutePath() + ".png");                
                    ImageIO.write(vi.getLienzo().getImage(),"png",f);
                    vi.setTitle(f.getName()); // la ventana interna toma el nuevo título de la imagen al guardarse
                }
                else if(dlg.getFileFilter().getDescription()=="JPG"){
                    File f = new File(dlg.getSelectedFile().getAbsolutePath() + ".jpg");                
                    ImageIO.write(vi.getLienzo().getImage(),"jpg",f);
                    vi.setTitle(f.getName());
                }     
                BarraEstado.setText("Imagen guardada");
            }catch(Exception ex){ 
                BarraEstado.setText("Error al guardar imagen!!"); 
            }  
        }        
    }
        
    /** 
    * Crea una copia de la imagen actual
    */    
    private void copiarImagen(){
        try{ 
            /* Primero volcamos el dibujo sobre la imagen de la ventana interna de imagen actual
            y luego la guardamos sobre una nueva ventana interna, que se añade al escritorio
            */
            VentanaInternaImagen vi = (VentanaInternaImagen)escritorio.getSelectedFrame(); 
            VentanaInternaImagen viNueva = new VentanaInternaImagen(vi.getLienzo().getWidth(), vi.getLienzo().getHeight()); 
            vi.getLienzo().paintShapes(vi.getLienzo().getImage().createGraphics());
            viNueva.getLienzo().setImage(vi.getLienzo().getImage()); 
            escritorio.add(viNueva);
            BarraEstado.setText("Imagen duplicada");
            viNueva.setTitle("Copia de " + vi.getTitle()); // la nueva ventana interna tomará como nombre "Copia de " imagen copiada
            viNueva.setVisible(true);
        }catch(Exception ex){ 
            BarraEstado.setText("Error al duplicar imagen!!"); 
        } 
    }
    
    /** 
    * Crea una ventana interna de reproducción. Puede reproducir audio o video.
    * @param f fichero que contiene el archivo a reproducir
    */    
    private void Reproducir(File f){
        try{ 
            VentanaInternaReproductor vi = VentanaInternaReproductor.getInstance(f);
            escritorio.add(vi); 
            BarraEstado.setText("Reproduciendo archivo");
            vi.setVisible(true); 
        }catch(Exception e){ 
            BarraEstado.setText("Error al reproducir archivo!!"); 
        }         
    }
      
    /** 
    * Crea una ventana interna de webcam, donde muestra el vídeo capturado por la cámara.
    */      
    private void WebCam(){
        try{ 
            VentanaInternaWebcam vi = VentanaInternaWebcam.getInstance();
            escritorio.add(vi);             
            BarraEstado.setText("Capturando webcam");
            vi.setVisible(true); 
        }catch(Exception e){ 
            BarraEstado.setText("Error al capturar video!!"); 
        }       
    }
    
    /** 
    * Realiza una captura de vídeo. Muestra dicha captura sobre una nueva ventana interna de imagen. 
    * La captura se puede realizar sobre la webcam, o sobre la reproducción de un vídeo.
    */        
    private void capturarImagen(){
        CapturaFrame captura = new CapturaFrame();
        BufferedImage img;
        try{
            /* Comprueba que se esté reproduciendo vídeo o haya webcam abierta */
            if(escritorio.getSelectedFrame() instanceof VentanaInternaReproductor || escritorio.getSelectedFrame() instanceof VentanaInternaWebcam){
                VentanaInternaImagen vi;
                /* Creará una nueva ventana interna donde mostrará la captura de vídeo */
                if(escritorio.getSelectedFrame() instanceof VentanaInternaReproductor)
                    img = captura.getFrame(((VentanaInternaReproductor)escritorio.getSelectedFrame()).getPlayer());
                else
                    img = captura.getFrame(((VentanaInternaWebcam)escritorio.getSelectedFrame()).getPlayer());
                vi = new VentanaInternaImagen(img.getWidth(), img.getHeight());
                vi.getLienzo().setImage(img);               
                BarraEstado.setText("Captura realizada");
                vi.setTitle("Nueva captura"); // nombre que toma la ventana interna de imagen
                escritorio.add(vi); 
                vi.setVisible(true);            
            }
        }catch(Exception e){ 
            BarraEstado.setText("Error al capturar imagen!!"); 
        }            
    }
    
    /**
     * Muestra u oculta la barra que se le mete como argumento.
     * @param barra barra de herramientas a mostrar/ocultar
     */
    private void verBarra(JToolBar barra){
        if(barra.isVisible()) barra.setVisible(false);
        else barra.setVisible(true);        
    }
                
    /**
     * Traduce la elección del tipo de degradado.
     * @return tipo de degradado seleccionado
     */
    private Degradado getTipoDeg(){
        Degradado tipo = null;
        switch((String)eleccionTipoDeg.getSelectedItem()){
            case "Horizontal":
                tipo = Degradado.horizontal;
                break;
            case "Vertical":
                tipo = Degradado.vertical;
                break;
        };
        return tipo;
    }
    
    /**
     * Traduce la elección del tipo de umbralización.
     * @return tipo de umbralización seleccionada
     */
    private tipoUmbral getTipoUmbral(){
        tipoUmbral tipo = null;
        switch((String)botonTipoUmbral.getSelectedItem()){
            case "Nivel de gris":
                tipo = tipoUmbral.gris;
                break;
            case "Color":
                tipo = tipoUmbral.color;
                break;
        };
        return tipo;
    }
    
    /**
    * Edita el trazo de una figura seleccionada.
    * Se encarga de llamar a editarTrazo del lienzo actual.
    */
    private void editarTrazo(){
        if(Lienzo.getSeleccionar() && Lienzo.getSelecccion()!=-1){ //si estamos seleccionando y además tenemos una figura seleccionada
            VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
            if (vi != null){
                vi.getLienzo().editarTrazo();
                vi.repaint();
            }
        }
    }
    
    /**
    * Edita el color de una figura seleccionada.
    * Se encarga de llamar a editarColor del lienzo actual.
    */    
    private void editarColor(){
        if(Lienzo.getSeleccionar() && Lienzo.getSelecccion()!=-1){ //si estamos seleccionando y además tenemos una figura seleccionada
            VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
            if (vi != null){
                vi.getLienzo().editarColor();
                vi.repaint();
            }
        }
    }
    
    /**
    * Edita el relleno de una figura seleccionada.
    * Se encarga de llamar a editarRelleno del lienzo actual.
    */    
    private void editarRelleno(){
        if(Lienzo.getSeleccionar() && Lienzo.getSelecccion()!=-1){ //si estamos seleccionando y además tenemos una figura seleccionada
            VentanaInternaImagen vi = (VentanaInternaImagen) (escritorio.getSelectedFrame());
            if (vi != null){
                vi.getLienzo().editarRelleno();
                vi.repaint();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarraDibujo;
    private javax.swing.JLabel BarraEstado;
    private javax.swing.JToolBar BarraGeneral;
    private javax.swing.JToolBar BarraOperaciones;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JPanel PanelBrillo;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JPanel PanelColor;
    private javax.swing.JPanel PanelContraste;
    private javax.swing.JPanel PanelEdicion;
    private javax.swing.JPanel PanelEfColor;
    private javax.swing.JPanel PanelEscalado;
    private javax.swing.JPanel PanelFiltro;
    private javax.swing.JPanel PanelFormas;
    private javax.swing.JPanel PanelRelleno;
    private javax.swing.JPanel PanelRotacion;
    private javax.swing.JPanel PanelTrazo;
    private javax.swing.JPanel PanelUmbralizacion;
    private javax.swing.JToolBar.Separator SeparadorBotonesGeneral;
    private javax.swing.JPopupMenu.Separator SeparadorMenu;
    private javax.swing.JSlider barraBandas;
    private javax.swing.JSlider barraBrillo;
    private javax.swing.JSlider barraRotacion;
    private javax.swing.JSlider barraUmbral;
    private javax.swing.JButton botonAbrirBarra;
    private javax.swing.JMenuItem botonAcercaDe;
    private javax.swing.JMenu botonArchivo;
    private javax.swing.JMenu botonAyuda;
    private javax.swing.JButton botonCaptura;
    private javax.swing.JButton botonColor1;
    private javax.swing.JButton botonColor2;
    private javax.swing.JButton botonContrasteNormal;
    private javax.swing.JToggleButton botonCurva;
    private javax.swing.JButton botonDeshacer;
    private javax.swing.JCheckBox botonDiscontinuidad;
    private javax.swing.JButton botonDuplicar;
    private javax.swing.JToggleButton botonEditar;
    private javax.swing.JComboBox botonEfColor;
    private javax.swing.JToggleButton botonElipse;
    private javax.swing.JButton botonEscalaMas;
    private javax.swing.JButton botonEscalaMenos;
    private javax.swing.JComboBox botonFiltro;
    private javax.swing.JToggleButton botonGoma;
    private javax.swing.JSpinner botonGrosor;
    private javax.swing.JButton botonGuardarBarra;
    private javax.swing.JButton botonIluminacion;
    private javax.swing.JButton botonInvertir;
    private javax.swing.JToggleButton botonLinea;
    private javax.swing.JMenuItem botonMenuAbrir;
    private javax.swing.JMenuItem botonMenuAudio;
    private javax.swing.JMenuItem botonMenuGuardar;
    private javax.swing.JMenuItem botonMenuImagen;
    private javax.swing.JToggleButton botonMover;
    private javax.swing.JButton botonNuevaImagenBarra;
    private javax.swing.JButton botonNuevoAudioBarra;
    private javax.swing.JButton botonOscurecer;
    private javax.swing.JToggleButton botonPunto;
    private javax.swing.JToggleButton botonRectangulo;
    private javax.swing.JToggleButton botonRedondeado;
    private javax.swing.JToggleButton botonRellenoDeg;
    private javax.swing.JToggleButton botonRellenoLiso;
    private javax.swing.JButton botonRotar180;
    private javax.swing.JButton botonRotar90;
    private javax.swing.JToggleButton botonSinRelleno;
    private javax.swing.JComboBox botonTipoUmbral;
    private javax.swing.JToggleButton botonTrazoLibre;
    private javax.swing.JMenu botonVer;
    private javax.swing.JCheckBoxMenuItem botonVerDibujo;
    private javax.swing.JCheckBoxMenuItem botonVerEstado;
    private javax.swing.JCheckBoxMenuItem botonVerGeneral;
    private javax.swing.JCheckBoxMenuItem botonVerOperaciones;
    private javax.swing.JButton botonWebCam;
    private javax.swing.ButtonGroup botonesFormas;
    private javax.swing.ButtonGroup botonesRelleno;
    private javax.swing.JComboBox eleccionColor1;
    private javax.swing.JComboBox eleccionColor2;
    private javax.swing.JComboBox eleccionColorUmbral;
    private javax.swing.JComboBox eleccionTipoDeg;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JSplitPane jSplitPane6;
    private javax.swing.JSplitPane jSplitPane7;
    private javax.swing.JSplitPane jSplitPane8;
    // End of variables declaration//GEN-END:variables
}
