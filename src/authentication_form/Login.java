package authentication_form;

import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

public class Login extends javax.swing.JPanel {

    public Login() {
        initComponents();
        password.setEchoChar((char)0);
        access.setBackground(Color.WHITE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        passwordPanel = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        passwordBTN = new javax.swing.JLabel();
        loginBTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        newAccount = new javax.swing.JButton();
        access = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(550, 700));
        setMinimumSize(new java.awt.Dimension(550, 700));
        setPreferredSize(new java.awt.Dimension(550, 700));

        loginPanel.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 57, 57));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");

        email.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        email.setForeground(new java.awt.Color(193, 193, 193));
        email.setText("Email");
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        email.setMaximumSize(new java.awt.Dimension(400, 47));
        email.setMinimumSize(new java.awt.Dimension(400, 47));
        email.setPreferredSize(new java.awt.Dimension(400, 47));
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocus(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldLost(evt);
            }
        });

        passwordPanel.setBackground(new java.awt.Color(255, 255, 255));
        passwordPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        passwordPanel.setMaximumSize(new java.awt.Dimension(400, 47));
        passwordPanel.setMinimumSize(new java.awt.Dimension(400, 47));
        passwordPanel.setName(""); // NOI18N
        passwordPanel.setPreferredSize(new java.awt.Dimension(400, 47));

        password.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        password.setForeground(new java.awt.Color(193, 193, 193));
        password.setText("Password");
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocus(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldLost(evt);
            }
        });

        passwordBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        passwordBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passwordBTN.setIconTextGap(0);
        passwordBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(password)
            .addComponent(passwordBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        loginBTN.setBackground(new java.awt.Color(255, 57, 57));
        loginBTN.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        loginBTN.setForeground(new java.awt.Color(255, 255, 255));
        loginBTN.setText("Login");
        loginBTN.setBorderPainted(false);
        loginBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBTN.setFocusPainted(false);
        loginBTN.setMaximumSize(new java.awt.Dimension(400, 47));
        loginBTN.setMinimumSize(new java.awt.Dimension(400, 47));
        loginBTN.setPreferredSize(new java.awt.Dimension(400, 47));
        loginBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBTNMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(193, 193, 193));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 50, 20));

        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 5));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 410, 10));

        newAccount.setBackground(new java.awt.Color(255, 98, 88));
        newAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newAccount.setForeground(new java.awt.Color(255, 255, 255));
        newAccount.setText("Create new account");
        newAccount.setBorderPainted(false);
        newAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newAccount.setFocusPainted(false);
        newAccount.setMaximumSize(new java.awt.Dimension(400, 47));
        newAccount.setMinimumSize(new java.awt.Dimension(400, 47));
        newAccount.setPreferredSize(new java.awt.Dimension(400, 47));
        newAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newAccountMouseClicked(evt);
            }
        });

        access.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        access.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Cashier" }));
        access.setBorder(null);
        access.setFocusable(false);
        access.setPreferredSize(new java.awt.Dimension(72, 47));
        access.setRequestFocusEnabled(false);

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(access, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(newAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(access, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(125, 125, 125))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    boolean passwordShow = false;
    private void textFieldFocus(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFocus
        if (evt.getSource() == email && email.getText().equals("Email")){
            email.setForeground(new Color(28, 28, 28));
            email.setText("");
        }else if (evt.getSource() == password && String.valueOf(password.getPassword()).equals("Password")){
            password.setForeground(new Color(28, 28, 28));
            password.setText("");
            if(!passwordShow){
                password.setEchoChar('\u2022');
            }else{
                password.setEchoChar((char)0);
            }
        }
    }//GEN-LAST:event_textFieldFocus

    private void textFieldLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldLost
        if (evt.getSource() == email && email.getText().isEmpty()){
            email.setForeground(new Color(193, 193, 193));
            email.setText("Email");
        }else if (evt.getSource() == password && password.getPassword().length == 0){
            password.setForeground(new Color(193, 193, 193));
            password.setText("Password");
            password.setEchoChar((char)0);

        }
    }//GEN-LAST:event_textFieldLost

    ImageIcon showPassImg = new ImageIcon(getClass().getResource("/images/show.png"));
    ImageIcon hidePassImg = new ImageIcon(getClass().getResource("/images/hide.png"));
    private void passwordBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordBTNMouseClicked
        if (passwordShow) {
            if(password.isFocusOwner() || !String.valueOf(password.getPassword()).equals("Password")){
            password.setEchoChar('\u2022');
            }
            passwordBTN.setIcon(hidePassImg);
            passwordShow = !passwordShow;
        } else{
            if(password.isFocusOwner() || !String.valueOf(password.getPassword()).equals("Password")){
                password.setEchoChar((char)0);
            }
            passwordBTN.setIcon(showPassImg);
            passwordShow = !passwordShow;
        }
    }//GEN-LAST:event_passwordBTNMouseClicked

    private void loginBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBTNMouseClicked
        validation();
    }//GEN-LAST:event_loginBTNMouseClicked

    private void newAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newAccountMouseClicked
        Main.changeContent(new Signup());
    }//GEN-LAST:event_newAccountMouseClicked

    private void validation(){
        if (email.getText().equals("Email") || String.valueOf(password.getPassword()).equals("Password")){
            JOptionPane.showMessageDialog(null, "One of the required field is empty please check your input.",
                   null, JOptionPane.INFORMATION_MESSAGE);
           
        } else if (!email.getText().isEmpty() && !isValidEmail(email.getText())){
            JOptionPane.showMessageDialog(null, "Not Valid Email.",
                   null, JOptionPane.ERROR_MESSAGE);
          
        } else {
            SwingWorker <Void, Void> worker = new SwingWorker<Void, Void>(){
                @Override
                protected Void doInBackground() throws Exception {
                    String result = database.AuthConnection.authentication(email.getText(), String.valueOf(password.getPassword()), access.getSelectedItem().toString());
                    if (result != null) {
                        if (access.getSelectedItem().toString().equals("Student")) {
                            studentHome = new student_form.Dashboard(result);
                            studentHome.setVisible(true);    
                        }else {
                            cashierHome = new cashier_Form.Dashboard(result);
                            cashierHome.setVisible(true);
                        }
                                           

                        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(loginPanel);
                        parentFrame.dispose();
                        
                    }
                    return null;
                }
            };
            worker.execute();
        }
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> access;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginBTN;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton newAccount;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordBTN;
    private javax.swing.JPanel passwordPanel;
    // End of variables declaration//GEN-END:variables
    private student_form.Dashboard studentHome;
    private cashier_Form.Dashboard cashierHome;
}
