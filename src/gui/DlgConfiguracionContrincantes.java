package gui;

import control.JugadoresDAO;
import dominio.ColorJ;
import dominio.ConfiguracionContrincantes;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 * Cuadro de dialogo que registra el color del jugador
 *
 * @author Administrador
 */
public class DlgConfiguracionContrincantes extends javax.swing.JDialog {

    /**
     * Faltaria la relacion con el enumerador y asignarlo a un jugador, para
     * luego sacar ese color establecido del jugador en FrmTablero y asignarlo a
     * su respectivo color del tablero mediante las clases control, solo es para
     * efectos practicos de la simulacion este atributo estatico.
     */
    private ColorJ color;
    //Forma para saber a que jugador corresponde el color a cambiar
    private String nombreUsuario;
    private ConfiguracionContrincantes configContrincantes;

    /**
     * Se crea DlgColores
     *
     * @param parent
     * @param modal
     * @param jugador
     */
    public DlgConfiguracionContrincantes(java.awt.Frame parent, boolean modal, String jugador) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.nombreUsuario = jugador;
        this.configContrincantes = new ConfiguracionContrincantes(JugadoresDAO.jugadores);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panelFondo = new javax.swing.JPanel();
        btnAzul = new javax.swing.JLabel();
        btnIndigo = new javax.swing.JLabel();
        btnVerde = new javax.swing.JLabel();
        btnNaranja = new javax.swing.JLabel();
        btnRojo = new javax.swing.JLabel();
        btnVioleta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblInstrucciones = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAmarillo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnElegir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuración contrincantes ");
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul.PNG"))); // NOI18N
        btnAzul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAzulMouseClicked(evt);
            }
        });
        panelFondo.add(btnAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 151, 64, 54));

        btnIndigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/indigo.PNG"))); // NOI18N
        btnIndigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnIndigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIndigoMouseClicked(evt);
            }
        });
        panelFondo.add(btnIndigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 151, 64, 54));

        btnVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde.PNG"))); // NOI18N
        btnVerde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnVerde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerdeMouseClicked(evt);
            }
        });
        panelFondo.add(btnVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 151, 64, 54));

        btnNaranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/narnaja.png"))); // NOI18N
        btnNaranja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnNaranja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNaranjaMouseClicked(evt);
            }
        });
        panelFondo.add(btnNaranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 64, 54));

        btnRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo.png"))); // NOI18N
        btnRojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRojoMouseClicked(evt);
            }
        });
        panelFondo.add(btnRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 64, 54));

        btnVioleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/violeta.PNG"))); // NOI18N
        btnVioleta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnVioleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVioletaMouseClicked(evt);
            }
        });
        panelFondo.add(btnVioleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 64, 54));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Rojo");
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 103, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Naranja");
        panelFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 103, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Amarillo");
        panelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 103, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Verde");
        panelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 216, -1, -1));

        lblInstrucciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInstrucciones.setText("Selecciona el color y luego presiona elegir.");
        panelFondo.add(lblInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Índigo");
        panelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 216, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Violeta");
        panelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 103, -1, -1));

        btnAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/amarillo.PNG"))); // NOI18N
        btnAmarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnAmarillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAmarilloMouseClicked(evt);
            }
        });
        panelFondo.add(btnAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 64, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelFondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 277, -1, 41));

        btnElegir.setBackground(new java.awt.Color(255, 255, 255));
        btnElegir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnElegir.setText("Elegir");
        btnElegir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirActionPerformed(evt);
            }
        });
        panelFondo.add(btnElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 277, -1, 41));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Azul");
        panelFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 216, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * ActionEvent de JButton para cancelar el registro.
     *
     * @param evt
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    /**
     * ActionEvent de JButton para registrar color seleccionado.
     *
     * @param evt
     */
    private void btnElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirActionPerformed
        this.verificarColorRepetido();
        this.dispose();
    }//GEN-LAST:event_btnElegirActionPerformed

    private void btnRojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRojoMouseClicked
        //HEX: #f51209
        //RGB: rgba(245,18,9,255)
        this.limpiarBordes();
        this.color = ColorJ.ROJO;
        this.btnRojo.setBorder(this.establecerBordeElegido());
    }//GEN-LAST:event_btnRojoMouseClicked

    private void btnVioletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVioletaMouseClicked
        //HEX: #973598
        //RGB: rgba(151,53,152,255)
        this.limpiarBordes();
        this.color = ColorJ.VIOLETA;
        this.btnVioleta.setBorder(this.establecerBordeElegido());
    }//GEN-LAST:event_btnVioletaMouseClicked

    private void btnNaranjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNaranjaMouseClicked
        //HEX: #f38e34
        //RGB: rgba(243,142,52,255)
        this.limpiarBordes();
        this.color = ColorJ.NARANJA;
        this.btnNaranja.setBorder(this.establecerBordeElegido());
    }//GEN-LAST:event_btnNaranjaMouseClicked

    private void btnAmarilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAmarilloMouseClicked
        //HEX: #f4f400
        //RGB: rgba(244,244,0,255)
        this.limpiarBordes();
        this.color = ColorJ.AMARILLO;
        this.btnAmarillo.setBorder(this.establecerBordeElegido());
    }//GEN-LAST:event_btnAmarilloMouseClicked

    private void btnVerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerdeMouseClicked
        //HEX: #68cb3c
        //RGB: rgba(104,203,60,255)
        this.limpiarBordes();
        this.color = ColorJ.VERDE;
        this.btnVerde.setBorder(this.establecerBordeElegido());
    }//GEN-LAST:event_btnVerdeMouseClicked

    private void btnAzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAzulMouseClicked
        //HEX: #18d2e9
        //RGB: rgba(24,210,233,255)
        this.limpiarBordes();
        this.color = ColorJ.AZUL;
        this.btnAzul.setBorder(this.establecerBordeElegido());
    }//GEN-LAST:event_btnAzulMouseClicked

    private void btnIndigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIndigoMouseClicked
        //HEX: #0066cb
        //RGB: rgba(0,102,203,255)
        this.limpiarBordes();
        this.color = ColorJ.INDIGO;
        this.btnIndigo.setBorder(this.establecerBordeElegido());
    }//GEN-LAST:event_btnIndigoMouseClicked
    //Este metodo se encarga de establecer el color de cada jugador. 

    private void establecerColorJugador() {
        for (int i = 0; i < JugadoresDAO.jugadores.length; i++) {
            if (JugadoresDAO.jugadores[i].getUsuario().equals(this.nombreUsuario)) {
                JugadoresDAO.jugadores[i].setColor(color);
                return;
            }
        }
    }

    /**
     * Se establece el borde elegido.
     *
     * @return border
     */
    private Border establecerBordeElegido() {
        Border border = BorderFactory.createLineBorder(Color.YELLOW, 3);
        return border;
    }
    //Se limpian los bordes. 

    private void limpiarBordes() {
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        this.btnRojo.setBorder(border);
        this.btnVioleta.setBorder(border);
        this.btnNaranja.setBorder(border);
        this.btnAmarillo.setBorder(border);
        this.btnVerde.setBorder(border);
        this.btnAzul.setBorder(border);
        this.btnIndigo.setBorder(border);
    }

    //Metodo que se encargara de validar que no se repitan los colores,
    //esto se hara con la clase control solicitando los jugadores y de estos
    //sus colores, validando que no se repita con el que se haya seleccionado
    //al presionar elegir
    private void verificarColorRepetido() {
        for (int i = 0; i < JugadoresDAO.jugadores.length; i++) {
            if (JugadoresDAO.jugadores[i].getColor().equals(this.color)) {
                JOptionPane.showMessageDialog(rootPane, "No se pueden repetir los colores!", "Error", 2);
                return;
            }

        }
        establecerColorJugador();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAmarillo;
    private javax.swing.JLabel btnAzul;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnElegir;
    private javax.swing.JLabel btnIndigo;
    private javax.swing.JLabel btnNaranja;
    private javax.swing.JLabel btnRojo;
    private javax.swing.JLabel btnVerde;
    private javax.swing.JLabel btnVioleta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblInstrucciones;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
