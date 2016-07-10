/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetamusical.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author sandrojc
 */
//mantener la conexion de JPA con la base de datos
public class JPAUtil {
    private  static  final EntityManagerFactory emf;
    private  static  final String persintence_name="PlanetaMusical";
    
    static{
        emf = Persistence.createEntityManagerFactory(persintence_name);
    }
    
    public static  EntityManagerFactory getEntityManagerFactory(){
        return emf;
    }  
}
