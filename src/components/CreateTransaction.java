package components;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import student_form.Dashboard;

public class CreateTransaction extends javax.swing.JPanel {

    public CreateTransaction() {
        initComponents();
        
        yearLevel.setBackground(Color.WHITE);
        semester.setBackground(Color.WHITE);
        course.setBackground(Color.WHITE);
        paymentCategory.setBackground(Color.WHITE);
        paymentMethod.setBackground(Color.WHITE);
        others.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        studentID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        yearLevel = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        semester = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        course = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        paymentMethod = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        others = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Create = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        paymentCategory = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

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
        jPanel1Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanel1.setLayout(jPanel1Layout);

        title.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 57, 57));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Create Transaction");
        title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 20, 0);
        jPanel1.add(title, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Student ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel5, gridBagConstraints);

        studentID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        studentID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        studentID.setPreferredSize(new java.awt.Dimension(300, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel1.add(studentID, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Year Level:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel9, gridBagConstraints);

        yearLevel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        yearLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        yearLevel.setBorder(null);
        yearLevel.setFocusable(false);
        yearLevel.setPreferredSize(new java.awt.Dimension(72, 42));
        yearLevel.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(yearLevel, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Semester:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel8, gridBagConstraints);

        semester.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        semester.setBorder(null);
        semester.setFocusable(false);
        semester.setPreferredSize(new java.awt.Dimension(72, 42));
        semester.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(semester, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Course:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel4, gridBagConstraints);

        course.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BS in Information Technology", "BS in Criminology", "BS in Psychology", "BS in Tourism Management", "BS in Accountancy", "Bachelor of Elementary Education" }));
        course.setBorder(null);
        course.setFocusable(false);
        course.setPreferredSize(new java.awt.Dimension(72, 42));
        course.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(course, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Payment Method:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel7, gridBagConstraints);

        paymentMethod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        paymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paylinker", "Face to Face" }));
        paymentMethod.setBorder(null);
        paymentMethod.setFocusable(false);
        paymentMethod.setPreferredSize(new java.awt.Dimension(72, 42));
        paymentMethod.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(paymentMethod, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Others:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel6, gridBagConstraints);

        others.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        others.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        others.setPreferredSize(new java.awt.Dimension(300, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        jPanel1.add(others, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Amount:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel10, gridBagConstraints);

        amount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        amount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        amount.setPreferredSize(new java.awt.Dimension(300, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        jPanel1.add(amount, gridBagConstraints);

        jPanel3.setOpaque(false);
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 39, 0};
        jPanel3Layout.rowHeights = new int[] {0};
        jPanel3.setLayout(jPanel3Layout);

        Create.setBackground(new java.awt.Color(255, 57, 57));
        Create.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Create.setForeground(new java.awt.Color(255, 255, 255));
        Create.setText("Create");
        Create.setBorderPainted(false);
        Create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Create.setFocusPainted(false);
        Create.setPreferredSize(new java.awt.Dimension(150, 40));
        Create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CreateMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 50, 0);
        jPanel3.add(Create, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 50, 0);
        jPanel3.add(back, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jPanel3, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Payment Category:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel11, gridBagConstraints);

        paymentCategory.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        paymentCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tuition Fee", "Books", "Registration Fee", "Medical Fee", "Dental Fee", "Library Fee", "Athletic Fee", "Laboratory Fee", "Guidance and Counseling Fee", "Others" }));
        paymentCategory.setBorder(null);
        paymentCategory.setFocusable(false);
        paymentCategory.setPreferredSize(new java.awt.Dimension(72, 42));
        paymentCategory.setRequestFocusEnabled(false);
        paymentCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                paymentCategoryItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(paymentCategory, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 30, 0);
        jPanel1.add(jSeparator1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 30, 0);
        jPanel1.add(jSeparator2, gridBagConstraints);

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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backToTrans(){
        Dashboard.contentPanel.removeAll();
        Dashboard.contentPanel.add(new student_form.Transaction());
        Dashboard.contentPanel.revalidate();
        Dashboard.contentPanel.repaint();
    }
    
    private void backMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseReleased
        backToTrans();
    }//GEN-LAST:event_backMouseReleased

    private void CreateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseReleased
        boolean isnum = amount.getText().matches("[0-9+.]+");
        boolean isOtherShow = others.isEnabled()&& others.getText().isEmpty();
        
        if (studentID.getText().isEmpty() || isOtherShow || amount.getText().isEmpty()){
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
    }//GEN-LAST:event_CreateMouseReleased

    private void paymentCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_paymentCategoryItemStateChanged
        if (paymentCategory.getSelectedItem().toString().equals("Others")){
            others.setEnabled(true);
        }
        else {
            others.setText("");
            others.setEnabled(false);
        }

    }//GEN-LAST:event_paymentCategoryItemStateChanged
        
    private void checkFields(boolean isNum){
        String currentBalance;
        if (isNum && ! amount.getText().equals(".")) {
            try {
                if (paymentMethod.getSelectedIndex() == 0) {
                    currentBalance = database.StudentConnection.getBalance(Dashboard.getAccountId());
                    
                    if (Float.parseFloat(currentBalance) < Float.parseFloat(amount.getText())) {
                        JOptionPane.showMessageDialog(null, "You dont have enought balance.",
                                null, JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        try {
                            String trans = paymentCategory.getSelectedItem().toString();
                            String year = yearLevel.getSelectedItem().toString();
                            String sem = semester.getSelectedItem().toString();
                            String c = course.getSelectedItem().toString();
                            
                            if (others.isEnabled()){
                                trans = others.getText();
                            }
                            
                            
                            float newbal = Float.parseFloat(currentBalance) - Float.parseFloat(amount.getText());

                            database.StudentConnection.updateBalance(String.valueOf(newbal), Dashboard.getAccountId());
                            database.StudentConnection.makeHistory(Dashboard.getAccountId(), null, trans, Dashboard.getAccountId(), "School", amount.getText(), "Complete");
                            database.transactionConnections.transactionCreator(Dashboard.getAccountId(), trans, studentID.getText(), year, sem, c, amount.getText(), "Complete");
                            JOptionPane.showMessageDialog(null, "Transaction Created Successful.",
                                    null, JOptionPane.INFORMATION_MESSAGE);
                                backToTrans();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Connection Error.",
                                    null, JOptionPane.INFORMATION_MESSAGE);
                        }
                    }                    
                }
                else {
                    try {
                        String trans = paymentCategory.getSelectedItem().toString();
                        String year = yearLevel.getSelectedItem().toString();
                        String sem = semester.getSelectedItem().toString();
                        String c = course.getSelectedItem().toString();
                        
                        if (others.isEnabled()){
                                trans = others.getText();
                        }
                        
                        database.transactionConnections.transactionCreator(Dashboard.getAccountId(), trans, studentID.getText(), year, sem, c, amount.getText(), "Pending");
                        JOptionPane.showMessageDialog(null, "Transaction Created Successful.",
                                null, JOptionPane.INFORMATION_MESSAGE);
                        backToTrans();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Connection Error.",
                                null, JOptionPane.INFORMATION_MESSAGE);
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
    private javax.swing.JButton Create;
    private javax.swing.JTextField amount;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField others;
    private javax.swing.JComboBox<String> paymentCategory;
    private javax.swing.JComboBox<String> paymentMethod;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JTextField studentID;
    private javax.swing.JLabel title;
    private javax.swing.JComboBox<String> yearLevel;
    // End of variables declaration//GEN-END:variables
}
