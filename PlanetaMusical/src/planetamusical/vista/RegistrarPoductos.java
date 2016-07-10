/*
 * To change this license header, choose License Headers in Project Proproties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetamusical.vista;

import planetamusical.Util.JPAUtil;
import planetamusical.controlador.ProductoJpaControl;
import planetamusical.modelo.Producto;

/**
 *
 * @author sandrojc
 */
public class RegistrarPoductos extends javax.swing.JInternalFrame {
    
    //Declaramos como variables globales a la clase Producto y a la Clase ProductoJpaControl
    Producto pro;
    ProductoJpaControl projpa;
    /**
     * Creates new form RegistrarPoductos_
     */
    public RegistrarPoductos() {
        initComponents();
    }
 //  MÉTODO PARA RECIBIR OBJETO  UN SITIO
//    public boolean setObjectUsuarios(Producto producto){
//        txtNombreProducto.setText(producto.getNombreProducto());
//        txtCantidad
//        txtCantidad.setText(producto.getCantidadProducto());
//        txtActorArtista.setText(producto.getAutorArtista());
//        txtPrecioVenta.setText(producto.getPrecioVenta());   
//        txtPrecioCompra.setText(producto.getPrecioCompra());
//        fechaLanzamiento.setDate(producto.getFechaLanzamiento());
//        return  true;
//    }
    
    
    //METODO CARGAR DATOS EN LA BASE DE DATOS
    public Producto cargarDatos(){
        pro = new Producto();
        pro.setNombreProducto(txtNombreProducto.getText());
        pro.setAutorArtista(txtActorArtista.getText());
        pro.setFechaLanzamiento(fechaLanzamiento.getDate());
        pro.setFormatoMusica(cbxFormatoMusica.getSelectedItem().toString());
        pro.setFormatoPelicula(cbxFormatoVideo.getSelectedItem().toString());
        pro.setGeneroMusica(cbxGeneroMusica.getSelectedItem().toString());
        pro.setGeneroPelicula(cbxGeneroPelicula.getSelectedItem().toString());
        pro.setPrecioCompra(Integer.parseInt(txtPrecioCompra.getText()));
        pro.setPrecioVenta(Integer.parseInt(txtPrecioVenta.getText()));
        pro.setTipoProducto(cbxTipoProducto.getSelectedItem().toString());
        
    
        projpa = new ProductoJpaControl(JPAUtil.getEntityManagerFactory());
        projpa.crear(pro);
        
        return pro;   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        cbxTipoProducto = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        cbxGeneroMusica = new javax.swing.JComboBox();
        cbxGeneroPelicula = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtActorArtista = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbxFormatoMusica = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        fechaLanzamiento = new org.jdesktop.swingx.JXDatePicker();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cbxFormatoVideo = new javax.swing.JComboBox();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel2.setText("Código :");

        txtCodigo.setEnabled(false);

        jLabel3.setText("Tipo de producto");

        jLabel4.setText("Género musical");

        jLabel8.setText("Cantidad");

        jLabel11.setText("Nombre / tÍtulo ");

        cbxTipoProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Película individual", "Colección", "BluRay", "Música", "Música Mp4" }));
        cbxTipoProducto.setAutoscrolls(true);

        jLabel12.setText("Género película");

        cbxGeneroMusica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Rock N` Roll", "Pop", "Música Electrónica", "Rap", "Reggaeton", "Heavy Metal", "Hard Rock", "Música Clásica", "Dance", "Blues", "Rock Alternativo", "Jazz", "Metal Alternativo", "Baladas", "Rock Latino", "Pop Latino", "Techno", "Cumbia", "Salsa", "Música Disco", "Country", "Merengue", "Ranchera", "Vals", "Vallenato", "Bolero", "Pasillos" }));
        cbxGeneroMusica.setAutoscrolls(true);

        cbxGeneroPelicula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Acción", "Animación", "Marciales", "Aventura", "Basada en hechos reales", "Buddy Films", "Ciencia Ficción", "Catástrofe", "Cómica", "Deporte", "Documental", "Dramática", "Erótica", "Experiemental", "Expresionistas", "Fantasia", "Guerra", "Gore", "Histórica", "Infantil", "Intriga", "Metraje encontrado", "Misterio", "Musicales", "Propaganda", "Policiaca", "Romántica", "Suspense", "Terror", "Tragicómicas", "", "", "" }));
        cbxGeneroPelicula.setAutoscrolls(true);

        jLabel9.setText("Precio de Compra");

        jLabel7.setText("Fecha Lanzamiento");

        cbxFormatoMusica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MIDI", "MP3", "MP4", "WAV" }));
        cbxFormatoMusica.setAutoscrolls(true);
        cbxFormatoMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFormatoMusicaActionPerformed(evt);
            }
        });

        jLabel14.setText("Formato");

        jLabel15.setText("Actor/Artista");

        jLabel17.setText("PrecioVenta");

        jLabel16.setText("Formato");

        cbxFormatoVideo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HD", "Full HD", "BluRay", "MP4", "AVI", "MP3", "WMA" }));
        cbxFormatoVideo.setAutoscrolls(true);
        cbxFormatoVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFormatoVideoActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir-25x25.png"))); // NOI18N
        btnSalir.setText("Salir ");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar-25x25.png"))); // NOI18N
        btnGuardar.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbxGeneroMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(cbxTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(28, 28, 28)
                                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(45, 45, 45)
                                        .addComponent(txtActorArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxGeneroPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel16)
                                                    .addGap(18, 18, 18))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addGap(18, 18, 18)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cbxFormatoMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbxFormatoVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(30, 30, 30)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(fechaLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnGuardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtActorArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(69, 69, 69)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxGeneroMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxGeneroPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxFormatoMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addGap(46, 46, 46))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxFormatoVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxFormatoMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFormatoMusicaActionPerformed

    }//GEN-LAST:event_cbxFormatoMusicaActionPerformed

    private void cbxFormatoVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFormatoVideoActionPerformed

    }//GEN-LAST:event_cbxFormatoVideoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cbxFormatoMusica;
    private javax.swing.JComboBox cbxFormatoVideo;
    private javax.swing.JComboBox cbxGeneroMusica;
    private javax.swing.JComboBox cbxGeneroPelicula;
    private javax.swing.JComboBox cbxTipoProducto;
    private org.jdesktop.swingx.JXDatePicker fechaLanzamiento;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtActorArtista;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
