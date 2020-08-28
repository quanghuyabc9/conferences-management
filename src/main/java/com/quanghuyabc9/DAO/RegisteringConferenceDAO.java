/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.DAO;

import com.quanghuyabc9.DTO.Conference;
import com.quanghuyabc9.DTO.Person;
import com.quanghuyabc9.DTO.RegisteringConference;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author quanghuyabc9
 */
public class RegisteringConferenceDAO {

    public static void add(RegisteringConference registeringConference) {
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(registeringConference);
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
    }

    public static List<RegisteringConference> getRegisteringConferencesOfConference(Conference conference) {
        String hql = "SELECT r FROM RegisteringConference r WHERE r.conference = :conference";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(hql);
        query.setParameter("conference", conference);
        List registeringConferences = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return registeringConferences;
    }

    public static int deleteAllRegisteringConferenceOfConference(int conferenceId) {
        String sql = "DELETE FROM registeringconference WHERE conference = :conferenceId";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNativeQuery(sql);
        query.setParameter("conferenceId", conferenceId);
        int rowsEffect = query.executeUpdate();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return rowsEffect;
    }

    public static void delete(int registeringConferenceId) {
        String hql = "DELETE FROM RegisteringConference WHERE id = :registeringConferenceId";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = null;
        query = entityManager.createQuery(hql);
        query.setParameter("registeringConferenceId", registeringConferenceId);
        query.executeUpdate();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
    }
    
    public static void deleteRegisteringConferenceOfConference(Conference conference) {
        String hql = "DELETE FROM RegisteringConference WHERE conference = :conference";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(hql);
        query.setParameter("conference", conference);
        query.executeUpdate();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
    }

    public static List<RegisteringConference> getRegisteringConference(Conference conference, Person person) {
        String hql = "SELECT r FROM RegisteringConference r WHERE r.conference = :conference AND r.person = :person";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(hql);
        query.setParameter("conference", conference);
        query.setParameter("person", person);
        List<RegisteringConference> registeringConferences = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return registeringConferences;
    }
}
