/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.BUS;

import com.quanghuyabc9.DAO.PersonDAO;
import com.quanghuyabc9.DTO.Person;
import com.quanghuyabc9.utils.SecureUtils;
import com.quanghuyabc9.manager.MyApplication;
import java.util.List;

/**
 *
 * @author quanghuyabc9
 */
public class PersonBUS {

    public static final String EMAIL_ERROR = "Email is not valid";
    public static final String PASSWORD_AGAIN_ERROR = "The two passwords do not match";
    public static final String PASSWORD_ERROR = "Incorrect password";
    public static final String USERNAME_ERROR = "Username is available";
    public static final String USERNAME_ERROR_2 = "Username does not exist";
    public static final String EMPTY_ERROR = "You should fill out all the requirements";
    public static final String ACCESS_ERROR = "Your account is currently blocked";

    public static boolean add(String fullname, String email, String username,
            String password, String passwordAgain, List<String> errors) {
        if (fullname.length() == 0 || email.length() == 0
                || username.length() == 0 || password.length() == 0) {
            errors.add(EMPTY_ERROR);
            return false;
        }

        boolean hasErrors = false;
        if (!isEmailValid(email)) {
            errors.add(EMAIL_ERROR);
            hasErrors = true;
        }
        if (!password.equals(passwordAgain)) {
            errors.add(PASSWORD_AGAIN_ERROR);
            hasErrors = true;
        }
        if (hasErrors) {
            return false;
        }

        if (isUsernameExist(username)) {
            errors.add(USERNAME_ERROR);
            return false;
        }

        byte[] salt = SecureUtils.getSalt();
        String securePassword = SecureUtils.getSecurePassword(password, salt);
        String saltStr = new String(salt);
        securePassword += saltStr;
        Person person = new Person();
        person.setFullname(fullname);
        person.setEmail(email);
        person.setUsername(username);
        person.setPasswordPerson(securePassword);
        person.setTypePerson(0);
        PersonDAO.add(person);
        return true;
    }

    public static boolean authenticate(String username, String password, List<String> errors) {
        if (username.length() == 0 || password.length() == 0) {
            errors.add(EMPTY_ERROR);
            return false;
        }
        List<Person> people = PersonDAO.getPerson(username);
        if (people.isEmpty()) {

            errors.add(USERNAME_ERROR_2);
            return false;
        }
        Person person = people.get(0);
        String savedSecurePassword = person.getPasswordPerson();
        String saltStr = savedSecurePassword.substring(SecureUtils.HASH_LENGTH, savedSecurePassword.length());
        byte[] salt = saltStr.getBytes();
        String inputSecurePassword = SecureUtils.getSecurePassword(password, salt) + saltStr;
        if (!inputSecurePassword.equals(savedSecurePassword)) {
            errors.add(PASSWORD_ERROR);
            return false;
        }
        if (person.getAccessibleApp() == 0) {
            errors.add(ACCESS_ERROR);
            return false;
        }
        MyApplication.setPersonSignIn(person);
        return true;
    }

    public static boolean isEmailValid(String email) {
        return email.matches("^(.+)@(.+)$");
    }

    public static boolean isUsernameExist(String username) {
        List<Person> people = PersonDAO.getPerson(username);
        if (people.size() > 0) {
            return true;
        }
        return false;
    }

    public static List<Person> getAllUsers() {
        return PersonDAO.getAllUsers();
    }

    public static void update(Person person) {
        PersonDAO.update(person);
    }

    public static Person update(int id, String fullname, String email, String username, String oldPassword,
            String password, String passwordAgain, List<String> errors, int typePerson) {
        if (fullname.length() == 0 || email.length() == 0
                || username.length() == 0) {
            errors.add(EMPTY_ERROR);
            return null;
        }

        boolean hasErrors = false;
        if (!isEmailValid(email)) {
            errors.add(EMAIL_ERROR);
            hasErrors = true;
        }
        if (!password.equals(passwordAgain)) {
            errors.add(PASSWORD_AGAIN_ERROR);
            hasErrors = true;
        }
        if (hasErrors) {
            return null;
        }

        Person person;
        if (password.length() == 0) {
            person = new Person();
            person.setId(id);
            person.setFullname(fullname);
            person.setEmail(email);
            person.setUsername(username);
            person.setPasswordPerson(oldPassword);
            person.setTypePerson(typePerson);
        } else {
            byte[] salt = SecureUtils.getSalt();
            String securePassword = SecureUtils.getSecurePassword(password, salt);
            String saltStr = new String(salt);
            securePassword += saltStr;
            person = new Person();
            person.setId(id);
            person.setFullname(fullname);
            person.setEmail(email);
            person.setUsername(username);
            person.setPasswordPerson(securePassword);
            person.setTypePerson(typePerson);
        }
        PersonBUS.update(person);
        return person;
    }
}
