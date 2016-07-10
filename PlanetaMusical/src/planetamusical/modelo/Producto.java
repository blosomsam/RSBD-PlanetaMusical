package planetamusical.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="Producto")
//Mapear en un fichero de xml  de la clase en cuanquir fichero
@XmlRootElement

//consultas a la base de datos SQL
@NamedQueries({
   @NamedQuery(name = "Producto.buscarAll",
            query = "SELECT o FROM Producto o"),
   @NamedQuery(name = "Producto.buscarPorId",
            query = "SELECT o FROM Producto o WHERE o.id_producto =:id_producto"),
   @NamedQuery(name = "Producto.buscarPorNombre",
            query = "SELECT o FROM Producto o WHERE o.nombreProducto =:nombreProducto")
})

public class Producto  implements Serializable {
    @Id
    @Column(name = "id_producto")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long   id_producto;
    
    @Column(name = "nombreProducto")
    public String nombreProducto;
    
    @Column(name = "cantidadProducto")
    public int    cantidadProducto;
    
    @Column(name = "tipoProducto")
    public String tipoProducto;
    
    @Column(name = "generoPelicula")
    public String generoPelicula;
    
    @Column(name = "generoMusica")
    public String generoMusica;
    
    @Column(name = "autorArtista")
    public String autorArtista;
    
    @Column(name = "formatoMusica")
    public String formatoMusica;
    
    @Column(name = "formatoPelicula")
    public String formatoPelicula;
    
    @Temporal(TemporalType.TIMESTAMP)
    public Date   fechaLanzamiento;
    
    @Column(name = "precioCompra")
    public double precioCompra;
    
    @Column(name = "precioVenta")
    public double precioVenta;

    
    //CREANDO METODOS SET Y GET
    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(String generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public String getGeneroMusica() {
        return generoMusica;
    }

    public void setGeneroMusica(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    public String getAutorArtista() {
        return autorArtista;
    }

    public void setAutorArtista(String autorArtista) {
        this.autorArtista = autorArtista;
    }

    public String getFormatoMusica() {
        return formatoMusica;
    }

    public void setFormatoMusica(String formatoMusica) {
        this.formatoMusica = formatoMusica;
    }

    public String getFormatoPelicula() {
        return formatoPelicula;
    }

    public void setFormatoPelicula(String formatoPelicula) {
        this.formatoPelicula = formatoPelicula;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}