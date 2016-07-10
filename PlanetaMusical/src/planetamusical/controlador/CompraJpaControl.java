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
import planetamusical.modelo.Compra;

public class CompraJpaControl implements  Serializable{
    public CompraJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManagerFactory emf = null;

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crear(Compra compra) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(compra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    //METODO PARA CONSULTAR
    public List<Compra> buscarCompraEntidad() {
        return buscarCompraEntidad(true, -1, -1);
    }

    public List<Compra> buscarCompraEntidad(int maxResultados,
            int minimosResulatados) {
        return buscarCompraEntidad(false, maxResultados, minimosResulatados);
    }

    private List<Compra> buscarCompraEntidad(boolean all,
            int maxResulatados, int minimosResulatados) {
        EntityManager em = getEntityManager();

        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Compra.class));
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
    public void accualizar(Compra compra) throws NoneexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            compra = em.merge(compra);
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
    public Compra buscarCompra(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Compra.class, id);
        } finally {
            em.close();
        }
    }

    //MÉTODO BUSCAR POR FECHA
    public List<Compra> buscarCompraId(Date fechaCompra) {
        EntityManager em = getEntityManager();
        boolean all = true;
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Compra.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.getParameterValue((Parameter<Date>) fechaCompra);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    // METODO ELIMINAR
    public void eliminarCompra(Long id) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            Compra compra = em.find(Compra.class, id);
            em.getTransaction().begin();
            em.remove(compra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
