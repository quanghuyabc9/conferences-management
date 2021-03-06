/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.GUI.Management;

import com.quanghuyabc9.BUS.ConferenceBUS;
import com.quanghuyabc9.BUS.RegisteredConferenceBUS;
import com.quanghuyabc9.BUS.RegisteringConferenceBUS;
import com.quanghuyabc9.DTO.Conference;
import com.quanghuyabc9.DTO.RegisteredConference;
import com.quanghuyabc9.DTO.RegisteringConference;
import com.quanghuyabc9.GUI.Guess;
import javax.swing.SwingUtilities;

/**
 *
 * @author quanghuyabc9
 */
public class UserRequestingItem01 extends javax.swing.JPanel {

    private RegisteringConference registeringConference;

    public UserRequestingItem01(RegisteringConference _registeringConference) {
        registeringConference = _registeringConference;
        initComponents();
        setData();
    }

    private final void setData() {
        lblUsername.setText(registeringConference.getPerson().getUsername());
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

        pnlUsername = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        pnlManagement = new javax.swing.JPanel();
        pnlAcceptManagement = new javax.swing.JPanel();
        lblAcceptManagement = new javax.swing.JLabel();
        pnlDenyManagement = new javax.swing.JPanel();
        lblDenyManagement = new javax.swing.JLabel();

        setBackground(new java.awt.Color(243, 242, 241));
        setMinimumSize(new java.awt.Dimension(302, 33));
        setPreferredSize(new java.awt.Dimension(0, 30));
        setLayout(new java.awt.GridBagLayout());

        pnlUsername.setBackground(new java.awt.Color(255, 255, 255));
        pnlUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0));
        pnlUsername.setPreferredSize(new java.awt.Dimension(0, 0));
        pnlUsername.setLayout(new java.awt.BorderLayout());

        lblUsername.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername.setText("Username");
        pnlUsername.add(lblUsername, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(pnlUsername, gridBagConstraints);

        pnlManagement.setPreferredSize(new java.awt.Dimension(0, 0));
        pnlManagement.setLayout(new java.awt.GridBagLayout());

        pnlAcceptManagement.setBackground(new java.awt.Color(255, 255, 255));
        pnlAcceptManagement.setPreferredSize(new java.awt.Dimension(0, 0));
        pnlAcceptManagement.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlAcceptManagementMouseMoved(evt);
            }
        });
        pnlAcceptManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAcceptManagementMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlAcceptManagementMousePressed(evt);
            }
        });
        pnlAcceptManagement.setLayout(new java.awt.BorderLayout());

        lblAcceptManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcceptManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/quanghuyabc9/images/icons8-checked-24.png"))); // NOI18N
        pnlAcceptManagement.add(lblAcceptManagement, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pnlManagement.add(pnlAcceptManagement, gridBagConstraints);

        pnlDenyManagement.setBackground(new java.awt.Color(255, 255, 255));
        pnlDenyManagement.setPreferredSize(new java.awt.Dimension(0, 0));
        pnlDenyManagement.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlDenyManagementMouseMoved(evt);
            }
        });
        pnlDenyManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDenyManagementMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDenyManagementMousePressed(evt);
            }
        });
        pnlDenyManagement.setLayout(new java.awt.BorderLayout());

        lblDenyManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDenyManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/quanghuyabc9/images/icons8-cancel-24.png"))); // NOI18N
        pnlDenyManagement.add(lblDenyManagement, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pnlManagement.add(pnlDenyManagement, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        add(pnlManagement, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlAcceptManagementMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAcceptManagementMouseMoved
        // TODO add your handling code here:
        pnlAcceptManagement.setBackground(Guess.MOUSE_MOVED_PNL_COLOR);
    }//GEN-LAST:event_pnlAcceptManagementMouseMoved

    private void pnlAcceptManagementMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAcceptManagementMouseExited
        // TODO add your handling code here:
        pnlAcceptManagement.setBackground(Guess.MOUSE_EXITED_PNL_COLOR_3);
    }//GEN-LAST:event_pnlAcceptManagementMouseExited

    private void pnlAcceptManagementMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAcceptManagementMousePressed
        // TODO add your handling code here:
        RegisteredConference registeredConference = new RegisteredConference();
        registeredConference.setPerson(registeringConference.getPerson());
        registeredConference.setConference(registeringConference.getConference());
        RegisteredConferenceBUS.add(registeredConference);
        RegisteringConferenceBUS.delete(registeringConference.getId());
        ListUserRequesting root = (ListUserRequesting) SwingUtilities.getWindowAncestor(this);
        root.setIsModified(true);
        root.updateUi();
    }//GEN-LAST:event_pnlAcceptManagementMousePressed

    private void pnlDenyManagementMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDenyManagementMouseMoved
        // TODO add your handling code here:
        pnlDenyManagement.setBackground(Guess.MOUSE_MOVED_PNL_COLOR);
    }//GEN-LAST:event_pnlDenyManagementMouseMoved

    private void pnlDenyManagementMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDenyManagementMouseExited
        // TODO add your handling code here:
        pnlDenyManagement.setBackground(Guess.MOUSE_EXITED_PNL_COLOR_3);
    }//GEN-LAST:event_pnlDenyManagementMouseExited

    private void pnlDenyManagementMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDenyManagementMousePressed
        // TODO add your handling code here:
        RegisteringConferenceBUS.delete(registeringConference.getId());
        ListUserRequesting root = (ListUserRequesting) SwingUtilities.getWindowAncestor(this);
        root.setIsModified(true);
        root.updateUi();
    }//GEN-LAST:event_pnlDenyManagementMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAcceptManagement;
    private javax.swing.JLabel lblDenyManagement;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlAcceptManagement;
    private javax.swing.JPanel pnlDenyManagement;
    private javax.swing.JPanel pnlManagement;
    private javax.swing.JPanel pnlUsername;
    // End of variables declaration//GEN-END:variables
}
