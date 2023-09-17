package cashier_Form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Pendings extends javax.swing.JPanel {
    
    public Pendings() {
        initComponents();
        model = (DefaultTableModel) pendingTable.getModel();
        
        JTableHeader tableHeader = pendingTable.getTableHeader();
        tableHeader.setBackground(new Color(0,102,255));
        tableHeader.setForeground(Color.WHITE);
        tableHeader.setFont(new Font("Arial", Font.BOLD, 13));
        tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(), 50));
        
        getData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        waiting = new javax.swing.JButton();
        refreshBTN = new javax.swing.JButton();
        cancelBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        searchID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Pendings");

        jScrollPane1.setBorder(null);

        pendingTable.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        pendingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account ID", "Reference #", "Date/Time", "Transaction", "Student ID", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pendingTable.setFillsViewportHeight(true);
        pendingTable.setFocusable(false);
        pendingTable.setGridColor(new java.awt.Color(193, 193, 193));
        pendingTable.setMaximumSize(new java.awt.Dimension(2147483647, 300));
        pendingTable.setRowHeight(50);
        pendingTable.setShowGrid(true);
        pendingTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(pendingTable);

        jPanel2.setOpaque(false);
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 20, 0, 20, 0};
        jPanel2Layout.rowHeights = new int[] {0};
        jPanel2.setLayout(jPanel2Layout);

        waiting.setBackground(new java.awt.Color(0, 204, 51));
        waiting.setForeground(new java.awt.Color(255, 255, 255));
        waiting.setText("Waiting");
        waiting.setBorderPainted(false);
        waiting.setFocusPainted(false);
        waiting.setPreferredSize(new java.awt.Dimension(80, 30));
        waiting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                waitingMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 7;
        jPanel2.add(waiting, gridBagConstraints);

        refreshBTN.setBackground(new java.awt.Color(204, 204, 204));
        refreshBTN.setText("Refresh");
        refreshBTN.setBorderPainted(false);
        refreshBTN.setFocusPainted(false);
        refreshBTN.setPreferredSize(new java.awt.Dimension(80, 30));
        refreshBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                refreshBTNMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 7;
        jPanel2.add(refreshBTN, gridBagConstraints);

        cancelBTN.setBackground(new java.awt.Color(255, 57, 57));
        cancelBTN.setForeground(new java.awt.Color(255, 255, 255));
        cancelBTN.setText("Cancel");
        cancelBTN.setBorderPainted(false);
        cancelBTN.setFocusPainted(false);
        cancelBTN.setPreferredSize(new java.awt.Dimension(80, 30));
        cancelBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelBTNMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 7;
        jPanel2.add(cancelBTN, gridBagConstraints);

        jPanel3.setOpaque(false);
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 10, 0};
        jPanel3Layout.rowHeights = new int[] {0};
        jPanel3.setLayout(jPanel3Layout);

        searchID.setMinimumSize(new java.awt.Dimension(64, 40));
        searchID.setPreferredSize(new java.awt.Dimension(71, 30));
        searchID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchIDKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 177;
        jPanel3.add(searchID, gridBagConstraints);

        jLabel2.setText("Account ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel3.add(jLabel2, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getData(){
        try {
            String[][] historyData = database.CashierConnection.getHistoryStatus(accountID, "Pending");
            model.setRowCount(0);

            if (historyData != null) {
                model.setRowCount(0);
                for (int i = (historyData.length - 1); i >= 0; i--) {
                    String formatTimeDate = historyData[i][2].replace(", ", " / ");

                    Object[] newRow = {historyData[i][0], historyData[i][1], formatTimeDate, historyData[i][3], historyData[i][4], historyData[i][5]};
                    model.addRow(newRow);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Error.",
                                null, JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void refreshBTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBTNMouseReleased
        getData();
    }//GEN-LAST:event_refreshBTNMouseReleased

    private void waitingMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waitingMouseReleased
        updateStatus("Waiting");
    }//GEN-LAST:event_waitingMouseReleased

    private void cancelBTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBTNMouseReleased
        updateStatus("Cancel");

    }//GEN-LAST:event_cancelBTNMouseReleased

    private void searchIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchIDKeyTyped
        accountID = searchID.getText();
        getData();
    }//GEN-LAST:event_searchIDKeyTyped

    private void updateStatus(String status){
        int[] selectedRows = pendingTable.getSelectedRows();
        if (selectedRows.length != 0) {
            for (int i = 0; i < selectedRows.length; i++) {
                String account = pendingTable.getValueAt(selectedRows[i], 0).toString();
                String reference = pendingTable.getValueAt(selectedRows[i], 1).toString();
                String trans = pendingTable.getValueAt(selectedRows[i], 3).toString();
                String amount = pendingTable.getValueAt(selectedRows[i], 5).toString();
                
                database.CashierConnection.updateStatus(reference, status);
                
                if (status.equals("Cancel")) {
                    database.StudentConnection.makeHistory(account, reference, trans, account, "School", amount, status);
                }

            }
            getData();

            String msg = "The transaction has successfully moved to the waiting state.";

            if (status.equals("Cancel")) {
                msg = "The transaction has successfully canceled.";
            }
            JOptionPane.showMessageDialog(null, msg,
                    null, JOptionPane.INFORMATION_MESSAGE); 
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pendingTable;
    private javax.swing.JButton refreshBTN;
    private javax.swing.JTextField searchID;
    private javax.swing.JButton waiting;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;
    private String accountID = null;
}
