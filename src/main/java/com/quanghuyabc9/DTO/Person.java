/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author quanghuyabc9
 */
@Entity
@Table(name = "person")
public class Person {
    private int id;
    private String fullname;
    private String username;
    private String passwordPerson;
    private String email;
    private int typePerson;
    private int accessibleApp;

    public Person() {
        accessibleApp = 1;
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "fullname")
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "passwordPerson")
    public String getPasswordPerson() {
        return passwordPerson;
    }

    public void setPasswordPerson(String passwordPerson) {
        this.passwordPerson = passwordPerson;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name = "typePerson")
     public int getTypePerson() {
        return typePerson;
    }

    public void setTypePerson(int typePerson) {
        this.typePerson = typePerson;
    }
   
    @Column(name = "accessibleApp")
    public int getAccessibleApp() {
        return accessibleApp;
    }

    public void setAccessibleApp(int accessibleApp) {
        this.accessibleApp = accessibleApp;
    }
}
