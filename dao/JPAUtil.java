/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 12101000400
 */
public class JPAUtil {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("observatorio");
    
    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}
