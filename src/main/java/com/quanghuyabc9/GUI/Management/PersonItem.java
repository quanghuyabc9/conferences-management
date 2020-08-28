/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.GUI.Management;

import com.quanghuyabc9.BUS.PersonBUS;
import com.quanghuyabc9.BUS.RegisteredConferenceBUS;
import com.quanghuyabc9.DTO.Person;
import com.quanghuyabc9.DTO.RegisteredConference;
import com.quanghuyabc9.GUI.Guess;
import com.quanghuyabc9.GUI.Home.ListViewItem01;
import static com.quanghuyabc9.GUI.Home.ListViewItem01.MOUSE_EXITED_PNL_COLOR;
import static com.quanghuyabc9.GUI.Home.ListViewItem01.MOUSE_MOVED_PNL_COLOR;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author quanghuyabc9
 */
public class PersonItem extends javax.swing.JPanel {

    public static final int STATUS_BLOCKED = 0;
    public static final int STATUS_ACTIVE = 1;

    private Person person;
    private int status;
    boolean isShowingRowDetail;

    public PersonItem(Person _person) {
        person = _person;
        status = person.getAccessibleApp();
        isShowingRowDetail = false;
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
        java.awt.GridBagConstraints gridBagConstraints;

        pnlRow = new javax.swing.JPanel();
        pnlDataRow = new javax.swing.JPanel();
        lblIdDataRow = new javax.swing.JLabel();
        lblUsernameDataRow = new javax.swing.JLabel();
        lblFullnameDataRow = new javax.swing.JLabel();
        lblEmailDataRow = new javax.swing.JLabel();
        pnlStatusRow = new javax.swing.JPanel();
        lblStatusRow = new javax.swing.JLabel();
        pnlRowDetail = new javax.swing.JPanel();
        pnlTitleRowDetail = new javax.swing.JPanel();
        lblTitleRowDetail = new javax.swing.JLabel();
        scrListEnrolledConferencesRowDetail = new javax.swing.JScrollPane();
        pnlListEnrolledConferencesRowDetail = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 315));
        setLayout(new java.awt.GridBagLayout());

        pnlRow.setBackground(new java.awt.Color(255, 255, 255));
        pnlRow.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 10));
        pnlRow.setPreferredSize(new java.awt.Dimension(0, 50));
        pnlRow.setRequestFocusEnabled(false);
        pnlRow.setLayout(new java.awt.GridBagLayout());

        pnlDataRow.setBackground(new java.awt.Color(255, 255, 255));
        pnlDataRow.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 25, 0, 0)));
        pnlDataRow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlDataRow.setFocusable(false);
        pnlDataRow.setPreferredSize(new java.awt.Dimension(0, 0));
        pnlDataRow.setRequestFocusEnabled(false);
        pnlDataRow.setVerifyInputWhenFocusTarget(false);
        pnlDataRow.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlDataRowMouseMoved(evt);
            }
        });
        pnlDataRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDataRowMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDataRowMousePressed(evt);
            }
        });
        pnlDataRow.setLayout(new java.awt.GridBagLayout());

        lblIdDataRow.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblIdDataRow.setForeground(new java.awt.Color(51, 51, 51));
        lblIdDataRow.setText("ID ");
        lblIdDataRow.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 1.0;
        pnlDataRow.add(lblIdDataRow, gridBagConstraints);

        lblUsernameDataRow.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUsernameDataRow.setForeground(new java.awt.Color(51, 51, 51));
        lblUsernameDataRow.setText("Username value");
        lblUsernameDataRow.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pnlDataRow.add(lblUsernameDataRow, gridBagConstraints);

        lblFullnameDataRow.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFullnameDataRow.setForeground(new java.awt.Color(51, 51, 51));
        lblFullnameDataRow.setText("Fullname value");
        lblFullnameDataRow.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pnlDataRow.add(lblFullnameDataRow, gridBagConstraints);

        lblEmailDataRow.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblEmailDataRow.setForeground(new java.awt.Color(51, 51, 51));
        lblEmailDataRow.setText("Email value");
        lblEmailDataRow.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pnlDataRow.add(lblEmailDataRow, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        pnlRow.add(pnlDataRow, gridBagConstraints);

        pnlStatusRow.setBackground(new java.awt.Color(255, 255, 255));
        pnlStatusRow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(223, 220, 230), 2, true));
        pnlStatusRow.setPreferredSize(new java.awt.Dimension(0, 0));
        pnlStatusRow.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlStatusRowMouseMoved(evt);
            }
        });
        pnlStatusRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlStatusRowMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlStatusRowMousePressed(evt);
            }
        });
        pnlStatusRow.setLayout(new java.awt.BorderLayout());

        lblStatusRow.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblStatusRow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusRow.setText("Active");
        pnlStatusRow.add(lblStatusRow, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        pnlRow.add(pnlStatusRow, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(pnlRow, gridBagConstraints);

        pnlRowDetail.setBackground(new java.awt.Color(243, 242, 241));
        pnlRowDetail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        pnlRowDetail.setPreferredSize(new java.awt.Dimension(0, 0));

        pnlTitleRowDetail.setBackground(new java.awt.Color(243, 242, 241));
        pnlTitleRowDetail.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)), javax.swing.BorderFactory.createEmptyBorder(0, 25, 0, 10)));
        pnlTitleRowDetail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pnlTitleRowDetail.setPreferredSize(new java.awt.Dimension(210, 30));

        lblTitleRowDetail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTitleRowDetail.setForeground(new java.awt.Color(46, 164, 79));
        lblTitleRowDetail.setText("List enrolled conferences");

        javax.swing.GroupLayout pnlTitleRowDetailLayout = new javax.swing.GroupLayout(pnlTitleRowDetail);
        pnlTitleRowDetail.setLayout(pnlTitleRowDetailLayout);
        pnlTitleRowDetailLayout.setHorizontalGroup(
            pnlTitleRowDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleRowDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTitleRowDetailLayout.setVerticalGroup(
            pnlTitleRowDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleRowDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        scrListEnrolledConferencesRowDetail.setBackground(new java.awt.Color(243, 242, 241));
        scrListEnrolledConferencesRowDetail.setBorder(null);

        pnlListEnrolledConferencesRowDetail.setBackground(new java.awt.Color(243, 242, 241));
        pnlListEnrolledConferencesRowDetail.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 25, 0, 10));
        pnlListEnrolledConferencesRowDetail.setLayout(new java.awt.GridBagLayout());
        scrListEnrolledConferencesRowDetail.setViewportView(pnlListEnrolledConferencesRowDetail);

        javax.swing.GroupLayout pnlRowDetailLayout = new javax.swing.GroupLayout(pnlRowDetail);
        pnlRowDetail.setLayout(pnlRowDetailLayout);
        pnlRowDetailLayout.setHorizontalGroup(
            pnlRowDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrListEnrolledConferencesRowDetail)
            .addComponent(pnlTitleRowDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );
        pnlRowDetailLayout.setVerticalGroup(
            pnlRowDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRowDetailLayout.createSequentialGroup()
                .addComponent(pnlTitleRowDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrListEnrolledConferencesRowDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(pnlRowDetail, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlStatusRowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlStatusRowMousePressed
        // TODO add your handling code here:
        if (status == STATUS_BLOCKED) {
            status = STATUS_ACTIVE;
            lblStatusRow.setForeground(Color.green);
            lblStatusRow.setText("Active");
            person.setAccessibleApp(status);
            PersonBUS.update(person);
        } else if (status == STATUS_ACTIVE) {
            status = STATUS_BLOCKED;
            lblStatusRow.setForeground(Color.red);
            lblStatusRow.setText("Blocked");
            person.setAccessibleApp(status);
            PersonBUS.update(person);
        }
    }//GEN-LAST:event_pnlStatusRowMousePressed

    private void pnlStatusRowMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlStatusRowMouseMoved
        // TODO add your handling code here:
        pnlStatusRow.setBackground(Guess.MOUSE_MOVED_PNL_COLOR);
    }//GEN-LAST:event_pnlStatusRowMouseMoved

    private void pnlStatusRowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlStatusRowMouseExited
        // TODO add your handling code here:
        pnlStatusRow.setBackground(Guess.MOUSE_EXITED_PNL_COLOR_3);
    }//GEN-LAST:event_pnlStatusRowMouseExited

    private void pnlDataRowMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDataRowMouseMoved
        // TODO add your handling code here:
        pnlDataRow.setBackground(ListViewItem01.MOUSE_MOVED_PNL_COLOR);
    }//GEN-LAST:event_pnlDataRowMouseMoved

    private void pnlDataRowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDataRowMouseExited
        // TODO add your handling code here:
        pnlDataRow.setBackground(ListViewItem01.MOUSE_EXITED_PNL_COLOR);
    }//GEN-LAST:event_pnlDataRowMouseExited

    private void pnlDataRowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDataRowMousePressed
        // TODO add your handling code here:
        if (!isShowingRowDetail) {
            List<RegisteredConference> registeredConferences = RegisteredConferenceBUS.getRegisteredConferencesOfPerson(person);
            GridBagConstraints gbc1 = new GridBagConstraints();
            gbc1.weightx = 1;
            gbc1.fill = GridBagConstraints.HORIZONTAL;
            gbc1.gridwidth = GridBagConstraints.REMAINDER;
            GridBagConstraints gbc2 = new GridBagConstraints();
            gbc2.weightx = 1;
            gbc2.weighty = 1;
            for (int i = 0; i < registeredConferences.size(); i++) {
                UserEnrolledConference userEnrolledConferencePnl = new UserEnrolledConference(i + 1, registeredConferences.get(i).getConference());
                pnlListEnrolledConferencesRowDetail.add(userEnrolledConferencePnl, gbc1);
            }
            pnlListEnrolledConferencesRowDetail.add(new JPanel(), gbc2);
            pnlRowDetail.setVisible(true);
            setPreferredSize(new Dimension(0, 315));
            isShowingRowDetail = true;
        } else {
            isShowingRowDetail = false;
            pnlRowDetail.setVisible(false);
            setPreferredSize(new Dimension(0, 50));
        }
    }//GEN-LAST:event_pnlDataRowMousePressed

    private void setData() {
        lblIdDataRow.setText(String.valueOf(person.getId()));
        lblUsernameDataRow.setText(person.getUsername());
        lblFullnameDataRow.setText(person.getFullname());
        lblEmailDataRow.setText(person.getEmail());
        if (status == STATUS_BLOCKED) {
            lblStatusRow.setForeground(Color.red);
            lblStatusRow.setText("Blocked");
        } else if (status == STATUS_ACTIVE) {
            lblStatusRow.setForeground(Color.green);
            lblStatusRow.setText("Active");
        }
        pnlRowDetail.setVisible(false);
        setPreferredSize(new Dimension(0, 50));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblEmailDataRow;
    private javax.swing.JLabel lblFullnameDataRow;
    private javax.swing.JLabel lblIdDataRow;
    private javax.swing.JLabel lblStatusRow;
    private javax.swing.JLabel lblTitleRowDetail;
    private javax.swing.JLabel lblUsernameDataRow;
    private javax.swing.JPanel pnlDataRow;
    private javax.swing.JPanel pnlListEnrolledConferencesRowDetail;
    private javax.swing.JPanel pnlRow;
    private javax.swing.JPanel pnlRowDetail;
    private javax.swing.JPanel pnlStatusRow;
    private javax.swing.JPanel pnlTitleRowDetail;
    private javax.swing.JScrollPane scrListEnrolledConferencesRowDetail;
    // End of variables declaration//GEN-END:variables

}