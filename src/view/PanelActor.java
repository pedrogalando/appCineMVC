package view;

import controller.ActorController;
import entity.Actor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PanelActor extends javax.swing.JPanel {
    private final DefaultTableModel modeloTablaActor;
    private final ActorController actorController;
    private final List<Actor> listaActor;

    public PanelActor(List<Actor> listaActor) {
        initComponents();

        this.modeloTablaActor = (DefaultTableModel) jTableRegistrosActor.getModel();
        this.actorController = new ActorController();
        this.listaActor = listaActor;

        this.llenarDatosInicialesActor();
        this.actorController.mostrarRegistro(this.listaActor, modeloTablaActor);
    }

    public final void llenarDatosInicialesActor() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            listaActor.add(new Actor(1, "Eddie Murphy", formato.parse("03/04/1961")));
            listaActor.add(new Actor(2, "Will Smith", formato.parse("25/10/1968")));
            listaActor.add(new Actor(3, "Antonio Banderas", formato.parse("10/08/1960")));
            listaActor.add(new Actor(4, "Charlize Theron", formato.parse("07/08/1975")));
            listaActor.add(new Actor(5, "Megan Fox", formato.parse("16/05/1986")));
        } catch (ParseException ex) {
            Logger.getLogger(PanelActor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombreActor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistrosActor = new javax.swing.JTable();
        jDateChooserFechaNacimiento = new com.toedter.calendar.JDateChooser();
        botonAgregarRegistro = new javax.swing.JButton();
        botonEditarRegistro = new javax.swing.JButton();
        botonEliminarRegistro = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de datos del Actor");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Fecha de Nacimiento:");

        jTableRegistrosActor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Fecha Nacimiento"
            }
        ));
        jTableRegistrosActor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRegistrosActorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRegistrosActor);
        if (jTableRegistrosActor.getColumnModel().getColumnCount() > 0) {
            jTableRegistrosActor.getColumnModel().getColumn(2).setResizable(false);
        }

        botonAgregarRegistro.setText("Agregar");
        botonAgregarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarRegistroMouseClicked(evt);
            }
        });

        botonEditarRegistro.setText("Editar");
        botonEditarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEditarRegistroMouseClicked(evt);
            }
        });

        botonEliminarRegistro.setText("Eliminar");
        botonEliminarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarRegistroMouseClicked(evt);
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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAgregarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEditarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNombreActor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombreActor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarRegistroMouseClicked
        Actor actor = new Actor();
        actor.setNombre(this.jTextFieldNombreActor.getText());
        actor.setFechaNacimiento(this.jDateChooserFechaNacimiento.getDate());

        this.actorController.crearRegistro(this.listaActor, actor);
        this.actorController.mostrarRegistro(this.listaActor, this.modeloTablaActor);
    }//GEN-LAST:event_botonAgregarRegistroMouseClicked

    private void botonEliminarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarRegistroMouseClicked
        int id = Integer.parseInt(this.jTableRegistrosActor.getValueAt(this.jTableRegistrosActor.getSelectedRow(), 0).toString());
        this.actorController.eliminarRegistro(listaActor, id);
        this.actorController.mostrarRegistro(listaActor, modeloTablaActor);
    }//GEN-LAST:event_botonEliminarRegistroMouseClicked

    private void jTableRegistrosActorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRegistrosActorMouseClicked
        try {
            this.jTextFieldNombreActor.setText(this.jTableRegistrosActor.getValueAt(this.jTableRegistrosActor.getSelectedRow(), 1).toString());
            String fecha = this.jTableRegistrosActor.getValueAt(this.jTableRegistrosActor.getSelectedRow(), 2).toString();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
            this.jDateChooserFechaNacimiento.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(PanelActor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableRegistrosActorMouseClicked

    private void botonEditarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarRegistroMouseClicked
        Actor actor = new Actor();
        actor.setId(Integer.parseInt(this.jTableRegistrosActor.getValueAt(this.jTableRegistrosActor.getSelectedRow(), 0).toString()));
        actor.setNombre(this.jTextFieldNombreActor.getText());
        actor.setFechaNacimiento(this.jDateChooserFechaNacimiento.getDate());

        this.actorController.actualizarRegistro(this.listaActor, actor);
        this.actorController.mostrarRegistro(this.listaActor, this.modeloTablaActor);
    }//GEN-LAST:event_botonEditarRegistroMouseClicked

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonSalirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarRegistro;
    private javax.swing.JButton botonEditarRegistro;
    private javax.swing.JButton botonEliminarRegistro;
    private javax.swing.JButton botonSalir;
    private com.toedter.calendar.JDateChooser jDateChooserFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegistrosActor;
    private javax.swing.JTextField jTextFieldNombreActor;
    // End of variables declaration//GEN-END:variables
}
