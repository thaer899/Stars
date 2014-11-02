/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.interfaces;

import ideastarter.util.CreateConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author attia
 */
public class GestionDesComptesClients extends javax.swing.JFrame {
 Connection conn =null;
    ResultSet rs =null;
    PreparedStatement pst=null;
    /**
     * Creates new form GestionDesComptesClients
     */
    public GestionDesComptesClients() {
        initComponents(); 
        conn=CreateConnection.ConnecrDB();
        UpdateTable();
    }
private void UpdateTable(){
String sql ="select Nom,Prenom,Pays,Ville,Adresse,Pseudo,MotDePasse,TypeCarteBancaire from client ";
        try {
            pst =conn.prepareStatement(sql);
            rs=pst.executeQuery();
            Table_Client.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            //Logger.getLogger(ImporterImage.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, ex);
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Client = new javax.swing.JTable();
        bt_delete = new javax.swing.JButton();
        bt_back = new javax.swing.JButton();
        txt_Name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        Table_Client.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Prenom", "Pays", "Ville", "Adresse", "Email", "Pseudo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table_Client);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 26, 485, 162);

        bt_delete.setText("Delete Account");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(bt_delete);
        bt_delete.setBounds(196, 229, 110, 52);

        bt_back.setText("Back");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });
        getContentPane().add(bt_back);
        bt_back.setBounds(10, 299, 55, 23);

        txt_Name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/fond.png"))); // NOI18N
        getContentPane().add(txt_Name);
        txt_Name.setBounds(0, 0, 600, 360);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 70, 34, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        // TODO add your handling code here:
        String sql="delete from client where Nom = ?";
        try {
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_Name.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Deleted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         DefaultTableModel model= (DefaultTableModel)Table_Client.getModel();
        
             model.removeRow(Table_Client.getSelectedRow());
       
         UpdateTable();
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
     this.dispose(); 
    }//GEN-LAST:event_bt_backActionPerformed

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
            java.util.logging.Logger.getLogger(GestionDesComptesClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDesComptesClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDesComptesClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDesComptesClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDesComptesClients().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Client;
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt_Name;
    // End of variables declaration//GEN-END:variables
}