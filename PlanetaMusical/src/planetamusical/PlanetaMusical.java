package planetamusical;

import java.util.Date;
import planetamusical.controlador.CuentaJpaControl;
import planetamusical.controlador.PersonaJpaControl;
import planetamusical.modelo.Cuenta;
import planetamusical.modelo.Persona;
import planetamusical.Util.JPAUtil;

public class PlanetaMusical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//CREAR UN USUARIO ADMINISTRADOR CON CONTRASEÑA

        Cuenta cu = new Cuenta();
        cu.setNombreUsuario("blosom");
        cu.setClave("1234");
        cu.setEstado("activo");
        cu.setFechaCreacion(new Date());
        cu.setFechaModificacion(new Date());

        PersonaJpaControl usc = new PersonaJpaControl(JPAUtil.getEntityManagerFactory());
        Persona pe = new Persona();
        pe.setNombres("Sandro");
        pe.setApellidos("Castillo");  
        pe.setCedula("1900547496");
        pe.setCorreoElectronico("blosom@gmail.com");
        pe.setDireccion("loja");
        pe.setFechaNacimiento(new Date());
        pe.setTelefonoCelular("0999887766");
        pe.setTelefonoCasa("230044");
        
        pe.setCuenta(cu);
        usc.crear(pe);     

 
    }
}
