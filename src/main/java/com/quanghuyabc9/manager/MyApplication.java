/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.manager;

import com.quanghuyabc9.DTO.Conference;
import com.quanghuyabc9.DTO.Person;

/**
 *
 * @author quanghuyabc9
 */
public class MyApplication {

    private static Person personSignin = null;
    private static Conference curShowDetailConference = null;
    private static String localImagesPath = null;

    public static String getLocalImagesPath() {
        return localImagesPath;
    }

    public static void setLocalImagesPath(String localImagesPath) {
        MyApplication.localImagesPath = localImagesPath;
    }

    public static Conference getCurShowDetailConference() {
        return curShowDetailConference;
    }

    public static void setCurShowDetailConference(Conference curShowDetailConference) {
        MyApplication.curShowDetailConference = curShowDetailConference;
    }
    
    public static Person getPersonSignIn() {
        return personSignin;
    }
    
    public static void setPersonSignIn(Person _personSignin) {
        personSignin = _personSignin;
    }
}
