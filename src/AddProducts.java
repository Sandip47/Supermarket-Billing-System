import java.sql.*;
import javax.swing.*;

public class AddProducts extends javax.swing.JFrame {
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
        
        public AddProducts() {
        initComponents();
        getConn();
        setTitle("SuperMarket Billing System");
        this.setLocationRelativeTo(null);
        AutopId();
    }
        
   void AutopId()
        {
            int id=1;
        String sql="SELECT MAX(\"Product_Id\") FROM \"Products\"";
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
        TxtProductId.setText(Id);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblProductId = new javax.swing.JLabel();
        LblProductName = new javax.swing.JLabel();
        LblQuantity = new javax.swing.JLabel();
        LblPrice = new javax.swing.JLabel();
        TxtProductId = new javax.swing.JTextField();
        TxtProductName = new javax.swing.JTextField();
        TxtQuantity = new javax.swing.JTextField();
        TxtPrice = new javax.swing.JTextField();
        BtnAddPr = new javax.swing.JButton();
        BtnBackPr = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(210, 226, 229));

        LblProductId.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        LblProductId.setText("Product Id");

        LblProductName.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        LblProductName.setText("Product Name");

        LblQuantity.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        LblQuantity.setText("Quantity");

        LblPrice.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        LblPrice.setText("Price");

        TxtProductId.setBackground(new java.awt.Color(245, 246, 246));
        TxtProductId.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        TxtProductName.setBackground(new java.awt.Color(245, 246, 246));
        TxtProductName.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        TxtQuantity.setBackground(new java.awt.Color(245, 246, 246));
        TxtQuantity.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        TxtPrice.setBackground(new java.awt.Color(245, 246, 246));
        TxtPrice.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        TxtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPriceActionPerformed(evt);
            }
        });

        BtnAddPr.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BtnAddPr.setText("Add");
        BtnAddPr.setBorder(null);
        BtnAddPr.setBorderPainted(false);
        BtnAddPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddPrActionPerformed(evt);
            }
        });

        BtnBackPr.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BtnBackPr.setText("Back");
        BtnBackPr.setBorder(null);
        BtnBackPr.setBorderPainted(false);
        BtnBackPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackPrActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lithos Pro Regular", 2, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 141, 163));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add PRODUCT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblProductName)
                            .addComponent(LblQuantity)
                            .addComponent(LblPrice)
                            .addComponent(LblProductId))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtProductId)
                            .addComponent(TxtProductName)
                            .addComponent(TxtQuantity)
                            .addComponent(TxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnAddPr, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(BtnBackPr, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblProductId)
                    .addComponent(TxtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblProductName)
                    .addComponent(TxtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblQuantity)
                    .addComponent(TxtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPrice)
                    .addComponent(TxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAddPr, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBackPr, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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

    private void BtnBackPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackPrActionPerformed
        dispose();
    }//GEN-LAST:event_BtnBackPrActionPerformed

    private void TxtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPriceActionPerformed

    }//GEN-LAST:event_TxtPriceActionPerformed

    private void BtnAddPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddPrActionPerformed
    try
        {
            stmt=conn.createStatement();
            String sql="INSERT INTO \"Products\" VALUES("+TxtProductId.getText()+",'"+TxtProductName.getText()+"',"+TxtQuantity.getText()+", "+TxtPrice.getText()+")";
            int i=stmt.executeUpdate(sql);
            if(i==1)
                JOptionPane.showMessageDialog(null,"Added Succesfully");
            TxtProductId.setText("");
            TxtProductName.setText("");
            TxtQuantity.setText("");
            TxtPrice.setText("");
        }
        catch (Exception ex)
        {
              JOptionPane.showMessageDialog(null,ex);  
        }
        
    }//GEN-LAST:event_BtnAddPrActionPerformed
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new AddProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddPr;
    private javax.swing.JButton BtnBackPr;
    private javax.swing.JLabel LblPrice;
    private javax.swing.JLabel LblProductId;
    private javax.swing.JLabel LblProductName;
    private javax.swing.JLabel LblQuantity;
    private javax.swing.JTextField TxtPrice;
    private javax.swing.JTextField TxtProductId;
    private javax.swing.JTextField TxtProductName;
    private javax.swing.JTextField TxtQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}