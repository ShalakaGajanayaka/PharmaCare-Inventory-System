/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pharmacare.view;

/**
 *
 * @author shala
 */
public class DashboardView extends javax.swing.JFrame {

    /**
     * Creates new form DashboardView
     */
    public DashboardView() {
        initComponents();
        loadHomePage(); // Load the home panel when dashboard opens
    }

    private void loadHomePage() {
        DashboardHomePanel homePanel = new DashboardHomePanel();
        contentPanel.removeAll();
        contentPanel.setLayout(new java.awt.BorderLayout());
        contentPanel.add(homePanel, java.awt.BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navPanel = new javax.swing.JPanel();
        btnNavDashboard = new javax.swing.JButton();
        btnNavPOS = new javax.swing.JButton();
        btnNavMedicines = new javax.swing.JButton();
        btnNavSuppliers = new javax.swing.JButton();
        btnNavReports = new javax.swing.JButton();
        btnNavUsers = new javax.swing.JButton();
        btnNavLogout = new javax.swing.JButton();
        btnNavGrn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnNavHistory = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuChangePassword = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PharmaCare - Dashboard");

        btnNavDashboard.setText("Dashboard");
        btnNavDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavDashboardActionPerformed(evt);
            }
        });

        btnNavPOS.setText("POS / Sale");
        btnNavPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavPOSActionPerformed(evt);
            }
        });

        btnNavMedicines.setText("Medicines");
        btnNavMedicines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavMedicinesActionPerformed(evt);
            }
        });

        btnNavSuppliers.setText("Suppliers");
        btnNavSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavSuppliersActionPerformed(evt);
            }
        });

        btnNavReports.setText("Reports");
        btnNavReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavReportsActionPerformed(evt);
            }
        });

        btnNavUsers.setText("Users");
        btnNavUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavUsersActionPerformed(evt);
            }
        });

        btnNavLogout.setText("Logout");

        btnNavGrn.setText("GRN / Stock In");
        btnNavGrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavGrnActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("--- TRANSACTIONS ---");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("--- MANAGEMENT ---");

        jButton3.setText("Employees");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("--- OTHER ---");

        btnNavHistory.setText("Invoice History");
        btnNavHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNavDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(btnNavPOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNavGrn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNavLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNavUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNavReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNavMedicines, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNavSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNavHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNavDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNavPOS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNavHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNavGrn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNavMedicines)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNavSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNavUsers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNavReports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNavLogout)
                .addContainerGap())
        );

        navPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnNavLogout, btnNavUsers});

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuChangePassword.setText("Change Password");
        menuChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuChangePasswordActionPerformed(evt);
            }
        });
        jMenu1.add(menuChangePassword);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Manage");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reports");

        jMenuItem3.setText("Medicine List");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Help");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();

        LoginView login = new LoginView();
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0); // This will close the entire application
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnNavMedicinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavMedicinesActionPerformed
        // 1. Create an instance of our new panel
        MedicinePanel medicinePanel = new MedicinePanel();

        // 2. Clear the existing content of the contentPanel
        contentPanel.removeAll();

        // 3. Set the layout of the contentPanel to BorderLayout. This is important!
        contentPanel.setLayout(new java.awt.BorderLayout());

        // 4. Add the new panel to the center of the contentPanel
        contentPanel.add(medicinePanel, java.awt.BorderLayout.CENTER);

        // 5. Repaint and validate the contentPanel to show the new content
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_btnNavMedicinesActionPerformed

    private void btnNavDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavDashboardActionPerformed
        loadHomePage();
    }//GEN-LAST:event_btnNavDashboardActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            // 1. Get the database connection from our singleton class
            java.sql.Connection con = com.pharmacare.db.DBConnection.getInstance().getConnection();

            // 2. Define the path to the .jrxml file
            // The path is relative to the project's root folder
            String reportPath = "src/reports/rpt_medicines.jrxml";

            // 3. Compile the JRXML file to a JasperReport object
            net.sf.jasperreports.engine.JasperReport jr = net.sf.jasperreports.engine.JasperCompileManager.compileReport(reportPath);

            // 4. Create a JasperPrint object by filling the report with data
            // We don't need parameters for this report, so we pass an empty HashMap
            net.sf.jasperreports.engine.JasperPrint jp = net.sf.jasperreports.engine.JasperFillManager.fillReport(jr, null, con);

            // 5. Create a report viewer and display it
            net.sf.jasperreports.view.JasperViewer.viewReport(jp, false); // 'false' means the app doesn't exit on viewer close

        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error displaying report: " + e.getMessage(), "Report Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnNavSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavSuppliersActionPerformed
        SupplierPanel supplierPanel = new SupplierPanel();
        contentPanel.removeAll();
        contentPanel.setLayout(new java.awt.BorderLayout());
        contentPanel.add(supplierPanel, java.awt.BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_btnNavSuppliersActionPerformed

    private void btnNavGrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavGrnActionPerformed
        // Create an instance of our GRNPanel
        GRNPanel grnPanel = new GRNPanel();

        // Clear the existing content of the contentPanel
        contentPanel.removeAll();

        // Set the layout and add the new panel
        contentPanel.setLayout(new java.awt.BorderLayout());
        contentPanel.add(grnPanel, java.awt.BorderLayout.CENTER);

        // Repaint and validate to show the new content
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_btnNavGrnActionPerformed

    private void btnNavPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavPOSActionPerformed
        POSPanel posPanel = new POSPanel();
        contentPanel.removeAll();
        contentPanel.setLayout(new java.awt.BorderLayout());
        contentPanel.add(posPanel, java.awt.BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_btnNavPOSActionPerformed

    private void btnNavUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavUsersActionPerformed
        UserPanel userPanel = new UserPanel();
        contentPanel.removeAll();
        contentPanel.setLayout(new java.awt.BorderLayout());
        contentPanel.add(userPanel, java.awt.BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_btnNavUsersActionPerformed

    private void btnNavHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavHistoryActionPerformed
        InvoiceHistoryPanel historyPanel = new InvoiceHistoryPanel();
        contentPanel.removeAll();
        contentPanel.setLayout(new java.awt.BorderLayout());
        contentPanel.add(historyPanel, java.awt.BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_btnNavHistoryActionPerformed

    private void menuChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuChangePasswordActionPerformed
        // අපි 'this' (Dashboard JFrame එක) සහ 'true' (modal) pass කරනවා
        // Modal 'true' කියන්නේ, මේ dialog එක close කරනකම් user ට ආපහු dashboard එක click කරන්න බෑ
        ChangePasswordDialog dialog = new ChangePasswordDialog(this, true);
        dialog.setLocationRelativeTo(this); // Dashboard එක මැදට වෙන්න පෙන්නනවා
        dialog.setVisible(true);
    }//GEN-LAST:event_menuChangePasswordActionPerformed

    private void btnNavReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavReportsActionPerformed
        ReportsPanel reportsPanel = new ReportsPanel();
        contentPanel.removeAll();
        contentPanel.setLayout(new java.awt.BorderLayout());
        contentPanel.add(reportsPanel, java.awt.BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_btnNavReportsActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNavDashboard;
    private javax.swing.JButton btnNavGrn;
    private javax.swing.JButton btnNavHistory;
    private javax.swing.JButton btnNavLogout;
    private javax.swing.JButton btnNavMedicines;
    private javax.swing.JButton btnNavPOS;
    private javax.swing.JButton btnNavReports;
    private javax.swing.JButton btnNavSuppliers;
    private javax.swing.JButton btnNavUsers;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem menuChangePassword;
    private javax.swing.JPanel navPanel;
    // End of variables declaration//GEN-END:variables
}
