/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpInterface;
import StarsUpConnexion.DataSource;
import StarsUpDAO.AdministrateurDao;
import StarsUpIDAO.IAdministrateurDAO;
import entities.Administrateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author attia
 */
public class GestionDesComptesAdmins extends javax.swing.JFrame {
    private Connection conn;
    /**
     * Creates new form GestionDesComptesAdmins
     */
   public GestionDesComptesAdmins() {
        initComponents();
        conn= DataSource.getInstance().getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_addAccount = new javax.swing.JButton();
        bt_deleteAccount = new javax.swing.JButton();
        bt_updateAccount = new javax.swing.JButton();
        bt_back = new javax.swing.JButton();
        label_msg = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tx_Name = new javax.swing.JTextField();
        tx_LastName = new javax.swing.JTextField();
        tx_Login = new javax.swing.JTextField();
        tx_password = new javax.swing.JTextField();
        tx_Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tx_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        bt_addAccount.setText("Add Account");
        bt_addAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addAccountActionPerformed(evt);
            }
        });
        getContentPane().add(bt_addAccount);
        bt_addAccount.setBounds(20, 160, 140, 23);

        bt_deleteAccount.setText("Delete Account");
        bt_deleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteAccountActionPerformed(evt);
            }
        });
        getContentPane().add(bt_deleteAccount);
        bt_deleteAccount.setBounds(20, 240, 140, 23);

        bt_updateAccount.setText("Update Account");
        bt_updateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateAccountActionPerformed(evt);
            }
        });
        getContentPane().add(bt_updateAccount);
        bt_updateAccount.setBounds(20, 200, 140, 23);

        bt_back.setText("Back");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });
        getContentPane().add(bt_back);
        bt_back.setBounds(40, 290, 55, 23);

        label_msg.setBackground(new java.awt.Color(204, 0, 0));
        label_msg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(label_msg);
        label_msg.setBounds(350, 280, 200, 0);

        jTable1.setModel(new ListAdmin());
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 50, 440, 90);

        jLabel1.setText("Nom");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 170, 34, 14);

        jLabel2.setText("Prenom");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 200, 36, 14);

        jLabel3.setText("Pseudo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 230, 50, 14);

        jLabel5.setText("Mot de passe");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 260, 70, 14);

        jLabel6.setText("Email");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 290, 34, 14);

        tx_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_NameActionPerformed(evt);
            }
        });
        getContentPane().add(tx_Name);
        tx_Name.setBounds(380, 160, 110, 30);

        tx_LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_LastNameActionPerformed(evt);
            }
        });
        getContentPane().add(tx_LastName);
        tx_LastName.setBounds(380, 190, 110, 30);
        getContentPane().add(tx_Login);
        tx_Login.setBounds(380, 220, 110, 30);
        getContentPane().add(tx_password);
        tx_password.setBounds(380, 250, 110, 30);
        getContentPane().add(tx_Email);
        tx_Email.setBounds(380, 280, 110, 30);

        jLabel7.setText("Id Administrateur");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 340, 90, 14);

        tx_id.setToolTipText("");
        getContentPane().add(tx_id);
        tx_id.setBounds(390, 340, 60, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/fond.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -10, 590, 380);
        getContentPane().add(txt_Name);
        txt_Name.setBounds(500, 50, 80, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addAccountActionPerformed
        Administrateur administrateur=new Administrateur();
        
        administrateur.setName(tx_Name.getText());
        administrateur.setLast_Name(tx_LastName.getText());
        administrateur.setLogin(tx_Login.getText());
        administrateur.setPassword(tx_password.getText());
        administrateur.setEmail(tx_Email.getText());
        IAdministrateurDAO administrateurdao= AdministrateurDao.getInstance();
        administrateurdao.createAdministrateur(administrateur);
        setVisible(false);
       new GestionDesComptesAdmins().setVisible(true);
    }//GEN-LAST:event_bt_addAccountActionPerformed

    private void bt_updateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updateAccountActionPerformed
      
       
        Administrateur administrateur=new Administrateur();
        administrateur.setName(tx_Name.getText());
        administrateur.setLast_Name(tx_LastName.getText());
        administrateur.setLogin(tx_Login.getText());
        administrateur.setPassword(tx_password.getText());
        administrateur.setEmail(tx_Email.getText());
        administrateur.setId(Integer.parseInt((tx_id.getText())));
        IAdministrateurDAO administrateurdao= AdministrateurDao.getInstance();
        administrateurdao.updateAdministratur(administrateur);
        setVisible(false);
        new GestionDesComptesAdmins().setVisible(true);
        
        
        
    }//GEN-LAST:event_bt_updateAccountActionPerformed

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        new GestionHome().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_bt_backActionPerformed

    private void bt_deleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteAccountActionPerformed
        Administrateur administrateur=new Administrateur();
        administrateur.setId(Integer.parseInt((tx_id.getText())));
        IAdministrateurDAO administrateurdao= AdministrateurDao.getInstance();
        administrateurdao.deleteAdministrateur(Integer.parseInt((tx_id.getText())));
        setVisible(false);
        new GestionDesComptesAdmins().setVisible(true);
       
        
    }//GEN-LAST:event_bt_deleteAccountActionPerformed

    private void tx_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_NameActionPerformed

    private void tx_LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_LastNameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         AbstractTableModel model =(AbstractTableModel) jTable1.getModel();
        tx_id.setText(model.getValueAt(jTable1.getSelectedRow(), 0).toString());
        tx_Name.setText(model.getValueAt(jTable1.getSelectedRow(), 1).toString());
        tx_LastName.setText(model.getValueAt(jTable1.getSelectedRow(), 2).toString());
        tx_Login.setText(model.getValueAt(jTable1.getSelectedRow(), 3).toString());
        tx_password.setText(model.getValueAt(jTable1.getSelectedRow(), 4).toString());
        tx_Email.setText(model.getValueAt(jTable1.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(GestionDesComptesAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDesComptesAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDesComptesAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDesComptesAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDesComptesAdmins().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addAccount;
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_deleteAccount;
    private javax.swing.JButton bt_updateAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_msg;
    private javax.swing.JTextField tx_Email;
    private javax.swing.JTextField tx_LastName;
    private javax.swing.JTextField tx_Login;
    private javax.swing.JTextField tx_Name;
    private javax.swing.JTextField tx_id;
    private javax.swing.JTextField tx_password;
    private javax.swing.JTextField txt_Name;
    // End of variables declaration//GEN-END:variables



    
}
