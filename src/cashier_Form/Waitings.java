package cashier_Form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Waitings extends javax.swing.JPanel {
    
    public Waitings() {
        initComponents();
        model = (DefaultTableModel) waitingTable.getModel();
        
        JTableHeader tableHeader = waitingTable.getTableHeader();
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
        waitingTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        doneBTN = new javax.swing.JButton();
        refreshBTN = new javax.swing.JButton();
        cancelBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        searchID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Waiting");

        jScrollPane1.setBorder(null);

        waitingTable.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        waitingTable.setModel(new javax.swing.table.DefaultTableModel(
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
        waitingTable.setFillsViewportHeight(true);
        waitingTable.setFocusable(false);
        waitingTable.setGridColor(new java.awt.Color(193, 193, 193));
        waitingTable.setMaximumSize(new java.awt.Dimension(2147483647, 300));
        waitingTable.setRowHeight(50);
        waitingTable.setShowGrid(true);
        waitingTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(waitingTable);

        jPanel2.setOpaque(false);
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 20, 0, 20, 0};
        jPanel2Layout.rowHeights = new int[] {0};
        jPanel2.setLayout(jPanel2Layout);

        doneBTN.setBackground(new java.awt.Color(0, 204, 51));
        doneBTN.setForeground(new java.awt.Color(255, 255, 255));
        doneBTN.setText("Done");
        doneBTN.setBorderPainted(false);
        doneBTN.setFocusPainted(false);
        doneBTN.setPreferredSize(new java.awt.Dimension(80, 30));
        doneBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                doneBTNMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 7;
        jPanel2.add(doneBTN, gridBagConstraints);

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

    public static boolean isDateTimePast(String dateTimeString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);

        LocalDateTime currentDateTime = LocalDateTime.now();

        return currentDateTime.isAfter(dateTime);
    }
    
    private void getData(){
        try {
            String[][] historyData = database.CashierConnection.getHistoryStatus(accountID, "Waiting");
            model.setRowCount(0);

            if (historyData != null) {
                model.setRowCount(0);
                for (int i = (historyData.length - 1); i >= 0; i--) {
                    String transDate = historyData[i][2].replace(" / ", " ");
                    
                    if (isDateTimePast(transDate)){
                        database.CashierConnection.updateStatus(historyData[i][1], "Cancel");
                        
                        database.StudentConnection.makeHistory(historyData[i][0], historyData[i][1], historyData[i][3], historyData[i][0], "School", historyData[i][5], "Cancel");
                        continue;
                    }

                    Object[] newRow = {historyData[i][0], historyData[i][1], historyData[i][2], historyData[i][3], historyData[i][4], historyData[i][5]};
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

    private void doneBTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneBTNMouseReleased
        updateStatus("Complete");
    }//GEN-LAST:event_doneBTNMouseReleased

    private void cancelBTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBTNMouseReleased
        updateStatus("Cancel");
    }//GEN-LAST:event_cancelBTNMouseReleased

    private void searchIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchIDKeyTyped
        accountID = searchID.getText();
        getData();
    }//GEN-LAST:event_searchIDKeyTyped

    private void updateStatus(String status){
        int[] selectedRows = waitingTable.getSelectedRows();
        if (selectedRows.length != 0) {
            for (int i = 0; i < selectedRows.length; i++) {
                String account = waitingTable.getValueAt(selectedRows[i], 0).toString();
                String reference = waitingTable.getValueAt(selectedRows[i], 1).toString();
                String trans = waitingTable.getValueAt(selectedRows[i], 3).toString();
                String amount = waitingTable.getValueAt(selectedRows[i], 5).toString();

                database.CashierConnection.updateStatus(reference, status);
                database.StudentConnection.makeHistory(account, reference, trans, account, "School", amount, status);
            }
            getData();

            String msg = "The transaction has been successfully completed.";

            if (status.equals("Cancel")) {
                msg = "The transaction has successfully canceled.";
            }
            JOptionPane.showMessageDialog(null, msg,
                    null, JOptionPane.INFORMATION_MESSAGE); 
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBTN;
    private javax.swing.JButton doneBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBTN;
    private javax.swing.JTextField searchID;
    private javax.swing.JTable waitingTable;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;
    private String accountID = null;

}
