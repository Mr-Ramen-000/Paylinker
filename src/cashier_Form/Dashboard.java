package cashier_Form;

import java.awt.Color;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard(String id){
        accountID = id;
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        changeContent(new cashier_Form.Home());
        home.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nav = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        pendings = new javax.swing.JButton();
        waiting = new javax.swing.JButton();
        history = new javax.swing.JButton();
        account = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        topPanel = new javax.swing.JPanel();
        buttons = new javax.swing.JPanel();
        minimizeBTN = new javax.swing.JLabel();
        closeBTN = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        nav.setBackground(new java.awt.Color(0, 51, 255));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left_menu_logo.png"))); // NOI18N
        logo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        home.setBackground(new java.awt.Color(0, 102, 255));
        home.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        home.setFocusPainted(false);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                navigationBTN(evt);
            }
        });

        pendings.setBackground(new java.awt.Color(0, 102, 255));
        pendings.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        pendings.setForeground(new java.awt.Color(255, 255, 255));
        pendings.setText("Pending");
        pendings.setBorder(null);
        pendings.setFocusPainted(false);
        pendings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                navigationBTN(evt);
            }
        });
        pendings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingsActionPerformed(evt);
            }
        });

        waiting.setBackground(new java.awt.Color(0, 102, 255));
        waiting.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        waiting.setForeground(new java.awt.Color(255, 255, 255));
        waiting.setText("Waiting");
        waiting.setBorder(null);
        waiting.setFocusPainted(false);
        waiting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                navigationBTN(evt);
            }
        });

        history.setBackground(new java.awt.Color(0, 102, 255));
        history.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        history.setForeground(new java.awt.Color(255, 255, 255));
        history.setText("History");
        history.setBorder(null);
        history.setFocusPainted(false);
        history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                navigationBTN(evt);
            }
        });

        account.setBackground(new java.awt.Color(0, 102, 255));
        account.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        account.setForeground(new java.awt.Color(255, 255, 255));
        account.setText("Account");
        account.setBorder(null);
        account.setFocusPainted(false);
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                navigationBTN(evt);
            }
        });

        logout.setBackground(new java.awt.Color(0, 102, 255));
        logout.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.setBorder(null);
        logout.setFocusPainted(false);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                navigationBTN(evt);
            }
        });

        javax.swing.GroupLayout navLayout = new javax.swing.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pendings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(waiting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(history, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pendings, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waiting, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        topPanel.setBackground(new java.awt.Color(255, 255, 255));
        topPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topPanelMouseDragged(evt);
            }
        });
        topPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                topPanelMouseReleased(evt);
            }
        });

        buttons.setOpaque(false);
        buttons.setLayout(new java.awt.GridBagLayout());

        minimizeBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize.png"))); // NOI18N
        minimizeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minimizeBTNMouseReleased(evt);
            }
        });
        buttons.add(minimizeBTN, new java.awt.GridBagConstraints());

        closeBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        closeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeBTNMouseReleased(evt);
            }
        });
        buttons.add(closeBTN, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setRequestFocusEnabled(false);

        contentPanel.setBackground(new java.awt.Color(240, 240, 240));
        contentPanel.setLayout(new java.awt.CardLayout());
        jScrollPane1.setViewportView(contentPanel);

        jScrollPane1.getVerticalScrollBar().setUnitIncrement(10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public static String getAccountId(){
        return accountID;
    }
    
    private void closeBTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBTNMouseReleased
        System.exit(0);
    }//GEN-LAST:event_closeBTNMouseReleased

    private void minimizeBTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBTNMouseReleased
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeBTNMouseReleased
    
    String currentNav = "Home";
    private void navigationBTN(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navigationBTN
        JButton button = (JButton)evt.getComponent();
        String clickedBTN = button.getText();
       
        if (clickedBTN.equals("Home") && !currentNav.equals("Home")) {
            changeContent(new Home());
            home.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
            currentNav = "Home";
                
        }else if (clickedBTN.equals("Pending") && !currentNav.equals("Pending")) {
            changeContent(new Pendings());
            pendings.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
            currentNav = "Pending";

        }else if (clickedBTN.equals("Waiting") && !currentNav.equals("Waiting")) {
            changeContent(new cashier_Form.Waitings());
            waiting.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
            currentNav = "Waiting";
            
            
        }else if (clickedBTN.equals("History") && !currentNav.equals("History")) {
            changeContent(new cashier_Form.History());
            history.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
            currentNav = "History";

        
        }else if (clickedBTN.equals("Account") && !currentNav.equals("Account")) {
            changeContent(new cashier_Form.Account());
            account.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
            currentNav = "Account";
        
        }else if (clickedBTN.equals("Logout")) {
            int result = JOptionPane.showConfirmDialog(null, "Do you want to logout?", null, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

            if (result == JOptionPane.YES_OPTION) {
                new authentication_form.Main().setVisible(true);                       
                this.dispose();
            }
        }
    }//GEN-LAST:event_navigationBTN

    private Point mouseOffset;
    private void topPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topPanelMousePressed
        mouseOffset = evt.getPoint();
    }//GEN-LAST:event_topPanelMousePressed

    private void topPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topPanelMouseDragged
        Point currentLocation = this.getLocation();
        this.setLocation(currentLocation.x + evt.getX() - mouseOffset.x,
                         currentLocation.y + evt.getY() - mouseOffset.y);
    }//GEN-LAST:event_topPanelMouseDragged

    private void topPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topPanelMouseReleased
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_topPanelMouseReleased

    private void pendingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pendingsActionPerformed

    private void changeContent(JPanel content){
        home.setBorder(null);
        pendings.setBorder(null);
        waiting.setBorder(null);
        history.setBorder(null);
        account.setBorder(null);

        contentPanel.removeAll();
        contentPanel.add(content);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account;
    private javax.swing.JPanel buttons;
    private javax.swing.JLabel closeBTN;
    public static javax.swing.JPanel contentPanel;
    private javax.swing.JButton history;
    private javax.swing.JButton home;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logout;
    private javax.swing.JLabel minimizeBTN;
    private javax.swing.JPanel nav;
    private javax.swing.JButton pendings;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton waiting;
    // End of variables declaration//GEN-END:variables
    //"26214735"
    public static String accountID = "";
}
