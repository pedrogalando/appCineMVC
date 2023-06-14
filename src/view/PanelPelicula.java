package view;

import controller.PeliculaController;
import entity.Actor;
import entity.Genero;
import entity.Pelicula;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelPelicula extends javax.swing.JPanel {

    private final PeliculaController peliculaController;
    private final DefaultTableModel modeloTablaPelicula;
    private final DefaultListModel modeloJListActores;
    private final List<Pelicula> listaPelicula;

    public PanelPelicula() {
        initComponents();

        this.modeloTablaPelicula = (DefaultTableModel) jTableRegistrosPelicula.getModel();
        this.peliculaController = new PeliculaController();
        this.modeloJListActores = new DefaultListModel();
        this.jList1.setModel(modeloJListActores);
        this.listaPelicula = new ArrayList<>();
    }

    public void llenarComboGenero(List<Genero> listaGenero) {
        for (Genero genero : listaGenero) {
            jComboGenero.addItem(genero.getId() + "-" + genero.getNombre());
        }
    }

    public void llenarComboActor(List<Actor> listaActor) {
        for (Actor actor : listaActor) {
            jComboActor.addItem(actor.getId() + "-" + actor.getNombre());
        }
    }

    public void limpiarCombo() {
        jComboGenero.removeAllItems();
        jComboActor.removeAllItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboGenero = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboActor = new javax.swing.JComboBox<>();
        jTextFieldNombrePelicula = new javax.swing.JTextField();
        jDateChooserFechaLanzamiento = new com.toedter.calendar.JDateChooser();
        jComboDuracion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSinopsis = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableRegistrosPelicula = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        botonAgregarRegistro = new javax.swing.JButton();
        botonEditarRegistro = new javax.swing.JButton();
        botonEliminarRegistro = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonAgregarActor = new javax.swing.JButton();
        botonQuitarActor = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de películas");

        jLabel2.setText("Género: ");

        jLabel3.setText("Nombre: ");

        jLabel4.setText("Lanzamiento: ");

        jLabel5.setText("Duración:");

        jLabel6.setText("Sinopsis:");

        jLabel7.setText("Actor:");

        jComboDuracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60" }));

        jTextAreaSinopsis.setColumns(20);
        jTextAreaSinopsis.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSinopsis);

        jTableRegistrosPelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Lanzamiento", "Duración", "Sinopsis", "Género", "Actores"
            }
        ));
        jTableRegistrosPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRegistrosPeliculaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableRegistrosPelicula);

        jScrollPane4.setViewportView(jList1);

        botonAgregarRegistro.setText("Agregar");
        botonAgregarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarRegistroMouseClicked(evt);
            }
        });

        botonEditarRegistro.setText("Editar");

        botonEliminarRegistro.setText("Eliminar");
        botonEliminarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarRegistroMouseClicked(evt);
            }
        });

        botonSalir.setText("Salir");

        botonAgregarActor.setText("+ Actor");
        botonAgregarActor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarActorMouseClicked(evt);
            }
        });

        botonQuitarActor.setText("- Actor");
        botonQuitarActor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonQuitarActorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAgregarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(botonEditarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonEliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNombrePelicula))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooserFechaLanzamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboActor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(botonAgregarActor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonQuitarActor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(283, 283, 283))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1)
                                        .addGap(45, 45, 45)))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jComboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jDateChooserFechaLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboActor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonAgregarActor, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(botonQuitarActor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonEliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botonEditarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAgregarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarRegistroMouseClicked
        Pelicula pelicula = new Pelicula();
        pelicula.setNombre(this.jTextFieldNombrePelicula.getText());
        pelicula.setLanzamiento(this.jDateChooserFechaLanzamiento.getDate());
        pelicula.setDuracion(Integer.parseInt(this.jComboDuracion.getSelectedItem().toString()));
        pelicula.setSinopsis(this.jTextAreaSinopsis.getText());
        
        Genero genero = new Genero();
        genero.setNombre(this.jComboGenero.getSelectedItem().toString());
        pelicula.setGenero(genero);

        List<Actor> listaActor = new ArrayList<>();
        for (int i = 0; i < this.modeloJListActores.size(); i++) {
            Actor actor = new Actor();
            actor.setNombre(this.modeloJListActores.elementAt(i).toString());
            listaActor.add(actor);
        }

        pelicula.setListaAutor(listaActor);

        this.peliculaController.crearRegistro(this.listaPelicula, pelicula);
        this.peliculaController.mostrarRegistro(this.listaPelicula, this.modeloTablaPelicula);

        this.limpiarComponentes();
    }//GEN-LAST:event_botonAgregarRegistroMouseClicked

    private void botonAgregarActorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarActorMouseClicked
        this.modeloJListActores.addElement(this.jComboActor.getSelectedItem());
    }//GEN-LAST:event_botonAgregarActorMouseClicked

    private void botonEliminarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarRegistroMouseClicked
        int id = Integer.parseInt(this.jTableRegistrosPelicula.getValueAt(this.jTableRegistrosPelicula.getSelectedRow(), 0).toString());
        this.peliculaController.eliminarRegistro(this.listaPelicula, id);
        this.peliculaController.mostrarRegistro(this.listaPelicula, this.modeloTablaPelicula);
    }//GEN-LAST:event_botonEliminarRegistroMouseClicked

    private void jTableRegistrosPeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRegistrosPeliculaMouseClicked
        try {    
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");            
            String nombre = this.jTableRegistrosPelicula.getValueAt(this.jTableRegistrosPelicula.getSelectedRow(), 1).toString();
            String lanzamiento = this.jTableRegistrosPelicula.getValueAt(this.jTableRegistrosPelicula.getSelectedRow(), 2).toString();
            String duracion = this.jTableRegistrosPelicula.getValueAt(this.jTableRegistrosPelicula.getSelectedRow(), 3).toString();
            String sinopsis = this.jTableRegistrosPelicula.getValueAt(this.jTableRegistrosPelicula.getSelectedRow(), 4).toString();
            String genero = this.jTableRegistrosPelicula.getValueAt(this.jTableRegistrosPelicula.getSelectedRow(), 5).toString();
            String autores = this.jTableRegistrosPelicula.getValueAt(this.jTableRegistrosPelicula.getSelectedRow(), 6).toString();
            
            this.jTextFieldNombrePelicula.setText(nombre);
            this.jDateChooserFechaLanzamiento.setDate(formatoFecha.parse(lanzamiento));
            this.jComboDuracion.setSelectedItem(duracion);
            this.jTextAreaSinopsis.setText(sinopsis);
            this.jComboGenero.setSelectedItem(genero);

            StringTokenizer tokens = new StringTokenizer(autores, ",");
            this.modeloJListActores.clear();
            while (tokens.hasMoreTokens()) {
                this.modeloJListActores.addElement(tokens.nextToken());
            }

        } catch (ParseException ex) {
            Logger.getLogger(PanelActor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableRegistrosPeliculaMouseClicked

    private void botonQuitarActorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonQuitarActorMouseClicked
        if (!this.jList1.isSelectionEmpty()) {
            this.modeloJListActores.removeElementAt(this.jList1.getSelectedIndex());
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un actor.", "Mensaje de error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botonQuitarActorMouseClicked

    public void limpiarComponentes() {
        this.jTextFieldNombrePelicula.setText("");
        this.jDateChooserFechaLanzamiento.setDate(null);
        this.jComboDuracion.setSelectedIndex(0);
        this.jTextAreaSinopsis.setText("");
        this.jComboGenero.setSelectedIndex(0);
        this.jComboActor.setSelectedIndex(0);
        this.modeloJListActores.clear();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarActor;
    private javax.swing.JButton botonAgregarRegistro;
    private javax.swing.JButton botonEditarRegistro;
    private javax.swing.JButton botonEliminarRegistro;
    private javax.swing.JButton botonQuitarActor;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> jComboActor;
    private javax.swing.JComboBox<String> jComboDuracion;
    private javax.swing.JComboBox<String> jComboGenero;
    private com.toedter.calendar.JDateChooser jDateChooserFechaLanzamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableRegistrosPelicula;
    private javax.swing.JTextArea jTextAreaSinopsis;
    private javax.swing.JTextField jTextFieldNombrePelicula;
    // End of variables declaration//GEN-END:variables
}
