package planetamusical.modelo;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

//Endicamos que es una entidad de JPA
@Entity
//Identificar como se va ha realcionar y crea la tabla en la base de datos
@Table(name="Proveedor")
//Mapear en un fichero de xml  de la clase en cuanquir fichero
@XmlRootElement
//consultas a la base de datos SQL
@NamedQueries({
    @NamedQuery(name = "Proveedor.buscarAll",
            query = "SELECT o FROM Proveedor o"),
    @NamedQuery(name = "Proveedor.buscarPorId",
            query = "SELECT o FROM Proveedor o WHERE o.id_proveedor =:id_proveedor"),
    @NamedQuery(name = "Proveedor.buscarPorNombres",
            query = "SELECT o FROM Proveedor o WHERE o.nombresProveedor =:nombresProveedor"),
    @NamedQuery(name = "Proveedor.buscarPorApellidos",
            query = "SELECT o FROM Proveedor o WHERE o.apellidosProveedor =:apellidosProveedor")
})

public class Proveedor {
    @Id
    @Column(name = "id_proveedor")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long   id_proveedor;
    
    @Column(name = "nombresProveedor")
    private String nombresProveedor;
    
    @Column(name = "apellidosProveedor")
    private String apellidosProveedor;
    
    @Column(name = "cedulaProveedor")
    private String cedulaProveedor;
    
    @Column(name = "direccionProveedor")
    private String direccionProveedor;
    
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    
    @Column(name = "telefonoCelularProveedor")
    private String telefonoCelularProveedor;
    
    @Column(name = "telefonoCasaProveedor")
    private String telefonoCasaProveedor;
    
    @Column(name = "correrElectronicoProveedor")
    private String correrElectronicoProveedor;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date   FechaRegistroProveedor;
    
    
    //#### CREANDO RELACIONES ####
    //Relacion de un proveedor a muchos con la clase compra
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "Proveedor",cascade= CascadeType.ALL)
    private List<Compra> compra;
    
    // CREANDO METODOS SET Y GET    
    public long getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(long id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombresProveedor() {
        return nombresProveedor;
    }

    public void setNombresProveedor(String nombresProveedor) {
        this.nombresProveedor = nombresProveedor;
    }

    public String getApellidosProveedor() {
        return apellidosProveedor;
    }

    public void setApellidosProveedor(String apellidosProveedor) {
        this.apellidosProveedor = apellidosProveedor;
    }

    public String getCedulaProveedor() {
        return cedulaProveedor;
    }

    public void setCedulaProveedor(String cedulaProveedor) {
        this.cedulaProveedor = cedulaProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefonoCelularProveedor() {
        return telefonoCelularProveedor;
    }

    public void setTelefonoCelularProveedor(String telefonoCelularProveedor) {
        this.telefonoCelularProveedor = telefonoCelularProveedor;
    }

    public String getTelefonoCasaProveedor() {
        return telefonoCasaProveedor;
    }

    public void setTelefonoCasaProveedor(String telefonoCasaProveedor) {
        this.telefonoCasaProveedor = telefonoCasaProveedor;
    }

    public String getCorrerElectronicoProveedor() {
        return correrElectronicoProveedor;
    }

    public void setCorrerElectronicoProveedor(String correrElectronicoProveedor) {
        this.correrElectronicoProveedor = correrElectronicoProveedor;
    }

    public Date getFechaRegistroProveedor() {
        return FechaRegistroProveedor;
    }

    public void setFechaRegistroProveedor(Date FechaRegistroProveedor) {
        this.FechaRegistroProveedor = FechaRegistroProveedor;
    }

    public List<Compra> getCompra() {
        return compra;
    }

    public void setCompra(List<Compra> compra) {
        this.compra = compra;
    }
}