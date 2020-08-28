/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.DAO;

import com.quanghuyabc9.DTO.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author quanghuyabc9
 */
public class PersonDAO {
    public static void add(Person person) {
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(person);
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
    }
    
    public static List<Person> getPerson(String username) {
        String hql = "SELECT p FROM Person p WHERE p.username = '" + username + "'";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = null;
        query = entityManager.createQuery(hql);     
        List people = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return people;
    }
    
    public static List<Person> getAllUsers() {
        String hql = "SELECT p FROM Person p WHERE p.typePerson = 0";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(hql);
        List people = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return people;
    }
    
    public static void update(Person person) {
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(person);
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
    }
}
