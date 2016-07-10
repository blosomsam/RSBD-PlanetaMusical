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

//Endicamos que es una entidad de JPA
@Entity
//Identificar como se va ha realcionar y crea la tabla en la base de datos
@Table(name="Persona")
//Mapear en un fichero de xml  de la clase en cuanquir fichero
@XmlRootElement
//consultas a la base de datos SQL
@NamedQueries({
    @NamedQuery(name = "Persona.buscarAll",
            query = "SELECT o FROM Persona o"),
    @NamedQuery(name = "Persona.buscarPorId",
            query = "SELECT o FROM Persona o WHERE o.id_cuenta :id_cuenta"),
    @NamedQuery(name = "Persona.buscarPorNombres",
            query = "SELECT o FROM Persona o WHERE o.nombres :nombres"),
    @NamedQuery(name = "Persona.buscarPorApellidos",
            query = "SELECT o FROM Persona o WHERE o.apellidos :apellidos")
})

public class Persona implements  Serializable{
    @Id
    @Column(name = "id_persona")
    private Long   id_persona;
    
    @Column(name = "nombres")
    private String nombres;
    
    @Column(name = "apellidos")
    private String apellidos;
    
    @Column(name = "cedula")
    private String cedula;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "telefonoCelular")
    private String telefonoCelular;
    
    @Column(name = "telefonoCasa")
    private String telefonoCasa;
    
    @Column(name = "correoElectronico")
    private String correoElectronico;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date   fechaNacimiento;
    
    
    //CREANADO METODOS SET Y GET
    public Long getId() {
        return id_persona;
    }

    public void setId(Long id) {
        this.id_persona = id;
    }

    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public String getApellido() {
        return apellidos;
    }

    public void setApellido(String apellido) {
        this.apellidos = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    public void setTelefonoCasa(String telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}