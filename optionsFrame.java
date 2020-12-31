package loan.collection.and.recovery.services;

import javax.swing.JOptionPane;

public class optionsFrame extends javax.swing.JFrame {

    public optionsFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRCustomerManagement = new javax.swing.JRadioButton();
        jRLoanDepartment = new javax.swing.JRadioButton();
        jRQuit = new javax.swing.JRadioButton();
        jbtnDotask = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Welcome To the Loan Collection and Recovery Services");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setText("Select An Option");

        buttonGroup1.add(jRCustomerManagement);
        jRCustomerManagement.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRCustomerManagement.setText("Customer Management");

        buttonGroup1.add(jRLoanDepartment);
        jRLoanDepartment.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRLoanDepartment.setText("Loans Department");
        jRLoanDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRLoanDepartmentActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRQuit);
        jRQuit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRQuit.setText("Quit");
        jRQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRQuitActionPerformed(evt);
            }
        });

        jbtnDotask.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnDotask.setText("Do Task");
        jbtnDotask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(jbtnDotask, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRQuit)
                            .addComponent(jRLoanDepartment)
                            .addComponent(jRCustomerManagement))
                        .addGap(483, 483, 483))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(342, 342, 342))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jRCustomerManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRLoanDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRQuit)
                .addGap(31, 31, 31)
                .addComponent(jbtnDotask, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRLoanDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRLoanDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRLoanDepartmentActionPerformed

    private void jRQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRQuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRQuitActionPerformed

    private void jbtnDotaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotaskActionPerformed
        if(validateInput()==false)
        {
            JOptionPane.showMessageDialog(null, "Please make a selection first","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(jRCustomerManagement.isSelected())
        {
            CustomerManagement  addCus;
            addCus = new CustomerManagement();
            addCus.setVisible(true);
            this.dispose();
            
        }
        else if(jRLoanDepartment.isSelected())
        {
           LoanDepartment  LoanCus=new LoanDepartment();
           LoanCus.setVisible(true);
           this.dispose();  
        }
        
        else
        {
            JOptionPane.showMessageDialog(null,"Thank you for using the app!","Thanks",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

   
    }//GEN-LAST:event_jbtnDotaskActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new optionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRCustomerManagement;
    private javax.swing.JRadioButton jRLoanDepartment;
    private javax.swing.JRadioButton jRQuit;
    private javax.swing.JButton jbtnDotask;
    // End of variables declaration//GEN-END:variables

 private boolean validateInput() { {
        if(jRCustomerManagement.isSelected()==false && 
           jRLoanDepartment.isSelected()==false && 
                 jRQuit.isSelected()==false)
        {
            return false;
        }
        return true;
    }

}
}

