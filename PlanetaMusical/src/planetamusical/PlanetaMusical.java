package planetamusical;

import java.util.Date;
import planetamusical.controlador.CuentaJpaControl;
import planetamusical.controlador.PersonaJpaControl;
import planetamusical.modelo.Cuenta;
import planetamusical.modelo.Persona;
import planetamusical.Util.JPAUtil;
import planetamusical.vista.Autentificacion;
import planetamusical.vista.VentanaPrincipal;

public class PlanetaMusical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        
//        //AUTENTIFICACIÓN DE USUARIOS
        Autentificacion au = new Autentificacion(null,true);
        au.setVisible(true);
        
  
//CREAR UN USUARIO ADMINISTRADOR CON CONTRASEÑA

//        Cuenta cu = new Cuenta();
//        cu.setNombreUsuario("blosom");
//        cu.setClave("1234");
//        cu.setEstado("activo");
//        cu.setFechaCreacion(new Date());
//        cu.setFechaModificacion(new Date());
//        cu.setTipoRol("Administrador");
//
//        PersonaJpaControl usc = new PersonaJpaControl(JPAUtil.getEntityManagerFactory());
//        Persona pe = new Persona();
//        pe.setNombres("Sandro");
//        pe.setApellidos("Castillo");  
//        pe.setCedula("1900547496");
//        pe.setCorreoElectronico("blosom@gmail.com");
//        pe.setDireccion("loja");
//        pe.setFechaNacimiento(new Date());
//        pe.setTelefonoCelular("0999887766");
//        pe.setTelefonoCasa("230044");
//        
//        pe.setCuenta(cu);
//        usc.crear(pe);     
    }
}