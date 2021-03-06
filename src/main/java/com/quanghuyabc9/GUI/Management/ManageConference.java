/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.GUI.Management;

import com.quanghuyabc9.BUS.ConferenceBUS;
import com.quanghuyabc9.BUS.LocationBUS;
import com.quanghuyabc9.DTO.Conference;
import com.quanghuyabc9.DTO.Location;
import com.quanghuyabc9.GUI.HintTextField;
import com.quanghuyabc9.manager.MyApplication;
import com.quanghuyabc9.utils.ImageFilter;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

/**
 *
 * @author quanghuyabc9
 */
public class ManageConference extends javax.swing.JDialog {

    public static final int CREATE_NEW_CONFERENCE = 0;
    public static final int EDIT_CONFERENCE = 1;

    public static final Color MOUSE_MOVED_PNL_COLOR = new Color(240, 85, 55);
    public static final Color MOUSE_EXITED_PNL_COLOR = new Color(209, 65, 12);
    public static final Color MOUSE_MOVED_PNL_COLOR_2 = new Color(237, 235, 233);
    public static final Color MOUSE_EXITED_PNL_COLOR_2 = new Color(255, 255, 255);
    public static final Color MOUSE_MOVED_PNL_COLOR_3 = new Color(44, 151, 75);
    public static final Color MOUSE_EXITED_PNL_COLOR_3 = new Color(46, 164, 79);

    private String image = null;
    private boolean addOrUpdateConferenceSuccessfully = false;
    private int type = CREATE_NEW_CONFERENCE;
    private Conference conference = null;
    private boolean selecteNewImage = false;

    public static int IMG_WIDTH = 380, IMG_HEIGHT = 144;
    private Object com;

    public ManageConference(java.awt.Frame parent, boolean modal, int _type) {
        super(parent, modal);
        type = _type;
        initComponents();
    }

    public ManageConference(java.awt.Frame parent, boolean modal, int _type, Conference _conference) {
        super(parent, modal);
        type = _type;
        conference = _conference;
        initComponents();
        setData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrMain = new javax.swing.JScrollPane();
        pnlMain = new javax.swing.JPanel();
        pnlBasicInfoMain = new javax.swing.JPanel();
        lblTitleBasicInfoMain = new javax.swing.JLabel();
        scrConferenceNameBasicInfoMain = new javax.swing.JScrollPane();
        txtConferenceNameBasicInfoMain = new javax.swing.JTextArea();
        scrBriefDescriptionBasicInfoMain = new javax.swing.JScrollPane();
        txtBriefDescriptionBasicInfoMain = new javax.swing.JTextArea();
        scrDetailDescriptionBasicInfoMain = new javax.swing.JScrollPane();
        txtDetailDescriptionBasicInfoMain = new javax.swing.JTextArea();
        pnlImageMain = new javax.swing.JPanel();
        lblITitleImageMain = new javax.swing.JLabel();
        pnlSelectImageMain = new javax.swing.JPanel();
        lblSelectAnImage = new javax.swing.JLabel();
        pnlViewImageMain = new javax.swing.JPanel();
        lblImageView = new javax.swing.JLabel();
        pnlDateAndTimeMain = new javax.swing.JPanel();
        lblTitleDateAndTimeMain = new javax.swing.JLabel();
        pnlInputDateAndTimeMain = new javax.swing.JPanel();
        txtConferenceStart = new HintTextField("YYYY-MM-DD hh:mm:ss");
        txtDuration = new HintTextField("hh:mm:ss");
        pnlLocationMain = new javax.swing.JPanel();
        lblTitleLocationMain = new javax.swing.JLabel();
        List<Location> locations = LocationBUS.getAll();
        cmbDataLocationMain = new javax.swing.JComboBox();
        DefaultComboBoxModel model = new DefaultComboBoxModel(locations.toArray());
        cmbDataLocationMain.setModel(model);
        pnlContainBtn = new javax.swing.JPanel();
        pnlSave = new javax.swing.JPanel();
        lblSave = new javax.swing.JLabel();
        pnlDiscard = new javax.swing.JPanel();
        lblDiscard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create new conference");
        setPreferredSize(new java.awt.Dimension(610, 600));
        setResizable(false);

        scrMain.setBorder(null);
        scrMain.setPreferredSize(new java.awt.Dimension(620, 500));

        pnlMain.setBackground(new java.awt.Color(243, 242, 241));
        pnlMain.setPreferredSize(new java.awt.Dimension(569, 853));

        pnlBasicInfoMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlBasicInfoMain.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 25, 0, 25));

        lblTitleBasicInfoMain.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitleBasicInfoMain.setForeground(new java.awt.Color(30, 10, 60));
        lblTitleBasicInfoMain.setText("Basic Info");

        scrConferenceNameBasicInfoMain.setBackground(new java.awt.Color(255, 255, 255));
        scrConferenceNameBasicInfoMain.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(223, 220, 230), 2, true), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)), "Conference Name (*)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        txtConferenceNameBasicInfoMain.setBackground(new java.awt.Color(255, 255, 255));
        txtConferenceNameBasicInfoMain.setColumns(20);
        txtConferenceNameBasicInfoMain.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtConferenceNameBasicInfoMain.setForeground(new java.awt.Color(51, 51, 51));
        txtConferenceNameBasicInfoMain.setLineWrap(true);
        txtConferenceNameBasicInfoMain.setRows(5);
        scrConferenceNameBasicInfoMain.setViewportView(txtConferenceNameBasicInfoMain);

        scrBriefDescriptionBasicInfoMain.setBackground(new java.awt.Color(255, 255, 255));
        scrBriefDescriptionBasicInfoMain.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(223, 220, 230), 2, true), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)), "Bried Description (*)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        txtBriefDescriptionBasicInfoMain.setBackground(new java.awt.Color(255, 255, 255));
        txtBriefDescriptionBasicInfoMain.setColumns(20);
        txtBriefDescriptionBasicInfoMain.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtBriefDescriptionBasicInfoMain.setLineWrap(true);
        txtBriefDescriptionBasicInfoMain.setRows(5);
        scrBriefDescriptionBasicInfoMain.setViewportView(txtBriefDescriptionBasicInfoMain);

        scrDetailDescriptionBasicInfoMain.setBackground(new java.awt.Color(255, 255, 255));
        scrDetailDescriptionBasicInfoMain.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(223, 220, 230), 2, true), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)), "Detail Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        txtDetailDescriptionBasicInfoMain.setBackground(new java.awt.Color(255, 255, 255));
        txtDetailDescriptionBasicInfoMain.setColumns(20);
        txtDetailDescriptionBasicInfoMain.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDetailDescriptionBasicInfoMain.setForeground(new java.awt.Color(51, 51, 51));
        txtDetailDescriptionBasicInfoMain.setLineWrap(true);
        txtDetailDescriptionBasicInfoMain.setRows(5);
        txtDetailDescriptionBasicInfoMain.setBorder(null);
        scrDetailDescriptionBasicInfoMain.setViewportView(txtDetailDescriptionBasicInfoMain);

        javax.swing.GroupLayout pnlBasicInfoMainLayout = new javax.swing.GroupLayout(pnlBasicInfoMain);
        pnlBasicInfoMain.setLayout(pnlBasicInfoMainLayout);
        pnlBasicInfoMainLayout.setHorizontalGroup(
            pnlBasicInfoMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleBasicInfoMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrConferenceNameBasicInfoMain)
            .addComponent(scrBriefDescriptionBasicInfoMain)
            .addComponent(scrDetailDescriptionBasicInfoMain, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlBasicInfoMainLayout.setVerticalGroup(
            pnlBasicInfoMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBasicInfoMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleBasicInfoMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrConferenceNameBasicInfoMain, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrBriefDescriptionBasicInfoMain, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrDetailDescriptionBasicInfoMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlImageMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlImageMain.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 25, 0, 25));

        lblITitleImageMain.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblITitleImageMain.setForeground(new java.awt.Color(30, 10, 60));
        lblITitleImageMain.setText("Image");

        pnlSelectImageMain.setBackground(new java.awt.Color(46, 164, 79));
        pnlSelectImageMain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(46, 164, 79), 1, true));
        pnlSelectImageMain.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlSelectImageMainMouseMoved(evt);
            }
        });
        pnlSelectImageMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSelectImageMainMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlSelectImageMainMousePressed(evt);
            }
        });

        lblSelectAnImage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSelectAnImage.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectAnImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelectAnImage.setText("Select an image");

        javax.swing.GroupLayout pnlSelectImageMainLayout = new javax.swing.GroupLayout(pnlSelectImageMain);
        pnlSelectImageMain.setLayout(pnlSelectImageMainLayout);
        pnlSelectImageMainLayout.setHorizontalGroup(
            pnlSelectImageMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSelectAnImage, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        pnlSelectImageMainLayout.setVerticalGroup(
            pnlSelectImageMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSelectAnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlViewImageMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlViewImageMain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(223, 220, 230), 2, true));
        pnlViewImageMain.setPreferredSize(new java.awt.Dimension(380, 144));

        javax.swing.GroupLayout pnlViewImageMainLayout = new javax.swing.GroupLayout(pnlViewImageMain);
        pnlViewImageMain.setLayout(pnlViewImageMainLayout);
        pnlViewImageMainLayout.setHorizontalGroup(
            pnlViewImageMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImageView, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );
        pnlViewImageMainLayout.setVerticalGroup(
            pnlViewImageMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImageView, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlImageMainLayout = new javax.swing.GroupLayout(pnlImageMain);
        pnlImageMain.setLayout(pnlImageMainLayout);
        pnlImageMainLayout.setHorizontalGroup(
            pnlImageMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageMainLayout.createSequentialGroup()
                .addComponent(pnlSelectImageMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlViewImageMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addComponent(lblITitleImageMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlImageMainLayout.setVerticalGroup(
            pnlImageMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblITitleImageMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlImageMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlViewImageMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSelectImageMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnlDateAndTimeMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlDateAndTimeMain.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 25, 0, 25));

        lblTitleDateAndTimeMain.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitleDateAndTimeMain.setForeground(new java.awt.Color(30, 10, 60));
        lblTitleDateAndTimeMain.setText("Date And Time");

        pnlInputDateAndTimeMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlInputDateAndTimeMain.setLayout(new java.awt.GridLayout(1, 0));

        if(type == EDIT_CONFERENCE) txtConferenceStart = new JTextField();
        txtConferenceStart.setBackground(new java.awt.Color(255, 255, 255));
        txtConferenceStart.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtConferenceStart.setForeground(new java.awt.Color(51, 51, 51));
        txtConferenceStart.setToolTipText("");
        txtConferenceStart.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(223, 220, 230), 2, true), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10)), "Conference Start (*)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        pnlInputDateAndTimeMain.add(txtConferenceStart);

        if(type == EDIT_CONFERENCE) txtDuration = new JTextField();
        txtDuration.setBackground(new java.awt.Color(255, 255, 255));
        txtDuration.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDuration.setForeground(new java.awt.Color(51, 51, 51));
        txtDuration.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(223, 220, 230), 2, true), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10)), "Duration (*)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        pnlInputDateAndTimeMain.add(txtDuration);

        javax.swing.GroupLayout pnlDateAndTimeMainLayout = new javax.swing.GroupLayout(pnlDateAndTimeMain);
        pnlDateAndTimeMain.setLayout(pnlDateAndTimeMainLayout);
        pnlDateAndTimeMainLayout.setHorizontalGroup(
            pnlDateAndTimeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleDateAndTimeMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlInputDateAndTimeMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlDateAndTimeMainLayout.setVerticalGroup(
            pnlDateAndTimeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDateAndTimeMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleDateAndTimeMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInputDateAndTimeMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pnlLocationMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlLocationMain.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 25, 0, 25));

        lblTitleLocationMain.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitleLocationMain.setForeground(new java.awt.Color(30, 10, 60));
        lblTitleLocationMain.setText("Location ");

        cmbDataLocationMain.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmbDataLocationMain.setBorder(null);
        cmbDataLocationMain.setPreferredSize(new java.awt.Dimension(64, 40));

        javax.swing.GroupLayout pnlLocationMainLayout = new javax.swing.GroupLayout(pnlLocationMain);
        pnlLocationMain.setLayout(pnlLocationMainLayout);
        pnlLocationMainLayout.setHorizontalGroup(
            pnlLocationMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleLocationMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cmbDataLocationMain, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLocationMainLayout.setVerticalGroup(
            pnlLocationMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLocationMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleLocationMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbDataLocationMain, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlImageMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDateAndTimeMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlLocationMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBasicInfoMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlBasicInfoMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlImageMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDateAndTimeMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLocationMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        scrMain.setViewportView(pnlMain);

        getContentPane().add(scrMain, java.awt.BorderLayout.CENTER);

        pnlContainBtn.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(223, 220, 230)), javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0)));
        pnlContainBtn.setPreferredSize(new java.awt.Dimension(0, 50));

        pnlSave.setBackground(new java.awt.Color(209, 65, 12));
        pnlSave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(209, 65, 12), 1, true));
        pnlSave.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlSaveMouseMoved(evt);
            }
        });
        pnlSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlSaveMousePressed(evt);
            }
        });

        lblSave.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSave.setForeground(new java.awt.Color(255, 255, 255));
        lblSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSave.setText("Save");

        javax.swing.GroupLayout pnlSaveLayout = new javax.swing.GroupLayout(pnlSave);
        pnlSave.setLayout(pnlSaveLayout);
        pnlSaveLayout.setHorizontalGroup(
            pnlSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSave, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        pnlSaveLayout.setVerticalGroup(
            pnlSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlDiscard.setBackground(new java.awt.Color(255, 255, 255));
        pnlDiscard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(223, 220, 230), 2, true));
        pnlDiscard.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlDiscardMouseMoved(evt);
            }
        });
        pnlDiscard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDiscardMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDiscardMousePressed(evt);
            }
        });

        lblDiscard.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDiscard.setForeground(new java.awt.Color(51, 51, 51));
        lblDiscard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiscard.setText("Discard");

        javax.swing.GroupLayout pnlDiscardLayout = new javax.swing.GroupLayout(pnlDiscard);
        pnlDiscard.setLayout(pnlDiscardLayout);
        pnlDiscardLayout.setHorizontalGroup(
            pnlDiscardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDiscard, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        );
        pnlDiscardLayout.setVerticalGroup(
            pnlDiscardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDiscard, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlContainBtnLayout = new javax.swing.GroupLayout(pnlContainBtn);
        pnlContainBtn.setLayout(pnlContainBtnLayout);
        pnlContainBtnLayout.setHorizontalGroup(
            pnlContainBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlDiscard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(pnlSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        pnlContainBtnLayout.setVerticalGroup(
            pnlContainBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDiscard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlContainBtn, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlSaveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSaveMouseMoved
        // TODO add your handling code here:
        pnlSave.setBackground(MOUSE_MOVED_PNL_COLOR);
    }//GEN-LAST:event_pnlSaveMouseMoved

    private void pnlSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSaveMouseExited
        // TODO add your handling code here:
        pnlSave.setBackground(MOUSE_EXITED_PNL_COLOR);
    }//GEN-LAST:event_pnlSaveMouseExited

    private void pnlDiscardMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDiscardMouseMoved
        // TODO add your handling code here:
        pnlDiscard.setBackground(MOUSE_MOVED_PNL_COLOR_2);
    }//GEN-LAST:event_pnlDiscardMouseMoved

    private void pnlDiscardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDiscardMouseExited
        // TODO add your handling code here:
        pnlDiscard.setBackground(MOUSE_EXITED_PNL_COLOR_2);
    }//GEN-LAST:event_pnlDiscardMouseExited

    private void pnlSelectImageMainMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSelectImageMainMouseMoved
        // TODO add your handling code here:
        pnlSelectImageMain.setBackground(MOUSE_MOVED_PNL_COLOR_3);
    }//GEN-LAST:event_pnlSelectImageMainMouseMoved

    private void pnlSelectImageMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSelectImageMainMouseExited
        // TODO add your handling code here:
        pnlSelectImageMain.setBackground(MOUSE_EXITED_PNL_COLOR_3);
    }//GEN-LAST:event_pnlSelectImageMainMouseExited

    private void pnlSelectImageMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSelectImageMainMousePressed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.addChoosableFileFilter(new ImageFilter());
        fileChooser.setAcceptAllFileFilterUsed(false);

        int option = fileChooser.showOpenDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            image = file.getAbsolutePath();
            setImage(image);
            selecteNewImage = true;
        }
    }//GEN-LAST:event_pnlSelectImageMainMousePressed

    private void setImage(String image) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(image));
        } catch (Exception e) {
            img = null;
            //e.printStackTrace();
        }
        if (img != null) {
            Image dimg = img.getScaledInstance(IMG_WIDTH, IMG_HEIGHT, Image.SCALE_SMOOTH);
            lblImageView.setIcon(new ImageIcon(dimg));
        }
    }
    private void pnlSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSaveMousePressed
        // TODO add your handling code here:
        String nameConference = txtConferenceNameBasicInfoMain.getText();
        String briefDes = txtBriefDescriptionBasicInfoMain.getText();
        String detalDes = txtDetailDescriptionBasicInfoMain.getText();
        String startTime = txtConferenceStart.getText();
        String duration = txtDuration.getText();
        Location location = (Location) cmbDataLocationMain.getSelectedItem();
        List<String> errors = new ArrayList<>();
        boolean isSuccess = false;
        if (type == CREATE_NEW_CONFERENCE) {
            if (image != null) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
                LocalDateTime now = LocalDateTime.now();
                String newFileName = dtf.format(now) + ".png";
                String newImagePath = MyApplication.getLocalImagesPath() + newFileName;
                try {
                    Files.copy(new File(image).toPath(), new File(newImagePath).toPath(), StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                    image = null;
                }
                isSuccess = ConferenceBUS.add(nameConference, briefDes, detalDes, newFileName, startTime, duration, location, errors);
            } else {
                isSuccess = ConferenceBUS.add(nameConference, briefDes, detalDes, null, startTime, duration, location, errors);
            }
        } else {
            String newImageName = conference.getImage();
            if (selecteNewImage) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
                LocalDateTime now = LocalDateTime.now();
                newImageName = dtf.format(now) + ".png";
                String newImagePath = MyApplication.getLocalImagesPath() + newImageName;
                try {
                    Files.copy(new File(image).toPath(), new File(newImagePath).toPath(), StandardCopyOption.REPLACE_EXISTING);
                    Files.delete(new File(MyApplication.getLocalImagesPath() + conference.getImage()).toPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            isSuccess = ConferenceBUS.update(conference.getId(), nameConference, briefDes,
                    detalDes, newImageName, startTime,
                    duration, location, errors);
        }
        if (isSuccess) {
            addOrUpdateConferenceSuccessfully = true;
            setVisible(false);
            dispose();
        } else {
            com.quanghuyabc9.GUI.Error dialog = new com.quanghuyabc9.GUI.Error(new javax.swing.JFrame(), true, errors);
            dialog.showDialog();
        }
    }//GEN-LAST:event_pnlSaveMousePressed

    private void pnlDiscardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDiscardMousePressed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_pnlDiscardMousePressed

    public boolean showDiaglog() {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - getWidth()) / 2;
        final int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);
        setVisible(true);
        setLocationRelativeTo(null);
        return addOrUpdateConferenceSuccessfully;
    }

    public final void setData() {
        if (conference != null) {
            txtConferenceNameBasicInfoMain.setText(conference.getNameConference());
            txtBriefDescriptionBasicInfoMain.setText(conference.getBriefDes());
            txtDetailDescriptionBasicInfoMain.setText(conference.getDetailDes());
            image = MyApplication.getLocalImagesPath() + conference.getImage();
            setImage(image);
            txtConferenceStart.setText(conference.getTimeStart().toString());
            txtDuration.setText(conference.getDuration().toString());
            cmbDataLocationMain.setSelectedItem(conference.getLocation());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbDataLocationMain;
    private javax.swing.JLabel lblDiscard;
    private javax.swing.JLabel lblITitleImageMain;
    private javax.swing.JLabel lblImageView;
    private javax.swing.JLabel lblSave;
    private javax.swing.JLabel lblSelectAnImage;
    private javax.swing.JLabel lblTitleBasicInfoMain;
    private javax.swing.JLabel lblTitleDateAndTimeMain;
    private javax.swing.JLabel lblTitleLocationMain;
    private javax.swing.JPanel pnlBasicInfoMain;
    private javax.swing.JPanel pnlContainBtn;
    private javax.swing.JPanel pnlDateAndTimeMain;
    private javax.swing.JPanel pnlDiscard;
    private javax.swing.JPanel pnlImageMain;
    private javax.swing.JPanel pnlInputDateAndTimeMain;
    private javax.swing.JPanel pnlLocationMain;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlSave;
    private javax.swing.JPanel pnlSelectImageMain;
    private javax.swing.JPanel pnlViewImageMain;
    private javax.swing.JScrollPane scrBriefDescriptionBasicInfoMain;
    private javax.swing.JScrollPane scrConferenceNameBasicInfoMain;
    private javax.swing.JScrollPane scrDetailDescriptionBasicInfoMain;
    private javax.swing.JScrollPane scrMain;
    private javax.swing.JTextArea txtBriefDescriptionBasicInfoMain;
    private javax.swing.JTextArea txtConferenceNameBasicInfoMain;
    private javax.swing.JTextField txtConferenceStart;
    private javax.swing.JTextArea txtDetailDescriptionBasicInfoMain;
    private javax.swing.JTextField txtDuration;
    // End of variables declaration//GEN-END:variables
}
