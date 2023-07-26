
package com.pooitec1.alibaba2.entity.repository;

import com.pooitec1.alibaba2.entity.LoteProduct;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.pooitec1.alibaba2.entity.Sector;
import com.pooitec1.alibaba2.entity.repository.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author nadia
 */
public class LoteProductRepository implements Serializable {

    public LoteProductRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(LoteProduct loteProduct) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sector sector = loteProduct.getSector();
            if (sector != null) {
                sector = em.getReference(sector.getClass(), sector.getId());
                loteProduct.setSector(sector);
            }
            em.persist(loteProduct);
            if (sector != null) {
                sector.getStocksProcucts().add(loteProduct);
                sector = em.merge(sector);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LoteProduct loteProduct) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            LoteProduct persistentLoteProduct = em.find(LoteProduct.class, loteProduct.getIdLote());
            Sector sectorOld = persistentLoteProduct.getSector();
            Sector sectorNew = loteProduct.getSector();
            if (sectorNew != null) {
                sectorNew = em.getReference(sectorNew.getClass(), sectorNew.getId());
                loteProduct.setSector(sectorNew);
            }
            loteProduct = em.merge(loteProduct);
            if (sectorOld != null && !sectorOld.equals(sectorNew)) {
                sectorOld.getStocksProcucts().remove(loteProduct);
                sectorOld = em.merge(sectorOld);
            }
            if (sectorNew != null && !sectorNew.equals(sectorOld)) {
                sectorNew.getStocksProcucts().add(loteProduct);
                sectorNew = em.merge(sectorNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = loteProduct.getIdLote();
                if (findLoteProduct(id) == null) {
                    throw new NonexistentEntityException("The loteProduct with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            LoteProduct loteProduct;
            try {
                loteProduct = em.getReference(LoteProduct.class, id);
                loteProduct.getIdLote();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The loteProduct with id " + id + " no longer exists.", enfe);
            }
            Sector sector = loteProduct.getSector();
            if (sector != null) {
                sector.getStocksProcucts().remove(loteProduct);
                sector = em.merge(sector);
            }
            em.remove(loteProduct);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<LoteProduct> findLoteProductEntities() {
        return findLoteProductEntities(true, -1, -1);
    }

    public List<LoteProduct> findLoteProductEntities(int maxResults, int firstResult) {
        return findLoteProductEntities(false, maxResults, firstResult);
    }

    private List<LoteProduct> findLoteProductEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LoteProduct.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public LoteProduct findLoteProduct(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(LoteProduct.class, id);
        } finally {
            em.close();
        }
    }

    public int getLoteProductCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LoteProduct> rt = cq.from(LoteProduct.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    //public void updateLoteProduct(LoteProduct loteProduct) {
    //EntityManager em = Conexion.getEm();
   // try {
        //em.getTransaction().begin();
       // em.merge(loteProduct);
        //em.getTransaction().commit();
    //} finally {
       // if (em != null) {
           // em.close();
        //}
    //}
//}
    public void updateLoteProduct(LoteProduct loteProduct) {
    EntityManager em = Conexion.getEm();
    if (!em.isOpen()) {
        em = Conexion.getEmf().createEntityManager();
    }
    try {
        em.getTransaction().begin();
        em.merge(loteProduct);
        em.getTransaction().commit();
    } finally {
        if (em.isOpen()) {
            em.close();
        }
    }
}
    
}
