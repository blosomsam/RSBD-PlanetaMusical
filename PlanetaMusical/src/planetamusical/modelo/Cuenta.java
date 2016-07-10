package planetamusical.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "Cuenta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "cuenta.buscarAll",
            query = "SELECT o FROM Cuenta o"),
    @NamedQuery(name = "cuenta.buscarPorId",
            query = "SELECT o FROM Cuenta o WHERE o.id_cuenta = :id_cuenta"),
    @NamedQuery(name = "persona.buscarPorUsuario",
            query = "SELECT o FROM Cuenta o WHERE o.nombreUsuario = :nombreUsuario"),
})


public class Cuenta implements  Serializable{
    @Id
    @Column(name ="id_cuenta")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
    
    @Column(name = "tipoRol")
    private String tipoRol;
    
    //#####CREANDO RELACIONES#####
    //Relación con la clase Persona
    @OneToOne(mappedBy = "Cuenta")
    private Persona persona;
    
    
    
    //#####CREANDO METODOS SET Y GET#####
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }
}
