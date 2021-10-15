
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddCustomer extends javax.swing.JFrame
{
    public Connection conn = null;
    Statement stmt=null;
    public Connection getConn()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1234");
        }
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
        }
       
        return conn;
    }
        
        public AddCustomer()
        {
        initComponents();
        getConn();
        setTitle("SuperMarket Billing System");  ////Title
        this.setLocationRelativeTo(null); //display form to center
        AutocId();
        }
        
   void AutocId()
        {
            int id=1;
        String sql="SELECT MAX(\"Customer_Id\") FROM \"Customer\"";
        try
        {
        Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                id=rs.getInt(1) +1;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        String Id=Integer.toString(id);
        TxtCuId.setText(Id);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblCuId = new javax.swing.JLabel();
        LblCuName = new javax.swing.JLabel();
        LblPhone = new javax.swing.JLabel();
        LblAddr = new javax.swing.JLabel();
        TxtCuId = new javax.swing.JTextField();
        TxtCuName = new javax.swing.JTextField();
        TxtPhone = new javax.swing.JTextField();
        TxtAddr = new javax.swing.JTextField();
        BtnAdd = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(210, 226, 229));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 400));

        LblCuId.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        LblCuId.setText("Customer Id");

        LblCuName.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        LblCuName.setText("Customer Name");

        LblPhone.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        LblPhone.setText("Phone No");

        LblAddr.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        LblAddr.setText("Address");

        TxtCuId.setBackground(new java.awt.Color(245, 246, 246));
        TxtCuId.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        TxtCuName.setBackground(new java.awt.Color(245, 246, 246));
        TxtCuName.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        TxtPhone.setBackground(new java.awt.Color(245, 246, 246));
        TxtPhone.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        TxtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPhoneActionPerformed(evt);
            }
        });

        TxtAddr.setBackground(new java.awt.Color(245, 246, 246));
        TxtAddr.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        TxtAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAddrActionPerformed(evt);
            }
        });

        BtnAdd.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BtnAdd.setText("Add");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnBack.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lithos Pro Regular", 2, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(35, 141, 163));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add Customer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblCuName)
                            .addComponent(LblCuId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblAddr, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtCuId)
                            .addComponent(TxtCuName)
                            .addComponent(TxtPhone)
                            .addComponent(TxtAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCuId)
                    .addComponent(TxtCuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCuName)
                    .addComponent(TxtCuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPhone)
                    .addComponent(TxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblAddr)
                    .addComponent(TxtAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdd)
                    .addComponent(BtnBack))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddrActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        try
        {
            stmt=conn.createStatement();
            String sql="INSERT INTO \"Customer\" VALUES("+TxtCuId.getText()+",'"+TxtCuName.getText()+"',"+TxtPhone.getText()+", '"+TxtAddr.getText()+"')";
            int i=stmt.executeUpdate(sql);
            if(i==1)
            JOptionPane.showMessageDialog(null,"Added Succesfully");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        this.hide();
    }//GEN-LAST:event_BtnBackActionPerformed

    private void TxtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPhoneActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnBack;
    private javax.swing.JLabel LblAddr;
    private javax.swing.JLabel LblCuId;
    private javax.swing.JLabel LblCuName;
    private javax.swing.JLabel LblPhone;
    private javax.swing.JTextField TxtAddr;
    private javax.swing.JTextField TxtCuId;
    private javax.swing.JTextField TxtCuName;
    private javax.swing.JTextField TxtPhone;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
