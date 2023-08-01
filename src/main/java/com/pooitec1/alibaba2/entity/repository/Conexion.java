
package com.pooitec1.alibaba2.entity.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author nadia
 */
public class Conexion {
    
    
    private static EntityManagerFactory emf;
    private static EntityManager em;

    public Conexion() {
        Conexion.conectar();
    }

    private static void conectar() {
        if (em == null) {
            Conexion.emf = Persistence.createEntityManagerFactory("com.pooitec1_Alibaba2_jar_1.0PU");
            Conexion.em = Conexion.emf.createEntityManager();
        }
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static void setEmf(EntityManagerFactory emf) {
        Conexion.emf = emf;
    }

    public static EntityManager getEm() {
        return em;
    }

    public static void setEm(EntityManager em) {
        Conexion.em = em;
    }
    
}
