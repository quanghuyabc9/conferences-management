/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.BUS;

import com.quanghuyabc9.DAO.RegisteringConferenceDAO;
import com.quanghuyabc9.DTO.Conference;
import com.quanghuyabc9.DTO.Person;
import com.quanghuyabc9.DTO.RegisteringConference;
import java.util.List;

/**
 *
 * @author quanghuyabc9
 */
public class RegisteringConferenceBUS {
    
    public static final String CAPACITY_ERROR = "The current number of registrations have reached the limit";

    public static boolean add(RegisteringConference registeringConference, List<String> errors) {
        int nCurRegisteringConferences = getRegisteringConferencesOfConference(registeringConference.getConference()).size();
        int nCurRegisteredConferences = RegisteredConferenceBUS.getRegisterdConferencesOfConference(registeringConference.getConference()).size();
        if(nCurRegisteredConferences + nCurRegisteringConferences >= registeringConference.getConference().getLocation().getCapacity()) {
            errors.add(CAPACITY_ERROR);
            return false;
        }
        RegisteringConferenceDAO.add(registeringConference);
        return true;
    }
    
    public static List<RegisteringConference> getRegisteringConferencesOfConference(Conference conference) {
        return RegisteringConferenceDAO.getRegisteringConferencesOfConference(conference);
    }

    public static void delete(int registeringConferenceId) {
        RegisteringConferenceDAO.delete(registeringConferenceId);
    }

    public static int deleteAllRegisteringConferenceOfConference(int conferenceId) {
        return RegisteringConferenceDAO.deleteAllRegisteringConferenceOfConference(conferenceId);
    }
    
     public static List<RegisteringConference> getRegisteringConference(Conference conference, Person person) {
         return RegisteringConferenceDAO.getRegisteringConference(conference, person);
     }
     
     public static boolean isExist(Conference conference, Person person) {
         List<RegisteringConference> registeringConference = getRegisteringConference(conference, person);
         return registeringConference.size() > 0;
     }
     
     public static void deleteRegisteringConferenceOfConference(Conference conference) {
         RegisteringConferenceDAO.deleteRegisteringConferenceOfConference(conference);
     }
}
