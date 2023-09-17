package components;

import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import student_form.Home;
import student_form.Dashboard;

public class Send extends javax.swing.JPanel {

    public Send() {
        initComponents();
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
        accountID = new javax.swing.JTextField();
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
        title.setText("SEND CASH");
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
        amount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        amount.setPreferredSize(new java.awt.Dimension(300, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel1.add(amount, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Account ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel5, gridBagConstraints);

        accountID.setBackground(new java.awt.Color(255, 255, 255));
        accountID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        accountID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        accountID.setPreferredSize(new java.awt.Dimension(300, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel1.add(accountID, gridBagConstraints);

        jPanel3.setOpaque(false);
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 39, 0};
        jPanel3Layout.rowHeights = new int[] {0};
        jPanel3.setLayout(jPanel3Layout);

        submit.setBackground(new java.awt.Color(255, 57, 57));
        submit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Send");
        submit.setBorderPainted(false);
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

    private void backToHome(){
        Dashboard.contentPanel.removeAll();
        Dashboard.contentPanel.add(new Home());
        Dashboard.contentPanel.revalidate();
        Dashboard.contentPanel.repaint();
    }
    
    private void backMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseReleased
        backToHome();
    }//GEN-LAST:event_backMouseReleased

    private void submitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseReleased
        boolean isnum = amount.getText().matches("[0-9+.]+");
        
        if (amount.getText().isEmpty() || accountID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "One of the required field is empty please check your input.",
                       null, JOptionPane.INFORMATION_MESSAGE);
        } else {
            SwingWorker <Void, Void> worker = new SwingWorker<Void, Void>(){
                @Override
                protected Void doInBackground() throws Exception {
                    checkFields(isnum);
                    return null;
                }
            };
            worker.execute();
        }
    }//GEN-LAST:event_submitMouseReleased

    private void checkFields(boolean isNum){
        String currentBalance = database.StudentConnection.getBalance(Dashboard.getAccountId());
        
        if (isNum && !amount.getText().equals(".")) {
            try {
                if (Float.parseFloat(amount.getText()) < 50) {
                JOptionPane.showMessageDialog(null, "Minimum amount is 50",
                       null, JOptionPane.INFORMATION_MESSAGE);
                } else if (Float.parseFloat(currentBalance) < Float.parseFloat(amount.getText())){
                    JOptionPane.showMessageDialog(null, "You dont have enought balance.",
                           null, JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (!database.AuthConnection.idAlreadyExisted(accountID.getText())) {
                        JOptionPane.showMessageDialog(null, "Account ID not found.",
                           null, JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        if (!accountID.getText().equals(Dashboard.getAccountId())) {
                            try {
                                database.StudentConnection.transferBalance(accountID.getText(), Dashboard.getAccountId(), amount.getText());
                                JOptionPane.showMessageDialog(null, "Transfer Balance Successful.",
                                        null, JOptionPane.INFORMATION_MESSAGE);
                                backToHome();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Connection Error.",
                                        null, JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Invalid Transaction.",
                                        null, JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Check your input.",
                           null, JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Check your input.",
                           null, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountID;
    private javax.swing.JTextField amount;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton submit;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
