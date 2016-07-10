package planetamusical.controlador;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import planetamusical.controlador.exception.NoneexistentEntityException;
import planetamusical.modelo.Persona;

public class PersonaJpaControl implements Serializable {

    public PersonaJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManagerFactory emf = null;

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crear(Persona persona) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    //METODO PARA CONSULTAR
    public List<Persona> buscarPersonaEntidad() {
        return buscarPersonaEntidad(true, -1, -1);
    }

    public List<Persona> buscarPersonaEntidad(int maxResultados,
            int minimosResulatados) {
        return buscarPersonaEntidad(false, maxResultados, minimosResulatados);
    }

    private List<Persona> buscarPersonaEntidad(boolean all,
            int maxResulatados, int minimosResulatados) {
        EntityManager em = getEntityManager();

        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Persona.class));
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
    public void accualizar(Persona persona) throws NoneexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            persona = em.merge(persona);
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
    public Persona buscarPersona(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Persona.class, id);
        } finally {
            em.close();
        }
    }

    //MÉTODO BUSCAR POR NOMBRES
    public List<Persona> buscarSitioNombre(String nombrePersona) {
        EntityManager em = getEntityManager();
        boolean all = true;
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Persona.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.getParameterValue(nombrePersona);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    // METODO ELIMINAR
    public void eliminarPersona(Long id) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            Persona persona = em.find(Persona.class, id);
            em.getTransaction().begin();
            em.remove(persona);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}