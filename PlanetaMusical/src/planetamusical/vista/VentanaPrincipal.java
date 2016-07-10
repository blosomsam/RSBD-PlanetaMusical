package planetamusical.vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    protected  void this_windowsOpened(WindowEvent e ){
        centrarVentana();
    }
    
    public void centrarVentana(){
        // Se obtiene las dimenciones en pixeles de la patalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        
        //Se obtine las dimeciones de la ventana en pixeles
        Dimension ventana = getSize();
        
        // centrando ventana en el centro de la pantalla
        
        setLocation((pantalla.width - ventana.width)/2, 
                   (pantalla.height -ventana.height)/2);
    }

    public VentanaPrincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuVentas = new javax.swing.JMenu();
        itmAdministrarVentas = new javax.swing.JMenuItem();
        menuCompras = new javax.swing.JMenu();
        itmAdministrarCompras = new javax.swing.JMenuItem();
        menuProductos = new javax.swing.JMenu();
        itmAdministrarProductos = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        itmAdministrarClientes = new javax.swing.JMenuItem();
        menuProveedores = new javax.swing.JMenu();
        itmAdministrarProveedores = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        itmAdministrarUsuarios = new javax.swing.JMenuItem();
        menuClientes1 = new javax.swing.JMenu();
        itmAdministrarCuentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 992, Short.MAX_VALUE)
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        menuInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/inicio-28x28.png"))); // NOI18N
        menuInicio.setText("Inicio            ");
        jMenuBar1.add(menuInicio);

        menuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/venta-s28x28.png"))); // NOI18N
        menuVentas.setText("Ventas         ");
        menuVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVentasActionPerformed(evt);
            }
        });

        itmAdministrarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/engranaje-20x20.png"))); // NOI18N
        itmAdministrarVentas.setText("Administrar");
        itmAdministrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAdministrarVentasActionPerformed(evt);
            }
        });
        menuVentas.add(itmAdministrarVentas);

        jMenuBar1.add(menuVentas);

        menuCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/registroCompras-28x28.png"))); // NOI18N
        menuCompras.setText("Compras      ");

        itmAdministrarCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/engranaje-20x20.png"))); // NOI18N
        itmAdministrarCompras.setText("Administrar");
        itmAdministrarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAdministrarComprasActionPerformed(evt);
            }
        });
        menuCompras.add(itmAdministrarCompras);

        jMenuBar1.add(menuCompras);

        menuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/productos-28x28.png"))); // NOI18N
        menuProductos.setText("Productos    ");

        itmAdministrarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/engranaje-20x20.png"))); // NOI18N
        itmAdministrarProductos.setText("Administrar");
        itmAdministrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAdministrarProductosActionPerformed(evt);
            }
        });
        menuProductos.add(itmAdministrarProductos);

        jMenuBar1.add(menuProductos);

        menuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/cliente-28x28.png"))); // NOI18N
        menuClientes.setText("Clientes       ");

        itmAdministrarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/engranaje-20x20.png"))); // NOI18N
        itmAdministrarClientes.setText("Administrar");
        itmAdministrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAdministrarClientesActionPerformed(evt);
            }
        });
        menuClientes.add(itmAdministrarClientes);

        jMenuBar1.add(menuClientes);

        menuProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/proveedores.png"))); // NOI18N
        menuProveedores.setText("Proveedores");

        itmAdministrarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/engranaje-20x20.png"))); // NOI18N
        itmAdministrarProveedores.setText("Administrar");
        itmAdministrarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAdministrarProveedoresActionPerformed(evt);
            }
        });
        menuProveedores.add(itmAdministrarProveedores);

        jMenuBar1.add(menuProveedores);

        menuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/usuarios-28x28.png"))); // NOI18N
        menuUsuarios.setText("Usuarios      ");

        itmAdministrarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/engranaje-20x20.png"))); // NOI18N
        itmAdministrarUsuarios.setText("Administrar");
        itmAdministrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAdministrarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itmAdministrarUsuarios);

        jMenuBar1.add(menuUsuarios);

        menuClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/cuenta-28x28.png"))); // NOI18N
        menuClientes1.setText("Cuentas       ");

        itmAdministrarCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetamusical/iconos/engranaje-20x20.png"))); // NOI18N
        itmAdministrarCuentas.setText("Administrar");
        itmAdministrarCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAdministrarCuentasActionPerformed(evt);
            }
        });
        menuClientes1.add(itmAdministrarCuentas);

        jMenuBar1.add(menuClientes1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmAdministrarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAdministrarCuentasActionPerformed

        AdministraCuentas acu = new AdministraCuentas();
        acu.setResizable(false);
        principal.add(acu);
        acu.setTitle("ADMINISTRACIÓN DE CUENTAS");

        acu.show();
    }//GEN-LAST:event_itmAdministrarCuentasActionPerformed

    private void itmAdministrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAdministrarUsuariosActionPerformed

        AdministarUsuarios aus = new AdministarUsuarios();
        principal.add(aus);
        aus.setResizable(false);
        aus.show();
        aus.setTitle("ADMINISTRACIÓN DE USUARIOS");
    }//GEN-LAST:event_itmAdministrarUsuariosActionPerformed

    private void itmAdministrarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAdministrarProveedoresActionPerformed

        AdministrarProveedores apr = new AdministrarProveedores();
        principal.add(apr);
        apr.setResizable(false);
        apr.setTitle("ADMINISTRACIÓN DE PROVEEDORES");
        apr.show();
    }//GEN-LAST:event_itmAdministrarProveedoresActionPerformed

    private void itmAdministrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAdministrarClientesActionPerformed

        AdministrarClientes acl = new AdministrarClientes();
        principal.add(acl);
        acl.setResizable(false);
        acl.setTitle("ADMINISTRACIÓN DE CLIENTES");
        acl.show();
    }//GEN-LAST:event_itmAdministrarClientesActionPerformed

    private void itmAdministrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAdministrarProductosActionPerformed

        AdministrarProductos ap = new AdministrarProductos();
        principal.add(ap);
        ap.setResizable(false);
        ap.setTitle("ADMINISTRACIÓN DE PRODUCTOS");
        ap.show();
    }//GEN-LAST:event_itmAdministrarProductosActionPerformed

    private void itmAdministrarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAdministrarComprasActionPerformed

        AdministrarCompras ac = new AdministrarCompras();
        principal.add(ac);
        ac.setResizable(false);
        ac.setTitle("ADMINISTRACIÓN DE COMPRAS");
        ac.show();
    }//GEN-LAST:event_itmAdministrarComprasActionPerformed

    private void itmAdministrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAdministrarVentasActionPerformed

        AdministraVentas av = new AdministraVentas();
        principal.add(av);
        av.setResizable(false);
        av.setTitle("ADMINISTRACIÓN DE VENTAS");
        av.show();
    }//GEN-LAST:event_itmAdministrarVentasActionPerformed

    private void menuVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuVentasActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAdministrarClientes;
    private javax.swing.JMenuItem itmAdministrarCompras;
    private javax.swing.JMenuItem itmAdministrarCuentas;
    private javax.swing.JMenuItem itmAdministrarProductos;
    private javax.swing.JMenuItem itmAdministrarProveedores;
    private javax.swing.JMenuItem itmAdministrarUsuarios;
    private javax.swing.JMenuItem itmAdministrarVentas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuClientes1;
    private javax.swing.JMenu menuCompras;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuProveedores;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JMenu menuVentas;
    public static javax.swing.JDesktopPane principal;
    // End of variables declaration//GEN-END:variables
}
