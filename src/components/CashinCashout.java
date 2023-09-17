package components;

import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import student_form.Home;
import student_form.Dashboard;

public class CashinCashout extends javax.swing.JPanel {

    public CashinCashout(boolean iscahsIn) {
        initComponents();
        
        this.isCashIN = iscahsIn;
        
        if (this.isCashIN) {
            title.setText("CASH-IN");
        } else {
            title.setText("CASH-OUT");
        }
        
        SwingWorker <Void, Void> worker = new SwingWorker<Void, Void>(){
            @Override
            protected Void doInBackground() throws Exception {
                currentBalance = database.StudentConnection.getBalance(Dashboard.getAccountId());
                newBalance.setText(String.format("%.2f", Float.valueOf(currentBalance))); 
                return null;
            }
        };
        worker.execute();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        newBalance = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        submit = new javax.swing.JButton();
        back = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 350));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 350));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 350));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setMaximumSize(new java.awt.Dimension(356, 220));
        jPanel1.setMinimumSize(new java.awt.Dimension(356, 219));
        jPanel1.setOpaque(false);
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 20, 0, 20, 0};
        jPanel1Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0};
        jPanel1.setLayout(jPanel1Layout);

        title.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 57, 57));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CASH-IN");
        title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 20, 0);
        jPanel1.add(title, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Amount:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel4, gridBagConstraints);

        amount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        amount.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        amount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        amount.setPreferredSize(new java.awt.Dimension(300, 40));
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel1.add(amount, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Balance:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel5, gridBagConstraints);

        newBalance.setEditable(false);
        newBalance.setBackground(new java.awt.Color(255, 255, 255));
        newBalance.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        newBalance.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        newBalance.setFocusable(false);
        newBalance.setPreferredSize(new java.awt.Dimension(300, 40));
        newBalance.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel1.add(newBalance, gridBagConstraints);

        jPanel3.setOpaque(false);
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 39, 0};
        jPanel3Layout.rowHeights = new int[] {0};
        jPanel3.setLayout(jPanel3Layout);

        submit.setBackground(new java.awt.Color(255, 57, 57));
        submit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.setBorderPainted(false);
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.setEnabled(false);
        submit.setFocusPainted(false);
        submit.setPreferredSize(new java.awt.Dimension(150, 40));
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                submitMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 50, 0);
        jPanel3.add(submit, gridBagConstraints);

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.setBorderPainted(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setFocusPainted(false);
        back.setPreferredSize(new java.awt.Dimension(150, 40));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 50, 0);
        jPanel3.add(back, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel2.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyReleased
        boolean isnum = amount.getText().matches("[0-9+.]+");
        float temp = Float.parseFloat(currentBalance);
        
        if(isnum){
            if (amount.getText().length() <= 8 && !amount.getText().equals(".")) {
                try {
                    if (isCashIN) {
                        temp = Float.valueOf(currentBalance) + Float.valueOf(amount.getText());
                        newBalance.setText(String.format("%.2f", temp));
                        submit.setEnabled(true);

                    } else {
                        temp = Float.parseFloat(currentBalance) - Float.parseFloat(amount.getText());
                        if (temp < 0) {
                            newBalance.setText(String.format("%.2f", temp));
                            submit.setEnabled(false);
                        } else {
                            newBalance.setText(String.format("%.2f", temp));
                            submit.setEnabled(true);
                        }
                    }
                } catch (Exception e) {
                    newBalance.setText(String.valueOf("Error"));
                    submit.setEnabled(false);
                }
                
            } else {
                newBalance.setText(String.valueOf("Error"));
                submit.setEnabled(false);
            }
        } else {
            if (amount.getText().isEmpty()) {
                newBalance.setText(String.format("%.2f", temp));
                submit.setEnabled(false);
            }
            else {
                newBalance.setText(String.valueOf("Error"));
                submit.setEnabled(false);
            }
        }
    }//GEN-LAST:event_amountKeyReleased

    private void submitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseReleased
        if(isCashIN && submit.isEnabled()){
            newbal = Float.valueOf(currentBalance) + Float.valueOf(amount.getText());
            
            if (newbal < 0) {
                JOptionPane.showMessageDialog(null, "Invalid Input.",
                   null, JOptionPane.WARNING_MESSAGE);
            }
            else if (newbal > 10000) {
                JOptionPane.showMessageDialog(null, "Maximum cash-in is 10,000.",
                   null, JOptionPane.WARNING_MESSAGE);
            }
            else {
                balanceUpadate();
            }
        } else if(!isCashIN && submit.isEnabled()){
            newbal = Float.valueOf(currentBalance) - Float.valueOf(amount.getText());
            
            if (newbal < 0) {
                JOptionPane.showMessageDialog(null, "You dont have enough balance.",
                   null, JOptionPane.WARNING_MESSAGE);
            }
            else if (Float.parseFloat(amount.getText()) < 50) {
                JOptionPane.showMessageDialog(null, "Minimum cash-out is 50.",
                   null, JOptionPane.WARNING_MESSAGE);
            }
            else {
                balanceUpadate();
            }
        }
    }//GEN-LAST:event_submitMouseReleased

    private void balanceUpadate(){
        SwingWorker <Void, Void> worker = new SwingWorker<Void, Void>(){
                @Override
                protected Void doInBackground() throws Exception {
                    String transaction = isCashIN? "Cash-In" : "Cash-Out";
                    String sender = isCashIN ? "Student" : "Bank";
                    String reciever = isCashIN ? "Bank" : "Student";
                    
                    database.StudentConnection.makeHistory(Dashboard.getAccountId(), null, transaction, sender , reciever, amount.getText(), "Complete");
                    database.StudentConnection.updateBalance(String.format("%.2f", newbal), Dashboard.getAccountId());
                    JOptionPane.showMessageDialog(null, isCashIN? "Cash-In Successful." : "Cash-Out Successful.",
                            null, JOptionPane.INFORMATION_MESSAGE);
                    newbal = 0;
                    backToHome();
                    return null;
                }
            };
            worker.execute();
    }
    
    private void backMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseReleased
        backToHome();
    }//GEN-LAST:event_backMouseReleased

    private void backToHome(){
        Dashboard.contentPanel.removeAll();
        Dashboard.contentPanel.add(new Home());
        Dashboard.contentPanel.revalidate();
        Dashboard.contentPanel.repaint();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField newBalance;
    private javax.swing.JButton submit;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
    private String currentBalance;
    private boolean isCashIN;
    private float newbal;
}
