/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.BUS;

import com.quanghuyabc9.DAO.LocationDAO;
import com.quanghuyabc9.DTO.Location;
import java.util.List;

/**
 *
 * @author quanghuyabc9
 */
public class LocationBUS {
     public static List<Location> getAll() {
         return LocationDAO.getAll();
     }
}
