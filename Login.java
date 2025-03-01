/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private static String usname, pass, type = "admin";

    private static String filepath = "src\\Data.json";
    private static JSONParser jsonParser = new JSONParser();
    private static JSONObject record = new JSONObject();
    private static JSONArray userlist = new JSONArray();

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        Psswrd = new javax.swing.JPasswordField();
        LoginBttn = new javax.swing.JButton();
        ClearBttn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        UsernameLabel.setBackground(new java.awt.Color(51, 51, 51));
        UsernameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setText("ENTER USERNAME");
        UsernameLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        UsernameLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        PasswordLabel.setBackground(new java.awt.Color(51, 51, 51));
        PasswordLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("ENTER PASSWORD");

        UserName.setBackground(new java.awt.Color(51, 51, 51));
        UserName.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setBorder(null);
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });

        Psswrd.setBackground(new java.awt.Color(51, 51, 51));
        Psswrd.setForeground(new java.awt.Color(255, 255, 255));
        Psswrd.setBorder(null);
        Psswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsswrdActionPerformed(evt);
            }
        });

        LoginBttn.setBackground(new java.awt.Color(255, 102, 0));
        LoginBttn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        LoginBttn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBttn.setText("LOGIN");
        LoginBttn.setBorder(null);
        LoginBttn.setBorderPainted(false);
        LoginBttn.setContentAreaFilled(false);
        LoginBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBttnActionPerformed(evt);
            }
        });

        ClearBttn.setBackground(new java.awt.Color(255, 255, 255));
        ClearBttn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ClearBttn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBttn.setText("CLEAR");
        ClearBttn.setBorder(null);
        ClearBttn.setBorderPainted(false);
        ClearBttn.setContentAreaFilled(false);
        ClearBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBttnActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\REX_F\\Downloads\\HD-wallpaper-akatsuki-naruto-all-characters-in-one-anime.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(134, 134, 134))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Psswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(131, 131, 131))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UsernameLabel)
                                .addComponent(PasswordLabel))
                            .addGap(131, 131, 131)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LoginBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(ClearBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(UsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(PasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Psswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClearBttn))
                .addGap(113, 113, 113))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClearBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBttnActionPerformed
        UserName.setText("");
        Psswrd.setText("");
    }//GEN-LAST:event_ClearBttnActionPerformed

    private void LoginBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBttnActionPerformed
        try {
            usname = UserName.getText();
            pass = Psswrd.getText();

            filecheck();

            int checker = 0;
            for (int a = 0; a < userlist.size(); a++) {
                JSONObject userobject = (JSONObject) userlist.get(a);
                String searcheduname = (String) userobject.get("username");
                String searchedpswd = (String) userobject.get("password");
                if (usname.equals(searcheduname) && pass.equals(searchedpswd)) {
                    checker++;

                    break;
                }
            }

            if (checker == 0) {
                JOptionPane.showMessageDialog(this, "No account has been found.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            } else {
                this.dispose();
                Dashboard x = new Dashboard();
                x.setVisible(true);

            }

        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String getuname() {
        return usname;
    }//GEN-LAST:event_LoginBttnActionPerformed

    private void PsswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsswrdActionPerformed

    }//GEN-LAST:event_PsswrdActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed

    }//GEN-LAST:event_UserNameActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    public void filecheck() throws FileNotFoundException, IOException, ParseException {
        FileReader reader = new FileReader(filepath);

        if (reader.ready()) {
            Scanner scan = new Scanner(reader);
            String line = "";
            while (scan.hasNext()) {
                line = line + scan.nextLine();
            }

            reader.close();

            if (!line.equals("")) {
                reader.close();
                FileReader reader2 = new FileReader(filepath);
                record = (JSONObject) jsonParser.parse(reader2);
                userlist = (JSONArray) record.get("users");
                reader2.close();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBttn;
    private javax.swing.JButton LoginBttn;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField Psswrd;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
