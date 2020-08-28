package com.quanghuyabc9.BUS;

import com.quanghuyabc9.DAO.RegisteredConferenceDAO;
import com.quanghuyabc9.DTO.Conference;
import com.quanghuyabc9.DTO.Person;
import com.quanghuyabc9.DTO.RegisteredConference;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author quanghuyabc9
 */
public class RegisteredConferenceBUS {

    public static void add(RegisteredConference registeredConference) {
        RegisteredConferenceDAO.add(registeredConference);
    }

    public static List<RegisteredConference> getRegisteredConferencesOfPerson(Person person) {
        return RegisteredConferenceDAO.getRegisteredConferencesOfPerson(person);
    }

    public static boolean isExist(Conference conference, Person person) {
        List<RegisteredConference> registeredConference = getRegisteredConference(conference, person);
        return registeredConference.size() > 0;
    }

    public static List<RegisteredConference> getRegisteredConference(Conference conference, Person person) {
        return RegisteredConferenceDAO.getRegisteredConference(conference, person);
    }

    public static List<RegisteredConference> getRegisterdConferencesOfConference(Conference conference) {
        return RegisteredConferenceDAO.getRegisterdConferencesOfConference(conference);
    }

    public static void deleteRegisteredConferenceOfConference(Conference conference) {
        RegisteredConferenceDAO.deleteRegisteredConferenceOfConference(conference);
    }

    public static List<RegisteredConference> searchByConferenceNameOfPerson(Person person, String conferenceName) {
        return RegisteredConferenceDAO.searchByConferenceNameOfPerson(person, conferenceName);
    }

    public static List<RegisteredConference> searchByConferenceAddressOfPerson(Person person, String address) {
        return RegisteredConferenceDAO.searchByConferenceAddressOfPerson(person, address);
    }
    
    public static void deleteRegisteredConference(Person person, Conference conference) {
        RegisteredConferenceDAO.deleteRegisteredConference(person, conference);
    }
}
