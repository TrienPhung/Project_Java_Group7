/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginRegister;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Register() {
        initComponents();
        this.iconHideDisplay.setVisible(false);
        this.iconHideDisplayConfirm.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Username = new javax.swing.JLabel();
        ConfirmPassword = new javax.swing.JLabel();
        textUsername = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnBacktoLogin = new javax.swing.JButton();
        Email = new javax.swing.JLabel();
        textPassword = new javax.swing.JPasswordField();
        Password = new javax.swing.JLabel();
        textConfirmPassword = new javax.swing.JPasswordField();
        textEmail = new javax.swing.JTextField();
        iconDisplay = new javax.swing.JLabel();
        iconHideDisplay = new javax.swing.JLabel();
        iconDisplayConfirm = new javax.swing.JLabel();
        iconHideDisplayConfirm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setBackground(new java.awt.Color(255, 255, 255));

        Username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Username.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User.png"))); // NOI18N
        Username.setText("Username");

        ConfirmPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConfirmPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Confirm_Password.png"))); // NOI18N
        ConfirmPassword.setText("Confirm Password");

        textUsername.setForeground(new java.awt.Color(0, 0, 0));
        textUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsernameActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(102, 255, 255));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 0, 0));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Register");

        btnBacktoLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBacktoLogin.setForeground(new java.awt.Color(0, 0, 255));
        btnBacktoLogin.setText("Back to Login");
        btnBacktoLogin.setContentAreaFilled(false);
        btnBacktoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBacktoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoLoginActionPerformed(evt);
            }
        });

        Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Mail.png"))); // NOI18N
        Email.setText("Email");

        textPassword.setForeground(new java.awt.Color(0, 0, 0));

        Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Lock.png"))); // NOI18N
        Password.setText("Password");

        textConfirmPassword.setForeground(new java.awt.Color(0, 0, 0));

        textEmail.setForeground(new java.awt.Color(0, 0, 0));
        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });

        iconDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/display.png"))); // NOI18N
        iconDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconDisplayMousePressed(evt);
            }
        });

        iconHideDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hide_display.png"))); // NOI18N
        iconHideDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconHideDisplayMousePressed(evt);
            }
        });

        iconDisplayConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/display.png"))); // NOI18N
        iconDisplayConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconDisplayConfirmMousePressed(evt);
            }
        });

        iconHideDisplayConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hide_display.png"))); // NOI18N
        iconHideDisplayConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconHideDisplayConfirmMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconDisplayConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconHideDisplayConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconHideDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(111, 111, 111))
                        .addComponent(textUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegister, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBacktoLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconHideDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconDisplay))))
                .addGap(15, 15, 15)
                .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconHideDisplayConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconDisplayConfirm))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBacktoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsernameActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String username = textUsername.getText().trim();
        String email = textEmail.getText().trim();
        String password = new String(textPassword.getPassword());
        String confirmPassword = new String(textConfirmPassword.getPassword());
        if (username.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên đăng nhập!");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email!");
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu!");
        } else if (confirmPassword.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng xác nhận mật khẩu!");
        } else if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không trùng khớp!");
        } else {
            try {
                Connection con = JDBC.JDBC_MySql.CSDL();
                ArrayList<User> listUsers = new ArrayList<>();
                String sqlQuery = "SELECT * FROM user";
                PreparedStatement statementQuery = con.prepareStatement(sqlQuery);
                ResultSet rs = statementQuery.executeQuery();
                boolean check = true;
                while (rs.next()) {
                    User user = new User(rs.getString("username"), rs.getString("password"));
                    listUsers.add(user);
                }

                for (User user : listUsers) {
                    if (user.getUsername().equalsIgnoreCase(username)) {
                        JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại!");
                        check = false;
                        return;
                    }
                }
                if (check) {
                    User user = new User(username, password, email);
                    String sqlUpdate = "INSERT INTO User(username, password, email) VALUES (?, ?, ?);";
                    PreparedStatement statementUpdate = con.prepareStatement(sqlUpdate);
                    statementUpdate.setString(1, user.getUsername());
                    statementUpdate.setString(2, user.getPassword());
                    statementUpdate.setString(3, user.getEmail());
                    int row = statementUpdate.executeUpdate();
                    if (row != 0) {
                        JOptionPane.showMessageDialog(this, "Đăng ký thành công!");
                        this.setVisible(false);

                        new Login().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Đăng ký thất bại!");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBacktoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoLoginActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnBacktoLoginActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void iconDisplayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconDisplayMousePressed
        // TODO add your handling code here:
        iconHideDisplay.setVisible(true);
        iconDisplay.setVisible(false);
        textPassword.setEchoChar(((char) 0));
    }//GEN-LAST:event_iconDisplayMousePressed

    private void iconHideDisplayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconHideDisplayMousePressed
        // TODO add your handling code here:
        iconHideDisplay.setVisible(false);
        iconDisplay.setVisible(true);
        textPassword.setEchoChar('*');
    }//GEN-LAST:event_iconHideDisplayMousePressed

    private void iconDisplayConfirmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconDisplayConfirmMousePressed
        // TODO add your handling code here:
        iconHideDisplayConfirm.setVisible(true);
        iconDisplayConfirm.setVisible(false);
        textConfirmPassword.setEchoChar(((char) 0));

    }//GEN-LAST:event_iconDisplayConfirmMousePressed

    private void iconHideDisplayConfirmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconHideDisplayConfirmMousePressed
        // TODO add your handling code here:
        iconHideDisplayConfirm.setVisible(false);
        iconDisplayConfirm.setVisible(true);
        textConfirmPassword.setEchoChar('*');

    }//GEN-LAST:event_iconHideDisplayConfirmMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
                new Register().setLocationRelativeTo(null);;
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfirmPassword;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Username;
    private javax.swing.JButton btnBacktoLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel iconDisplay;
    private javax.swing.JLabel iconDisplayConfirm;
    private javax.swing.JLabel iconHideDisplay;
    private javax.swing.JLabel iconHideDisplayConfirm;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField textConfirmPassword;
    private javax.swing.JTextField textEmail;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUsername;
    // End of variables declaration//GEN-END:variables
}
