package loan.collection.and.recovery.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CustomerManagement extends javax.swing.JFrame {
private PreparedStatement ps;
private Connection conn;
    
    public CustomerManagement() {
        
        initComponents();
        setLocationRelativeTo(null);
        connectDB();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCustomerNo = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerSalary = new javax.swing.JTextField();
        btnAddRecord = new javax.swing.JButton();
        btnShowRecord = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtShowAllRecord = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LOAN COLLECTION AND RECOVERY SERVICES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Customer No");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Customer Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Customer Salary");

        txtCustomerNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCustomerNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNoActionPerformed(evt);
            }
        });

        txtCustomerName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtCustomerSalary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnAddRecord.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddRecord.setText("Add Record");
        btnAddRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecordActionPerformed(evt);
            }
        });

        btnShowRecord.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnShowRecord.setText("Show Record");
        btnShowRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowRecordActionPerformed(evt);
            }
        });

        txtShowAllRecord.setColumns(20);
        txtShowAllRecord.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtShowAllRecord.setRows(5);
        jScrollPane1.setViewportView(txtShowAllRecord);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCustomerSalary, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddRecord)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowRecord)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(txtCustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4))
                            .addComponent(txtCustomerSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShowRecord)
                            .addComponent(btnAddRecord)
                            .addComponent(btnBack)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
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

    private void txtCustomerNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNoActionPerformed

    private void btnAddRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecordActionPerformed
        boolean result=validateInputs();
        if(!result){
            JOptionPane.showMessageDialog(null,"Please fill all the value");
            return;
        }
        try{
            String cNo=txtCustomerNo.getText();
            String cusName=txtCustomerName.getText();
            String cusSal=txtCustomerSalary.getText();
            
            int cusNo=Integer.parseInt(cNo);
            double CusSal=Double.parseDouble(cusSal);
            
            ps.setInt(1,cusNo);
            ps.setString(2,cusName);
            ps.setDouble(3,CusSal);
            int count=ps.executeUpdate();
            if(count==1)
            {
                JOptionPane.showMessageDialog(null,"Record inserted Succussfully");
                txtCustomerNo.setText("");
                txtCustomerName.setText("");
                txtCustomerSalary.setText("");
                txtCustomerNo.requestFocus();
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
    }//GEN-LAST:event_btnAddRecordActionPerformed

    private void btnShowRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowRecordActionPerformed
        try{
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("Select *from customer order by CusNo");
            StringBuilder sb=new StringBuilder();
            txtShowAllRecord.setText("");
            while(rs.next())
            {
                int CusNo=rs.getInt(1);
                String CusName=rs.getString(2);
                double CusSal=rs.getDouble(3);
                sb.append(CusNo+"\t"+CusName+"\t"+CusSal+"\n");
            }
            txtShowAllRecord.setText(sb.toString());
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnShowRecordActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        optionsFrame  opFrame=new optionsFrame();
        opFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRecord;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnShowRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCustomerNo;
    private javax.swing.JTextField txtCustomerSalary;
    private javax.swing.JTextArea txtShowAllRecord;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs() {
        if(txtCustomerNo.getText().isEmpty() || txtCustomerName.getText().isEmpty() || txtCustomerSalary.getText().isEmpty())
            return false;
        return true;
    }

    private void connectDB() {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-URC4K6K5:1522/xe","LOAN","Loan");
            ps=conn.prepareStatement("Insert into customer values(?,?,?)");
            JOptionPane.showMessageDialog(null,"Connected to the DB");
            
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Cannot connect to the DB");
            ex.printStackTrace();
        }
        
    }
}
