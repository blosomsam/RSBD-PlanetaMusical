package planetamusical.vista;

import javax.swing.JOptionPane;
import planetamusical.Util.JPAUtil;
import planetamusical.controlador.CuentaJpaControl;
import planetamusical.modelo.Cuenta;
import planetamusical.modelo.Cuenta;
import planetamusical.modelo.Persona;

public class RegistrarCuentas extends javax.swing.JInternalFrame {
    Cuenta cue;
    CuentaJpaControl cuejpa;
    private Persona per;
    
    public RegistrarCuentas() {
        initComponents();
    }
    
    //  MÉTODO PARA RECIBIR OBJETO  UNA CUENTA
    public boolean setObjectCuentas(Cuenta cuenta){
        txtAsignarClave.setText(cuenta.getClave());
        txtAsignarNombreUsuario.setText(cuenta.getNombreUsuario());
        fechaCreacion.setDate(cuenta.getFechaCreacion());
        fechaModificacionCuenta.setDate(cuenta.getFechaModificacion());   
        cbxEstadoCuenta.setName(cuenta.getEstado());  
        cbxTipoRol.setName(cuenta.getTipoRol());

        //        btnGuardar.setText("Modificar");
        //        txtRegistroDeCuentas.setText("MODIFICAR SITIO");
        //        txtTuristicos.setText(null);
        return  true;
    }
    
    
    //METODO CARGAR DATOS EN LA BASE DE DATOS
    public Cuenta cargarDatos(){
        cue = new Cuenta();
        cue.setClave(txtAsignarClave.getText());
        cue.setNombreUsuario(txtAsignarNombreUsuario.getText());
        cue.setFechaCreacion(fechaCreacion.getDate());
        cue.setFechaModificacion(fechaModificacionCuenta.getDate());
        cue.setEstado(cbxEstadoCuenta.getSelectedItem().toString());
        cue.setTipoRol(cbxTipoRol.getSelectedItem().toString());
        cue.setPersona(per);//para que id persona salga en tabla cuenta
    
        cuejpa = new CuentaJpaControl(JPAUtil.getEntityManagerFactory());
        cuejpa.crear(cue);
        
        return cue;   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAsignarNombreUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAsignarClave = new javax.swing.JPasswordField();
        cbxEstadoCuenta = new javax.swing.JComboBox();
        fechaModificacionCuenta = new org.jdesktop.swingx.JXDatePicker();
        fechaCreacion = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cbxTipoRol = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);

        txtAsignarNombreUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAsignarNombreUsuario.setOpaque(true);
        txtAsignarNombreUsuario.setSelectedTextColor(new java.awt.Color(51, 153, 255));
        txtAsignarNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsignarNombreUsuarioActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha modificación :");

        jLabel5.setText("Fecha creación :");

        cbxEstadoCuenta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activa", "Inactiva" }));

        jLabel3.setText("clave :");

        jLabel2.setText("Nombe de usuario :");

        jLabel6.setText("Estado :");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar-25x25.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir-25x25.png"))); // NOI18N
        btnSalir.setText("Salir ");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel10.setText("Tipo rol :");

        cbxTipoRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        cbxTipoRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoRolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbxEstadoCuenta, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fechaModificacionCuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAsignarClave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(txtAsignarNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxTipoRol, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAsignarNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsignarClave, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaCreacion, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEstadoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaModificacionCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoRol, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAsignarNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsignarNombreUsuarioActionPerformed

    }//GEN-LAST:event_txtAsignarNombreUsuarioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cbxTipoRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoRolActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        cue = cargarDatos();
        try {
            cuejpa = new CuentaJpaControl(JPAUtil.getEntityManagerFactory());
            JOptionPane.showMessageDialog(null, "Cuenta Creada ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cbxEstadoCuenta;
    private javax.swing.JComboBox<String> cbxTipoRol;
    private org.jdesktop.swingx.JXDatePicker fechaCreacion;
    private org.jdesktop.swingx.JXDatePicker fechaModificacionCuenta;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtAsignarClave;
    private javax.swing.JTextField txtAsignarNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
