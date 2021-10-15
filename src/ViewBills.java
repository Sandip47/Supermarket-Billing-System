
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewBills extends javax.swing.JFrame
{    
    public ArrayList<Bill> BillList()
    {
        ArrayList<Bill> BillsList = new ArrayList<>();
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1234");
            String query1 = "SELECT * FROM \"Bill\" ORDER BY \"Bill_No\";";
            Statement st = conn.createStatement();
            ResultSet rs= st.executeQuery(query1);
            Bill Bill;
            while(rs.next())
            {
                Bill=new Bill(rs.getString("Bill_No"), rs.getString("Date"),rs.getString("Time"),rs.getString("Customer_Name"),rs.getString("Customer_Phone"),rs.getString("Total_Quantity"),rs.getString("Total_Price"),rs.getString("Cashier"));
                BillsList.add(Bill);
            }
        } 
        catch (Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex);
        }
        return BillsList;
    }
    
    public void Show_Bills()
    {
        ArrayList<Bill> list = BillList();
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        Object[] row = new Object[8];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getBill_No();
            row[1]=list.get(i).getDate();
            row[2]=list.get(i).getTime();
            row[3]=list.get(i).getCustomer_Name();
            row[4]=list.get(i).getCustomer_Phone();
            row[5]=list.get(i).getTotal_Quantity();
            row[6]=list.get(i).getTotal_Price();
            row[7]=list.get(i).getCashier();
            model.addRow(row);
        }
    }

    public ViewBills()
    {
        initComponents();
        setTitle("SuperMarket Billing System");
        this.setLocationRelativeTo(null);
        Show_Bills();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(210, 226, 229));

        jLabel1.setFont(new java.awt.Font("Lithos Pro Regular", 2, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 141, 163));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BILL DATABASE");

        jTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill No", "Date", "Time", "Customer Name", "Customer Phone", "Total Quantity", "Total Price", "Cashier"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setRowHeight(25);
        jTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        jButtonBack.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addGap(117, 117, 117))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(ViewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBills().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables

}
class Bill
{
    private String Bill_No,Date,Time,Customer_Name,Customer_Phone,Total_Quantity,Total_Price,Cashier;    
    public Bill(String Bill_No,String Date,String Time,String Customer_Name,String Customer_Phone,String Total_Quantity,String Total_Price,String Cashier)
    {
        this.Bill_No=Bill_No;
        this.Date=Date;
        this.Time=Time;
        this.Customer_Name=Customer_Name;
        this.Customer_Phone=Customer_Phone;
        this.Total_Quantity=Total_Quantity;
        this.Total_Price=Total_Price;
        this.Cashier=Cashier;
    }
    public String getBill_No(){
        return Bill_No;
    }
    public String getDate(){
        return Date;
    }
    public String getTime(){
        return Time;
    }
    public String getCustomer_Name(){
        return Customer_Name;
    }
    public String getCustomer_Phone(){
        return Customer_Phone;
    }
    public String getTotal_Quantity(){
        return Total_Quantity;
    }
    public String getTotal_Price(){
        return Total_Price;
    }
    public String getCashier(){
        return Cashier;
    }
}