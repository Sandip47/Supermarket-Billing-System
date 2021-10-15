import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;

public class AddBill extends javax.swing.JFrame
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
    public AddBill()
    {
        initComponents();
        CurrentDate();
        setTitle("SuperMarket Billing System");
        this.setLocationRelativeTo(null);
        addImage();
        getConn();
        FilljComboAdmin();
        FilljComboProduct();
        AutoIncrement();
        
    }
    public void CurrentDate()
    {
        Calendar cal=new GregorianCalendar();
        int Year=cal.get(Calendar.YEAR);
        int Month=cal.get(Calendar.MONTH);
        int Day=cal.get(Calendar.DAY_OF_MONTH);
        LblDate.setText(Day+"/"+(Month+1)+"/"+Year);
        
        int Hour=cal.get(Calendar.HOUR);
        int Minute=cal.get(Calendar.MINUTE);
        int Second=cal
                .get(Calendar.SECOND);
        LblTime.setText(Hour+":"+Minute+":"+Second);
    }
    void addImage()
    {
        ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Billing System.png")));
        Image img1=myimage.getImage();
        Image img2=img1.getScaledInstance(LblImage.getWidth(),LblImage.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        LblImage.setIcon(i);
    }
    private void FilljComboAdmin()
    {   
        String Name1=null;
        String sql="SELECT * FROM \"Admin\"";
        try
        {
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                String name=rs.getString("Name");
                jComboBoxAdmin.addItem(name);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    private void FilljComboProduct()
    {   
        String Name1=null;
        String sql="SELECT * FROM \"Products\" ORDER BY \"Product_Name\"";
        try
        {
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                String name=rs.getString("Product_Name");
                jComboBoxProduct.addItem(name);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }    
    public void getTotalQty()
    {
        int sum=0;
        for(int i=0;i<jTable.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(jTable.getValueAt(i, 1).toString());
        }
        LblTotalQty.setText(Integer.toString(sum));
    }
    public void getTotalPrice()
    {
        int sum=0;
        for(int i=0;i<jTable.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(jTable.getValueAt(i, 3).toString());
        }
        LblTotalPrice.setText(Integer.toString(sum));
    }
    
    public void getQty()
    {
        int sum=0;
        for(int i=0;i<jTable.getRowCount(); i++)
        {
            sum = sum - Integer.parseInt(jTable.getValueAt(i, 1).toString());
        }
        LblTotalQty.setText(Integer.toString(-sum));
    }
    public void getPrice()
    {
        int sum=0;
        for(int i=0;i<jTable.getRowCount(); i++)
        {
            sum = sum - Integer.parseInt(jTable.getValueAt(i, 3).toString());
        }
        
        LblTotalPrice.setText(Integer.toString(-sum));
    }
    
    void AddStock()
    {
        int a=0;
        for(int i=0;i<jTable.getRowCount(); i++)
        {
            a= Integer.parseInt(jTable.getValueAt(i, 1).toString());
        }
        int b = Integer.parseInt(LblQuantity.getText());
        int c=b+a;
        String Q=Integer.toString(c);
        LblQuantity.setText(Q);
    }
    
    
    public void AutoIncrement()
    {
        int id=1;
        String sql="SELECT MAX(\"Bill_No\") FROM \"Bill\"";
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
        LblBill.setText(Integer.toString(id));
    }
    
    public void StockLeft()
    {
        int x = Integer.parseInt(LblQuantity.getText());
        int y = Integer.parseInt(TxtQuantity.getText());
        int total=x-y;
        
         if(total<=0)
        {
            JOptionPane.showMessageDialog(null," Product \'"+jComboBoxProduct.getSelectedItem().toString()+"\' is  Out of Stock","Warning...!",JOptionPane.WARNING_MESSAGE);
        }
        String s=Integer.toString(total);
        LblQuantity.setText(s);
    }
    
    public int StockAdd()
    {
        
        int x = Integer.parseInt(LblQuantity.getText());
        int y = Integer.parseInt(TxtQuantity.getText());
        int total=x-y;
        
        return total;
    }

    void update()
    {
        try {
            stmt=conn.createStatement();
            String sql="UPDATE \"Products\" SET \"Quantity\" ="+LblQuantity.getText()+" WHERE \"Product_Id\" ="+LblPrId.getText()+"";
            int i=stmt.executeUpdate(sql);
        }
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LblCAddress = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        LblCId = new javax.swing.JLabel();
        LblCName = new javax.swing.JLabel();
        LblCPhone = new javax.swing.JLabel();
        BtnExit = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        LblImage1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxAdmin = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtCuName = new javax.swing.JTextField();
        TxtPhone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TxtQuantity = new javax.swing.JTextField();
        TxtPrice = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        BtnAddCart = new javax.swing.JButton();
        jComboBoxProduct = new javax.swing.JComboBox<>();
        LblDate = new javax.swing.JLabel();
        LblTime = new javax.swing.JLabel();
        LblPrId = new javax.swing.JLabel();
        LblQuantity = new javax.swing.JLabel();
        LblBill = new javax.swing.JLabel();
        BtnClear = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        LblTotalQty = new javax.swing.JLabel();
        LblTotalPrice = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        BtnSave = new javax.swing.JButton();
        Printview = new javax.swing.JButton();
        BtnPrint = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(85, 197, 215));
        jPanel1.setLayout(null);
        jPanel1.add(LblImage);
        LblImage.setBounds(100, 120, 170, 140);

        jLabel1.setFont(new java.awt.Font("Lithos Pro Regular", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CASHIER DETAILS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 30, 300, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cashier Address :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 490, 180, 30);

        LblCAddress.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        LblCAddress.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LblCAddress);
        LblCAddress.setBounds(210, 490, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cashier Name :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 390, 160, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cashier Phone :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 440, 160, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cashier Id :");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(80, 340, 120, 30);

        LblCId.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        LblCId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LblCId);
        LblCId.setBounds(210, 340, 170, 30);

        LblCName.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        LblCName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LblCName);
        LblCName.setBounds(210, 390, 170, 30);

        LblCPhone.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        LblCPhone.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LblCPhone);
        LblCPhone.setBounds(210, 440, 170, 30);

        BtnExit.setBackground(new java.awt.Color(255, 255, 255));
        BtnExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(BtnExit);
        BtnExit.setBounds(220, 580, 130, 40);

        BtnBack.setBackground(new java.awt.Color(255, 255, 255));
        BtnBack.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBack);
        BtnBack.setBounds(40, 580, 130, 40);
        jPanel1.add(LblImage1);
        LblImage1.setBounds(100, 120, 170, 140);

        jPanel2.setBackground(new java.awt.Color(85, 197, 215));

        jLabel2.setBackground(new java.awt.Color(85, 197, 215));
        jLabel2.setFont(new java.awt.Font("Lithos Pro Regular", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRODUCT BILLING");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(210, 226, 229));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Cashier");

        jComboBoxAdmin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBoxAdmin.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxAdminPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAdminActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Customer Name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Customer Phone");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Bill No : ");
        jLabel10.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Date :");
        jLabel11.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Time :");
        jLabel12.setToolTipText("");

        TxtCuName.setBackground(new java.awt.Color(245, 246, 246));
        TxtCuName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TxtCuName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCuNameActionPerformed(evt);
            }
        });

        TxtPhone.setBackground(new java.awt.Color(245, 246, 246));
        TxtPhone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TxtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPhoneActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Products");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Product Id : ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Quantity");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("Price");

        TxtQuantity.setBackground(new java.awt.Color(245, 246, 246));
        TxtQuantity.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TxtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtQuantityActionPerformed(evt);
            }
        });

        TxtPrice.setBackground(new java.awt.Color(245, 246, 246));
        TxtPrice.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TxtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPriceActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setText("Stock Left : ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel19.setText("Add Cart");

        BtnAddCart.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BtnAddCart.setText("Add Cart");
        BtnAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddCartActionPerformed(evt);
            }
        });

        jComboBoxProduct.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBoxProduct.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxProductPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProductActionPerformed(evt);
            }
        });

        LblDate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        LblTime.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        LblPrId.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        LblQuantity.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        LblBill.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        LblBill.setForeground(new java.awt.Color(250, 41, 86));

        BtnClear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BtnClear.setText("Clear");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel21.setText("Remove Cart");

        Area.setColumns(20);
        Area.setRows(5);
        jScrollPane2.setViewportView(Area);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(TxtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel14))
                            .addComponent(TxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(218, 218, 218)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(6, 6, 6)
                                .addComponent(LblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(38, 38, 38)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BtnAddCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblBill, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(TxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(TxtCuName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblPrId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(518, 518, 518))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)
                                .addComponent(LblBill, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LblDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LblTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jComboBoxAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TxtCuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(TxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jComboBoxProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addComponent(LblPrId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(LblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(TxtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(BtnAddCart))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(TxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(BtnClear)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Quantity", "Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setRowHeight(20);
        jScrollPane1.setViewportView(jTable);

        jPanel4.setBackground(new java.awt.Color(210, 226, 229));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel22.setText("Total Quantity : ");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel23.setText("Total Price : ");

        LblTotalQty.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        LblTotalPrice.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Save Bill");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setText("Print Recepit");

        BtnSave.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        Printview.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Printview.setText("View");
        Printview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintviewvActionPerformed(evt);
            }
        });

        BtnPrint.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BtnPrint.setText("Print");
        BtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrintActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel25.setText("Print View");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblTotalQty, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Printview)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSave)
                    .addComponent(BtnPrint))
                .addGap(99, 99, 99))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblTotalQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7))
                    .addComponent(BtnSave)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Printview)
                        .addComponent(jLabel25)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(BtnPrint)
                        .addComponent(jLabel23)))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPhoneActionPerformed

    private void TxtCuNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCuNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCuNameActionPerformed

    private void TxtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtQuantityActionPerformed

    private void TxtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPriceActionPerformed

    private void jComboBoxAdminPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxAdminPopupMenuWillBecomeInvisible
        String tmp=(String)jComboBoxAdmin.getSelectedItem();
        String sql1=(String)"SELECT * FROM \"Admin\" Where \"Name\"='"+tmp+"'";
        
        try
        {
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql1);
            while(rs.next())
            {
                String add1=rs.getString("Id");
                LblCId.setText(add1);
                String add2=rs.getString("Name");
                LblCName.setText(add2);
                String add3=rs.getString("Phone");
                LblCPhone.setText(add3);
                String add4=rs.getString("Address");
                LblCAddress.setText(add4);
            }
                
      //  int A=AutoIncrement();
      //  LblBill.setText(Integer.toString(A));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jComboBoxAdminPopupMenuWillBecomeInvisible

    private void jComboBoxAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAdminActionPerformed

    private void jComboBoxProductPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxProductPopupMenuWillBecomeInvisible
        String tmp=(String)jComboBoxProduct.getSelectedItem();
        String sql1=(String)"SELECT * FROM \"Products\" Where \"Product_Name\"='"+tmp+"'";
        try
        {
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql1);
            while(rs.next())
            {
                String add1=rs.getString("Product_Id");
                LblPrId.setText(add1);
                String add2=rs.getString("Quantity");
                LblQuantity.setText(add2);
                String add3=rs.getString("Price");
                TxtPrice.setText(add3);
               // TxtDiscount.setText("0");
                TxtQuantity.setText("1");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jComboBoxProductPopupMenuWillBecomeInvisible

    private void BtnAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddCartActionPerformed
        int Quantity1 =Integer.parseInt(TxtQuantity.getText());
        int Price1 = Integer.parseInt(TxtPrice.getText());
        int Total=0;
        Total = Quantity1*Price1;
        update();
        DefaultTableModel model=(DefaultTableModel)jTable.getModel();
        model.addRow(new Object[]{(String)jComboBoxProduct.getSelectedItem(),TxtQuantity.getText(),TxtPrice.getText(),Total});
        StockLeft();
        getTotalQty();
        getTotalPrice();
    }//GEN-LAST:event_BtnAddCartActionPerformed

    private void jComboBoxProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProductActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        String AdminName=(String)jComboBoxAdmin.getSelectedItem();        
        String sql="INSERT INTO \"Bill\" VALUES("+LblBill.getText()+",'"+LblDate.getText()+"','"+LblTime.getText()+"','"+TxtCuName.getText()+"',"+TxtPhone.getText()+","+LblTotalQty.getText()+","+LblTotalPrice.getText()+",'"+AdminName+"')";
        try
        {
            Statement stmt=conn.createStatement();
            int i=stmt.executeUpdate(sql);
            if(i==1)
                JOptionPane.showMessageDialog(null,"Added Succesfully");
        }
        catch (Exception ex)
        {
              JOptionPane.showMessageDialog(null,ex);  
        }
        
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable.getModel();
        int c = model.getRowCount()-1;
        if(c>=0)
        { model.removeRow(c);
        getQty();
        getPrice();
        AddStock();
        }
    }//GEN-LAST:event_BtnClearActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

    private void PrintviewvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintviewvActionPerformed
        Area.setText("\n");
        Area.setText(Area.getText()+"  \t OM SAI SUPER SHOPER SHOPEE\n\n");
        Area.setText(Area.getText()+"  Customer Name : "+TxtCuName.getText()+"\n  Phone : "+TxtPhone.getText()+"\n");
        Area.setText(Area.getText()+"  *************************************************************\n");
        Area.setText(Area.getText()+"  \t\t                Bill No : "+LblBill.getText()+"\n");
        Area.setText(Area.getText()+"   Date & Time :  "+LblDate.getText()+"  "+LblTime.getText()+"\n");
        Area.setText(Area.getText()+"  *************************************************************\n");
        Area.setText(Area.getText()+"   Items\tQuantity\tPrice\tTotal\n");
        Area.setText(Area.getText()+"  *************************************************************\n");
        for(int i=0;i<jTable.getRowCount(); i++)
        Area.setText(Area.getText()+"   "+jTable.getValueAt(i,0).toString()+"\t"+jTable.getValueAt(i,1).toString()+"\t"+jTable.getValueAt(i,2).toString()+"\t"+jTable.getValueAt(i,3).toString()+"\n");
        Area.setText(Area.getText()+"  *************************************************************\n");
        Area.setText(Area.getText()+"  Total Quantity : "+LblTotalQty.getText()+"\n  Total Price : "+LblTotalPrice.getText()+"\n");
        Area.setText(Area.getText()+"  *************************************************************\n\n");
        Area.setText(Area.getText()+"  \tThanks For Shopping\n  \t     Visit Again  . . . .\n");
        
        new ViewPrint(Area.getText()).setVisible(true);
    }//GEN-LAST:event_PrintviewvActionPerformed

    private void BtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrintActionPerformed
        try
        {
            Area.print();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_BtnPrintActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        dispose();
    }//GEN-LAST:event_BtnBackActionPerformed

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
            java.util.logging.Logger.getLogger(AddBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area;
    private javax.swing.JButton BtnAddCart;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnPrint;
    private javax.swing.JButton BtnSave;
    private javax.swing.JLabel LblBill;
    private javax.swing.JLabel LblCAddress;
    private javax.swing.JLabel LblCId;
    private javax.swing.JLabel LblCName;
    private javax.swing.JLabel LblCPhone;
    private javax.swing.JLabel LblDate;
    private javax.swing.JLabel LblImage;
    private javax.swing.JLabel LblImage1;
    private javax.swing.JLabel LblPrId;
    private javax.swing.JLabel LblQuantity;
    private javax.swing.JLabel LblTime;
    private javax.swing.JLabel LblTotalPrice;
    private javax.swing.JLabel LblTotalQty;
    private javax.swing.JButton Printview;
    private javax.swing.JTextField TxtCuName;
    private javax.swing.JTextField TxtPhone;
    private javax.swing.JTextField TxtPrice;
    private javax.swing.JTextField TxtQuantity;
    private javax.swing.JComboBox<String> jComboBoxAdmin;
    private javax.swing.JComboBox<String> jComboBoxProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
