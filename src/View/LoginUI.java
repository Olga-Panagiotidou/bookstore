package View;

import Controllers.*;
import Model.*;
import View.*;
import jaco.mp3.player.MP3Player;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.*;
import java.awt.*;
import java.io.File;


public class LoginUI extends javax.swing.JFrame{

    private LoginCON cLogin = new LoginCON();
    private UserList user;
   
    
    public LoginUI() {
   
        initComponents();
        
    }
    
    //γαι να κλεινουν τα παραθυρα
     public void close(){
        
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
     }
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        singinform = new javax.swing.JPanel();
        signin = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        passwd = new javax.swing.JPasswordField();
        usericon = new javax.swing.JLabel();
        passwdicon = new javax.swing.JLabel();
        singinicon = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        signinbutton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        resetpasswdbutton = new javax.swing.JButton();
        lathosstoixeia = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backicon = new javax.swing.JPanel();
        backbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        singinform.setBackground(new java.awt.Color(51, 51, 51));
        singinform.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signin.setFont(new java.awt.Font("Script MT Bold", 0, 28)); // NOI18N
        signin.setForeground(new java.awt.Color(255, 255, 255));
        signin.setText("Sign In");
        singinform.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 204, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        singinform.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 10));

        username.setBackground(new java.awt.Color(51, 51, 51));
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        singinform.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, 20));

        passwd.setBackground(new java.awt.Color(51, 51, 51));
        passwd.setForeground(new java.awt.Color(255, 255, 255));
        passwd.setToolTipText("");
        passwd.setBorder(null);
        passwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwdActionPerformed(evt);
            }
        });
        singinform.add(passwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 180, 20));

        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons8_User_35px_1.png"))); // NOI18N
        singinform.add(usericon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        passwdicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons8_Lock_32px.png"))); // NOI18N
        singinform.add(passwdicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 30, 40));

        singinicon.setBackground(new java.awt.Color(51, 51, 51));
        singinicon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153), 2));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        signinbutton.setBackground(new java.awt.Color(0, 0, 0));
        signinbutton.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        signinbutton.setForeground(new java.awt.Color(255, 255, 255));
        signinbutton.setText("Sign in");
        signinbutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        signinbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout singiniconLayout = new javax.swing.GroupLayout(singinicon);
        singinicon.setLayout(singiniconLayout);
        singiniconLayout.setHorizontalGroup(
            singiniconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singiniconLayout.createSequentialGroup()
                .addComponent(signinbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        singiniconLayout.setVerticalGroup(
            singiniconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(singiniconLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(signinbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        singinform.add(singinicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 240, 50));
        singinform.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 190, 20));
        singinform.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 190, -1));

        resetpasswdbutton.setBackground(new java.awt.Color(0, 0, 0));
        resetpasswdbutton.setForeground(new java.awt.Color(255, 255, 255));
        resetpasswdbutton.setText("Forgot your password?");
        resetpasswdbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153), 2));
        resetpasswdbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetpasswdbuttonActionPerformed(evt);
            }
        });
        singinform.add(resetpasswdbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 200, 40));

        lathosstoixeia.setForeground(new java.awt.Color(255, 0, 0));
        singinform.add(lathosstoixeia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 240, 20));

        jPanel2.add(singinform, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 280, 420));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("     Sign in");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 110, 40));

        backicon.setBackground(new java.awt.Color(255, 204, 153));
        backicon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backbutton.setBackground(new java.awt.Color(255, 204, 153));
        backbutton.setFont(new java.awt.Font("Script MT Bold", 0, 20)); // NOI18N
        backbutton.setText("Back");
        backbutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbuttonMouseClicked(evt);
            }
        });
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        backicon.add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel2.add(backicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/books2.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwdActionPerformed
       
    }//GEN-LAST:event_passwdActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
      
    }//GEN-LAST:event_usernameActionPerformed

    private void signinbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbuttonActionPerformed
        
        String user=username.getText().trim();
        String password=passwd.getText().trim();
        if( username.getText().trim().isEmpty() && passwd.getText().trim().isEmpty() ){
            lathosstoixeia.setText("Πρέπει να συμπληρώσετε όλα τα πεδία!");
        }else if(username.getText().trim().isEmpty()){
            lathosstoixeia.setText("Το πεδίο username είναι κενό!");
        }else if(passwd.getText().trim().isEmpty()){
             lathosstoixeia.setText("Το πεδίο password είναι κενό!");
        }else{
           int res=LoginCON.authenticate(user,password);
           if(res==0){
              lathosstoixeia.setText("Λάθος στοιχεία!");
              
           }else if(res==1){
              close();    
              BookUserUI books=new BookUserUI(getMember());
              books.setVisible(true);
            
           }else if(res==2){
              close();
              AdminUI admin=new AdminUI();
              admin.setVisible(true);
           }
        }
        
               
    }//GEN-LAST:event_signinbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
       
        close();
        VivliopwleioMenuUI vivlio=new VivliopwleioMenuUI ();
        vivlio.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void resetpasswdbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetpasswdbuttonActionPerformed
        
        close();
        ResetEmailUI reset= new ResetEmailUI();
        reset.setVisible(true);
    }//GEN-LAST:event_resetpasswdbuttonActionPerformed

    private void backbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonMouseClicked
       
    }//GEN-LAST:event_backbuttonMouseClicked

      
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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
            
          
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JPanel backicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lathosstoixeia;
    private javax.swing.JPasswordField passwd;
    private javax.swing.JLabel passwdicon;
    private javax.swing.JButton resetpasswdbutton;
    private javax.swing.JLabel signin;
    private javax.swing.JButton signinbutton;
    private javax.swing.JPanel singinform;
    private javax.swing.JPanel singinicon;
    private javax.swing.JLabel usericon;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void alert(String both_fields_should_not_be_blank) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void showMsg(String λάθος_κωδικοί) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Member getMember(){
        return cLogin.MemberbyUsr(username.getText().trim());
    }

}
