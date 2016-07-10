package planetamusical.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;


//Indicamos que es una entidad para JPA
@Entity
//Identificar como se va ha realcionar y crea la tabla en la base de datos
@Table(name="Cuenta")
//Mapear en un fichero de xml  de la clase en cuanquir fichero
@XmlRootElement

//Consultar en SQL 
@NamedQueries({
   @NamedQuery(name = "Cuenta.buscarAll",
            query = "SELECT o FROM Cuenta o"),
   @NamedQuery(name = "Cuenta.buscarPorId",
            query = "SELECT o FROM Cuenta o WHERE o.id_cuenta :id_cuenta"),
   @NamedQuery(name = "Cuenta.buscarPorFechaCreacion",
            query = "SELECT o FROM Cuenta o WHERE o.fechaCreacion :fechaCreacion")
})

public class Cuenta implements  Serializable{
    @Id
    @Column(name ="id_cuenta")
    private long   id_cuenta;
    
    @Column(name = "nombreUsuario")
    private String nombreUsuario;
    
    @Column(name = "clave")
    private String clave;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date   fechaCreacion;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date   fechaModificacion;
    
    @Column(name = "estado")
    private String estado;

    //Añadiendo métodos set y get
    public long getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(long id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
