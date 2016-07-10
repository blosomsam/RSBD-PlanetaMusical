package planetamusical.modelo;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

//Indicamos que es  una entidad de JPA
@Entity
//Identificar como se va a llamar la tabla  en la base de datos
@Table(name = "DetalleVenta")
//Mapear un fichero xml de la clase  en cualquier fichero
@XmlRootElement

//Consultar en SQL 
@NamedQueries({
   @NamedQuery(name = "DetalleVenta.buscarAll",
            query = "SELECT o FROM DetalleVenta o"),
   @NamedQuery(name = "DetalleVenta.buscarPorId",
            query = "SELECT o FROM DetalleVenta o WHERE o.id_detalleVenta =:id_detalleVenta")
})

public class DetalleVenta  implements  Serializable {
    @Id
    @Column(name = "id_detalleVenta")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long   id_detalleVenta;
    
    @Column(name = "cantidadProducto")
    public int    cantidadProducto;
    
    @Column(name = "nombreProducto")
    public String nombreProducto;
    
    @Column(name = "valorUnitario")
    public double valorUnitario;
    
    @Column(name = "valorTotalUnitario")
    public double valorTotalUnitario;
    
    //Relacion con la clase Producto....De UNO a MUCHOS
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "producto",cascade= CascadeType.ALL)
    private List<Producto> producto;
    
    //CREANDO METODOS SET Y GET
    public Long getId_detalleVenta() {
        return id_detalleVenta;
    }

    public void setId_detalleVenta(Long id_detalleVenta) {
        this.id_detalleVenta = id_detalleVenta;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotalUnitario() {
        return valorTotalUnitario;
    }

    public void setValorTotalUnitario(double valorTotalUnitario) {
        this.valorTotalUnitario = valorTotalUnitario;
    }   

    /**
     * @return the producto
     */
    public List<Producto> getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }
}