/*******************************************************************************
 * Autor: Rolando Pedro Gabriel                                                *
 * Fecha de creación: 01/05/2023                                               * 
 * Fecha de modificación:                                                      *
 * Descripción: Clase para implementar el CRUD de géneros de las películas.    * 
 ******************************************************************************/
package view;

import controller.GeneroController;
import entity.Genero;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class PanelGenero extends javax.swing.JPanel {
    // Declaración de los atributos    
    private final DefaultListModel modeloListaGenero;
    private final GeneroController generoController;
    private final List<Genero> listaGenero;

    public PanelGenero(List<Genero> listaGenero) {
        // Inicializa los componentes de la interfaz Género.
        initComponents();
        
        // Se inicializa el modelo para integrarlo en el JList
        this.modeloListaGenero = new DefaultListModel();
        this.jListGenero.setModel(modeloListaGenero);
        
        this.generoController = new GeneroController();
        // Esta lista viene del FramePrincipal
        this.listaGenero = listaGenero;

        // Se cargan al iniciar la aplicación una lista de Géneros.
        this.llenarDatosInicialesGenero();
        this.generoController.mostrarRegistro(this.listaGenero, modeloListaGenero);
    }

    /**
     * Método para cargar al iniciar la aplicación una lista de géneros.
     */
    public final void llenarDatosInicialesGenero() {
        this.listaGenero.add(new Genero(1, "Drama"));
        this.listaGenero.add(new Genero(2, "Terror"));
        this.listaGenero.add(new Genero(3, "Comedia"));
        this.listaGenero.add(new Genero(4, "Romántica"));
        this.listaGenero.add(new Genero(5, "Acción"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonAgregarRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombreGenero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListGenero = new javax.swing.JList<>();
        botonQuitarRegistro = new javax.swing.JButton();
        botonModificarRegistro = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Género");

        botonAgregarRegistro.setText("Agregar");
        botonAgregarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarRegistroMouseClicked(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jListGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListGeneroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListGenero);

        botonQuitarRegistro.setText("Quitar");
        botonQuitarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonQuitarRegistroMouseClicked(evt);
            }
        });

        botonModificarRegistro.setText("Modificar");
        botonModificarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarRegistroMouseClicked(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombreGenero)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonAgregarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonQuitarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonModificarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombreGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAgregarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonQuitarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(botonModificarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarRegistroMouseClicked
        if (this.jTextFieldNombreGenero.getText().compareTo("") != 0) {
            this.generoController.crearRegistro(this.listaGenero, new Genero(this.jTextFieldNombreGenero.getText()));
            this.generoController.mostrarRegistro(this.listaGenero, this.modeloListaGenero);
            this.jTextFieldNombreGenero.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa el género.", "Mensaje de error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botonAgregarRegistroMouseClicked

    private void botonQuitarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonQuitarRegistroMouseClicked
        if (!this.jListGenero.isSelectionEmpty()) {
            String[] tokens = this.jListGenero.getSelectedValue().split("-");
            int id = Integer.parseInt(tokens[0]); 
            this.generoController.eliminarRegistro(listaGenero, id);
            this.generoController.mostrarRegistro(listaGenero, this.modeloListaGenero);
            this.jTextFieldNombreGenero.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un género.", "Mensaje de error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botonQuitarRegistroMouseClicked

    private void botonModificarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarRegistroMouseClicked
        if (!this.jListGenero.isSelectionEmpty()) {
            String[] tokens = this.jListGenero.getSelectedValue().split("-");

            Genero genero = new Genero();
            genero.setId(Integer.parseInt(tokens[0]));
            genero.setNombre(this.jTextFieldNombreGenero.getText());

            this.generoController.actualizarRegistro(this.listaGenero, genero);
            this.generoController.mostrarRegistro(this.listaGenero, this.modeloListaGenero);
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un género.", "Mensaje de error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botonModificarRegistroMouseClicked

    private void jListGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListGeneroMouseClicked
        String[] token = this.jListGenero.getSelectedValue().split("-");
        String nombre = token[1]; 
        this.jTextFieldNombreGenero.setText(nombre);
    }//GEN-LAST:event_jListGeneroMouseClicked

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonSalirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarRegistro;
    private javax.swing.JButton botonModificarRegistro;
    private javax.swing.JButton botonQuitarRegistro;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListGenero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNombreGenero;
    // End of variables declaration//GEN-END:variables
}
