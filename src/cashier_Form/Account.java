package cashier_Form;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Account extends javax.swing.JPanel {

    public Account() {
        initComponents();
        
        cashierInfo = database.CashierConnection.cashierInfo(Dashboard.getAccountId());
        
        accountIdField.setText(Dashboard.getAccountId());
        firstname.setText(cashierInfo[0]);
        lastname.setText(cashierInfo[1]);
        email.setText(cashierInfo[2]);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        copyBTN = new javax.swing.JLabel();
        accountIdField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        updateBasicInfo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        oldPassword = new javax.swing.JPasswordField();
        hideBTN1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        newPassword = new javax.swing.JPasswordField();
        hideBTN2 = new javax.swing.JLabel();
        updateSecurity = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Account");

        jPanel1.setMinimumSize(new java.awt.Dimension(1768, 367));
        jPanel1.setOpaque(false);
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 20, 0, 20, 0};
        jPanel1Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanel1.setLayout(jPanel1Layout);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Basic Information");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Account ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel3, gridBagConstraints);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        jPanel15.setMaximumSize(new java.awt.Dimension(400, 47));
        jPanel15.setMinimumSize(new java.awt.Dimension(400, 47));
        jPanel15.setName(""); // NOI18N
        jPanel15.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel15.setRequestFocusEnabled(false);

        copyBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copy.png"))); // NOI18N
        copyBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        copyBTN.setIconTextGap(0);
        copyBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                copyBTNMouseReleased(evt);
            }
        });

        accountIdField.setEditable(false);
        accountIdField.setBackground(new java.awt.Color(255, 255, 255));
        accountIdField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        accountIdField.setForeground(new java.awt.Color(193, 193, 193));
        accountIdField.setBorder(null);
        accountIdField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(accountIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(copyBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(copyBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(accountIdField)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jPanel15, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("First Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel4, gridBagConstraints);

        firstname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        firstname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        firstname.setPreferredSize(new java.awt.Dimension(300, 40));
        firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dataChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel1.add(firstname, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Last Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel5, gridBagConstraints);

        lastname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lastname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        lastname.setPreferredSize(new java.awt.Dimension(300, 40));
        lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dataChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        jPanel1.add(lastname, gridBagConstraints);

        updateBasicInfo.setBackground(new java.awt.Color(0, 102, 255));
        updateBasicInfo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateBasicInfo.setForeground(new java.awt.Color(255, 255, 255));
        updateBasicInfo.setText("Update");
        updateBasicInfo.setBorderPainted(false);
        updateBasicInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBasicInfo.setEnabled(false);
        updateBasicInfo.setFocusPainted(false);
        updateBasicInfo.setPreferredSize(new java.awt.Dimension(85, 40));
        updateBasicInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateBasicInfoMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(updateBasicInfo, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Security");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 20, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel13, gridBagConstraints);

        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        email.setPreferredSize(new java.awt.Dimension(300, 40));
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dataChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        jPanel1.add(email, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Old Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 6;
        jPanel1.add(jLabel14, gridBagConstraints);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        jPanel16.setMaximumSize(new java.awt.Dimension(400, 47));
        jPanel16.setMinimumSize(new java.awt.Dimension(400, 47));
        jPanel16.setName(""); // NOI18N
        jPanel16.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel16.setRequestFocusEnabled(false);

        oldPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        oldPassword.setBorder(null);
        oldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dataChange(evt);
            }
        });

        hideBTN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hideBTN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        hideBTN1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hideBTN1.setIconTextGap(0);
        hideBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(oldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(hideBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(oldPassword)
            .addComponent(hideBTN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        jPanel1.add(jPanel16, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("New Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel11, gridBagConstraints);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        jPanel14.setMaximumSize(new java.awt.Dimension(400, 47));
        jPanel14.setMinimumSize(new java.awt.Dimension(400, 47));
        jPanel14.setName(""); // NOI18N
        jPanel14.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel14.setRequestFocusEnabled(false);

        newPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        newPassword.setBorder(null);
        newPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dataChange(evt);
            }
        });

        hideBTN2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hideBTN2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        hideBTN2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hideBTN2.setIconTextGap(0);
        hideBTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passwordBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(hideBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newPassword)
            .addComponent(hideBTN2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        jPanel1.add(jPanel14, gridBagConstraints);

        updateSecurity.setBackground(new java.awt.Color(0, 102, 255));
        updateSecurity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateSecurity.setForeground(new java.awt.Color(255, 255, 255));
        updateSecurity.setText("Update");
        updateSecurity.setBorderPainted(false);
        updateSecurity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateSecurity.setEnabled(false);
        updateSecurity.setFocusPainted(false);
        updateSecurity.setPreferredSize(new java.awt.Dimension(85, 40));
        updateSecurity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateSecurityMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(updateSecurity, gridBagConstraints);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dataChange(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataChange
        if (evt.getComponent() == firstname || evt.getComponent() == lastname) {       
            if (!firstname.getText().equals(cashierInfo[0]) || !lastname.getText().equals(cashierInfo[1])) {
                updateBasicInfo.setEnabled(true);
            }
            else{
                updateBasicInfo.setEnabled(false);
            }
       
        }
        else if(evt.getComponent() == email || evt.getComponent() == oldPassword || evt.getComponent() == newPassword) {
            if (!email.getText().equals(cashierInfo[2]) || oldPassword.getPassword().length != 0 || newPassword.getPassword().length != 0) {
                updateSecurity.setEnabled(true);
            }
            else{
                updateSecurity.setEnabled(false);
            }
        
        }
    }//GEN-LAST:event_dataChange

    private void updateBasicInfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBasicInfoMouseReleased
        if (updateBasicInfo.isEnabled()) {
            if (firstname.getText().isEmpty() || lastname.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "One of the required field is empty please check your input.",
                       null, JOptionPane.INFORMATION_MESSAGE);
            } else {
                boolean update = database.CashierConnection.updateBasicInfo(firstname.getText(), lastname.getText(), Dashboard.getAccountId());
                if (update) {
                    updateBasicInfo.setEnabled(false);
                    cashierInfo = database.CashierConnection.cashierInfo(Dashboard.getAccountId());
                    JOptionPane.showMessageDialog(null, "Basic Information Update Successful.", 
                       null, JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Connection Error", 
                       null, JOptionPane.WARNING_MESSAGE);

                }
            }
        }
    }//GEN-LAST:event_updateBasicInfoMouseReleased

    private void updateSecurityMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateSecurityMouseReleased
        if (updateSecurity.isEnabled()) {
            if (email.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "One of the required field is empty please check your input.",
                       null, JOptionPane.INFORMATION_MESSAGE);
            
            } else if (!email.getText().isEmpty() && !isValidEmail(email.getText())){
                JOptionPane.showMessageDialog(null, "Not Valid Email.",
                       null, JOptionPane.ERROR_MESSAGE);
                
            } else if (oldPassword.getPassword().length != 0 || newPassword.getPassword().length != 0){
                if (oldPassword.getPassword().length == 0 || newPassword.getPassword().length == 0){
                    JOptionPane.showMessageDialog(null, "One of the required field is empty please check your input.",
                       null, JOptionPane.INFORMATION_MESSAGE);
                
                } else if (!(newPassword.getPassword().length >= 8)){
                    JOptionPane.showMessageDialog(null, "Please enter a password of 8 characters or more.",
                           null, JOptionPane.INFORMATION_MESSAGE);

                } else if (!(String.valueOf(oldPassword.getPassword()).equals(cashierInfo[3]))){
                    JOptionPane.showMessageDialog(null, "Make sure your old password is match.",
                           null, JOptionPane.INFORMATION_MESSAGE);

                } else {
                    cashierSecurityUpdate();
                }
                
            } else {
                cashierSecurityUpdate();
            }
        }
    }//GEN-LAST:event_updateSecurityMouseReleased

    private void copyBTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copyBTNMouseReleased
        StringSelection stringSelection = new StringSelection (accountIdField.getText());
        Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
        clpbrd.setContents (stringSelection, null);
        JOptionPane.showMessageDialog(null, "Account ID are copied.", 
                       null, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_copyBTNMouseReleased

    boolean passwordShow1 = false;
    boolean passwordShow2 = false;

    ImageIcon showPassImg = new ImageIcon(getClass().getResource("/images/show.png"));
    ImageIcon hidePassImg = new ImageIcon(getClass().getResource("/images/hide.png"));
    private void passwordBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordBTNMouseClicked
        if (evt.getComponent() == hideBTN1) {
            passwordShow1 = passwordShowHide(oldPassword, hideBTN1, passwordShow1);
        } else{
            passwordShow2 = passwordShowHide(newPassword, hideBTN2, passwordShow2);
        }
    }//GEN-LAST:event_passwordBTNMouseClicked
    
    private boolean passwordShowHide(JPasswordField field, JLabel passBTN, boolean isShow){
        if (isShow) {
            field.setEchoChar('\u2022');
            
            passBTN.setIcon(hidePassImg);
            return !isShow;
        } else{
            field.setEchoChar((char)0);
         
            passBTN.setIcon(showPassImg);
            return !isShow;
        }
    }
    
    private void cashierSecurityUpdate(){
        boolean update = database.CashierConnection.updateSecurityInfo(email.getText(), String.valueOf(newPassword.getPassword()), Dashboard.getAccountId());
            if (update) {
                
                updateSecurity.setEnabled(false);
                cashierInfo = database.CashierConnection.cashierInfo(Dashboard.getAccountId());
                JOptionPane.showMessageDialog(null, "Security Information Update Successful.", 
                       null, JOptionPane.INFORMATION_MESSAGE);
                oldPassword.setText("");
                newPassword.setText("");
            }
            else {
                JOptionPane.showMessageDialog(null, "Connection Error", 
                       null, JOptionPane.WARNING_MESSAGE);

            }
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountIdField;
    private javax.swing.JLabel copyBTN;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel hideBTN1;
    private javax.swing.JLabel hideBTN2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastname;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JPasswordField oldPassword;
    private javax.swing.JButton updateBasicInfo;
    private javax.swing.JButton updateSecurity;
    // End of variables declaration//GEN-END:variables
    private String[] cashierInfo;
}
