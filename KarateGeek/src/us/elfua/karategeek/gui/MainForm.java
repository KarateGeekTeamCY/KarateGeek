package us.elfua.karategeek.gui;

import us.elfua.karategeek.gui.ObjectSellecttingForm;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * karate geek
 *
 *
 * Copyright (C) 2012 michael theodorides <mc.theodorides@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */
/**
 *
 * @author Athina
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    private ObjectSellecttingForm selectionForm;

    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        pnlMainAction = new javax.swing.JPanel();
        btnAthleteManagement = new javax.swing.JButton();
        btnJudgeManagement = new javax.swing.JButton();
        btnEventManagement = new javax.swing.JButton();
        btnEventSupport = new javax.swing.JButton();
        pnlOkExit = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Karate Federetion");

        pnlMainAction.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAthleteManagement.setText("athlete management");
        btnAthleteManagement.setName("btnAthleteManagement"); // NOI18N
        btnAthleteManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAthleteManagementActionPerformed(evt);
            }
        });

        btnJudgeManagement.setText("judge management");
        btnJudgeManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJudgeManagementActionPerformed(evt);
            }
        });

        btnEventManagement.setText("event management");
        btnEventManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventManagementActionPerformed(evt);
            }
        });

        btnEventSupport.setText("event support");

        javax.swing.GroupLayout pnlMainActionLayout = new javax.swing.GroupLayout(pnlMainAction);
        pnlMainAction.setLayout(pnlMainActionLayout);
        pnlMainActionLayout.setHorizontalGroup(
            pnlMainActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainActionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEventSupport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEventManagement, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJudgeManagement, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAthleteManagement, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlMainActionLayout.setVerticalGroup(
            pnlMainActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainActionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAthleteManagement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJudgeManagement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEventManagement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEventSupport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlOkExit.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOkExitLayout = new javax.swing.GroupLayout(pnlOkExit);
        pnlOkExit.setLayout(pnlOkExitLayout);
        pnlOkExitLayout.setHorizontalGroup(
            pnlOkExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOkExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlOkExitLayout.setVerticalGroup(
            pnlOkExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOkExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlOkExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMainAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(pnlMainAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlOkExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAthleteManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAthleteManagementActionPerformed
        this.selectionForm = new ObjectSellecttingForm();
        this.selectionForm.lblTitle.setText("Athlete Management");
        this.selectionForm.parent = this;
        this.setVisible(false);
        this.selectionForm.setVisible(true);

    }//GEN-LAST:event_btnAthleteManagementActionPerformed

    private void btnJudgeManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJudgeManagementActionPerformed

        this.selectionForm = new ObjectSellecttingForm();
        this.selectionForm.lblTitle.setText("Judge Management");
        this.selectionForm.parent = this;
        this.setVisible(false);
        this.selectionForm.setVisible(true);

    }//GEN-LAST:event_btnJudgeManagementActionPerformed

    private void btnEventManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventManagementActionPerformed
        this.selectionForm = new ObjectSellecttingForm();
        this.selectionForm.lblTitle.setText("Event Management");
        this.selectionForm.parent = this;
        this.setVisible(false);
        this.selectionForm.setVisible(true);
    }//GEN-LAST:event_btnEventManagementActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        //this.hide();
        System.exit(0);
        
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAthleteManagement;
    private javax.swing.JButton btnEventManagement;
    private javax.swing.JButton btnEventSupport;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnJudgeManagement;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlMainAction;
    private javax.swing.JPanel pnlOkExit;
    // End of variables declaration//GEN-END:variables
}