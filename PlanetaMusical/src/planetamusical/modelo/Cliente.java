package planetamusical.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

//Endicamos que es una entidad de JPA
@Entity
//Identificar como se va ha realcionar y crea la tabla en la base de datos
@Table(name="Usuario")
//Mapear en un fichero de xml  de la clase en cuanquir fichero
@XmlRootElement
//consultas a la base de datos SQL
@NamedQueries({
    @NamedQuery(name = "Cliente.buscarAll",
            query = "SELECT o FROM Cliente o"),
    @NamedQuery(name = "Cliente.buscarPorId",
            query = "SELECT o FROM Cliente o WHERE o.id_persona = :id_persona"),
    @NamedQuery(name = "Cliente.buscarPorNombres",
            query = "SELECT o FROM Cliente o WHERE o.nombres = :nombres"),
    @NamedQuery(name = "Cliente.buscarPorApellidos",
            query = "SELECT o FROM Cliente o WHERE o.apellidos = :apellidos"),
    @NamedQuery(name = "Cliente.buscarPorruc",
            query = "SELECT o FROM Cliente o WHERE o.ruc = :ruc")
})

public class Cliente extends Persona implements  Serializable {
    @Column(name ="")
    private String ruc;
    
    
    //CREANDO METODOS SET Y GET
    public String getruc() {
        return ruc;
    }

    public void setruc(String ruc) {
        this.ruc = ruc;
    }  
}