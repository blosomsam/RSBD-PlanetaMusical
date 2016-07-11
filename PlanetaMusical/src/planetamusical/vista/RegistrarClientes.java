package planetamusical.vista;

import javax.swing.JOptionPane;
import planetamusical.Util.JPAUtil;
import planetamusical.controlador.ClienteJpaControl;
import planetamusical.controlador.PersonaJpaControl;
import planetamusical.modelo.Cliente;
import planetamusical.modelo.Persona;

public class RegistrarClientes extends javax.swing.JInternalFrame {
    Cliente cli;
    ClienteJpaControl clijpa;
    
    public RegistrarClientes() {
        initComponents();
    }
    
    //  MÉTODO PARA RECIBIR OBJETO  UNA clisona
    public boolean setObjectUsuarios(Persona clisona){
        txtApellidosCliente.setText(clisona.getApellidos());
        txtRucCliente.setText(clisona.getCedula());
        txtCelularCliente.setText(clisona.getTelefonoCelular());
        txtDireccionCliente.setText(clisona.getDireccion());   
        txtEmailCliente.setText(clisona.getCorreoElectronico());
        txtNombresCliente.setText(clisona.getNombres());
        
       
        //        btnGuardar.setText("Modificar");
        //        txtRegistroDePersonas.setText("MODIFICAR SITIO");
        //        txtTuristicos.setText(null);
        return  true;
    }
    
    
    //METODO CARGAR DATOS EN LA BASE DE DATOS
    public Cliente cargarDatos(){
        cli = new Cliente();
        cli.setApellidos(txtApellidosCliente.getText());
        cli.setCedula(txtRucCliente.getText());
        cli.setTelefonoCelular(txtCelularCliente.getText());
        cli.setDireccion(txtDireccionCliente.getText());
        cli.setCorreoElectronico(txtEmailCliente.getText());
        cli.setNombres(txtNombresCliente.getText());
        cli.setruc(txtRucCliente.getText());// añadi otra linea

        clijpa = new ClienteJpaControl(JPAUtil.getEntityManagerFactory());
        clijpa.crear(cli);
        
        return cli;   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtRucCliente = new javax.swing.JTextField();
        txtNombresCliente = new javax.swing.JTextField();
        txtEmailCliente = new javax.swing.JTextField();
        txtCelularCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtApellidosCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel5.setText("Dirección :");

        txtRucCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtNombresCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtNombresCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresClienteActionPerformed(evt);
            }
        });

        txtEmailCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtCelularCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel8.setText("Correo Electrónico :");

        jLabel2.setText("Nombres :");

        txtApellidosCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtApellidosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosClienteActionPerformed(evt);
            }
        });

        txtDireccionCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel3.setText("Apellidos :");

        jLabel6.setText("Teléfono celular :");

        jLabel4.setText("Ruc : ");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombresCliente)
                            .addComponent(txtEmailCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidosCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRucCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccionCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCelularCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRucCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresClienteActionPerformed

    }//GEN-LAST:event_txtNombresClienteActionPerformed

    private void txtApellidosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosClienteActionPerformed

    }//GEN-LAST:event_txtApellidosClienteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      cargarDatos(); // elimine cli =
        try {
            clijpa = new ClienteJpaControl(JPAUtil.getEntityManagerFactory());
            JOptionPane.showMessageDialog(null, "Cliente Guardado ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellidosCliente;
    private javax.swing.JTextField txtCelularCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtNombresCliente;
    private javax.swing.JTextField txtRucCliente;
    // End of variables declaration//GEN-END:variables
}
