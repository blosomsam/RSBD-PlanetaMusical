package planetamusical.controlador;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Parameter;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import planetamusical.controlador.exception.NoneexistentEntityException;
import planetamusical.modelo.DetalleVenta;

public class DetalleVentaJpaControl implements Serializable {
    public DetalleVentaJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManagerFactory emf = null;

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crear(DetalleVenta detalleventa) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalleventa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    //METODO PARA CONSULTAR
    public List<DetalleVenta> buscarDetalleVentaEntidad() {
        return buscarDetalleVentaEntidad(true, -1, -1);
    }

    public List<DetalleVenta> buscarDetalleVentaEntidad(int maxResultados,
            int minimosResulatados) {
        return buscarDetalleVentaEntidad(false, maxResultados, minimosResulatados);
    }

    private List<DetalleVenta> buscarDetalleVentaEntidad(boolean all,
            int maxResulatados, int minimosResulatados) {
        EntityManager em = getEntityManager();

        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalleVenta.class));
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
    public void accualizar(DetalleVenta detalleventa) throws NoneexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalleventa = em.merge(detalleventa);
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
    public DetalleVenta buscarDetalleVenta(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetalleVenta.class, id);
        } finally {
            em.close();
        }
    }

    //MÉTODO BUSCAR POR FECHA
    public List<DetalleVenta> buscarDetalleVentaId(Date fechaDetalleVenta) {
        EntityManager em = getEntityManager();
        boolean all = true;
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalleVenta.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.getParameterValue((Parameter<Date>) fechaDetalleVenta);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    // METODO ELIMINAR
    public void eliminarDetalleVenta(Long id) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            DetalleVenta detalleventa = em.find(DetalleVenta.class, id);
            em.getTransaction().begin();
            em.remove(detalleventa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}