/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.pharmacare.view;

/**
 *
 * @author shala
 */
public class MedicinePanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicinePanel
     */
    public MedicinePanel() {
        initComponents();
        lblMedicineId.setVisible(false);
        initTableSorter();
        loadMedicinesToTable();
    }

    private void initTableSorter() {
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tblMedicines.getModel();
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> sorter = new javax.swing.table.TableRowSorter<>(dtm);
        tblMedicines.setRowSorter(sorter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        medicineDetailsPanel = new com.pharmacare.customui.RoundedPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBarcode = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMedicineName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        spinnerQty = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtSellPrice = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        dateExpiry = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblMedicineId = new javax.swing.JLabel();
        medicineListPanel = new com.pharmacare.customui.RoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedicines = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Manage Medicines ");

        medicineDetailsPanel.setBackground(new java.awt.Color(242, 245, 249));
        medicineDetailsPanel.setCornerRadius(20);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Medicine Details");

        jLabel14.setText("Barcode :");

        jLabel15.setText("Name     :");

        jLabel16.setText("Quantity :");

        jLabel17.setText("Category :");

        jLabel18.setText("Pur. Price :");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel19.setText("Sell Price :");

        txtSellPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSellPriceActionPerformed(evt);
            }
        });

        jLabel20.setText("Expire Date :");

        jLabel21.setText("Supplier :");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout medicineDetailsPanelLayout = new javax.swing.GroupLayout(medicineDetailsPanel);
        medicineDetailsPanel.setLayout(medicineDetailsPanelLayout);
        medicineDetailsPanelLayout.setHorizontalGroup(
            medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicineDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(medicineDetailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMedicineName))
                    .addGroup(medicineDetailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerQty))
                    .addGroup(medicineDetailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9))
                    .addGroup(medicineDetailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10))
                    .addGroup(medicineDetailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSellPrice))
                    .addGroup(medicineDetailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateExpiry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(medicineDetailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(medicineDetailsPanelLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtBarcode))
                        .addGroup(medicineDetailsPanelLayout.createSequentialGroup()
                            .addGroup(medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(medicineDetailsPanelLayout.createSequentialGroup()
                                    .addComponent(btnSave)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnUpdate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDelete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnClear))
                                .addGroup(medicineDetailsPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblMedicineId, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        medicineDetailsPanelLayout.setVerticalGroup(
            medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicineDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMedicineId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtMedicineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(spinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(dateExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(medicineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        medicineDetailsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dateExpiry, jComboBox2, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel19, jLabel20, jLabel21, jTextField10, jTextField9, spinnerQty, txtBarcode, txtMedicineName, txtSellPrice});

        medicineListPanel.setBackground(new java.awt.Color(255, 255, 255));
        medicineListPanel.setCornerRadius(20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Medicine List");

        jLabel11.setText("Search:");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tblMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Barcode", "Name", "Qty", "Price", "Expire"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMedicines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblMedicinesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblMedicines);

        javax.swing.GroupLayout medicineListPanelLayout = new javax.swing.GroupLayout(medicineListPanel);
        medicineListPanel.setLayout(medicineListPanelLayout);
        medicineListPanelLayout.setHorizontalGroup(
            medicineListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicineListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(medicineListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(medicineListPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch)))
                .addContainerGap())
        );
        medicineListPanelLayout.setVerticalGroup(
            medicineListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicineListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(medicineListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(medicineDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medicineListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medicineDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medicineListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void txtSellPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSellPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSellPriceActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String barcode = txtBarcode.getText();
        String name = txtMedicineName.getText();
        int quantity = (int) spinnerQty.getValue();
        double sellingPrice = Double.parseDouble(txtSellPrice.getText()); // Assuming you have txtSellPrice

        // Date handling
        java.util.Date utilDate = dateExpiry.getDate();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        // Basic Validation
        if (name.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Medicine name cannot be empty.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            java.sql.Connection con = com.pharmacare.db.DBConnection.getInstance().getConnection();
            String sql = "INSERT INTO medicine (barcode, name, quantity, selling_price, expiry_date) VALUES (?, ?, ?, ?, ?)";
            java.sql.PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, barcode);
            ps.setString(2, name);
            ps.setInt(3, quantity);
            ps.setDouble(4, sellingPrice);
            ps.setDate(5, sqlDate);

            int result = ps.executeUpdate();

            if (result > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Medicine added successfully!");
                loadMedicinesToTable(); // Refresh the table
                clearFields();
            }

        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Failed to add medicine.", "Database Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblMedicinesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicinesMousePressed
        // Get the table model
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tblMedicines.getModel();

        // Get the selected row index
        int selectedRow = tblMedicines.getSelectedRow();

        if (selectedRow != -1) { // Check if a row is actually selected
            // Get data from the model
            // Column 0 is ID, 1 is Barcode, 2 is Name, etc.
            String id = dtm.getValueAt(selectedRow, 0).toString(); // We will need this for update/delete
            String barcode = dtm.getValueAt(selectedRow, 1).toString();
            String name = dtm.getValueAt(selectedRow, 2).toString();
            int quantity = Integer.parseInt(dtm.getValueAt(selectedRow, 3).toString());
            String price = dtm.getValueAt(selectedRow, 4).toString();
            java.util.Date expiryDate = (java.util.Date) dtm.getValueAt(selectedRow, 5);

            // Set data to the form fields
            txtBarcode.setText(barcode); // Assuming you have these variable names
            txtMedicineName.setText(name);
            spinnerQty.setValue(quantity);
            txtSellPrice.setText(price);
            dateExpiry.setDate(expiryDate);

            // Store the selected ID in a hidden label or a class variable for later use
            // This is a good practice. Let's create a hidden label.
            // Add a JLabel to your form, name it lblMedicineId, and make it invisible.
            lblMedicineId.setText(id);
        }
    }//GEN-LAST:event_tblMedicinesMousePressed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String id = lblMedicineId.getText(); // Get the ID from our hidden label

        // Check if an ID is selected
        if (id.isEmpty() || id.equals("0")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a medicine from the table to update.", "No Medicine Selected", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get updated values from the form
        String name = txtMedicineName.getText();
        int quantity = (int) spinnerQty.getValue();
        double sellingPrice = Double.parseDouble(txtSellPrice.getText());
        java.util.Date utilDate = dateExpiry.getDate();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        try {
            java.sql.Connection con = com.pharmacare.db.DBConnection.getInstance().getConnection();
            String sql = "UPDATE medicine SET name = ?, quantity = ?, selling_price = ?, expiry_date = ? WHERE id = ?";
            java.sql.PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, quantity);
            ps.setDouble(3, sellingPrice);
            ps.setDate(4, sqlDate);
            ps.setInt(5, Integer.parseInt(id)); // Set the ID for the WHERE clause

            int result = ps.executeUpdate();

            if (result > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Medicine updated successfully!");
                loadMedicinesToTable(); // Refresh the table with new data
                clearFields(); // Clear the form
            }

        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Failed to update medicine.", "Database Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String id = lblMedicineId.getText();

        if (id.isEmpty() || id.equals("0")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a medicine from the table to delete.", "No Medicine Selected", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Confirmation Dialog
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this medicine?", "Confirm Deletion", javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            try {
                java.sql.Connection con = com.pharmacare.db.DBConnection.getInstance().getConnection();
                String sql = "DELETE FROM medicine WHERE id = ?";
                java.sql.PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(id));

                int result = ps.executeUpdate();

                if (result > 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Medicine deleted successfully!");
                    loadMedicinesToTable();
                    clearFields();
                }

            } catch (Exception e) {
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(this, "Failed to delete medicine.", "Database Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // Get the search text from the text field
        String searchText = txtSearch.getText().toLowerCase(); // Convert to lower case for case-insensitive search

        // Get the table model
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tblMedicines.getModel();

        // Create a TableRowSorter for filtering
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> sorter = new javax.swing.table.TableRowSorter<>(dtm);
        tblMedicines.setRowSorter(sorter);

        if (searchText.trim().length() == 0) {
            // If search text is empty, show all rows
            sorter.setRowFilter(null);
        } else {
            // Create a filter. This will search in all columns.
            // The "(?i)" part makes the search case-insensitive.
            sorter.setRowFilter(javax.swing.RowFilter.regexFilter("(?i)" + searchText));
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void loadMedicinesToTable() {
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tblMedicines.getModel();
        dtm.setRowCount(0); // Clear existing rows

        try {
            java.sql.Connection con = com.pharmacare.db.DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM medicine";
            java.sql.Statement st = con.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                java.util.Vector row = new java.util.Vector();
                row.add(rs.getInt("id"));
                row.add(rs.getString("barcode"));
                row.add(rs.getString("name"));
                row.add(rs.getInt("quantity"));
                row.add(rs.getDouble("selling_price"));
                row.add(rs.getDate("expiry_date"));
                dtm.addRow(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearFields() {
        txtBarcode.setText("");
        txtMedicineName.setText("");
        spinnerQty.setValue(0);
        txtSellPrice.setText("");
        dateExpiry.setDate(null);
        lblMedicineId.setText("0"); // Reset the hidden ID
        tblMedicines.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser dateExpiry;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblMedicineId;
    private com.pharmacare.customui.RoundedPanel medicineDetailsPanel;
    private com.pharmacare.customui.RoundedPanel medicineListPanel;
    private javax.swing.JSpinner spinnerQty;
    private javax.swing.JTable tblMedicines;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtMedicineName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSellPrice;
    // End of variables declaration//GEN-END:variables
}
