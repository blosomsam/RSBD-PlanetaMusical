/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetamusical.Util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author sandrojc
 */
public class JPAUtil {
     private static final EntityManagerFactory emf;
    private static final String persistence_name = "PlanetaMusical";

    static {
        emf = Persistence.createEntityManagerFactory(persistence_name, null);
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}