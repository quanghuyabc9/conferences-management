/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.BUS;

import com.quanghuyabc9.DAO.ConferenceDAO;
import com.quanghuyabc9.DTO.Conference;
import com.quanghuyabc9.DTO.Location;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quanghuyabc9
 */
public class ConferenceBUS {

    public static final String EMPTY_ERROR = "Conference Name, Brief Description, Time Start and Duration mustnot be leave empty";
    public static final String FORMAT_ERROR = "Conference Start and Duration must match the format";
    public static final String ADDING_CONFERENCE_ERROR = "The timstart and duration reachs the timeline of other conferences";

    public static List<Conference> getAllAvailableConferences() {
//        List<Conference> conferences =  ConferenceDAO.getAll();
//        List<Conference> availableConferences = new ArrayList<>(); 
//        Timestamp curTime = new Timestamp(System.currentTimeMillis());
//        for(int i = 0; i < conferences.size(); i++) {
//            if(conferences.get(i).getTimeStart().after(curTime)) {
//                availableConferences.add(conferences.get(i));
//            }
//        }
//        return availableConferences;
        return ConferenceDAO.getAvailableConferences();
    }

    public static List<Conference> getAll() {
        return ConferenceDAO.getAll();
    }

    public static boolean add(String nameConference, String briefDes,
            String detailDes, String image,
            String timeStartStr, String durationStr, Location location,
            List<String> errors) {
        if (nameConference.length() == 0 || briefDes.length() == 0
                || timeStartStr.length() == 0 || durationStr.length() == 0) {
            errors.add(EMPTY_ERROR);
            return false;
        }

        Timestamp timeStart = null;
        Time duration = null;
        try {
            timeStart = Timestamp.valueOf(timeStartStr);
            duration = Time.valueOf(durationStr);
        } catch (IllegalArgumentException e) {
            errors.add(FORMAT_ERROR);
            return false;
        }

//        long durationMilliseconds = duration.getTime();
//        long timeEndMillisecond = timeStart.getTime() + durationMilliseconds;
//        Timestamp timeEnd = new Timestamp(timeEndMillisecond);
        //       long timeStartMilliSeconds = timeStart.getTime();
        boolean isValid = true;
        List<Conference> availableConferences = ConferenceBUS.getAll();
        long tmp2 = new Time(0, 0, 0).getTime();
        long durationMiliseconds = duration.getTime() - tmp2;
        Timestamp timeEnd = new Timestamp(timeStart.getTime() + durationMiliseconds);
        for (int i = 0; i < availableConferences.size(); i++) {
            if (availableConferences.get(i).getLocation().getId() == location.getId()) {
                long curTimeStartMilliSeconds = availableConferences.get(i).getTimeStart().getTime();
                long tmp1 = availableConferences.get(i).getDuration().getTime();
                long curDurationMiliseconds = tmp1 - tmp2;
                long curTimeEndMilliSeconds = curTimeStartMilliSeconds + curDurationMiliseconds;
                Timestamp curTimeEnd = new Timestamp(curTimeEndMilliSeconds);
                if(timeStart.equals(availableConferences.get(i).getTimeStart())) {
                    isValid = false;
                    break;
                }
                if (timeStart.after(availableConferences.get(i).getTimeStart()) && timeStart.before(curTimeEnd)) {
                    isValid = false;
                    break;
                }
                if (timeEnd.after(availableConferences.get(i).getTimeStart()) && timeEnd.before(curTimeEnd)) {
                    isValid = false;
                    break;
                }

            }
        }
        if (isValid) {
            Conference conference = new Conference();
            conference.setNameConference(nameConference);
            conference.setBriefDes(briefDes);
            conference.setDetailDes(detailDes);
            conference.setImage(image);
            conference.setTimeStart(timeStart);
            conference.setDuration(duration);
            conference.setLocation(location);
            ConferenceDAO.add(conference);
        } else {
            errors.add(ADDING_CONFERENCE_ERROR);
        }
        return isValid;
    }

    public static boolean update(int id, String nameConference, String briefDes,
            String detailDes, String image,
            String timeStartStr, String durationStr, Location location,
            List<String> errors) {
        if (nameConference.length() == 0 || briefDes.length() == 0
                || timeStartStr.length() == 0 || durationStr.length() == 0) {
            errors.add(EMPTY_ERROR);
            return false;
        }

        Timestamp timeStart = null;
        Time duration = null;
        try {
            timeStart = Timestamp.valueOf(timeStartStr);
            duration = Time.valueOf(durationStr);
        } catch (IllegalArgumentException e) {
            errors.add(FORMAT_ERROR);
            return false;
        }

        long timeStartMilliSeconds = timeStart.getTime();
        boolean isValid = true;
        List<Conference> availableConferences = ConferenceBUS.getAllAvailableConferences();
        for (int i = 0; i < availableConferences.size(); i++) {
            if (availableConferences.get(i).getId() != id) {
                if (availableConferences.get(i).getLocation().getId() == location.getId()) {
                    long curTimeStartMilliSeconds = availableConferences.get(i).getTimeStart().getTime();
                    long curTimeEndMilliSeconds = curTimeStartMilliSeconds + availableConferences.get(i).getDuration().getTime();
                    if (timeStartMilliSeconds >= curTimeStartMilliSeconds && timeStartMilliSeconds < curTimeEndMilliSeconds) {
                        isValid = false;
                        break;
                    }
                }
            }
        }
        if (isValid) {
            Conference conference = new Conference();
            conference.setId(id);
            conference.setNameConference(nameConference);
            conference.setBriefDes(briefDes);
            conference.setDetailDes(detailDes);
            conference.setImage(image);
            conference.setTimeStart(timeStart);
            conference.setDuration(duration);
            conference.setLocation(location);
            ConferenceDAO.update(conference);
        } else {
            errors.add(ADDING_CONFERENCE_ERROR);
        }
        return isValid;
    }

    public static void delete(Conference conference) {
        RegisteringConferenceBUS.deleteRegisteringConferenceOfConference(conference);
        RegisteredConferenceBUS.deleteRegisteredConferenceOfConference(conference);
        ConferenceDAO.delete(conference.getId());
    }

    public static void update(Conference conference) {
        ConferenceDAO.update(conference);
    }
}
