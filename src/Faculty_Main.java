
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author elizmariemanalo
 */
public class Faculty_Main extends javax.swing.JFrame {

    /**
     * Creates new form Faculty_Main
     */
    public Faculty_Main() {
        initComponents();
        Faculty_Username.setBackground(new java.awt.Color(0,0,0,1));
        Faculty_Password.setBackground(new java.awt.Color(0,0,0,1));
    }
    
    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Faculty_Username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Faculty_Password = new javax.swing.JPasswordField();
        FacultyLogin_Btn = new javax.swing.JButton();
        Back_Btn = new javax.swing.JButton();
        logo1 = new javax.swing.JLabel();
        background_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(logo);
        logo.setBounds(130, 220, 0, 0);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(22, 0, 83));
        jLabel3.setText("Sign in as Faculty");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(670, 160, 180, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(115, 115, 115));
        jLabel4.setText("Username (ID)");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(670, 240, 180, 30);

        Faculty_Username.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Faculty_Username.setForeground(new java.awt.Color(22, 0, 83));
        Faculty_Username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(Faculty_Username);
        Faculty_Username.setBounds(670, 280, 340, 45);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(115, 115, 115));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(670, 360, 180, 30);

        Faculty_Password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Faculty_Password.setForeground(new java.awt.Color(22, 0, 83));
        Faculty_Password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(Faculty_Password);
        Faculty_Password.setBounds(670, 400, 340, 45);

        FacultyLogin_Btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FacultyLogin_Btn.setForeground(new java.awt.Color(22, 0, 83));
        FacultyLogin_Btn.setText("Login");
        FacultyLogin_Btn.setBorder(null);
        FacultyLogin_Btn.setBorderPainted(false);
        FacultyLogin_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FacultyLogin_Btn.setFocusPainted(false);
        FacultyLogin_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacultyLogin_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(FacultyLogin_Btn);
        FacultyLogin_Btn.setBounds(670, 500, 90, 38);

        Back_Btn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Back_Btn.setForeground(new java.awt.Color(22, 0, 83));
        Back_Btn.setText("Go back");
        Back_Btn.setBorder(null);
        Back_Btn.setBorderPainted(false);
        Back_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Back_Btn.setFocusPainted(false);
        Back_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Back_Btn);
        Back_Btn.setBounds(1070, 620, 90, 30);

        logo1.setIcon(new javax.swing.ImageIcon("/Users/elizmariemanalo/NetBeansProjects/AMS/images/logo.png")); // NOI18N
        jPanel1.add(logo1);
        logo1.setBounds(130, 220, 427, 181);

        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.png"))); // NOI18N
        background_image.setText("jLabel2");
        jPanel1.add(background_image);
        background_image.setBounds(0, 0, 1200, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1201, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FacultyLogin_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacultyLogin_BtnActionPerformed
        boolean check = true;
        try {
                File f1 = new File( "/Users/elizmariemanalo/NetBeansProjects/AMS/Records/FacultyList.txt" );
		Scanner rd = new Scanner(f1);
		rd.useDelimiter("\\n|,");
                
		while(rd.hasNext()) {
			rd.next();
			String s1 = rd.next();
			String s2 = rd.next();
			rd.nextLine();
                        
			if( Faculty_Username.getText().equals(s1) && Faculty_Password.getText().equals(s2) ) {
				JOptionPane.showMessageDialog( null, "You have successfully logged in!" );
                                
				Faculty_board fac_board = new Faculty_board();
				fac_board.setVisible( true );
				dispose();
                                
				check = false;
			}
		}
                
		if(check){
			JOptionPane.showMessageDialog( null, "Wrong Username or Password!" );
		}
	}
	catch( Exception f ) {
		JOptionPane.showMessageDialog( null, f );
	}
    }//GEN-LAST:event_FacultyLogin_BtnActionPerformed

    private void Back_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BtnActionPerformed
        Driver d = new Driver();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_Back_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(Faculty_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faculty_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faculty_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculty_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faculty_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Btn;
    private javax.swing.JButton FacultyLogin_Btn;
    private javax.swing.JPasswordField Faculty_Password;
    private javax.swing.JTextField Faculty_Username;
    private javax.swing.JLabel background_image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    // End of variables declaration//GEN-END:variables
}
