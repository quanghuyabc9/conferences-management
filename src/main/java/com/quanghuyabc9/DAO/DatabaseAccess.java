/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.DAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author quanghuyabc9
 */
public class DatabaseAccess {

    public static EntityManagerFactory entityManagerFactory;

    public static void setUp() {
        entityManagerFactory = Persistence.createEntityManagerFactory("com.quanghuyabc9");
    }
 
    public static void tearDown() {
        entityManagerFactory.close();
    }
}
