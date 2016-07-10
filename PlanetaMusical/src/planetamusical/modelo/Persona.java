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

//indicamos que es una entidad para jpa
@Entity
//indincar como se va a relacionar y crea la tabla en la base de datos
@Table(name = "Persona")
//mapear en un fichero xml de la clase en cualquier fichero
@XmlRootElement
//consultar en sql
@NamedQueries({
    @NamedQuery(name = "Persona.buscarAll",
            query = "SELECT o FROM Persona o"),
    @NamedQuery(name = "persona.buscarPorId",
            query = "SELECT o FROM Persona o WHERE o.id_persona= :id_persona"),
    @NamedQuery(name = "persona.buscarPorNombre",
            query = "SELECT o FROM Persona o WHERE o.nombres = :nombres"),
    @NamedQuery(name = "persona.buscarPorCedula",
            query = "SELECT o FROM Persona o WHERE o.cedula = :cedula")
})

public class Persona implements  Serializable{
    @Id
    @Column(name = "id_persona")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long   id_persona;
    
    @Column(name = "nombres")
    private String nombres;
    
    @Column(name = "apellidos")
    private String apellidos;
    
    @Column(name = "cedula", unique = true)
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
    
    /**
     * Agragamos las relaciones , luego del análisis del modelo de dominio y del
     * diagrama de clases y diagrama de secuencia. 
     * */
    
    //CREANDO REALACIONES 
    //Relacion con la clase Cuenta
   @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    // union entre dos culumnas, relación con la clase id cuenta
    @JoinColumn(name = "id_cuenta")
    // obtener los metodos set y get
    private Cuenta cuenta;

    
    
    
    //CREANADO METODOS SET Y GET
    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Long getId_persona() {
        return id_persona;
    }

    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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