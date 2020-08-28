/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.DAO;

import com.quanghuyabc9.DTO.Location;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author quanghuyabc9
 */
public class LocationDAO {
      public static List<Location> getAll() {
        String hql = "SELECT l FROM Location l";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = null;
        query = entityManager.createQuery(hql);     
        List locations = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return locations;
    }
}
