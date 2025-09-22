/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.pharmacare.view;

import com.pharmacare.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shala
 */
public class UserPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserPanel
     */
    public UserPanel() {
        initComponents();
        // Set the items for the Role ComboBox in the constructor
        cmbRole.addItem("Admin");
        cmbRole.addItem("Manager");
        cmbRole.addItem("Cashier");

        lblUserId.setVisible(false);

        loadUsersToTable();
    }

    private void loadUsersToTable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) tblUsers.getModel();
            dtm.setRowCount(0);

            Connection con = DBConnection.getInstance().getConnection();
            String sql = "SELECT id, username, role, is_active FROM user";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Vector row = new Vector();
                row.add(rs.getInt("id"));
                row.add(rs.getString("username"));
                row.add(rs.getString("role"));

                // Convert boolean (1/0) from DB to a user-friendly string
                boolean isActive = rs.getBoolean("is_active");
                row.add(isActive ? "Active" : "Inactive");

                dtm.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to load user data.", "Data Load Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        roundedPanel1 = new com.pharmacare.customui.RoundedPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        chkIsActive = new javax.swing.JCheckBox();
        btnSaveUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblUserId = new javax.swing.JLabel();
        chkShowPassword = new javax.swing.JCheckBox();
        roundedPanel2 = new com.pharmacare.customui.RoundedPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSearchUser = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Manage Users");

        roundedPanel1.setBackground(new java.awt.Color(242, 245, 249));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("User Details");

        jLabel3.setText("Username :");

        jLabel4.setText("Password :  ");

        jLabel5.setText("Role :");

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role" }));

        jLabel6.setText("Status :");

        chkIsActive.setText("Active");

        btnSaveUser.setText("Save");
        btnSaveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveUserActionPerformed(evt);
            }
        });

        btnUpdateUser.setText("Update");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        chkShowPassword.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        chkShowPassword.setText("show password");
        chkShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblUserId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkIsActive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addComponent(btnSaveUser, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkShowPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword))))
                .addContainerGap())
        );

        roundedPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5, jLabel6});

        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUserId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkShowPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(chkIsActive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveUser)
                    .addComponent(btnUpdateUser))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        roundedPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {chkIsActive, cmbRole, jLabel3, jLabel4, jLabel5, jLabel6, txtUsername});

        roundedPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("User List");

        jLabel8.setText("Search :");

        txtSearchUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchUserKeyReleased(evt);
            }
        });

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "User Name", "Role", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblUsersMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsers);

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchUser, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSearchUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundedPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel8, txtSearchUser});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchUserKeyReleased
        String searchText = txtSearchUser.getText();
        DefaultTableModel dtm = (DefaultTableModel) tblUsers.getModel();
        javax.swing.table.TableRowSorter<DefaultTableModel> sorter = new javax.swing.table.TableRowSorter<>(dtm);
        tblUsers.setRowSorter(sorter);
        sorter.setRowFilter(javax.swing.RowFilter.regexFilter("(?i)" + searchText));
    }//GEN-LAST:event_txtSearchUserKeyReleased

    private void btnSaveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveUserActionPerformed
        String username = txtUsername.getText();
        // Get password from JPasswordField
        String password = new String(txtPassword.getPassword());
        String role = cmbRole.getSelectedItem().toString();
        // Get status from JCheckBox
        boolean isActive = chkIsActive.isSelected();

        // Validation
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username and Password cannot be empty.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            Connection con = DBConnection.getInstance().getConnection();
            // Check if username already exists
            PreparedStatement checkPs = con.prepareStatement("SELECT id FROM user WHERE username = ?");
            checkPs.setString(1, username);
            if (checkPs.executeQuery().next()) {
                JOptionPane.showMessageDialog(this, "This username already exists.", "Duplicate Username", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "INSERT INTO user (username, password, role, is_active) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password); // Note: In a real app, you should hash the password!
            ps.setString(3, role);
            ps.setBoolean(4, isActive);

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "User saved successfully!");
                loadUsersToTable();
                clearUserForm();
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to save user.", "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveUserActionPerformed

    private void tblUsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMousePressed
        try {
            DefaultTableModel dtm = (DefaultTableModel) tblUsers.getModel();
            int selectedRow = tblUsers.getSelectedRow();

            if (selectedRow != -1) {
                String id = dtm.getValueAt(selectedRow, 0).toString();
                String username = dtm.getValueAt(selectedRow, 1).toString();
                String role = dtm.getValueAt(selectedRow, 2).toString();
                String status = dtm.getValueAt(selectedRow, 3).toString();

                lblUserId.setText(id);
                txtUsername.setText(username);
                cmbRole.setSelectedItem(role);

                // Set checkbox based on the status string
                chkIsActive.setSelected(status.equals("Active"));

                // Clear the password field for security
                txtPassword.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblUsersMousePressed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        String id = lblUserId.getText();
        if (id.isEmpty() || id.equals("0")) {
            JOptionPane.showMessageDialog(this, "Please select a user from the table to update.", "No User Selected", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        String role = cmbRole.getSelectedItem().toString();
        boolean isActive = chkIsActive.isSelected();

        try {
            Connection con = DBConnection.getInstance().getConnection();

            // We build the query dynamically to handle optional password update
            StringBuilder sql = new StringBuilder("UPDATE user SET username = ?, role = ?, is_active = ?");
            if (!password.isEmpty()) {
                sql.append(", password = ?"); // Add password update only if a new one is typed
            }
            sql.append(" WHERE id = ?");

            PreparedStatement ps = con.prepareStatement(sql.toString());
            ps.setString(1, username);
            ps.setString(2, role);
            ps.setBoolean(3, isActive);

            if (!password.isEmpty()) {
                ps.setString(4, password);
                ps.setInt(5, Integer.parseInt(id));
            } else {
                ps.setInt(4, Integer.parseInt(id));
            }

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "User updated successfully!");
                loadUsersToTable();
                clearUserForm();
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to update user.", "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void chkShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPasswordActionPerformed
        if (chkShowPassword.isSelected()) {
            // --- PASSWORD එක පෙන්වීම ---
            // '\u0000' (හෝ (char) 0) කියන character එකෙන් කියවෙන්නේ "echo character එකක් එපා" කියන එකයි.
            // ඒකෙන් text එක පේනවා.
            txtPassword.setEchoChar((char) 0);
        } else {
            // --- PASSWORD එක සැඟවීම ---
            // Echo character එක ආයෙත් default තිතට (●) මාරු කරනවා.
            // අපි default character එක system එකේ look and feel එකෙන්ම අහලා ගන්නවා.
            txtPassword.setEchoChar((Character) javax.swing.UIManager.get("PasswordField.echoChar"));
        }
    }//GEN-LAST:event_chkShowPasswordActionPerformed

    private void clearUserForm() {
        lblUserId.setText("0");
        txtUsername.setText("");
        txtPassword.setText("");
        cmbRole.setSelectedIndex(0);
        chkIsActive.setSelected(true);
        tblUsers.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveUser;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JCheckBox chkIsActive;
    private javax.swing.JCheckBox chkShowPassword;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUserId;
    private com.pharmacare.customui.RoundedPanel roundedPanel1;
    private com.pharmacare.customui.RoundedPanel roundedPanel2;
    private javax.swing.JTable tblUsers;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSearchUser;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
