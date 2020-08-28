/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanghuyabc9.GUI;

import com.quanghuyabc9.BUS.PersonBUS;
import com.quanghuyabc9.DTO.Person;
import com.quanghuyabc9.GUI.Management.ManageConference;
import com.quanghuyabc9.manager.MyApplication;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author quanghuyabc9
 */
public class Profile extends javax.swing.JDialog {

    private Person person;
    private boolean isEdit;

    public Profile(java.awt.Frame parent, boolean modal, Person _person) {
        super(parent, modal);
        person = _person;
        isEdit = false;
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

        pnlMain = new javax.swing.JPanel();
        pnlContent = new javax.swing.JPanel();
        lblTitleContent = new javax.swing.JLabel();
        lblFullnameContent = new javax.swing.JLabel();
        txtFullnameContent = new javax.swing.JTextField();
        lblEmailContent = new javax.swing.JLabel();
        txtEmailContent = new javax.swing.JTextField();
        lblUsernameContent = new javax.swing.JLabel();
        txtUsernameContent = new javax.swing.JTextField();
        lblPasswordContent = new javax.swing.JLabel();
        psswrdPassWordContent = new javax.swing.JPasswordField();
        lblPasswordAgainContent = new javax.swing.JLabel();
        psswrdPasswordAgainContent = new javax.swing.JPasswordField();
        pnlSaveContent = new javax.swing.JPanel();
        lblSaveContent = new javax.swing.JLabel();
        pnlDiscardContent = new javax.swing.JPanel();
        lblDiscardContent = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign up");
        setResizable(false);

        pnlMain.setBackground(new java.awt.Color(237, 235, 233));
        pnlMain.setPreferredSize(new java.awt.Dimension(500, 700));
        pnlMain.setLayout(new java.awt.GridBagLayout());

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlContent.setPreferredSize(new java.awt.Dimension(300, 550));

        lblTitleContent.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitleContent.setForeground(new java.awt.Color(70, 71, 117));
        lblTitleContent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleContent.setText("<html>Your profile</html>");

        lblFullnameContent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFullnameContent.setForeground(new java.awt.Color(51, 51, 51));
        lblFullnameContent.setText("Fullname");

        txtFullnameContent.setBackground(new java.awt.Color(243, 242, 241));
        txtFullnameContent.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtFullnameContent.setForeground(new java.awt.Color(51, 51, 51));
        txtFullnameContent.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));

        lblEmailContent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblEmailContent.setForeground(new java.awt.Color(51, 51, 51));
        lblEmailContent.setText("Email");

        txtEmailContent.setBackground(new java.awt.Color(243, 242, 241));
        txtEmailContent.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEmailContent.setForeground(new java.awt.Color(51, 51, 51));
        txtEmailContent.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));

        lblUsernameContent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUsernameContent.setForeground(new java.awt.Color(51, 51, 51));
        lblUsernameContent.setText("Username");

        txtUsernameContent.setBackground(new java.awt.Color(243, 242, 241));
        txtUsernameContent.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtUsernameContent.setForeground(new java.awt.Color(51, 51, 51));
        txtUsernameContent.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));

        lblPasswordContent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPasswordContent.setForeground(new java.awt.Color(51, 51, 51));
        lblPasswordContent.setText("Password");

        psswrdPassWordContent.setBackground(new java.awt.Color(243, 242, 241));
        psswrdPassWordContent.setForeground(new java.awt.Color(51, 51, 51));
        psswrdPassWordContent.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));
        psswrdPassWordContent.setPreferredSize(new java.awt.Dimension(21, 19));

        lblPasswordAgainContent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPasswordAgainContent.setForeground(new java.awt.Color(51, 51, 51));
        lblPasswordAgainContent.setText("Enter password again");

        psswrdPasswordAgainContent.setBackground(new java.awt.Color(243, 242, 241));
        psswrdPasswordAgainContent.setForeground(new java.awt.Color(51, 51, 51));
        psswrdPasswordAgainContent.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));
        psswrdPasswordAgainContent.setPreferredSize(new java.awt.Dimension(21, 19));

        pnlSaveContent.setBackground(new java.awt.Color(209, 65, 12));
        pnlSaveContent.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlSaveContentMouseMoved(evt);
            }
        });
        pnlSaveContent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSaveContentMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlSaveContentMousePressed(evt);
            }
        });

        lblSaveContent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSaveContent.setForeground(new java.awt.Color(255, 255, 255));
        lblSaveContent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaveContent.setText("Save");

        javax.swing.GroupLayout pnlSaveContentLayout = new javax.swing.GroupLayout(pnlSaveContent);
        pnlSaveContent.setLayout(pnlSaveContentLayout);
        pnlSaveContentLayout.setHorizontalGroup(
            pnlSaveContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSaveContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlSaveContentLayout.setVerticalGroup(
            pnlSaveContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSaveContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlDiscardContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlDiscardContent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        pnlDiscardContent.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlDiscardContentMouseMoved(evt);
            }
        });
        pnlDiscardContent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDiscardContentMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDiscardContentMousePressed(evt);
            }
        });

        lblDiscardContent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDiscardContent.setForeground(new java.awt.Color(51, 51, 51));
        lblDiscardContent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiscardContent.setText("Discard");

        javax.swing.GroupLayout pnlDiscardContentLayout = new javax.swing.GroupLayout(pnlDiscardContent);
        pnlDiscardContent.setLayout(pnlDiscardContentLayout);
        pnlDiscardContentLayout.setHorizontalGroup(
            pnlDiscardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDiscardContent, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlDiscardContentLayout.setVerticalGroup(
            pnlDiscardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDiscardContent, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(46, 164, 78));
        jLabel1.setText("<html>Leave password empty if you dont want to update!<html>");

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleContent)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlContentLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addComponent(pnlDiscardContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnlSaveContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(psswrdPasswordAgainContent, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPasswordAgainContent)
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFullnameContent)
                                    .addComponent(lblEmailContent)
                                    .addComponent(txtFullnameContent, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                    .addComponent(lblUsernameContent)
                                    .addComponent(psswrdPassWordContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPasswordContent)
                                    .addComponent(txtEmailContent)
                                    .addComponent(txtUsernameContent))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                .addComponent(lblTitleContent, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFullnameContent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFullnameContent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmailContent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailContent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsernameContent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsernameContent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPasswordContent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psswrdPassWordContent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPasswordAgainContent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psswrdPasswordAgainContent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDiscardContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSaveContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        psswrdPassWordContent.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                change();
            }
            public void removeUpdate(DocumentEvent e) {
                change();
            }
            public void insertUpdate(DocumentEvent e) {
                change();
            }

            public void change() {
                if(psswrdPassWordContent.getText().length() == 0)
                psswrdPasswordAgainContent.setEditable(false);
                else
                psswrdPasswordAgainContent.setEditable(true);
            }
        });

        pnlMain.add(pnlContent, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlDiscardContentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDiscardContentMousePressed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_pnlDiscardContentMousePressed

    private void pnlDiscardContentMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDiscardContentMouseMoved
        // TODO add your handling code here:
        pnlDiscardContent.setBackground(ManageConference.MOUSE_MOVED_PNL_COLOR_2);
    }//GEN-LAST:event_pnlDiscardContentMouseMoved

    private void pnlDiscardContentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDiscardContentMouseExited
        // TODO add your handling code here:
        pnlDiscardContent.setBackground(ManageConference.MOUSE_EXITED_PNL_COLOR_2);
    }//GEN-LAST:event_pnlDiscardContentMouseExited

    private void pnlSaveContentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSaveContentMousePressed
        // TODO add your handling code here:
        int id = MyApplication.getPersonSignIn().getId();
        String fullname = txtFullnameContent.getText();
        String email = txtEmailContent.getText();
        String username = txtUsernameContent.getText();
        String password = psswrdPassWordContent.getText();
        String passwordAgain = psswrdPasswordAgainContent.getText();
        List<String> errors = new ArrayList<>();
        Person personUpdate = PersonBUS.update(id, fullname, email, username, 
                person.getPasswordPerson(), password, 
                passwordAgain, errors, person.getTypePerson());
        if (personUpdate != null) {
            MyApplication.setPersonSignIn(personUpdate);
            isEdit = true;
            setVisible(false);
            dispose();
        } else {
            Error errorDialog = new Error(new Frame(), true, errors);
            errorDialog.showDialog();
        }
    }//GEN-LAST:event_pnlSaveContentMousePressed

    private void pnlSaveContentMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSaveContentMouseMoved
        // TODO add your handling code here:
        pnlSaveContent.setBackground(ManageConference.MOUSE_MOVED_PNL_COLOR);
    }//GEN-LAST:event_pnlSaveContentMouseMoved

    private void pnlSaveContentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSaveContentMouseExited
        // TODO add your handling code here:
        pnlSaveContent.setBackground(ManageConference.MOUSE_EXITED_PNL_COLOR);
    }//GEN-LAST:event_pnlSaveContentMouseExited

    public boolean showDialog() {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - getWidth()) / 2;
        final int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);
        setVisible(true);
        setLocationRelativeTo(null);
        return isEdit;
    }

    private void setData() {
        txtFullnameContent.setText(person.getFullname());
        txtEmailContent.setText(person.getEmail());
        txtUsernameContent.setText(person.getUsername());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDiscardContent;
    private javax.swing.JLabel lblEmailContent;
    private javax.swing.JLabel lblFullnameContent;
    private javax.swing.JLabel lblPasswordAgainContent;
    private javax.swing.JLabel lblPasswordContent;
    private javax.swing.JLabel lblSaveContent;
    private javax.swing.JLabel lblTitleContent;
    private javax.swing.JLabel lblUsernameContent;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlDiscardContent;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlSaveContent;
    private javax.swing.JPasswordField psswrdPassWordContent;
    private javax.swing.JPasswordField psswrdPasswordAgainContent;
    private javax.swing.JTextField txtEmailContent;
    private javax.swing.JTextField txtFullnameContent;
    private javax.swing.JTextField txtUsernameContent;
    // End of variables declaration//GEN-END:variables
}
