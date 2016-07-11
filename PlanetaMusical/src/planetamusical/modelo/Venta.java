package planetamusical.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

//indicamos que es una entidad de JPA
@Entity
//Identicar como se va ha llamar la tabla en la base de datos
@Table(name="Venta")
//Mapear en un fichero xml de la clase desde otra clase
@XmlRootElement

//consultas en base de datos SQL
@NamedQueries({
   @NamedQuery(name = "venta.buscarAll",
            query = "SELECT o FROM Venta o"),
   @NamedQuery(name = "venta.buscarPorId",
            query = "SELECT o FROM Venta o WHERE o.id_venta = :id_venta"),
   @NamedQuery(name = "venta.buscarPorFecha",
            query = "SELECT o FROM Venta o WHERE o.fechaVenta = :fechaVenta")
})

public class Venta implements Serializable{
    @Id
    @Column(name ="id_venta")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long   id_venta;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date   fechaVenta;
    
    @Column(name = "subtotal")
    private double subtotal;
    
    @Column(name = "IVA")
    private double IVA;
    
    @Column(name = "descuento")
    private double descuento;
    
    @Column(name = "total")
    private double total;
   
    //#### CREANDO REALACIONES ####
    //Relación con  la clase Persona 
    @ManyToOne
    private Persona persona;
    
    //Relacion con la clase DetalleVenta
    @OneToOne(mappedBy = "Venta")
    private DetalleVenta detalleVenta;
    
    
    //CRENANDO METODOS DET Y GET
    public long getId_venta() {
        return id_venta;
    }

    public void setId_venta(long id_venta) {
        this.id_venta = id_venta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }   

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(DetalleVenta detalleVenta) {
        this.detalleVenta = detalleVenta;
    }
}