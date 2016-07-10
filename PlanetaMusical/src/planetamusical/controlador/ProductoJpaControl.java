
package planetamusical.controlador;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import planetamusical.controlador.exception.NoneexistentEntityException;
import planetamusical.modelo.Producto;

public class ProductoJpaControl  implements  Serializable{
    public ProductoJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManagerFactory emf = null;

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crear(Producto producto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    //METODO PARA CONSULTAR
    public List<Producto> buscarProductoEntidad() {
        return buscarProductoEntidad(true, -1, -1);
    }

    public List<Producto> buscarProductoEntidad(int maxResultados,
            int minimosResulatados) {
        return buscarProductoEntidad(false, maxResultados, minimosResulatados);
    }

    private List<Producto> buscarProductoEntidad(boolean all,
            int maxResulatados, int minimosResulatados) {
        EntityManager em = getEntityManager();

        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Producto.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResulatados);
                q.setFirstResult(minimosResulatados);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    //METODO ACTUALIZAR
    public void accualizar(Producto producto) throws NoneexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            producto = em.merge(producto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw ex;

        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    //METODO BUSCAR POR ID
    public Producto buscarProducto(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Producto.class, id);
        } finally {
            em.close();
        }
    }

    //MÉTODO BUSCAR POR NOMBRES
    public List<Producto> buscarSitioNombre(String nombreProducto) {
        EntityManager em = getEntityManager();
        boolean all = true;
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Producto.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.getParameterValue(nombreProducto);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    // METODO ELIMINAR
    public void eliminarProducto(Long id) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            Producto producto = em.find(Producto.class, id);
            em.getTransaction().begin();
            em.remove(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}