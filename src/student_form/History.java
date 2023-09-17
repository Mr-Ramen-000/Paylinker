package student_form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class History extends javax.swing.JPanel {
    
    public History() {
        initComponents();
        model = (DefaultTableModel) historyTable.getModel();
        
        JTableHeader tableHeader = historyTable.getTableHeader();
        tableHeader.setBackground(new Color(255,57,57));
        tableHeader.setForeground(Color.WHITE);
        tableHeader.setFont(new Font("Arial", Font.BOLD, 13));
        tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(), 50));
        
        
        try {
            String[][] historyData = database.StudentConnection.getHistory(Dashboard.getAccountId());

            if (historyData != null) {
                model.setRowCount(0);
                for (int i = (historyData.length - 1); i >= 0; i--) {
                    String formatTimeDate = historyData[i][1].replace(", ", " / ");

                    Object[] newRow = {historyData[i][0], formatTimeDate, historyData[i][2], historyData[i][3], historyData[i][4], historyData[i][5], historyData[i][6]};
                    model.addRow(newRow);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Error.",
                                null, JOptionPane.WARNING_MESSAGE);
        }
        
        
        
        refreshHistory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 57, 57));
        jLabel1.setText("History");

        jScrollPane1.setBorder(null);

        historyTable.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reference #", "Date/Time", "Transaction", "Sender", "Recipient", "Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historyTable.setEnabled(false);
        historyTable.setFillsViewportHeight(true);
        historyTable.setFocusable(false);
        historyTable.setGridColor(new java.awt.Color(193, 193, 193));
        historyTable.setMaximumSize(new java.awt.Dimension(2147483647, 300));
        historyTable.setRowHeight(50);
        historyTable.setShowGrid(true);
        historyTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(historyTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addGap(40, 40, 40))
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

    private void refreshHistory(){
        
        SwingWorker <Void, Void> worker = new SwingWorker<Void, Void>(){
            @Override
            protected Void doInBackground() throws Exception {
                Timer timer = new Timer(1000, (e) -> {
                    String[][] historyData = database.StudentConnection.getHistory(Dashboard.getAccountId());
                    model.setRowCount(0);
                    if (historyData != null) {  
                        for (int i = (historyData.length - 1); i >= 0; i--) {
                            String formatTimeDate = historyData[i][1].replace(", ", " / ");

                            Object[] newRow = {historyData[i][0], formatTimeDate, historyData[i][2], historyData[i][3], historyData[i][4], historyData[i][5], historyData[i][6]};
                            model.addRow(newRow);
                        }
                    }
                });
                
                timer.start();
                
                return null;
            }
        };
        worker.execute();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable historyTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;
}
