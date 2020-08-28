/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.GUI;

import com.quanghuyabc9.manager.MyApplication;
import java.io.File;
import java.net.URISyntaxException;
import javax.swing.UIManager;

/**
 *
 * @author quanghuyabc9
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
//            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Guess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    String path = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath();
                    path = path + "\\images\\";
                    File folderImage = new File(path);
                    if(!folderImage.exists()) {
                        folderImage.mkdir();
                    }
                    MyApplication.setLocalImagesPath(path);
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                new Guess().showFrame();
            }
        });
    }
}
