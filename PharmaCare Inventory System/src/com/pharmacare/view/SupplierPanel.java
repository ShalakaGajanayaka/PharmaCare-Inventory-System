/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.pharmacare.view;

/**
 *
 * @author shala
 */
public class SupplierPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierPanel
     */
    public SupplierPanel() {
        initComponents();
        lblSupplierId.setVisible(false);
        initTableSorter();
        loadSuppliersToTable();
    }
    
    private void initTableSorter() {
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tblSuppliers.getModel();
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> sorter = new javax.swing.table.TableRowSorter<>(dtm);
        tblSuppliers.setRowSorter(sorter);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        roundedPanel1 = new com.pharmacare.customui.RoundedPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSupplierName = new javax.swing.JTextField();
        txtContactPerson = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnSaveSupplier = new javax.swing.JButton();
        btnUpdateSupplier = new javax.swing.JButton();
        btnDeleteSupplier = new javax.swing.JButton();
        lblSupplierId = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        roundedPanel2 = new com.pharmacare.customui.RoundedPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSuppliers = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(693, 460));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Manage Suppliers");

        roundedPanel1.setBackground(new java.awt.Color(242, 245, 249));
        roundedPanel1.setPreferredSize(new java.awt.Dimension(319, 378));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Supplier Details");

        jLabel3.setText("Supplier Name :");

        jLabel4.setText("Contact Person :");

        jLabel5.setText("Mobile No.      :");

        jLabel6.setText("Email Address :");

        btnSaveSupplier.setText("Save");
        btnSaveSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSupplierActionPerformed(evt);
            }
        });

        btnUpdateSupplier.setText("Update");
        btnUpdateSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSupplierActionPerformed(evt);
            }
        });

        btnDeleteSupplier.setText("Delete");
        btnDeleteSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSupplierActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
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
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContactPerson)
                            .addComponent(txtMobile)))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSupplierName)
                            .addComponent(txtEmail)))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addComponent(btnSaveSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteSupplier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSupplierId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtContactPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveSupplier)
                    .addComponent(btnUpdateSupplier)
                    .addComponent(btnDeleteSupplier)
                    .addComponent(btnClear))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        roundedPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5, jLabel6, txtContactPerson, txtEmail, txtMobile, txtSupplierName});

        roundedPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Supplier List");

        jLabel8.setText("Search :");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tblSuppliers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact Person", "Mobile", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSuppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSuppliersMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblSuppliers);

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
                        .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)))
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
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundedPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel8, txtSearch});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSupplierActionPerformed
        String name = txtSupplierName.getText();
        String contact_person = txtContactPerson.getText();
        String mobile = txtMobile.getText();
        String email = txtEmail.getText();

        // Basic Validation
        if (name.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Supplier name cannot be empty.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            java.sql.Connection con = com.pharmacare.db.DBConnection.getInstance().getConnection();
            String sql = "INSERT INTO supplier (name, contact_person, mobile, email) VALUES (?, ?, ?, ?)";
            java.sql.PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, contact_person);
            ps.setString(3, mobile);
            ps.setString(4, email);
            
            int result = ps.executeUpdate();
            
            if (result > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Supplier added successfully!");
                loadSuppliersToTable(); // Refresh the table
                clearFields();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Failed to add supplier.", "Database Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveSupplierActionPerformed

    private void tblSuppliersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSuppliersMousePressed
        // Get the table model
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tblSuppliers.getModel();

        // Get the selected row index
        int selectedRow = tblSuppliers.getSelectedRow();
        
        if (selectedRow != -1) { // Check if a row is actually selected
            // Get data from the model
            // Column 0 is ID, 1 is SupplierName, 2 is ContactPerson, etc.
            String id = dtm.getValueAt(selectedRow, 0).toString(); // We will need this for update/delete
            String name = dtm.getValueAt(selectedRow, 1).toString();
            String contact_person = dtm.getValueAt(selectedRow, 2).toString();
            String mobile = dtm.getValueAt(selectedRow, 3).toString();
            String email = dtm.getValueAt(selectedRow, 4).toString();

            // Set data to the form fields
            txtSupplierName.setText(name); // Assuming you have these variable names
            txtContactPerson.setText(contact_person);
            txtMobile.setText(mobile);
            txtEmail.setText(email);

            // Store the selected ID in a hidden label or a class variable for later use
            // This is a good practice. Let's create a hidden label.
            // Add a JLabel to your form, name it lblMedicineId, and make it invisible.
            lblSupplierId.setText(id);
        }
    }//GEN-LAST:event_tblSuppliersMousePressed

    private void btnUpdateSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSupplierActionPerformed
        String id = lblSupplierId.getText(); // Get the ID from our hidden label

        // Check if an ID is selected
        if (id.isEmpty() || id.equals("0")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a supplier from the table to update.", "No Supplier Selected", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get updated values from the form
        String name = txtSupplierName.getText();
        String contact_person = txtContactPerson.getText();
        String mobile = txtMobile.getText();
        String email = txtEmail.getText();
        
        try {
            java.sql.Connection con = com.pharmacare.db.DBConnection.getInstance().getConnection();
            String sql = "UPDATE supplier SET name = ?, contact_person = ?, mobile = ?, email = ? WHERE id = ?";
            java.sql.PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, contact_person);
            ps.setString(3, mobile);
            ps.setString(4, email);
            ps.setInt(5, Integer.parseInt(id)); // Set the ID for the WHERE clause

            int result = ps.executeUpdate();
            
            if (result > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Medicine updated successfully!");
                loadSuppliersToTable(); // Refresh the table with new data
                clearFields(); // Clear the form
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Failed to update medicine.", "Database Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateSupplierActionPerformed

    private void btnDeleteSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSupplierActionPerformed
        String id = lblSupplierId.getText();
        
        if (id.isEmpty() || id.equals("0")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a Supplier from the table to delete.", "No Supplier Selected", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Confirmation Dialog
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this Supplier?", "Confirm Deletion", javax.swing.JOptionPane.YES_NO_OPTION);
        
        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            try {
                java.sql.Connection con = com.pharmacare.db.DBConnection.getInstance().getConnection();
                String sql = "DELETE FROM supplier WHERE id = ?";
                java.sql.PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(id));
                
                int result = ps.executeUpdate();
                
                if (result > 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Supplier deleted successfully!");
                    loadSuppliersToTable();
                    clearFields();
                }
                
            } catch (Exception e) {
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(this, "Failed to delete supplier.", "Database Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteSupplierActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // Get the search text from the text field
        String searchText = txtSearch.getText().toLowerCase(); // Convert to lower case for case-insensitive search

        // Get the table model
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tblSuppliers.getModel();

        // Create a TableRowSorter for filtering
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> sorter = new javax.swing.table.TableRowSorter<>(dtm);
        tblSuppliers.setRowSorter(sorter);
        
        if (searchText.trim().length() == 0) {
            // If search text is empty, show all rows
            sorter.setRowFilter(null);
        } else {
            // Create a filter. This will search in all columns.
            // The "(?i)" part makes the search case-insensitive.
            sorter.setRowFilter(javax.swing.RowFilter.regexFilter("(?i)" + searchText));
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearFields();
    }//GEN-LAST:event_btnClearActionPerformed
    
    private void loadSuppliersToTable() {
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tblSuppliers.getModel();
        dtm.setRowCount(0); // Clear existing rows

        try {
            java.sql.Connection con = com.pharmacare.db.DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM supplier";
            java.sql.Statement st = con.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                java.util.Vector row = new java.util.Vector();
                row.add(rs.getInt("id"));
                row.add(rs.getString("name"));
                row.add(rs.getString("contact_person"));
                row.add(rs.getString("mobile"));
                row.add(rs.getString("email"));
                dtm.addRow(row);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void clearFields() {
        txtSupplierName.setText("");
        txtContactPerson.setText("");
        txtMobile.setText("");
        txtEmail.setText("");
        lblSupplierId.setText("0"); // Reset the hidden ID
        tblSuppliers.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteSupplier;
    private javax.swing.JButton btnSaveSupplier;
    private javax.swing.JButton btnUpdateSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSupplierId;
    private com.pharmacare.customui.RoundedPanel roundedPanel1;
    private com.pharmacare.customui.RoundedPanel roundedPanel2;
    private javax.swing.JTable tblSuppliers;
    private javax.swing.JTextField txtContactPerson;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables
}
