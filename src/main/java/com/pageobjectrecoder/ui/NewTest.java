package com.pageobjectrecoder.ui;

import com.pageobjectrecoder.utils.GlobalConstants;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author E005397
 * Bharath Kumar Reddy V
 */
public class NewTest extends JFrame {


    public NewTest() {
        initComponents();
    }


    private void initComponents() {

        pnlHeader = new JPanel();
        txtSetBaseURL = new JLabel();
        lblClose = new JLabel();
        txtHeader1 = new JLabel();
        inputBaseURL = new JTextField();
        txtTESTNAME = new JLabel();
        btnOK = new JButton();
        btnLater = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1,new Color(0,92,151) ));

        pnlHeader.setBackground(new Color(0, 92, 151));

        txtSetBaseURL.setFont(new Font("Calibri", 1, 25));
        txtSetBaseURL.setForeground(new Color(255, 255, 255));
        txtSetBaseURL.setText("Name your new test");

        lblClose.setForeground(new Color(255, 255, 255));
        lblClose.setIcon(new ImageIcon(getClass().getResource("/icons/multiply_18px.png")));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
        });

        GroupLayout pnlHeaderLayout = new GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
                pnlHeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHeaderLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtSetBaseURL)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblClose, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
        );
        pnlHeaderLayout.setVerticalGroup(
                pnlHeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHeaderLayout.createSequentialGroup()
                                .addComponent(lblClose, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(txtSetBaseURL)
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        txtHeader1.setFont(new Font("Tahoma", 0, 15));
        txtHeader1.setText("Please provide a name for your new test.");

        inputBaseURL.setFont(new Font("Tahoma", 0, 17));
        inputBaseURL.setForeground(new Color(0, 101, 202));
        //inputBaseURL.setText("http://newtours.demoaut.com/");
        inputBaseURL.setBorder(BorderFactory.createLineBorder(new Color(0, 162, 232)));

        txtTESTNAME.setFont(new Font("Tahoma", 0, 13));
        txtTESTNAME.setText("TEST NAME");

        btnOK.setText("OK");
        btnOK.setFocusPainted(false);
        btnOK.setBackground(new Color(240, 240, 240));
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });


        btnLater.setText("LATER");
        btnLater.setFocusPainted(false);
        btnLater.setBackground(new Color(240, 240, 240));
        btnLater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaterActionPerformed(evt);
            }
        });


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(pnlHeader, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnOK, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46)
                                                .addComponent(btnLater, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtTESTNAME)
                                                        .addComponent(txtHeader1)
                                                        .addComponent(inputBaseURL, GroupLayout.PREFERRED_SIZE, 768, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlHeader, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtHeader1)
                                .addGap(18, 18, 18)
                                .addComponent(txtTESTNAME)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputBaseURL, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btnLater, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                        .addComponent(btnOK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {
        Recorder.setBaseURL.setVisible(false);
    }
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {

        Recorder.newTest.setVisible(false);
    }

    private void btnLaterActionPerformed(java.awt.event.ActionEvent evt) {

        Recorder.newTest.setVisible(false);
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JButton btnLater;
    private JButton btnOK;
    private JTextField inputBaseURL;
    private JLabel lblClose;
    private JPanel pnlHeader;
    private JLabel txtTESTNAME;
    private JLabel txtHeader1;
    private JLabel txtSetBaseURL;
    // End of variables declaration
}

