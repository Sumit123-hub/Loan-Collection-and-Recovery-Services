package loan.collection.and.recovery.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LoanDepartment extends javax.swing.JFrame {
private PreparedStatement ps;
private Connection conn;

    double loan;
    double interest;
    double month;
    double payment;
    double MonthPayment;
    String name;
    String AccountType;
    String address;
    String withdrawal;
    String deposit;
    String overDraftRequired;

    public LoanDepartment() {
        initComponents();
        setLocationRelativeTo(null);
        connectDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtAmountloan = new javax.swing.JTextField();
        jtxtInterestRate = new javax.swing.JTextField();
        jtxtNumberofPayment = new javax.swing.JTextField();
        jtxtMonthPayment = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtAddress = new javax.swing.JTextField();
        jtxtFname = new javax.swing.JTextField();
        jtxtAccountType = new javax.swing.JTextField();
        jtxtWithdrawal = new javax.swing.JTextField();
        jtxtOverDraft = new javax.swing.JTextField();
        jtxtDeposit = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jExit = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jCalculate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jBtnAddLoanRecord = new javax.swing.JButton();
        jBtnShowLoanRecord = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLoanReport = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jShowLoanRecord = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Amount of Loan");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Number of Payments");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Monthaly Payment");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Interest Rate");

        jtxtAmountloan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jtxtInterestRate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jtxtNumberofPayment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jtxtMonthPayment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtMonthPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMonthPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtxtAmountloan)
                        .addComponent(jtxtInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtxtNumberofPayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtMonthPayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtAmountloan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtNumberofPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jtxtMonthPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Full Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Withdrawal");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Account Type");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Overdraft Required?");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Deposit");

        jtxtAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jtxtFname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFnameActionPerformed(evt);
            }
        });

        jtxtAccountType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jtxtWithdrawal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jtxtOverDraft.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jtxtDeposit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(142, 142, 142)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtFname)
                    .addComponent(jtxtAddress)
                    .addComponent(jtxtAccountType)
                    .addComponent(jtxtWithdrawal)
                    .addComponent(jtxtDeposit)
                    .addComponent(jtxtOverDraft, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addGap(95, 95, 95))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtWithdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtOverDraft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jExit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });

        jReset.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jReset.setText("Reset");
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });

        jCalculate.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jCalculate.setText("Loan Calculate");
        jCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalculateActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jBtnAddLoanRecord.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jBtnAddLoanRecord.setText("Add Loan Record");
        jBtnAddLoanRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddLoanRecordActionPerformed(evt);
            }
        });

        jBtnShowLoanRecord.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jBtnShowLoanRecord.setText("Show Loan Record");
        jBtnShowLoanRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnShowLoanRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jBtnAddLoanRecord)
                .addGap(18, 18, 18)
                .addComponent(jBtnShowLoanRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jReset, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAddLoanRecord)
                    .addComponent(jBtnShowLoanRecord))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel11.setText("LOAN COLLECTION AND RECOVERY SERVICES");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLoanReport.setColumns(20);
        jLoanReport.setRows(5);
        jScrollPane1.setViewportView(jLoanReport);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jShowLoanRecord.setColumns(20);
        jShowLoanRecord.setRows(5);
        jScrollPane2.setViewportView(jShowLoanRecord);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(31, 31, 31))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtMonthPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMonthPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMonthPaymentActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jExitActionPerformed

    private void jCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalculateActionPerformed

//////////////////////////////////////////////////////////////               
        if (jtxtAmountloan.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You must enter amount of loan to borrow", "Loan Collection System", JOptionPane.INFORMATION_MESSAGE);
        } else {
            loan = Double.parseDouble(jtxtAmountloan.getText());
            String Balance = String.format(jtxtAmountloan.getText());
        }

////////////////////////////////////////////////////////////
        if (jtxtInterestRate.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You must enter the amount of Interest",
                    "Loan Collection System", JOptionPane.INFORMATION_MESSAGE);
        } else {
            interest = Double.parseDouble(jtxtInterestRate.getText());
            String iInterest = String.format(jtxtInterestRate.getText());
        }
        
////////////////////////////////////////////////////////////
        if (jtxtNumberofPayment.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You must enter the amount of Number of Payment",
                    "Loan Collection System", JOptionPane.INFORMATION_MESSAGE);
        } else {
            month = Double.parseDouble(jtxtNumberofPayment.getText());
            String iMonth = String.format(jtxtNumberofPayment.getText());
        }
        
///////////////////////////////////////////////////////////

        if (jtxtMonthPayment.getText().equals("")) {
            JOptionPane.showMessageDialog(null,JOptionPane.INFORMATION_MESSAGE);
        } else {
            loan = Double.parseDouble(jtxtMonthPayment.getText());
            String iMonthPayment = String.format(jtxtMonthPayment.getText()); //txtMonthPayemnt
        }
        
///////////////////////////////////////////////////////////////
        payment = loan + ((loan * interest) / 100);
        MonthPayment=payment/month;
        String PayMonth=String.format("%.2f",MonthPayment);
        jtxtMonthPayment.setText(PayMonth);
        
        name=String.format(jtxtFname.getText());
        address=String.format(jtxtAddress.getText());
        AccountType=String.format(jtxtAccountType.getText());
        withdrawal=String.format(jtxtWithdrawal.getText());
        deposit=String.format(jtxtDeposit.getText());
        overDraftRequired=String.format(jtxtOverDraft.getText());


        jLoanReport.append("\t\t\tLoan Collection and Recovery Services:\n\n"+
                "\n Customer's Name:-\t"+name+
                "\n Address:-\t\t"+ address+
                "\n Account Type:-\t\t"+ AccountType +
                "\n Withdrawal:-\t\t"+ withdrawal+
                "\n Deposit:\t\t"+ deposit+
                "\n OverdraftRequired:\t"+ overDraftRequired+
                "\n Amount Of Loan:\t"+ loan + 
                "\n Number of Payment:\t"+interest + 
                "\n Number of Month for Payment:\t"+ month +
                "\n Payment Per Month:\t"+MonthPayment+
                "\n Total Loan Payment:\t"+payment+
                "\n\nThanks for using this Application");
/////////////////////////////////////////////////////////////
    }//GEN-LAST:event_jCalculateActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        jtxtAmountloan.setText("");
        jtxtInterestRate.setText("");
        jtxtNumberofPayment.setText("");
        jtxtMonthPayment.setText("");
        jtxtFname.setText("");
        jtxtAddress.setText("");
        jtxtAccountType.setText("");
        jtxtWithdrawal.setText("");
        jtxtDeposit.setText("");
        jtxtOverDraft.setText("");
        
    }//GEN-LAST:event_jResetActionPerformed

    private void jtxtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFnameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        optionsFrame  opFrame=new optionsFrame();
        opFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jBtnAddLoanRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddLoanRecordActionPerformed
        boolean result=validateInputs();
        if(!result){
            JOptionPane.showMessageDialog(null,"Please fill all the value");
            return;
        }
        try{
            String cusNm=jtxtFname.getText();
            String cusAddress=jtxtAddress.getText();
            String cusAccountType=jtxtAccountType.getText();
            String cusWithdrawal=jtxtWithdrawal.getText();
            String cusDeposit=jtxtDeposit.getText();
            String cusOverDraft=jtxtOverDraft.getText();
            String cusAmountloan=jtxtAmountloan.getText();
            String cusNumberofPayment=jtxtNumberofPayment.getText();
            
            double cusWid=Double.parseDouble(cusWithdrawal);
            double cusDep=Double.parseDouble(cusDeposit);
            double cusOver=Double.parseDouble(cusOverDraft);
            double cusAmtLoan=Double.parseDouble(cusAmountloan);
            double cusNumberPay=Double.parseDouble(cusNumberofPayment);
                        
            ps.setString(1,cusNm);
            ps.setString(2,cusAddress);
            ps.setString(3,cusAccountType);
            ps.setDouble(4,cusWid);
            ps.setDouble(5,cusDep);
            ps.setDouble(6,cusOver);
            ps.setDouble(7,cusAmtLoan);
            ps.setDouble(8,cusNumberPay);
            
            int count=ps.executeUpdate();
            if(count==1)
            {
                JOptionPane.showMessageDialog(null,"Record inserted Succussfully");
                jtxtFname.setText("");
                jtxtAddress.setText("");
                jtxtAccountType.setText("");
                jtxtWithdrawal.setText("");
                jtxtDeposit.setText("");
                jtxtOverDraft.setText("");
                jtxtAmountloan.setText("");
                jtxtNumberofPayment.setText("");
            }
            else
            JOptionPane.showMessageDialog(null,"Some problem occur");
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Please input digit");
            ex.printStackTrace();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jBtnAddLoanRecordActionPerformed

    private void jBtnShowLoanRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnShowLoanRecordActionPerformed
        try{
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("Select *from loanDepartment order by CusNm");
            StringBuilder sb=new StringBuilder();
            jShowLoanRecord.setText("");
            while(rs.next())
            {
                String cusNm=rs.getString(1);
                String cusAddress=rs.getString(2);
                String cusAccountType=rs.getString(3);
                double cusWid=rs.getDouble(4);
                double cusDep=rs.getDouble(5);
                double cusOver=rs.getDouble(6);
                double cusAmtLoan=rs.getDouble(7);
                double cusNumberPay=rs.getDouble(8);
                sb.append(cusNm+"\t"+cusAddress+"\t"+cusAccountType+"\t"+cusWid+"\t"+cusDep+"\t"+cusOver+"\t"+cusAmtLoan+"\t"+cusNumberPay+"\n");
            }
            jShowLoanRecord.setText(sb.toString());
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jBtnShowLoanRecordActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanDepartment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jBtnAddLoanRecord;
    private javax.swing.JButton jBtnShowLoanRecord;
    private javax.swing.JButton jCalculate;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextArea jLoanReport;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jShowLoanRecord;
    private javax.swing.JTextField jtxtAccountType;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtAmountloan;
    private javax.swing.JTextField jtxtDeposit;
    private javax.swing.JTextField jtxtFname;
    private javax.swing.JTextField jtxtInterestRate;
    private javax.swing.JTextField jtxtMonthPayment;
    private javax.swing.JTextField jtxtNumberofPayment;
    private javax.swing.JTextField jtxtOverDraft;
    private javax.swing.JTextField jtxtWithdrawal;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs() {
        if(jtxtFname.getText().isEmpty() 
                || jtxtAddress.getText().isEmpty() 
                || jtxtAccountType.getText().isEmpty() 
                || jtxtWithdrawal.getText().isEmpty()
                || jtxtDeposit.getText().isEmpty() 
                || jtxtOverDraft.getText().isEmpty() 
                || jtxtAmountloan.getText().isEmpty()
                || jtxtNumberofPayment.getText().isEmpty())
            return false;
        return true;
    }

    private void connectDB() {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-URC4K6K5:1522/xe","LOAN","Loan");
            ps=conn.prepareStatement("Insert into loanDepartment values(?,?,?,?,?,?,?,?)");
            JOptionPane.showMessageDialog(null,"Connected to the DB");
            
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Cannot connect to the DB");
            ex.printStackTrace();
        }
        
    }
        
    }

