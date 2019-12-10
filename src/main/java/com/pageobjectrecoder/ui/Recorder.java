package com.pageobjectrecoder.ui;

import com.pageobjectrecoder.utils.UIDesign;
import javafx.application.Platform;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bharath Kumar Reddy V
 */
public class Recorder extends javax.swing.JFrame {

//    public static ViewCommandStepsTableModel viewCommandStepsTableModel = null;
//
    public static DefaultTableModel model = new DefaultTableModel();

    boolean recordFlag = false;

    public static WebBrowser webBrowser;
    public static SetBaseURL setBaseURL;
    public static NewTest newTest;


    public Recorder() {
        initComponents();
    }

    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnRecord = new javax.swing.JButton();
        btnRunAll = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnRun = new javax.swing.JButton();
        imgCignitiLogo = new javax.swing.JLabel();
        pnlLeft = new javax.swing.JPanel();
        pnlTestSuites = new javax.swing.JPanel();
        txtTestSuites = new javax.swing.JLabel();
        btnOpenFolder = new javax.swing.JLabel();
        btnCreateTestSuite = new javax.swing.JLabel();
        btnCommentCode = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        treeTestSuites = new javax.swing.JTree();
        panlMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTestSteps = new javax.swing.JTable();
        btnAddTestStep = new javax.swing.JButton();
        btnDeleteTestStep = new javax.swing.JButton();
        btnTestStepCopy = new javax.swing.JButton();
        btnTestStepPaste = new javax.swing.JButton();
        btnTestStepUP = new javax.swing.JButton();
        btnTestStepDown = new javax.swing.JButton();
        btnHelp = new javax.swing.JLabel();
        pnlControls = new javax.swing.JPanel();
        listCommand = new javax.swing.JComboBox();
        txtCommand = new javax.swing.JLabel();
        txtValue = new javax.swing.JLabel();
        txtTarget = new javax.swing.JLabel();
        inputValue = new javax.swing.JTextField();
        btnFindObject = new javax.swing.JButton();
        inputTarget = new javax.swing.JTextField();
        pnlLog = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabLog = new javax.swing.JPanel();
        tabScreenshots = new javax.swing.JPanel();
        tabReports = new javax.swing.JPanel();
        tabConfig = new javax.swing.JPanel();
        pnlScore = new javax.swing.JPanel();
        txtPassed = new javax.swing.JLabel();
        txtPassedCount = new javax.swing.JLabel();
        txtFailed = new javax.swing.JLabel();
        txtFailedCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnNew.setFont(new java.awt.Font("Calibri", 1, 15));
        btnNew.setForeground(new java.awt.Color(0, 153, 102));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_add_28px.png")));
        btnNew.setFocusPainted(false);
        btnNew.setBackground(new Color(240, 240, 240));
        btnNew.setText("New");
        btnNew.setToolTipText("Create new test case");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnRecord.setFont(new java.awt.Font("Calibri", 1, 15));
        btnRecord.setForeground(new java.awt.Color(222, 31, 38));
        btnRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/record_28.png")));
        btnRecord.setFocusPainted(false);
        btnRecord.setBackground(new Color(240, 240, 240));
        btnRecord.setText("Record");
        btnRecord.setToolTipText("Click and navigate to the browser and record your tests");
        btnRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordActionPerformed(evt);
            }
        });

        btnRunAll.setFont(new java.awt.Font("Calibri", 1, 15));
        btnRunAll.setForeground(new java.awt.Color(33, 150, 243));
        btnRunAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_play_property_28px.png")));
        btnRunAll.setFocusPainted(false);
        btnRunAll.setBackground(new Color(240, 240, 240));
        btnRunAll.setText("Run All");
        btnRunAll.setToolTipText("Run All test cases on the desired browser and settings");
        btnRunAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunAllActionPerformed(evt);
            }
        });

        btnExport.setFont(new java.awt.Font("Calibri", 1, 15));
        btnExport.setForeground(new java.awt.Color(81, 154, 84));
        btnExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_google_code_28px.png")));
        btnExport.setFocusPainted(false);
        btnExport.setBackground(new Color(240, 240, 240));
        btnExport.setText("Export");
        btnExport.setToolTipText("Export the current test case to script in TestNG, JUnit or Cucumber");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnRun.setFont(new java.awt.Font("Calibri", 1, 15));
        btnRun.setForeground(new java.awt.Color(33, 150, 243));
        btnRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_play_28px.png")));
        btnRun.setFocusPainted(false);
        btnRun.setBackground(new Color(240, 240, 240));
        btnRun.setText("Run");
        btnRun.setToolTipText("Run selected test case on the desired browser and settings");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        imgCignitiLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cigniti_logo.png")));
        imgCignitiLogo.setToolTipText("Software Quality | Assured");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
                pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHeaderLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnRunAll, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imgCignitiLogo)
                                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
                pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHeaderLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(imgCignitiLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                                .addComponent(btnRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnNew)
                                                .addComponent(btnRun)
                                                .addComponent(btnRunAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        pnlTestSuites.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtTestSuites.setFont(new java.awt.Font("Calibri", 1, 18));
        txtTestSuites.setForeground(new java.awt.Color(102, 102, 102));
        txtTestSuites.setText("Test Suites");

        btnOpenFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_opened_folder_20px.png")));
        btnOpenFolder.setToolTipText("Open test suites");

        btnCreateTestSuite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_new_ticket_20px.png")));
        btnCreateTestSuite.setToolTipText("Create new test suite");

        javax.swing.GroupLayout pnlTestSuitesLayout = new javax.swing.GroupLayout(pnlTestSuites);
        pnlTestSuites.setLayout(pnlTestSuitesLayout);
        pnlTestSuitesLayout.setHorizontalGroup(
                pnlTestSuitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTestSuitesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtTestSuites)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOpenFolder)
                                .addGap(14, 14, 14)
                                .addComponent(btnCreateTestSuite)
                                .addContainerGap())
        );
        pnlTestSuitesLayout.setVerticalGroup(
                pnlTestSuitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTestSuitesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTestSuitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtTestSuites)
                                        .addGroup(pnlTestSuitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnCreateTestSuite)
                                                .addComponent(btnOpenFolder)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(treeTestSuites);

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
                pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlTestSuites, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
        );
        pnlLeftLayout.setVerticalGroup(
                pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlLeftLayout.createSequentialGroup()
                                .addComponent(pnlTestSuites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
        );

        panlMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

//        tblTestSteps.setModel(new javax.swing.table.DefaultTableModel(
//                new Object [][] {
//                        {null, null, null},
//                        {null, null, null},
//                        {null, null, null},
//                        {null, null, null},
//                        {null, null, null},
//                        {null, null, null},
//                        {null, null, null},
//                        {null, null, null}
//                },
//                new String [] {
//                        "Title 1", "Title 2", "Title 3"
//                }
//        ));


        model.addColumn("Sno");
        model.addColumn("Command");
        model.addColumn("Target");
        model.addColumn("Value");
        tblTestSteps.setModel(model);

        jScrollPane1.setViewportView(tblTestSteps);
        UIDesign.table_ui_style_blue(tblTestSteps);
        //tblTestSteps.setModel(getCommandStepsModel());
        tblTestSteps.getSelectionModel().addListSelectionListener(new SelectionListener());

        btnAddTestStep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_plus_math_25px.png")));
        btnAddTestStep.setFocusPainted(false);
        btnAddTestStep.setBackground(new Color(240, 240, 240));
        btnAddTestStep.setBorder(null);
        btnAddTestStep.setToolTipText("Add new test step");

        btnDeleteTestStep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_trash_25px.png")));
        btnDeleteTestStep.setFocusPainted(false);
        btnDeleteTestStep.setBackground(new Color(240, 240, 240));
        btnDeleteTestStep.setBorder(null);
        btnDeleteTestStep.setToolTipText("Delete the current test steps");

        btnTestStepCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_copy_to_clipboard_25px.png")));
        btnTestStepCopy.setFocusPainted(false);
        btnTestStepCopy.setBackground(new Color(240, 240, 240));
        btnTestStepCopy.setBorder(null);
        btnTestStepCopy.setToolTipText("Copy the current test steps");

        btnTestStepPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_paste_25px.png")));
        btnTestStepPaste.setFocusPainted(false);
        btnTestStepPaste.setBackground(new Color(240, 240, 240));
        btnTestStepPaste.setBorder(null);
        btnTestStepPaste.setToolTipText("Paste the copied test steps as the next step of the current one");

        btnTestStepUP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_up_squared_25px.png")));
        btnTestStepUP.setFocusPainted(false);
        btnTestStepUP.setBackground(new Color(240, 240, 240));
        btnTestStepUP.setBorder(null);
        btnTestStepUP.setToolTipText("Move Up the current test steps");

        btnTestStepDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_drop_down_25px.png")));
        btnTestStepDown.setFocusPainted(false);
        btnTestStepDown.setBackground(new Color(240, 240, 240));
        btnTestStepDown.setBorder(null);
        btnTestStepDown.setToolTipText("Move Down the current test steps");

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_help_25px.png")));
       // btnHelp.setFocusPainted(false);
        btnHelp.setBackground(new Color(240, 240, 240));
        btnHelp.setBorder(null);
        btnHelp.setToolTipText("Help");

        javax.swing.GroupLayout panlMainLayout = new javax.swing.GroupLayout(panlMain);
        panlMain.setLayout(panlMainLayout);
        panlMainLayout.setHorizontalGroup(
                panlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(panlMainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAddTestStep, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteTestStep, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTestStepCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTestStepPaste, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnTestStepUP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTestStepDown, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHelp)
                                .addContainerGap())
        );
        panlMainLayout.setVerticalGroup(
                panlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panlMainLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                .addGap(9, 9, 9)
                                .addGroup(panlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAddTestStep)
                                        .addComponent(btnDeleteTestStep)
                                        .addComponent(btnTestStepCopy)
                                        .addComponent(btnTestStepPaste)
                                        .addComponent(btnTestStepUP)
                                        .addComponent(btnTestStepDown)
                                        .addComponent(btnHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pnlControls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        listCommand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        //listCommand.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 204), java.awt.Color.darkGray, new java.awt.Color(51, 0, 255), null));

        txtCommand.setFont(new java.awt.Font("Calibri", 0, 16));
        txtCommand.setText("Command: ");

        txtValue.setFont(new java.awt.Font("Calibri", 0, 16));
        txtValue.setText("Value: ");

        txtTarget.setFont(new java.awt.Font("Calibri", 0, 16));
        txtTarget.setText("Target: ");

        inputValue.setFont(new java.awt.Font("Tahoma", 0, 13));
        inputValue.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 255), java.awt.Color.pink, null, null));

        btnFindObject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_paid_search_25px.png")));
        btnFindObject.setFocusPainted(false);
        btnFindObject.setBackground(new Color(240, 240, 240));
        btnFindObject.setBorder(null);
        btnFindObject.setToolTipText("Find target in page");

        btnCommentCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_unavailable_25px.png")));
        btnCommentCode.setFocusPainted(false);
        btnCommentCode.setBackground(new Color(240, 240, 240));
        btnCommentCode.setBorder(null);
        btnCommentCode.setToolTipText("Enable/Disable command");

        inputTarget.setFont(new java.awt.Font("Tahoma", 0, 13));
        inputTarget.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 255), java.awt.Color.pink, null, null));

        javax.swing.GroupLayout pnlControlsLayout = new javax.swing.GroupLayout(pnlControls);
        pnlControls.setLayout(pnlControlsLayout);
        pnlControlsLayout.setHorizontalGroup(
                pnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlControlsLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(pnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCommand)
                                        .addComponent(txtTarget)
                                        .addComponent(txtValue))
                                .addGap(18, 18, 18)
                                .addGroup(pnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inputValue)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlsLayout.createSequentialGroup()
                                                .addGroup(pnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(listCommand, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(inputTarget, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnFindObject, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnCommentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlControlsLayout.setVerticalGroup(
                pnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlControlsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCommand, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(listCommand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                        .addComponent(btnCommentCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addGroup(pnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtTarget)
                                                .addComponent(inputTarget, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                                        .addComponent(btnFindObject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inputValue, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                                .addGap(22, 22, 22))
        );

        pnlLog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout tabLogLayout = new javax.swing.GroupLayout(tabLog);
        tabLog.setLayout(tabLogLayout);
        tabLogLayout.setHorizontalGroup(
                tabLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 725, Short.MAX_VALUE)
        );
        tabLogLayout.setVerticalGroup(
                tabLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 118, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Log", tabLog);

        javax.swing.GroupLayout tabScreenshotsLayout = new javax.swing.GroupLayout(tabScreenshots);
        tabScreenshots.setLayout(tabScreenshotsLayout);
        tabScreenshotsLayout.setHorizontalGroup(
                tabScreenshotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 725, Short.MAX_VALUE)
        );
        tabScreenshotsLayout.setVerticalGroup(
                tabScreenshotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 118, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("ScreenShots", tabScreenshots);

        javax.swing.GroupLayout tabReportsLayout = new javax.swing.GroupLayout(tabReports);
        tabReports.setLayout(tabReportsLayout);
        tabReportsLayout.setHorizontalGroup(
                tabReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 725, Short.MAX_VALUE)
        );
        tabReportsLayout.setVerticalGroup(
                tabReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 118, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Reports", tabReports);

        javax.swing.GroupLayout tabConfigLayout = new javax.swing.GroupLayout(tabConfig);
        tabConfig.setLayout(tabConfigLayout);
        tabConfigLayout.setHorizontalGroup(
                tabConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 725, Short.MAX_VALUE)
        );
        tabConfigLayout.setVerticalGroup(
                tabConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 118, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Config", tabConfig);

        javax.swing.GroupLayout pnlLogLayout = new javax.swing.GroupLayout(pnlLog);
        pnlLog.setLayout(pnlLogLayout);
        pnlLogLayout.setHorizontalGroup(
                pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1)
        );
        pnlLogLayout.setVerticalGroup(
                pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jTabbedPane1))
        );

        pnlScore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtPassed.setFont(new java.awt.Font("Tahoma", 1, 11));
        txtPassed.setText("Passed:");

        txtPassedCount.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtPassedCount.setForeground(new java.awt.Color(0, 153, 51));
        txtPassedCount.setText("0");

        txtFailed.setFont(new java.awt.Font("Tahoma", 1, 11));
        txtFailed.setText("Failed:");

        txtFailedCount.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtFailedCount.setForeground(new java.awt.Color(255, 0, 0));
        txtFailedCount.setText("0");

        javax.swing.GroupLayout pnlScoreLayout = new javax.swing.GroupLayout(pnlScore);
        pnlScore.setLayout(pnlScoreLayout);
        pnlScoreLayout.setHorizontalGroup(
                pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlScoreLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txtPassed)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassedCount)
                                .addGap(23, 23, 23)
                                .addComponent(txtFailed)
                                .addGap(18, 18, 18)
                                .addComponent(txtFailedCount)
                                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlScoreLayout.setVerticalGroup(
                pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlScoreLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtPassed)
                                        .addComponent(txtPassedCount)
                                        .addComponent(txtFailed)
                                        .addComponent(txtFailedCount))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlLog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnlScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(panlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnlControls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(panlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(0, 0, 0)
                                                .addComponent(pnlControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(0, 0, 0)
                                                .addComponent(pnlScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnRecordActionPerformed(java.awt.event.ActionEvent evt) {
        if(recordFlag){
            recordFlag = false;
            btnRecord.setForeground(new java.awt.Color(222, 31, 38));
            btnRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/record_28.png")));
            btnRecord.setFocusPainted(false);
            btnRecord.setBackground(new Color(240, 240, 240));
            btnRecord.setText("Record");

            try {
                Platform.exit();
                newTest = new NewTest();


            }catch (Exception e){
                e.printStackTrace();
            }

        } else{
            recordFlag = true;
            btnRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/record_Stop_28.png")));
            btnRecord.setForeground(new java.awt.Color(34, 177, 76));
            btnRecord.setBackground(new Color(214, 248, 224));
            btnRecord.setText("Stop");
           // flashColor(btnRecord,new Color(34, 177, 76));

            setBaseURL =new SetBaseURL();
            setBaseURL.setVisible(true);


        }
    }

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnRunAllActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnAddTestStepActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnDeleteTestStepActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnTestStepCopyActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnTestStepPasteActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnTestStepUPActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnTestStepDownActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnCommentCodeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnFindObjectActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }




    private void flashColor(JButton button, Color color ) {
        Color origColor = button.getBackground();
        System.out.println("oriColor::"+origColor);
        for(int k=0;k<=100;k++){
            System.out.println("Color::"+color);
            button.setBackground( color );
            System.out.println("getcoor::"+button.getBackground());
            pause( 20 );
            button.setBackground( origColor );
            pause( 20 );
        }

    }
    private void pause( int time ) {
        try{
            Thread.sleep( time );
        } catch (InterruptedException ie ) {
            // doNothing
        }
    }



//    public ViewCommandStepsTableModel getCommandStepsModel() {
//        int x=0;
//        String command=null;
//        String target=null;
//        String value=null;
//
//        List<ViewCommandStepsTable> viewCommands = new ArrayList<ViewCommandStepsTable>();
//
//        return viewCommandStepsTableModel;
//    }

    class SelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {


        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recorder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAddTestStep;
    private javax.swing.JButton btnCommentCode;
    private javax.swing.JLabel btnCreateTestSuite;
    private javax.swing.JButton btnDeleteTestStep;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnFindObject;
    private javax.swing.JLabel btnHelp;
    private javax.swing.JButton btnNew;
    private javax.swing.JLabel btnOpenFolder;
    private javax.swing.JButton btnRecord;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnRunAll;
    private javax.swing.JButton btnTestStepCopy;
    private javax.swing.JButton btnTestStepDown;
    private javax.swing.JButton btnTestStepPaste;
    private javax.swing.JButton btnTestStepUP;
    private javax.swing.JLabel imgCignitiLogo;
    private javax.swing.JTextField inputTarget;
    private javax.swing.JTextField inputValue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox listCommand;
    private javax.swing.JPanel panlMain;
    private javax.swing.JPanel pnlControls;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlLog;
    private javax.swing.JPanel pnlScore;
    private javax.swing.JPanel pnlTestSuites;
    private javax.swing.JPanel tabConfig;
    private javax.swing.JPanel tabLog;
    private javax.swing.JPanel tabReports;
    private javax.swing.JPanel tabScreenshots;
    private javax.swing.JTable tblTestSteps;
    private javax.swing.JTree treeTestSuites;
    private javax.swing.JLabel txtCommand;
    private javax.swing.JLabel txtFailed;
    private javax.swing.JLabel txtFailedCount;
    private javax.swing.JLabel txtPassed;
    private javax.swing.JLabel txtPassedCount;
    private javax.swing.JLabel txtTarget;
    private javax.swing.JLabel txtTestSuites;
    private javax.swing.JLabel txtValue;
    // End of variables declaration
}
