package com.pageobjectrecoder.ui;

import com.pageobjectrecoder.utils.GlobalConstants;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author E005397
 * Bharath Kumar Reddy V
 */
public class SetBaseURL extends javax.swing.JFrame {


    public SetBaseURL() {
        initComponents();
    }


    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        txtSetBaseURL = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        txtHeader1 = new javax.swing.JLabel();
        inputBaseURL = new javax.swing.JTextField();
        txtBASEURL = new javax.swing.JLabel();
        btnStartRecording = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1,new Color(0,92,151) ));

        pnlHeader.setBackground(new java.awt.Color(0, 92, 151));

        txtSetBaseURL.setFont(new java.awt.Font("Calibri", 1, 25));
        txtSetBaseURL.setForeground(new java.awt.Color(255, 255, 255));
        txtSetBaseURL.setText("Set you project's base URL");

        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/multiply_18px.png")));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
                pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHeaderLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtSetBaseURL)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHeaderLayout.setVerticalGroup(
                pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHeaderLayout.createSequentialGroup()
                                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(txtSetBaseURL)
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        txtHeader1.setFont(new java.awt.Font("Tahoma", 0, 15));
        txtHeader1.setText("Before you can start recording, you must specify a valid base URL for your project. Your tests will start by navigating to this URL.");

        inputBaseURL.setFont(new java.awt.Font("Tahoma", 0, 17));
        inputBaseURL.setForeground(new java.awt.Color(0, 101, 202));
        inputBaseURL.setText("http://newtours.demoaut.com/");
        inputBaseURL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 162, 232)));

        txtBASEURL.setFont(new java.awt.Font("Tahoma", 0, 13));
        txtBASEURL.setText("BASE URL");

        btnStartRecording.setText("START RECORDING");
        btnStartRecording.setFocusPainted(false);
        btnStartRecording.setBackground(new Color(240, 240, 240));
        btnStartRecording.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartRecordingActionPerformed(evt);
            }
        });


        btnCancel.setText("CANCEL");
        btnCancel.setFocusPainted(false);
        btnCancel.setBackground(new Color(240, 240, 240));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnStartRecording, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46)
                                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtBASEURL)
                                                        .addComponent(txtHeader1)
                                                        .addComponent(inputBaseURL, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtHeader1)
                                .addGap(18, 18, 18)
                                .addComponent(txtBASEURL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputBaseURL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                        .addComponent(btnStartRecording, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {
        Recorder.setBaseURL.setVisible(false);
    }
    private void btnStartRecordingActionPerformed(java.awt.event.ActionEvent evt) {

        GlobalConstants.BASE_URL = inputBaseURL.getText();
        Thread t = new Thread() {
            public void run() {
                Recorder.webBrowser = new WebBrowser();
                Recorder.webBrowser.browserLaunch(inputBaseURL.getText());

            }
        };
        t.start();
        Recorder.setBaseURL.setVisible(false);
        GlobalConstants.tblRowno_incrementor = GlobalConstants.tblRowno_incrementor+1;
        Recorder.model.addRow(new Object[]{GlobalConstants.tblRowno_incrementor,"open","browser",inputBaseURL.getText()});
    }

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {
        Recorder.setBaseURL.setVisible(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetBaseURL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnStartRecording;
    private javax.swing.JTextField inputBaseURL;
    private javax.swing.JLabel lblClose;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JLabel txtBASEURL;
    private javax.swing.JLabel txtHeader1;
    private javax.swing.JLabel txtSetBaseURL;
    // End of variables declaration
}

