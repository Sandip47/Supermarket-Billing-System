import java.util.*;
public class HomePage extends javax.swing.JFrame
{
    public HomePage()
    {
        initComponents();
        setTitle("SuperMarket Billing System");
        this.setLocationRelativeTo(null);
        CurrentDate();
    }
    
    public void CurrentDate()
    {
        Calendar cal=new GregorianCalendar();
        int Year=cal.get(Calendar.YEAR);
        int Month=cal.get(Calendar.MONTH);
        int Day=cal.get(Calendar.DAY_OF_MONTH);
        Date.setText(Day+"/"+(Month+1)+"/"+Year);
        
        int Hour=cal.get(Calendar.HOUR);
        int Minute=cal.get(Calendar.MINUTE);
        int Second=cal.get(Calendar.SECOND);
        Time.setText(Hour+":"+Minute+":"+Second);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuAddCu = new javax.swing.JMenuItem();
        jMenuUpdateCu = new javax.swing.JMenuItem();
        jMenuDeleteCu = new javax.swing.JMenuItem();
        jMenuViewCu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuAddPr = new javax.swing.JMenuItem();
        jMenuUpdatePr = new javax.swing.JMenuItem();
        jMenuDeletePr = new javax.swing.JMenuItem();
        jMenuViewPr = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuAddBill = new javax.swing.JMenuItem();
        jMenuDeleteBill = new javax.swing.JMenuItem();
        jMenuViewBill = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuAddAdmin = new javax.swing.JMenuItem();
        jMenuChangePass = new javax.swing.JMenuItem();
        jMenuDeleteAdmin = new javax.swing.JMenuItem();
        jMenuViewAdmin = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu8.setText("jMenu8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 255));

        jPanel1.setBackground(new java.awt.Color(210, 226, 229));
        jPanel1.setPreferredSize(new java.awt.Dimension(1347, 671));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 188, 67));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customers");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 188, 67));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Products");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(7, 188, 67));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Admins");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(7, 188, 67));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Bills");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\Icon Pack\\Admin.png")); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\Icon Pack\\Bill.PNG")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\Icon Pack\\Product.PNG")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\Icon Pack\\Customer.png")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Date :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("Time :");

        Date.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Time.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Algerian", 0, 60)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(121, 189, 223));
        jLabel12.setText("om sai super shopeE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel5)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel12)))
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(null);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(231, 25));

        jMenu1.setText("Customer");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuAddCu.setBackground(new java.awt.Color(112, 183, 209));
        jMenuAddCu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuAddCu.setText("Add Customer");
        jMenuAddCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddCuActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAddCu);

        jMenuUpdateCu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuUpdateCu.setText("Updare Customer");
        jMenuUpdateCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUpdateCuActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuUpdateCu);

        jMenuDeleteCu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuDeleteCu.setText("Delete Customer");
        jMenuDeleteCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeleteCuActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuDeleteCu);

        jMenuViewCu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuViewCu.setText("View Customer");
        jMenuViewCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuViewCuActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuViewCu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Products");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuAddPr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuAddPr.setText("Add Products");
        jMenuAddPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddPrActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuAddPr);

        jMenuUpdatePr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuUpdatePr.setText("Update Products");
        jMenuUpdatePr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUpdatePrActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuUpdatePr);

        jMenuDeletePr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuDeletePr.setText("Delete Products");
        jMenuDeletePr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeletePrActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuDeletePr);

        jMenuViewPr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuViewPr.setText("View Products");
        jMenuViewPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuViewPrActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuViewPr);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("  Bill  ");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuAddBill.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuAddBill.setText("Add Bill");
        jMenuAddBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddBillActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuAddBill);

        jMenuDeleteBill.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuDeleteBill.setText("Delete Bill");
        jMenuDeleteBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeleteBillActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuDeleteBill);

        jMenuViewBill.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuViewBill.setText("View Bill");
        jMenuViewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuViewBillActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuViewBill);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Admin");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuAddAdmin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuAddAdmin.setText("Add Admin");
        jMenuAddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddAdminActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuAddAdmin);

        jMenuChangePass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuChangePass.setText("Change Password");
        jMenuChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuChangePassActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuChangePass);

        jMenuDeleteAdmin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuDeleteAdmin.setText("Delete Admin");
        jMenuDeleteAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeleteAdminActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuDeleteAdmin);

        jMenuViewAdmin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuViewAdmin.setText("View Admin");
        jMenuViewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuViewAdminActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuViewAdmin);

        jMenuBar1.add(jMenu4);

        jMenu7.setText("Help");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1327, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuChangePassActionPerformed
        new ChangePassword().setVisible(true);
    }//GEN-LAST:event_jMenuChangePassActionPerformed

    private void jMenuAddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddAdminActionPerformed
        new AddAdmin().setVisible(true);
    }//GEN-LAST:event_jMenuAddAdminActionPerformed

    private void jMenuDeletePrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeletePrActionPerformed
        new DeleteProducts().setVisible(true);
    }//GEN-LAST:event_jMenuDeletePrActionPerformed

    private void jMenuDeleteCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeleteCuActionPerformed
        new DeleteCustomer().setVisible(true);
    }//GEN-LAST:event_jMenuDeleteCuActionPerformed

    private void jMenuViewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuViewAdminActionPerformed
        new ViewAdmins().setVisible(true);
    }//GEN-LAST:event_jMenuViewAdminActionPerformed

    private void jMenuAddPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddPrActionPerformed
        new AddProducts().setVisible(true);
    }//GEN-LAST:event_jMenuAddPrActionPerformed

    private void jMenuUpdatePrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUpdatePrActionPerformed
        new UpdateProducts().setVisible(true);
    }//GEN-LAST:event_jMenuUpdatePrActionPerformed

    private void jMenuViewPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuViewPrActionPerformed
        new ViewProducts().setVisible(true);
    }//GEN-LAST:event_jMenuViewPrActionPerformed

    private void jMenuDeleteAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeleteAdminActionPerformed
        new DeleteAdmin().setVisible(true);
    }//GEN-LAST:event_jMenuDeleteAdminActionPerformed

    private void jMenuAddCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddCuActionPerformed
        new AddCustomer().setVisible(true);
    }//GEN-LAST:event_jMenuAddCuActionPerformed

    private void jMenuUpdateCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUpdateCuActionPerformed
        new UpdateCustomer().setVisible(true);
    }//GEN-LAST:event_jMenuUpdateCuActionPerformed

    private void jMenuViewCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuViewCuActionPerformed
        new ViewCustomers().setVisible(true);
    }//GEN-LAST:event_jMenuViewCuActionPerformed

    private void jMenuAddBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddBillActionPerformed
        new AddBill().setVisible(true);
    }//GEN-LAST:event_jMenuAddBillActionPerformed

    private void jMenuViewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuViewBillActionPerformed
        new ViewBills().setVisible(true);
    }//GEN-LAST:event_jMenuViewBillActionPerformed

    private void jMenuDeleteBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeleteBillActionPerformed
        new DeleteBill().setVisible(true);
    }//GEN-LAST:event_jMenuDeleteBillActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new AddCustomer().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new AddProducts().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new AddProducts().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new AddBill().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new AddBill().setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new AddAdmin().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new AddAdmin().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new AddCustomer().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuItem jMenuAddAdmin;
    private javax.swing.JMenuItem jMenuAddBill;
    private javax.swing.JMenuItem jMenuAddCu;
    private javax.swing.JMenuItem jMenuAddPr;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuChangePass;
    private javax.swing.JMenuItem jMenuDeleteAdmin;
    private javax.swing.JMenuItem jMenuDeleteBill;
    private javax.swing.JMenuItem jMenuDeleteCu;
    private javax.swing.JMenuItem jMenuDeletePr;
    private javax.swing.JMenuItem jMenuUpdateCu;
    private javax.swing.JMenuItem jMenuUpdatePr;
    private javax.swing.JMenuItem jMenuViewAdmin;
    private javax.swing.JMenuItem jMenuViewBill;
    private javax.swing.JMenuItem jMenuViewCu;
    private javax.swing.JMenuItem jMenuViewPr;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
