package planetamusical.controlador;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import planetamusical.controlador.exception.NoneexistentEntityException;
import planetamusical.modelo.Proveedor;

public class ProveedorJpaControl implements Serializable { 
    public ProveedorJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManagerFactory emf = null;

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crear(Proveedor proveedor) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(proveedor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    //METODO PARA CONSULTAR
    public List<Proveedor> buscarProveedorEntidad() {
        return buscarProveedorEntidad(true, -1, -1);
    }

    public List<Proveedor> buscarProveedorEntidad(int maxResultados,
            int minimosResulatados) {
        return buscarProveedorEntidad(false, maxResultados, minimosResulatados);
    }

    private List<Proveedor> buscarProveedorEntidad(boolean all,
            int maxResulatados, int minimosResulatados) {
        EntityManager em = getEntityManager();

        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Proveedor.class));
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
    public void accualizar(Proveedor proveedor) throws NoneexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            proveedor = em.merge(proveedor);
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
    public Proveedor buscarProveedor(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Proveedor.class, id);
        } finally {
            em.close();
        }
    }

    //MÉTODO BUSCAR POR NOMBRES
    public List<Proveedor> buscarSitioNombre(String nombreProveedor) {
        EntityManager em = getEntityManager();
        boolean all = true;
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Proveedor.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.getParameterValue(nombreProveedor);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    // METODO ELIMINAR
    public void eliminarProveedor(Long id) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            Proveedor proveedor = em.find(Proveedor.class, id);
            em.getTransaction().begin();
            em.remove(proveedor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
