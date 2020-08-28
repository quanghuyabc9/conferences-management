/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.DTO;

import java.sql.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author quanghuyabc9
 */
@Entity
@Table(name = "conference")
public class Conference {

    private int id;
    private String nameConference;
    private String briefDes;
    private String detailDes;
    private String image;
    private Timestamp timeStart;
    private Time duration;
    private Location location;

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

    @Column(name = "nameConference")
    public String getNameConference() {
        return nameConference;
    }

    public void setNameConference(String nameConference) {
        this.nameConference = nameConference;
    }

    @Column(name = "briefDes")
    public String getBriefDes() {
        return briefDes;
    }

    public void setBriefDes(String briefDes) {
        this.briefDes = briefDes;
    }

    @Column(name = "detailDes")
    public String getDetailDes() {
        return detailDes;
    }

    public void setDetailDes(String detailDes) {
        this.detailDes = detailDes;
    }

    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Column(name = "timeStart")
    public Timestamp getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Timestamp timeStart) {
        this.timeStart = timeStart;
    }

    @Column(name = "duration")
    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    @ManyToOne
    @JoinColumn(name = "location")
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Conference() {

    }

}
