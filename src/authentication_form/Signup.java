package authentication_form;

import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class Signup extends javax.swing.JPanel {

    public Signup() {
        initComponents();
        password.setEchoChar((char)0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        passwordBTN = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginBTN = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(550, 700));
        setMinimumSize(new java.awt.Dimension(550, 700));
        setPreferredSize(new java.awt.Dimension(550, 700));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 57, 57));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Signup");

        firstname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        firstname.setForeground(new java.awt.Color(193, 193, 193));
        firstname.setText("First Name");
        firstname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocus(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldLost(evt);
            }
        });

        lastname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lastname.setForeground(new java.awt.Color(193, 193, 193));
        lastname.setText("Last Name");
        lastname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocus(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldLost(evt);
            }
        });

        email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        email.setForeground(new java.awt.Color(193, 193, 193));
        email.setText("Email");
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocus(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldLost(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(193, 193, 193)));
        jPanel3.setMaximumSize(new java.awt.Dimension(400, 47));
        jPanel3.setMinimumSize(new java.awt.Dimension(400, 47));
        jPanel3.setName(""); // NOI18N

        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(passwordBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        submit.setBackground(new java.awt.Color(255, 57, 57));
        submit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.setBorderPainted(false);
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.setFocusPainted(false);
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                submitMouseReleased(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(28, 28, 28));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Already have an account?");
        jPanel4.add(jLabel1);

        loginBTN.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        loginBTN.setForeground(new java.awt.Color(102, 153, 255));
        loginBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBTN.setText("Login");
        loginBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBTNMouseClicked(evt);
            }
        });
        jPanel4.add(loginBTN);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(submit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    boolean passwordShow = false;
    private void textFieldFocus(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFocus
        if (evt.getSource() == firstname && firstname.getText().equals("First Name")){
            firstname.setForeground(new Color(28, 28, 28));
            firstname.setText("");
            
        }else if (evt.getSource() == lastname && lastname.getText().equals("Last Name")){
            lastname.setForeground(new Color(28, 28, 28));
            lastname.setText("");
            
        }else if (evt.getSource() == email && email.getText().equals("Email")){
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
        if (evt.getSource() == firstname && firstname.getText().isEmpty()){
            firstname.setForeground(new Color(193, 193, 193));
            firstname.setText("First Name");
            
        }else if (evt.getSource() == lastname && lastname.getText().isEmpty()){
            lastname.setForeground(new Color(193, 193, 193));
            lastname.setText("Last Name");
            
        }if (evt.getSource() == email && email.getText().isEmpty()){
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

    private void submitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseReleased
        validation();
    }//GEN-LAST:event_submitMouseReleased

    private void validation(){
        if (firstname.getText().equals("First Name") || 
            lastname.getText().equals("Last Name") ||
            email.getText().equals("Email") ||
            String.valueOf(password.getPassword()).equals("Password")){
            
            JOptionPane.showMessageDialog(null, "One of the required field is empty please check your input.",
                   null, JOptionPane.INFORMATION_MESSAGE);
           
        } else if (!email.getText().isEmpty() && !isValidEmail(email.getText())){
            JOptionPane.showMessageDialog(null, "Not Valid Email.",
                   null, JOptionPane.ERROR_MESSAGE);
            
        } else if (!(password.getPassword().length >= 8)){
            JOptionPane.showMessageDialog(null, "Please enter a password of 8 characters or more.",
                   null, JOptionPane.INFORMATION_MESSAGE);
          
        } else {
            SwingWorker <Void, Void> worker = new SwingWorker<Void, Void>(){
                @Override
                protected Void doInBackground() throws Exception {
                    boolean result = database.AuthConnection.signupClientAccount(
                            firstname.getText(),
                            lastname.getText(),
                            email.getText(),
                            String.valueOf(password.getPassword()));
                    
                    if (result) {
                        JOptionPane.showMessageDialog(null, "Congratulations, your account\n has been successfully created.","SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                        Main.changeContent(new Login());
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
    
    private void loginBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBTNMouseClicked
        Main.changeContent(new Login());

    }//GEN-LAST:event_loginBTNMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel loginBTN;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordBTN;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
