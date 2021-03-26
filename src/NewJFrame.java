import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import java.awt.Insets;
import javax.swing.border.Border;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import java.awt.Font;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class NewJFrame extends JFrame
{
    public static NewJFrame miframe;
    public JTextField TextFieldPantalla;
    private JButton boton0;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    public JButton boton7;
    public JButton boton8;
    public JButton boton9;
    private JButton botonBorrar;
    private JButton botonBorrarTodo;
    private JButton botonDivision;
    private JButton botonE;
    private JButton botonIgual;
    private JButton botonMas;
    private JButton botonMenos;
    private JButton botonMultiplicacion;
    private JButton botonPi;
    private JButton botonPunto;
    private JPanel panelBotones;
    private JPanel panelFrame;
    private JPanel panelPantalla;
    private JTextField textFieldPayola;
    
    public NewJFrame() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.panelFrame = new JPanel();
        this.panelBotones = new JPanel();
        this.boton7 = new JButton();
        this.boton8 = new JButton();
        this.boton9 = new JButton();
        this.botonMenos = new JButton();
        this.boton4 = new JButton();
        this.boton5 = new JButton();
        this.boton6 = new JButton();
        this.botonDivision = new JButton();
        this.boton1 = new JButton();
        this.boton2 = new JButton();
        this.boton3 = new JButton();
        this.botonMultiplicacion = new JButton();
        this.boton0 = new JButton();
        this.botonBorrar = new JButton();
        this.botonPunto = new JButton();
        this.botonMas = new JButton();
        this.botonIgual = new JButton();
        this.botonBorrarTodo = new JButton();
        this.botonPi = new JButton();
        this.botonE = new JButton();
        this.panelPantalla = new JPanel();
        this.TextFieldPantalla = new JTextField();
        this.textFieldPayola = new JTextField();
        this.setDefaultCloseOperation(3);
        this.setTitle("Calculadora V.1.0");
        this.setFocusable(true);
        this.setMinimumSize(new Dimension(380, 290));
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent evt) {
                NewJFrame.this.formKeyPressed(evt);
            }
        });
        this.getContentPane().setLayout(new GridLayout(1, 0));
        this.panelFrame.setBackground(new Color(255, 255, 255));
        this.panelFrame.setMinimumSize(new Dimension(360, 250));
        this.panelFrame.setLayout(new AbsoluteLayout());
        this.panelBotones.setBackground(new Color(255, 255, 255));
        this.panelBotones.setOpaque(false);
        this.panelBotones.setLayout(new GridLayout(5, 4));
        this.boton7.setBackground(new Color(255, 255, 255));
        this.boton7.setFont(new Font("Tahoma", 1, 14));
        this.boton7.setText("7");
        this.boton7.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.boton7.setFocusable(false);
        this.boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.boton7ActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.boton7);
        this.boton8.setBackground(new Color(255, 255, 255));
        this.boton8.setFont(new Font("Tahoma", 1, 14));
        this.boton8.setText("8");
        this.boton8.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.boton8.setFocusable(false);
        this.boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.boton8ActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.boton8);
        this.boton9.setBackground(new Color(255, 255, 255));
        this.boton9.setFont(new Font("Tahoma", 1, 14));
        this.boton9.setText("9");
        this.boton9.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.boton9.setFocusable(false);
        this.boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.boton9ActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.boton9);
        this.botonMenos.setBackground(new Color(255, 255, 255));
        this.botonMenos.setFont(new Font("Tahoma", 1, 18));
        this.botonMenos.setText("-");
        this.botonMenos.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.botonMenos.setFocusable(false);
        this.botonMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.botonMenosActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.botonMenos);
        this.boton4.setBackground(new Color(255, 255, 255));
        this.boton4.setFont(new Font("Tahoma", 1, 14));
        this.boton4.setText("4");
        this.boton4.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.boton4.setFocusable(false);
        this.boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.boton4ActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.boton4);
        this.boton5.setBackground(new Color(255, 255, 255));
        this.boton5.setFont(new Font("Tahoma", 1, 14));
        this.boton5.setText("5");
        this.boton5.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.boton5.setFocusable(false);
        this.boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.boton5ActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.boton5);
        this.boton6.setBackground(new Color(255, 255, 255));
        this.boton6.setFont(new Font("Tahoma", 1, 14));
        this.boton6.setText("6");
        this.boton6.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.boton6.setFocusable(false);
        this.boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.boton6ActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.boton6);
        this.botonDivision.setBackground(new Color(255, 255, 255));
        this.botonDivision.setFont(new Font("Tahoma", 1, 18));
        this.botonDivision.setText("/");
        this.botonDivision.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.botonDivision.setFocusable(false);
        this.botonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.botonDivisionActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.botonDivision);
        this.boton1.setBackground(new Color(255, 255, 255));
        this.boton1.setFont(new Font("Tahoma", 1, 14));
        this.boton1.setText("1");
        this.boton1.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.boton1.setFocusable(false);
        this.boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.boton1ActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.boton1);
        this.boton2.setBackground(new Color(255, 255, 255));
        this.boton2.setFont(new Font("Tahoma", 1, 14));
        this.boton2.setText("2");
        this.boton2.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.boton2.setFocusable(false);
        this.boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.boton2ActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.boton2);
        this.boton3.setBackground(new Color(255, 255, 255));
        this.boton3.setFont(new Font("Tahoma", 1, 14));
        this.boton3.setText("3");
        this.boton3.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.boton3.setFocusable(false);
        this.boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.boton3ActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.boton3);
        this.botonMultiplicacion.setBackground(new Color(255, 255, 255));
        this.botonMultiplicacion.setFont(new Font("Tahoma", 1, 18));
        this.botonMultiplicacion.setText("*");
        this.botonMultiplicacion.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.botonMultiplicacion.setFocusable(false);
        this.botonMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.botonMultiplicacionActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.botonMultiplicacion);
        this.boton0.setBackground(new Color(255, 255, 255));
        this.boton0.setFont(new Font("Tahoma", 1, 14));
        this.boton0.setText("0");
        this.boton0.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.boton0.setFocusable(false);
        this.boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.boton0ActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.boton0);
        this.botonBorrar.setBackground(new Color(255, 255, 255));
        this.botonBorrar.setFont(new Font("Tahoma", 1, 14));
        this.botonBorrar.setText("<--");
        this.botonBorrar.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.botonBorrar.setFocusable(false);
        this.botonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.botonBorrarActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.botonBorrar);
        this.botonPunto.setBackground(new Color(255, 255, 255));
        this.botonPunto.setFont(new Font("Tahoma", 1, 18));
        this.botonPunto.setText(".");
        this.botonPunto.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.botonPunto.setFocusable(false);
        this.botonPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.botonPuntoActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.botonPunto);
        this.botonMas.setBackground(new Color(255, 255, 255));
        this.botonMas.setFont(new Font("Tahoma", 1, 18));
        this.botonMas.setText("+");
        this.botonMas.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.botonMas.setFocusable(false);
        this.botonMas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.botonMasActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.botonMas);
        this.botonIgual.setBackground(new Color(255, 255, 255));
        this.botonIgual.setFont(new Font("Tahoma", 1, 18));
        this.botonIgual.setText("=");
        this.botonIgual.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.botonIgual.setFocusable(false);
        this.botonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.botonIgualActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.botonIgual);
        this.botonBorrarTodo.setBackground(new Color(255, 255, 255));
        this.botonBorrarTodo.setFont(new Font("Tahoma", 1, 14));
        this.botonBorrarTodo.setText("C");
        this.botonBorrarTodo.setFocusable(false);
        this.botonBorrarTodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.botonBorrarTodoActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.botonBorrarTodo);
        this.botonPi.setBackground(new Color(255, 255, 255));
        this.botonPi.setFont(new Font("Tahoma", 1, 14));
        this.botonPi.setText("\u03c0");
        this.botonPi.setFocusable(false);
        this.botonPi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.botonPiActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.botonPi);
        this.botonE.setBackground(new Color(255, 255, 255));
        this.botonE.setFont(new Font("Tahoma", 1, 14));
        this.botonE.setText("e");
        this.botonE.setFocusable(false);
        this.botonE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                NewJFrame.this.botonEActionPerformed(evt);
            }
        });
        this.panelBotones.add(this.botonE);
        this.panelFrame.add(this.panelBotones, new AbsoluteConstraints(20, 60, 320, 180));
        this.panelPantalla.setBackground(new Color(255, 255, 255));
        this.panelPantalla.setBorder(BorderFactory.createBevelBorder(0, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
        this.panelPantalla.setFocusable(false);
        this.panelPantalla.setLayout(new AbsoluteLayout());
        this.TextFieldPantalla.setEditable(false);
        this.TextFieldPantalla.setFont(new Font("Segoe UI", 1, 18));
        this.TextFieldPantalla.setHorizontalAlignment(11);
        this.TextFieldPantalla.setText("0");
        this.TextFieldPantalla.setAutoscrolls(false);
        this.TextFieldPantalla.setBorder(BorderFactory.createCompoundBorder());
        this.TextFieldPantalla.setDisabledTextColor(new Color(255, 255, 255));
        this.TextFieldPantalla.setFocusable(false);
        this.TextFieldPantalla.setMargin(new Insets(2, 5, 2, 4));
        this.panelPantalla.add(this.TextFieldPantalla, new AbsoluteConstraints(0, 0, 300, 40));
        this.panelFrame.add(this.panelPantalla, new AbsoluteConstraints(30, 10, 310, 40));
        this.textFieldPayola.setEditable(false);
        this.textFieldPayola.setFont(new Font("Segoe UI", 1, 13));
        this.textFieldPayola.setText("   Program Made With \u2665 by Brandon ");
        this.textFieldPayola.setAlignmentY(1.0f);
        this.textFieldPayola.setFocusable(false);
        this.panelFrame.add(this.textFieldPayola, new AbsoluteConstraints(60, 246, 230, 30));
        this.getContentPane().add(this.panelFrame);
        this.pack();
    }
    
    private void boton7ActionPerformed(final ActionEvent evt) {
        final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
        if (Operaciones.estadoOperacion) {
            NewJFrame.miframe.TextFieldPantalla.setText("7");
            Operaciones.estadoOperacion = false;
        }
        else if (texto.equals("0")) {
            NewJFrame.miframe.TextFieldPantalla.setText("");
            NewJFrame.miframe.TextFieldPantalla.setText("7");
        }
        else {
            NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
        }
    }
    
    private void boton9ActionPerformed(final ActionEvent evt) {
        final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
        if (Operaciones.estadoOperacion) {
            NewJFrame.miframe.TextFieldPantalla.setText("9");
            Operaciones.estadoOperacion = false;
        }
        else if (texto.equals("0")) {
            NewJFrame.miframe.TextFieldPantalla.setText("");
            NewJFrame.miframe.TextFieldPantalla.setText("9");
        }
        else {
            NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
        }
    }
    
    private void boton8ActionPerformed(final ActionEvent evt) {
        final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
        if (Operaciones.estadoOperacion) {
            NewJFrame.miframe.TextFieldPantalla.setText("8");
            Operaciones.estadoOperacion = false;
        }
        else if (texto.equals("0")) {
            NewJFrame.miframe.TextFieldPantalla.setText("");
            NewJFrame.miframe.TextFieldPantalla.setText("8");
        }
        else {
            NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
        }
    }
    
    private void boton4ActionPerformed(final ActionEvent evt) {
        final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
        if (Operaciones.estadoOperacion) {
            NewJFrame.miframe.TextFieldPantalla.setText("4");
            Operaciones.estadoOperacion = false;
        }
        else if (texto.equals("0")) {
            NewJFrame.miframe.TextFieldPantalla.setText("");
            NewJFrame.miframe.TextFieldPantalla.setText("4");
        }
        else {
            NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
        }
    }
    
    private void boton5ActionPerformed(final ActionEvent evt) {
        final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
        if (Operaciones.estadoOperacion) {
            NewJFrame.miframe.TextFieldPantalla.setText("5");
            Operaciones.estadoOperacion = false;
        }
        else if (texto.equals("0")) {
            NewJFrame.miframe.TextFieldPantalla.setText("");
            NewJFrame.miframe.TextFieldPantalla.setText("5");
        }
        else {
            NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
        }
    }
    
    private void boton6ActionPerformed(final ActionEvent evt) {
        final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
        if (Operaciones.estadoOperacion) {
            NewJFrame.miframe.TextFieldPantalla.setText("6");
            Operaciones.estadoOperacion = false;
        }
        else if (texto.equals("0")) {
            NewJFrame.miframe.TextFieldPantalla.setText("");
            NewJFrame.miframe.TextFieldPantalla.setText("6");
        }
        else {
            NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
        }
    }
    
    private void boton1ActionPerformed(final ActionEvent evt) {
        final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
        if (Operaciones.estadoOperacion) {
            NewJFrame.miframe.TextFieldPantalla.setText("1");
            Operaciones.estadoOperacion = false;
        }
        else if (texto.equals("0")) {
            NewJFrame.miframe.TextFieldPantalla.setText("");
            NewJFrame.miframe.TextFieldPantalla.setText("1");
        }
        else {
            NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
        }
    }
    
    private void boton2ActionPerformed(final ActionEvent evt) {
        final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
        if (Operaciones.estadoOperacion) {
            NewJFrame.miframe.TextFieldPantalla.setText("2");
            Operaciones.estadoOperacion = false;
        }
        else if (texto.equals("0")) {
            NewJFrame.miframe.TextFieldPantalla.setText("");
            NewJFrame.miframe.TextFieldPantalla.setText("2");
        }
        else {
            NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
        }
    }
    
    private void boton3ActionPerformed(final ActionEvent evt) {
        final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
        if (Operaciones.estadoOperacion) {
            NewJFrame.miframe.TextFieldPantalla.setText("3");
            Operaciones.estadoOperacion = false;
        }
        else if (texto.equals("0")) {
            NewJFrame.miframe.TextFieldPantalla.setText("");
            NewJFrame.miframe.TextFieldPantalla.setText("3");
        }
        else {
            NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
        }
    }
    
    private void botonBorrarActionPerformed(final ActionEvent evt) {
        final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
        String texto2 = "";
        final int longitud = texto.length();
        System.out.println(invokedynamic(makeConcatWithConstants:(I)Ljava/lang/String;, longitud));
        if (longitud == 1) {
            NewJFrame.miframe.TextFieldPantalla.setText("0");
        }
        else {
            for (int i = 0; i < longitud - 1; ++i) {
                texto2 = invokedynamic(makeConcatWithConstants:(Ljava/lang/String;C)Ljava/lang/String;, texto2, texto.charAt(i));
            }
            NewJFrame.miframe.TextFieldPantalla.setText(texto2);
        }
    }
    
    private void boton0ActionPerformed(final ActionEvent evt) {
        final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
        if (Operaciones.estadoOperacion) {
            NewJFrame.miframe.TextFieldPantalla.setText("0");
            Operaciones.estadoOperacion = false;
        }
        else if (texto.equals("0")) {
            NewJFrame.miframe.TextFieldPantalla.setText("");
            NewJFrame.miframe.TextFieldPantalla.setText("0");
        }
        else {
            NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
        }
    }
    
    private void botonPuntoActionPerformed(final ActionEvent evt) {
        final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
        if (Operaciones.estadoOperacion) {
            NewJFrame.miframe.TextFieldPantalla.setText("0.");
            Operaciones.estadoOperacion = false;
        }
        else if (texto.equals("0")) {
            NewJFrame.miframe.TextFieldPantalla.setText("");
            NewJFrame.miframe.TextFieldPantalla.setText("0.");
        }
        else {
            NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
        }
    }
    
    private void botonBorrarTodoActionPerformed(final ActionEvent evt) {
        NewJFrame.miframe.TextFieldPantalla.setText("0");
        Operaciones.valorA = 0.0;
        Operaciones.ValorA = false;
        Operaciones.valorB = 0.0;
        Operaciones.ValorB = false;
        Operaciones.estadoOperacion = false;
    }
    
    private void botonEActionPerformed(final ActionEvent evt) {
        final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
        if (Operaciones.estadoOperacion) {
            NewJFrame.miframe.TextFieldPantalla.setText("2.71828");
            Operaciones.estadoOperacion = false;
        }
        else if (texto.equals("0")) {
            NewJFrame.miframe.TextFieldPantalla.setText("");
            NewJFrame.miframe.TextFieldPantalla.setText("0");
        }
        else {
            NewJFrame.miframe.TextFieldPantalla.setText("2.71828");
        }
    }
    
    private void botonPiActionPerformed(final ActionEvent evt) {
        final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
        if (Operaciones.estadoOperacion) {
            NewJFrame.miframe.TextFieldPantalla.setText("3.14.15");
            Operaciones.estadoOperacion = false;
        }
        else if (texto.equals("0")) {
            NewJFrame.miframe.TextFieldPantalla.setText("");
            NewJFrame.miframe.TextFieldPantalla.setText("0");
        }
        else {
            NewJFrame.miframe.TextFieldPantalla.setText("3.1415");
        }
    }
    
    private void botonMasActionPerformed(final ActionEvent evt) {
        final double valor = Double.valueOf(NewJFrame.miframe.TextFieldPantalla.getText());
        NewJFrame.miframe.TextFieldPantalla.setText("");
        if (Operaciones.suma) {
            Operaciones.suma = false;
            Operaciones.operacion("+", valor);
            Operaciones.suma = true;
        }
        else if (Operaciones.resta) {
            Operaciones.resta = false;
            Operaciones.operacion("-", valor);
            Operaciones.suma = true;
        }
        else if (Operaciones.multiplicacion) {
            Operaciones.multiplicacion = false;
            Operaciones.operacion("*", valor);
            Operaciones.suma = true;
        }
        else if (Operaciones.division) {
            Operaciones.division = false;
            Operaciones.operacion("/", valor);
            Operaciones.suma = true;
        }
        else {
            Operaciones.operacion("+", valor);
            Operaciones.suma = true;
        }
    }
    
    private void botonMultiplicacionActionPerformed(final ActionEvent evt) {
        final double valor = Double.valueOf(NewJFrame.miframe.TextFieldPantalla.getText());
        NewJFrame.miframe.TextFieldPantalla.setText("");
        if (Operaciones.suma) {
            Operaciones.suma = false;
            Operaciones.operacion("+", valor);
            Operaciones.multiplicacion = true;
        }
        else if (Operaciones.resta) {
            Operaciones.resta = false;
            Operaciones.operacion("-", valor);
            Operaciones.multiplicacion = true;
        }
        else if (Operaciones.multiplicacion) {
            Operaciones.multiplicacion = false;
            Operaciones.operacion("*", valor);
            Operaciones.multiplicacion = true;
        }
        else if (Operaciones.division) {
            Operaciones.division = false;
            Operaciones.operacion("/", valor);
            Operaciones.multiplicacion = true;
        }
        else {
            Operaciones.operacion("*", valor);
            Operaciones.multiplicacion = true;
        }
    }
    
    private void botonDivisionActionPerformed(final ActionEvent evt) {
        final double valor = Double.valueOf(NewJFrame.miframe.TextFieldPantalla.getText());
        NewJFrame.miframe.TextFieldPantalla.setText("");
        if (Operaciones.suma) {
            Operaciones.suma = false;
            Operaciones.operacion("+", valor);
            Operaciones.division = true;
        }
        else if (Operaciones.resta) {
            Operaciones.resta = false;
            Operaciones.operacion("-", valor);
            Operaciones.division = true;
        }
        else if (Operaciones.multiplicacion) {
            Operaciones.multiplicacion = false;
            Operaciones.operacion("*", valor);
            Operaciones.division = true;
        }
        else if (Operaciones.division) {
            Operaciones.division = false;
            Operaciones.operacion("/", valor);
            Operaciones.division = true;
        }
        else {
            Operaciones.operacion("/", valor);
            Operaciones.division = true;
        }
    }
    
    private void botonMenosActionPerformed(final ActionEvent evt) {
        final double valor = Double.valueOf(NewJFrame.miframe.TextFieldPantalla.getText());
        NewJFrame.miframe.TextFieldPantalla.setText("");
        if (Operaciones.suma) {
            Operaciones.suma = false;
            Operaciones.operacion("+", valor);
            Operaciones.resta = true;
        }
        else if (Operaciones.resta) {
            Operaciones.resta = false;
            Operaciones.operacion("-", valor);
            Operaciones.resta = true;
        }
        else if (Operaciones.multiplicacion) {
            Operaciones.multiplicacion = false;
            Operaciones.operacion("*", valor);
            Operaciones.resta = true;
        }
        else if (Operaciones.division) {
            Operaciones.division = false;
            Operaciones.operacion("/", valor);
            Operaciones.resta = true;
        }
        else {
            Operaciones.operacion("-", valor);
            Operaciones.resta = true;
        }
    }
    
    private void botonIgualActionPerformed(final ActionEvent evt) {
        final double valorA = Operaciones.valorA;
        final double valorB = Double.valueOf(NewJFrame.miframe.TextFieldPantalla.getText());
        double x = 0.0;
        if (Operaciones.suma) {
            x = valorA + valorB;
            Operaciones.suma = false;
        }
        else if (Operaciones.resta) {
            x = valorA - valorB;
            Operaciones.resta = false;
        }
        else if (Operaciones.multiplicacion) {
            x = valorA * valorB;
            Operaciones.multiplicacion = false;
        }
        else if (Operaciones.division) {
            x = valorA / valorB;
            Operaciones.division = false;
        }
        NewJFrame.miframe.TextFieldPantalla.setText(String.valueOf(x));
        Operaciones.valorA = 0.0;
        Operaciones.ValorA = false;
        Operaciones.valorB = 0.0;
        Operaciones.ValorB = false;
    }
    
    private void formKeyPressed(final KeyEvent evt) {
        if (evt.getKeyChar() == '7') {
            final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
            if (Operaciones.estadoOperacion) {
                NewJFrame.miframe.TextFieldPantalla.setText("7");
                Operaciones.estadoOperacion = false;
            }
            else if (texto.equals("0")) {
                NewJFrame.miframe.TextFieldPantalla.setText("");
                NewJFrame.miframe.TextFieldPantalla.setText("7");
            }
            else {
                NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
            }
        }
        if (evt.getKeyChar() == '8') {
            final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
            if (Operaciones.estadoOperacion) {
                NewJFrame.miframe.TextFieldPantalla.setText("8");
                Operaciones.estadoOperacion = false;
            }
            else if (texto.equals("0")) {
                NewJFrame.miframe.TextFieldPantalla.setText("");
                NewJFrame.miframe.TextFieldPantalla.setText("8");
            }
            else {
                NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
            }
        }
        if (evt.getKeyChar() == '9') {
            final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
            if (Operaciones.estadoOperacion) {
                NewJFrame.miframe.TextFieldPantalla.setText("9");
                Operaciones.estadoOperacion = false;
            }
            else if (texto.equals("0")) {
                NewJFrame.miframe.TextFieldPantalla.setText("");
                NewJFrame.miframe.TextFieldPantalla.setText("9");
            }
            else {
                NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
            }
        }
        if (evt.getKeyChar() == '-') {
            final double valor = Double.valueOf(NewJFrame.miframe.TextFieldPantalla.getText());
            NewJFrame.miframe.TextFieldPantalla.setText("");
            if (Operaciones.suma) {
                Operaciones.suma = false;
                Operaciones.operacion("+", valor);
                Operaciones.resta = true;
            }
            else if (Operaciones.resta) {
                Operaciones.resta = false;
                Operaciones.operacion("-", valor);
                Operaciones.resta = true;
            }
            else if (Operaciones.multiplicacion) {
                Operaciones.multiplicacion = false;
                Operaciones.operacion("*", valor);
                Operaciones.resta = true;
            }
            else if (Operaciones.division) {
                Operaciones.division = false;
                Operaciones.operacion("/", valor);
                Operaciones.resta = true;
            }
            else {
                Operaciones.operacion("-", valor);
                Operaciones.resta = true;
            }
        }
        if (evt.getKeyChar() == '4') {
            final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
            if (Operaciones.estadoOperacion) {
                NewJFrame.miframe.TextFieldPantalla.setText("4");
                Operaciones.estadoOperacion = false;
            }
            else if (texto.equals("0")) {
                NewJFrame.miframe.TextFieldPantalla.setText("");
                NewJFrame.miframe.TextFieldPantalla.setText("4");
            }
            else {
                NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
            }
        }
        if (evt.getKeyChar() == '5') {
            final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
            if (Operaciones.estadoOperacion) {
                NewJFrame.miframe.TextFieldPantalla.setText("5");
                Operaciones.estadoOperacion = false;
            }
            else if (texto.equals("0")) {
                NewJFrame.miframe.TextFieldPantalla.setText("");
                NewJFrame.miframe.TextFieldPantalla.setText("5");
            }
            else {
                NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
            }
        }
        if (evt.getKeyChar() == '6') {
            final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
            if (Operaciones.estadoOperacion) {
                NewJFrame.miframe.TextFieldPantalla.setText("6");
                Operaciones.estadoOperacion = false;
            }
            else if (texto.equals("0")) {
                NewJFrame.miframe.TextFieldPantalla.setText("");
                NewJFrame.miframe.TextFieldPantalla.setText("6");
            }
            else {
                NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
            }
        }
        if (evt.getKeyChar() == '/') {
            final double valor = Double.valueOf(NewJFrame.miframe.TextFieldPantalla.getText());
            NewJFrame.miframe.TextFieldPantalla.setText("");
            if (Operaciones.suma) {
                Operaciones.suma = false;
                Operaciones.operacion("+", valor);
                Operaciones.division = true;
            }
            else if (Operaciones.resta) {
                Operaciones.resta = false;
                Operaciones.operacion("-", valor);
                Operaciones.division = true;
            }
            else if (Operaciones.multiplicacion) {
                Operaciones.multiplicacion = false;
                Operaciones.operacion("*", valor);
                Operaciones.division = true;
            }
            else if (Operaciones.division) {
                Operaciones.division = false;
                Operaciones.operacion("/", valor);
                Operaciones.division = true;
            }
            else {
                Operaciones.operacion("/", valor);
                Operaciones.division = true;
            }
        }
        if (evt.getKeyChar() == '1') {
            final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
            if (Operaciones.estadoOperacion) {
                NewJFrame.miframe.TextFieldPantalla.setText("1");
                Operaciones.estadoOperacion = false;
            }
            else if (texto.equals("0")) {
                NewJFrame.miframe.TextFieldPantalla.setText("");
                NewJFrame.miframe.TextFieldPantalla.setText("1");
            }
            else {
                NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
            }
        }
        if (evt.getKeyChar() == '2') {
            final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
            if (Operaciones.estadoOperacion) {
                NewJFrame.miframe.TextFieldPantalla.setText("2");
                Operaciones.estadoOperacion = false;
            }
            else if (texto.equals("0")) {
                NewJFrame.miframe.TextFieldPantalla.setText("");
                NewJFrame.miframe.TextFieldPantalla.setText("2");
            }
            else {
                NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
            }
        }
        if (evt.getKeyChar() == '3') {
            final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
            if (Operaciones.estadoOperacion) {
                NewJFrame.miframe.TextFieldPantalla.setText("3");
                Operaciones.estadoOperacion = false;
            }
            else if (texto.equals("0")) {
                NewJFrame.miframe.TextFieldPantalla.setText("");
                NewJFrame.miframe.TextFieldPantalla.setText("3");
            }
            else {
                NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
            }
        }
        if (evt.getKeyChar() == '*') {
            final double valor = Double.valueOf(NewJFrame.miframe.TextFieldPantalla.getText());
            NewJFrame.miframe.TextFieldPantalla.setText("");
            if (Operaciones.suma) {
                Operaciones.suma = false;
                Operaciones.operacion("+", valor);
                Operaciones.multiplicacion = true;
            }
            else if (Operaciones.resta) {
                Operaciones.resta = false;
                Operaciones.operacion("-", valor);
                Operaciones.multiplicacion = true;
            }
            else if (Operaciones.multiplicacion) {
                Operaciones.multiplicacion = false;
                Operaciones.operacion("*", valor);
                Operaciones.multiplicacion = true;
            }
            else if (Operaciones.division) {
                Operaciones.division = false;
                Operaciones.operacion("/", valor);
                Operaciones.multiplicacion = true;
            }
            else {
                Operaciones.operacion("*", valor);
                Operaciones.multiplicacion = true;
            }
        }
        if (evt.getKeyChar() == '0') {
            final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
            if (Operaciones.estadoOperacion) {
                NewJFrame.miframe.TextFieldPantalla.setText("0");
                Operaciones.estadoOperacion = false;
            }
            else if (texto.equals("0")) {
                NewJFrame.miframe.TextFieldPantalla.setText("");
                NewJFrame.miframe.TextFieldPantalla.setText("0");
            }
            else {
                NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
            }
        }
        if (evt.getKeyCode() == 8) {
            final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
            String texto2 = "";
            final int longitud = texto.length();
            System.out.println(invokedynamic(makeConcatWithConstants:(I)Ljava/lang/String;, longitud));
            if (longitud == 1) {
                NewJFrame.miframe.TextFieldPantalla.setText("0");
            }
            else {
                for (int i = 0; i < longitud - 1; ++i) {
                    texto2 = invokedynamic(makeConcatWithConstants:(Ljava/lang/String;C)Ljava/lang/String;, texto2, texto.charAt(i));
                }
                NewJFrame.miframe.TextFieldPantalla.setText(texto2);
            }
        }
        if (evt.getKeyChar() == '.') {
            final String texto = NewJFrame.miframe.TextFieldPantalla.getText();
            if (Operaciones.estadoOperacion) {
                NewJFrame.miframe.TextFieldPantalla.setText("0.");
                Operaciones.estadoOperacion = false;
            }
            else if (texto.equals("0")) {
                NewJFrame.miframe.TextFieldPantalla.setText("");
                NewJFrame.miframe.TextFieldPantalla.setText("0.");
            }
            else {
                NewJFrame.miframe.TextFieldPantalla.setText(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, texto));
            }
        }
        if (evt.getKeyChar() == '+') {
            final double valor = Double.valueOf(NewJFrame.miframe.TextFieldPantalla.getText());
            NewJFrame.miframe.TextFieldPantalla.setText("");
            if (Operaciones.suma) {
                Operaciones.suma = false;
                Operaciones.operacion("+", valor);
                Operaciones.suma = true;
            }
            else if (Operaciones.resta) {
                Operaciones.resta = false;
                Operaciones.operacion("-", valor);
                Operaciones.suma = true;
            }
            else if (Operaciones.multiplicacion) {
                Operaciones.multiplicacion = false;
                Operaciones.operacion("*", valor);
                Operaciones.suma = true;
            }
            else if (Operaciones.division) {
                Operaciones.division = false;
                Operaciones.operacion("/", valor);
                Operaciones.suma = true;
            }
            else {
                Operaciones.operacion("+", valor);
                Operaciones.suma = true;
            }
        }
        if (evt.getKeyChar() == '=') {
            final double valorA = Operaciones.valorA;
            final double valorB = Double.valueOf(NewJFrame.miframe.TextFieldPantalla.getText());
            double x = 0.0;
            if (Operaciones.suma) {
                x = valorA + valorB;
                Operaciones.suma = false;
            }
            else if (Operaciones.resta) {
                x = valorA - valorB;
                Operaciones.resta = false;
            }
            else if (Operaciones.multiplicacion) {
                x = valorA * valorB;
                Operaciones.multiplicacion = false;
            }
            else if (Operaciones.division) {
                x = valorA / valorB;
                Operaciones.division = false;
            }
            NewJFrame.miframe.TextFieldPantalla.setText(String.valueOf(x));
            Operaciones.valorA = 0.0;
            Operaciones.ValorA = false;
            Operaciones.valorB = 0.0;
            Operaciones.ValorB = false;
        }
        if (evt.getKeyCode() == 10) {
            final double valorA = Operaciones.valorA;
            final double valorB = Double.valueOf(NewJFrame.miframe.TextFieldPantalla.getText());
            double x = 0.0;
            if (Operaciones.suma) {
                x = valorA + valorB;
                Operaciones.suma = false;
            }
            else if (Operaciones.resta) {
                x = valorA - valorB;
                Operaciones.resta = false;
            }
            else if (Operaciones.multiplicacion) {
                x = valorA * valorB;
                Operaciones.multiplicacion = false;
            }
            else if (Operaciones.division) {
                x = valorA / valorB;
                Operaciones.division = false;
            }
            NewJFrame.miframe.TextFieldPantalla.setText(String.valueOf(x));
            Operaciones.valorA = 0.0;
            Operaciones.ValorA = false;
            Operaciones.valorB = 0.0;
            Operaciones.ValorB = false;
        }
    }
    
    public static void main(final String[] args) {
        try {
            for (final UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                (NewJFrame.miframe = new NewJFrame()).setVisible(true);
                NewJFrame.miframe.setLocationRelativeTo(null);
                NewJFrame.miframe.setResizable(false);
            }
        });
    }
}
