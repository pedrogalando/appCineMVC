package view;

import entity.Actor;
import entity.Genero;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class FramePrincipal extends javax.swing.JFrame {

    private PanelGenero panelGenero;
    private PanelActor panelActor;
    private PanelPelicula panelPelicula;

    private ImageIcon imagenBanner;
    private ImageIcon imagenDimAux;

    private List<Genero> listaGenero;
    private List<Actor> listaActor;

    public FramePrincipal() {
        initComponents();
        this.colocarImagenBanner();
    }

    public final void colocarImagenBanner() {
        this.imagenBanner = new ImageIcon("src/imagen/banner.jpg");

        imagenDimAux = new ImageIcon(
                imagenBanner.getImage()
                        .getScaledInstance(800, 100, Image.SCALE_AREA_AVERAGING)
        );

        this.jLabelBanner.setIcon(imagenDimAux);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelBanner = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonGenero = new javax.swing.JButton();
        botonActor = new javax.swing.JButton();
        botonPelicula = new javax.swing.JButton();
        botonLogin = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBanner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        botonGenero.setText("Género");
        botonGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGeneroMouseClicked(evt);
            }
        });

        botonActor.setText("Actor");
        botonActor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonActorMouseClicked(evt);
            }
        });

        botonPelicula.setText("Película");
        botonPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPeliculaMouseClicked(evt);
            }
        });

        botonLogin.setText("Login");

        botonSalir.setText("Salir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonActor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(botonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(botonGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(botonActor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botonPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGeneroMouseClicked
        if (panelActor != null) {
            panelActor.setVisible(false);
        }

        if (panelPelicula != null) {
            panelPelicula.setVisible(false);
        }

        if (panelGenero == null) {
            this.crearPanelGenero();
        } else {
            this.panelGenero.setVisible(true);
        }
    }//GEN-LAST:event_botonGeneroMouseClicked

    private void botonActorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActorMouseClicked
        if (panelGenero != null) {
            panelGenero.setVisible(false);
        }

        if (panelPelicula != null) {
            panelPelicula.setVisible(false);
        }

        if (panelActor == null) {
            this.crearPanelActor();
        } else {
            this.panelActor.setVisible(true);
        }
    }//GEN-LAST:event_botonActorMouseClicked

    private void botonPeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPeliculaMouseClicked
        if (panelGenero != null) {
            panelGenero.setVisible(false);
        }

        if (panelActor != null) {
            panelActor.setVisible(false);
        }

        if (panelPelicula == null) {
            if (this.panelActor == null) {
                crearPanelActor();
                this.panelActor.setVisible(false);
            }

            if (this.panelGenero == null) {
                crearPanelGenero();
                this.panelGenero.setVisible(false);
            }

            this.crearPanelPelicula();
        } else {
            this.panelPelicula.setVisible(true);
        }
        this.panelPelicula.limpiarCombo();
        this.panelPelicula.llenarComboGenero(listaGenero);
        this.panelPelicula.llenarComboActor(listaActor);
    }//GEN-LAST:event_botonPeliculaMouseClicked

    public void crearPanelActor() {
        this.listaActor = new ArrayList<>();
        panelActor = new PanelActor(this.listaActor);
        panelActor.setBackground(new Color(249, 250, 249, 255));
        panelActor.setBounds(210, 106, 580, 488);
        this.add(panelActor);
        this.revalidate();
        this.repaint();
    }

    public void crearPanelGenero() {
        this.listaGenero = new ArrayList<>();
        panelGenero = new PanelGenero(this.listaGenero);
        panelGenero.setBackground(new Color(249, 250, 249, 255));
        panelGenero.setBounds(210, 106, 580, 488);
        this.add(panelGenero);
        this.revalidate();
        this.repaint();
    }

    public void crearPanelPelicula() {
        panelPelicula = new PanelPelicula();
        panelGenero.setBackground(new Color(249, 250, 249, 255));
        panelPelicula.setBounds(210, 106, 580, 488);
        this.add(panelPelicula);
        this.repaint();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActor;
    private javax.swing.JButton botonGenero;
    private javax.swing.JButton botonLogin;
    private javax.swing.JButton botonPelicula;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabelBanner;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
