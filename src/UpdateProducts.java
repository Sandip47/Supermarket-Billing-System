
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class UpdateProducts extends javax.swing.JFrame {
    public Connection conn = null;
    Statement stmt=null;
    public Connection getConn()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1234");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        return conn;
    }
    public UpdateProducts()
    {
        initComponents();
        getConn();
        setTitle("SuperMarket Billing System");
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtPrice = new javax.swing.JTextField();
        BtnUpdatePr = new javax.swing.JButton();
        BtnBackPr = new javax.swing.JButton();
        LblProductId = new javax.swing.JLabel();
        LblProductName = new javax.swing.JLabel();
        LblQuantity = new javax.swing.JLabel();
        LblPrice = new javax.swing.JLabel();
        TxtProductId = new javax.swing.JTextField();
        TxtProductName = new javax.swing.JTextField();
        TxtQuantity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(210, 226, 229));

        TxtPrice.setBackground(new java.awt.Color(245, 246, 246));
        TxtPrice.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        TxtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPriceActionPerformed(evt);
            }
        });

        BtnUpdatePr.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BtnUpdatePr.setText("Update");
        BtnUpdatePr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdatePrActionPerformed(evt);
            }
        });

        BtnBackPr.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BtnBackPr.setText("Back");
        BtnBackPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackPrActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Lithos Pro Regular", 2, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 141, 163));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update PRODUCT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblProductName)
                            .addComponent(LblQuantity)
                            .addComponent(LblPrice)
                            .addComponent(LblProductId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtProductId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtProductName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnUpdatePr)
                        .addGap(178, 178, 178)
                        .addComponent(BtnBackPr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
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
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUpdatePr)
                    .addComponent(BtnBackPr))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPriceActionPerformed

    private void BtnUpdatePrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdatePrActionPerformed
        try {
            stmt=conn.createStatement();
            String sql="UPDATE \"Products\" SET \"Product_Name\" ='"+TxtProductName.getText()+"',\"Quantity\" ="+TxtQuantity.getText()+",\"Price\" ="+TxtPrice.getText()+" WHERE \"Product_Id\" ="+TxtProductId.getText()+"";
            int i=stmt.executeUpdate(sql);
            if(i==1)
            JOptionPane.showMessageDialog(null,"Updated Succesfully");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_BtnUpdatePrActionPerformed

    private void BtnBackPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackPrActionPerformed
        this.hide();
    }//GEN-LAST:event_BtnBackPrActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBackPr;
    private javax.swing.JButton BtnUpdatePr;
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
