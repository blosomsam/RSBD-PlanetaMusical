package planetamusical.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

//indicamos que es una entidad de JPA
@Entity
//Identicar como se va ha llamar la tabla en la base de datos
@Table(name="Rol")
//Mapear en un fichero xml de la clase desde otra clase
@XmlRootElement

//consultas en base de datos SQL
@NamedQueries({
    @NamedQuery(name = "Rol.buscarAll",
            query = "SELECT o FROM Rol o"),
    @NamedQuery(name = "Rol.buscarPorId",
            query = "SELECT o FROM Rol o WHERE o.id_rol =:id_rol"),
    @NamedQuery(name = "Rol.buscarPorNombres",
            query = "SELECT o FROM Rol o WHERE o.nombresRol =:nombresRol")
})

public class Rol implements  Serializable{
    @Id
    @Column(name = "id_rol")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id_rol;
    
    @Column(name = "nombreRol")
    private String nombreRol;

    
    //CREANDO METODOS SET Y GET
    public long getId_rol() {
        return id_rol;
    }

    public void setId_rol(long id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}