/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.GUI;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author quanghuyabc9
 */
public class Success extends javax.swing.JDialog {

    public Success(java.awt.Frame parent, boolean modal, String msg) {
        super(parent, modal);
        initComponents();
        lblDetailViewMain.setText(msg);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        btnOkMain = new javax.swing.JButton();
        pnlViewMain = new javax.swing.JPanel();
        lblSuccessViewMain = new javax.swing.JLabel();
        pnlDetailViewMain = new javax.swing.JPanel();
        lblDetailViewMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlMain.setBackground(new java.awt.Color(237, 235, 233));

        btnOkMain.setBackground(new java.awt.Color(46, 164, 79));
        btnOkMain.setForeground(new java.awt.Color(255, 255, 255));
        btnOkMain.setText("OK");
        btnOkMain.setBorder(null);
        btnOkMain.setFocusPainted(false);
        btnOkMain.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnOkMainMouseMoved(evt);
            }
        });
        btnOkMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOkMainMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOkMainMousePressed(evt);
            }
        });

        pnlViewMain.setBackground(new java.awt.Color(255, 255, 255));

        lblSuccessViewMain.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSuccessViewMain.setForeground(new java.awt.Color(46, 164, 79));
        lblSuccessViewMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuccessViewMain.setText("Success");

        pnlDetailViewMain.setBackground(new java.awt.Color(255, 255, 255));

        lblDetailViewMain.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDetailViewMain.setForeground(new java.awt.Color(46, 164, 79));
        lblDetailViewMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetailViewMain.setText("Enroll successfully. Admin will accept you soon !");

        javax.swing.GroupLayout pnlDetailViewMainLayout = new javax.swing.GroupLayout(pnlDetailViewMain);
        pnlDetailViewMain.setLayout(pnlDetailViewMainLayout);
        pnlDetailViewMainLayout.setHorizontalGroup(
            pnlDetailViewMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDetailViewMain, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlDetailViewMainLayout.setVerticalGroup(
            pnlDetailViewMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDetailViewMain, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout pnlViewMainLayout = new javax.swing.GroupLayout(pnlViewMain);
        pnlViewMain.setLayout(pnlViewMainLayout);
        pnlViewMainLayout.setHorizontalGroup(
            pnlViewMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSuccessViewMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDetailViewMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlViewMainLayout.setVerticalGroup(
            pnlViewMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewMainLayout.createSequentialGroup()
                .addComponent(lblSuccessViewMain, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlDetailViewMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlViewMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOkMain, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlViewMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOkMain, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkMainMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMainMouseMoved
        // TODO add your handling code here:
        btnOkMain.setBackground(Signin.MOUSE_MOVED_BTN_COLOR);
    }//GEN-LAST:event_btnOkMainMouseMoved

    private void btnOkMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMainMousePressed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnOkMainMousePressed

    private void btnOkMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMainMouseExited
        // TODO add your handling code here:
        btnOkMain.setBackground(Signin.MOUSE_EXITED_BTN_COLOR);
    }//GEN-LAST:event_btnOkMainMouseExited

    public void showDialog() {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - getWidth()) / 2;
        final int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOkMain;
    private javax.swing.JLabel lblDetailViewMain;
    private javax.swing.JLabel lblSuccessViewMain;
    private javax.swing.JPanel pnlDetailViewMain;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlViewMain;
    // End of variables declaration//GEN-END:variables
}
