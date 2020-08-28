/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.DAO;

import com.quanghuyabc9.DTO.Conference;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author quanghuyabc9
 */
public class ConferenceDAO {

    public static List<Conference> getAll() {
        String hql = "SELECT p FROM Conference p";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = null;
        query = entityManager.createQuery(hql);
        List conferences = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return conferences;
    }

    public static List<Conference> getAvailableConferences() {
        String hql = "SELECT c FROM Conference c WHERE c.timeStart > :curTime";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(hql);
        Timestamp curTime = new Timestamp(System.currentTimeMillis());
        query.setParameter("curTime", curTime);
        List conferences = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return conferences;
    }

    public static void add(Conference conference) {
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(conference);
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
    }

    public static void update(Conference conference) {
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(conference);
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
    }

    public static void delete(int conferenceId) {
        String hql = "DELETE FROM Conference WHERE id = :conferenceId";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = null;
        query = entityManager.createQuery(hql);
        query.setParameter("conferenceId", conferenceId);
        query.executeUpdate();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
    }

    public static List<Conference> searchConferenceByName(String conferenceName) {
        String hql = "SELECT FROM Conference WHERE nameConference like :conferenceName";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(hql);
        query.setParameter("conferenceName", conferenceName);
        List conferences = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return conferences;
    }

    public static List<Conference> searchConferenceByAddress(String address) {
        String hql = "SELECT FROM Conference WHERE location.address like :address";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(hql);
        query.setParameter("address", address);
        List conferences = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return conferences;
    }
}
