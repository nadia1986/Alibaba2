/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pooitec1.alibaba2.entity.repository;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.pooitec1.alibaba2.entity.Wharehouse;
import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Sector;
import com.pooitec1.alibaba2.entity.repository.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author nadia
 */
public class SectorJpaController implements Serializable {

    public SectorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Sector sector) {
        if (sector.getStocksProcucts() == null) {
            sector.setStocksProcucts(new ArrayList<LoteProduct>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Wharehouse wharehouse = sector.getWharehouse();
            if (wharehouse != null) {
                wharehouse = em.getReference(wharehouse.getClass(), wharehouse.getId());
                sector.setWharehouse(wharehouse);
            }
            List<LoteProduct> attachedStocksProcucts = new ArrayList<LoteProduct>();
            for (LoteProduct stocksProcuctsLoteProductToAttach : sector.getStocksProcucts()) {
                stocksProcuctsLoteProductToAttach = em.getReference(stocksProcuctsLoteProductToAttach.getClass(), stocksProcuctsLoteProductToAttach.getIdLote());
                attachedStocksProcucts.add(stocksProcuctsLoteProductToAttach);
            }
            sector.setStocksProcucts(attachedStocksProcucts);
            em.persist(sector);
            if (wharehouse != null) {
                wharehouse.getSectors().add(sector);
                wharehouse = em.merge(wharehouse);
            }
            for (LoteProduct stocksProcuctsLoteProduct : sector.getStocksProcucts()) {
                Sector oldSectorOfStocksProcuctsLoteProduct = stocksProcuctsLoteProduct.getSector();
                stocksProcuctsLoteProduct.setSector(sector);
                stocksProcuctsLoteProduct = em.merge(stocksProcuctsLoteProduct);
                if (oldSectorOfStocksProcuctsLoteProduct != null) {
                    oldSectorOfStocksProcuctsLoteProduct.getStocksProcucts().remove(stocksProcuctsLoteProduct);
                    oldSectorOfStocksProcuctsLoteProduct = em.merge(oldSectorOfStocksProcuctsLoteProduct);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sector sector) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sector persistentSector = em.find(Sector.class, sector.getId());
            Wharehouse wharehouseOld = persistentSector.getWharehouse();
            Wharehouse wharehouseNew = sector.getWharehouse();
            List<LoteProduct> stocksProcuctsOld = persistentSector.getStocksProcucts();
            List<LoteProduct> stocksProcuctsNew = sector.getStocksProcucts();
            if (wharehouseNew != null) {
                wharehouseNew = em.getReference(wharehouseNew.getClass(), wharehouseNew.getId());
                sector.setWharehouse(wharehouseNew);
            }
            List<LoteProduct> attachedStocksProcuctsNew = new ArrayList<LoteProduct>();
            for (LoteProduct stocksProcuctsNewLoteProductToAttach : stocksProcuctsNew) {
                stocksProcuctsNewLoteProductToAttach = em.getReference(stocksProcuctsNewLoteProductToAttach.getClass(), stocksProcuctsNewLoteProductToAttach.getIdLote());
                attachedStocksProcuctsNew.add(stocksProcuctsNewLoteProductToAttach);
            }
            stocksProcuctsNew = attachedStocksProcuctsNew;
            sector.setStocksProcucts(stocksProcuctsNew);
            sector = em.merge(sector);
            if (wharehouseOld != null && !wharehouseOld.equals(wharehouseNew)) {
                wharehouseOld.getSectors().remove(sector);
                wharehouseOld = em.merge(wharehouseOld);
            }
            if (wharehouseNew != null && !wharehouseNew.equals(wharehouseOld)) {
                wharehouseNew.getSectors().add(sector);
                wharehouseNew = em.merge(wharehouseNew);
            }
            for (LoteProduct stocksProcuctsOldLoteProduct : stocksProcuctsOld) {
                if (!stocksProcuctsNew.contains(stocksProcuctsOldLoteProduct)) {
                    stocksProcuctsOldLoteProduct.setSector(null);
                    stocksProcuctsOldLoteProduct = em.merge(stocksProcuctsOldLoteProduct);
                }
            }
            for (LoteProduct stocksProcuctsNewLoteProduct : stocksProcuctsNew) {
                if (!stocksProcuctsOld.contains(stocksProcuctsNewLoteProduct)) {
                    Sector oldSectorOfStocksProcuctsNewLoteProduct = stocksProcuctsNewLoteProduct.getSector();
                    stocksProcuctsNewLoteProduct.setSector(sector);
                    stocksProcuctsNewLoteProduct = em.merge(stocksProcuctsNewLoteProduct);
                    if (oldSectorOfStocksProcuctsNewLoteProduct != null && !oldSectorOfStocksProcuctsNewLoteProduct.equals(sector)) {
                        oldSectorOfStocksProcuctsNewLoteProduct.getStocksProcucts().remove(stocksProcuctsNewLoteProduct);
                        oldSectorOfStocksProcuctsNewLoteProduct = em.merge(oldSectorOfStocksProcuctsNewLoteProduct);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = sector.getId();
                if (findSector(id) == null) {
                    throw new NonexistentEntityException("The sector with id " + id + " no longer exists.");
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
            Sector sector;
            try {
                sector = em.getReference(Sector.class, id);
                sector.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sector with id " + id + " no longer exists.", enfe);
            }
            Wharehouse wharehouse = sector.getWharehouse();
            if (wharehouse != null) {
                wharehouse.getSectors().remove(sector);
                wharehouse = em.merge(wharehouse);
            }
            List<LoteProduct> stocksProcucts = sector.getStocksProcucts();
            for (LoteProduct stocksProcuctsLoteProduct : stocksProcucts) {
                stocksProcuctsLoteProduct.setSector(null);
                stocksProcuctsLoteProduct = em.merge(stocksProcuctsLoteProduct);
            }
            em.remove(sector);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Sector> findSectorEntities() {
        return findSectorEntities(true, -1, -1);
    }

    public List<Sector> findSectorEntities(int maxResults, int firstResult) {
        return findSectorEntities(false, maxResults, firstResult);
    }

    private List<Sector> findSectorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sector.class));
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

    public Sector findSector(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sector.class, id);
        } finally {
            em.close();
        }
    }

    public int getSectorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sector> rt = cq.from(Sector.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
