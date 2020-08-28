/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.DAO;

import com.quanghuyabc9.DTO.Conference;
import com.quanghuyabc9.DTO.Person;
import com.quanghuyabc9.DTO.RegisteredConference;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author quanghuyabc9
 */
public class RegisteredConferenceDAO {

    public static void add(RegisteredConference registeredConference) {
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(registeredConference);
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
    }

    public static List<RegisteredConference> getRegisteredConferencesOfPerson(Person person) {
        String hql = "SELECT r FROM RegisteredConference r WHERE r.person = :person";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(hql);
        query.setParameter("person", person);
        List registeredConferences = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return registeredConferences;
    }

    public static List<RegisteredConference> getAll() {
        String hql = "SELECT r FROM RegisteredConference r";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = null;
        query = entityManager.createQuery(hql);
        List registeredConferences = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return registeredConferences;
    }

    public static List<RegisteredConference> getRegisteredConference(Conference conference, Person person) {
        String hql = "SELECT r FROM RegisteredConference r WHERE r.conference = :conference AND r.person = :person";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(hql);
        query.setParameter("conference", conference);
        query.setParameter("person", person);
        List<RegisteredConference> registeredConferences = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return registeredConferences;
    }

    public static List<RegisteredConference> getRegisterdConferencesOfConference(Conference conference) {
        String hql = "SELECT r FROM RegisteredConference r WHERE r.conference = :conference";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(hql);
        query.setParameter("conference", conference);
        List registeredConferences = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return registeredConferences;
    }

    public static void deleteRegisteredConferenceOfConference(Conference conference) {
        String hql = "DELETE FROM RegisteredConference WHERE conference = :conference";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(hql);
        query.setParameter("conference", conference);
        query.executeUpdate();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
    }

    public static List<RegisteredConference> searchByConferenceNameOfPerson(Person person, String conferenceName) {
        String hql = "SELECT r FROM RegisteredConference r WHERE r.person = :person AND r.conference.nameConference like :conferenceName";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(hql);
        query.setParameter("person", person);
        query.setParameter("conferenceName", '%' + conferenceName + '%');
        List conferences = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return conferences;
    }

    public static List<RegisteredConference> searchByConferenceAddressOfPerson(Person person, String address) {
        String hql = "SELECT r FROM RegisteredConference r WHERE r.person = :person AND r.conference.location.address like :address";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(hql);
        query.setParameter("person", person);
        query.setParameter("address", '%' + address + '%');
        List conferences = query.getResultList();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
        return conferences;
    }

    public static void deleteRegisteredConference(Person person, Conference conference) {
        String hql = "DELETE FROM RegisteredConference WHERE person = :person AND conference = :conference";
        DatabaseAccess.setUp();
        EntityManager entityManager = DatabaseAccess.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery(hql);
        query.setParameter("person", person);
        query.setParameter("conference", conference);
        query.executeUpdate();
        entityManager.getTransaction().commit();
        DatabaseAccess.tearDown();
    }
}
