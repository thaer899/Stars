/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpInterface;

import StarsUpConnexion.DataSource;
import StarsUpDAO.AdministrateurDao;
import StarsUpDAO.CategorieDAO;
import StarsUpIDAO.IAdministrateurDAO;
import StarsUpIDAO.ICategorieDAO;
import entities.Administrateur;
import entities.Categorie;
import java.awt.Color;


import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author thaer
 */
public class GestionTagAdminAdd extends javax.swing.JFrame {
    private Connection conn;
    boolean test,test2,test3;
    
    
    
    /**
     * Creates new form GestionProjectAdminUpdate
     */
    
    public GestionTagAdminAdd() {
        initComponents();
        conn=DataSource.getInstance().getConnection();
         
         invalid2.setVisible(false);
         valid2.setVisible(false);
         invalid3.setVisible(false);
         valid3.setVisible(false);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Tb_Projects1 = new javax.swing.JTable();
        Bt_add_back = new javax.swing.JButton();
        Bt_Add = new javax.swing.JButton();
        tx_commentaire = new javax.swing.JTextField();
        tx_tag = new javax.swing.JTextField();
        tx_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Lb_add_commentary = new javax.swing.JLabel();
        Bt_Delete = new javax.swing.JButton();
        Bt_Update = new javax.swing.JButton();
        valid2 = new javax.swing.JLabel();
        invalid2 = new javax.swing.JLabel();
        valid3 = new javax.swing.JLabel();
        invalid3 = new javax.swing.JLabel();
        Lb_Add_category2 = new javax.swing.JLabel();
        Lb_Add_category1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        Tb_Projects1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Star Name", "Star Inventor", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tb_Projects1.setOpaque(false);
        Tb_Projects1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tb_ProjectsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tb_Projects1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 530));
        getContentPane().setLayout(null);

        Bt_add_back.setText("Back");
        Bt_add_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_add_backActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_add_back);
        Bt_add_back.setBounds(20, 450, 55, 23);

        Bt_Add.setText("add");
        Bt_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_AddActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_Add);
        Bt_Add.setBounds(80, 390, 70, 23);

        tx_commentaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_commentaireActionPerformed(evt);
            }
        });
        tx_commentaire.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tx_commentaireFocusLost(evt);
            }
        });
        getContentPane().add(tx_commentaire);
        tx_commentaire.setBounds(180, 110, 150, 30);

        tx_tag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_tagActionPerformed(evt);
            }
        });
        tx_tag.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tx_tagFocusLost(evt);
            }
        });
        getContentPane().add(tx_tag);
        tx_tag.setBounds(180, 70, 91, 20);

        tx_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_idActionPerformed(evt);
            }
        });
        tx_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tx_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tx_idFocusLost(evt);
            }
        });
        getContentPane().add(tx_id);
        tx_id.setBounds(180, 30, 50, 20);

        jTable1.setModel(new ListCategorie());
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 410, 170);

        Lb_add_commentary.setText("Commentary");
        getContentPane().add(Lb_add_commentary);
        Lb_add_commentary.setBounds(90, 114, 70, 20);

        Bt_Delete.setText("Delete");
        Bt_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_Delete);
        Bt_Delete.setBounds(270, 390, 80, 23);

        Bt_Update.setText("Update");
        Bt_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_Update);
        Bt_Update.setBounds(170, 390, 80, 23);

        valid2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StarsUpInterface/icone_validation.png"))); // NOI18N
        getContentPane().add(valid2);
        valid2.setBounds(280, 70, 20, 20);

        invalid2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StarsUpInterface/icon_warningbox.png"))); // NOI18N
        getContentPane().add(invalid2);
        invalid2.setBounds(280, 70, 20, 20);

        valid3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StarsUpInterface/icone_validation.png"))); // NOI18N
        getContentPane().add(valid3);
        valid3.setBounds(340, 120, 20, 20);

        invalid3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StarsUpInterface/icon_warningbox.png"))); // NOI18N
        getContentPane().add(invalid3);
        invalid3.setBounds(340, 120, 20, 20);

        Lb_Add_category2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lb_Add_category2.setText("New Tag");
        getContentPane().add(Lb_Add_category2);
        Lb_Add_category2.setBounds(90, 70, 100, 17);

        Lb_Add_category1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lb_Add_category1.setText("Id");
        getContentPane().add(Lb_Add_category1);
        Lb_Add_category1.setBounds(90, 30, 100, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/managementFond.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 460, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_add_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_add_backActionPerformed
        // TODO add your handling code here:
      new GestionHome().setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_Bt_add_backActionPerformed

    private void Bt_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AddActionPerformed
        // TODO add your handling code here:
        if ( test2==true)
{JOptionPane.showMessageDialog(null, "Champs vides ou  incorrects");}
else{
        Categorie categorie=new Categorie();
        
        //categorie.setId(Integer.parseInt((tx_id.getText())));
        categorie.setTitre(tx_tag.getText());
        categorie.setCommentaire(tx_commentaire.getText());
       
        ICategorieDAO catdao= CategorieDAO.getInstance();
        catdao.createCategorie(categorie);
        setVisible(false);
       new GestionTagAdminAdd().setVisible(true);}
        
    }//GEN-LAST:event_Bt_AddActionPerformed

    private void tx_commentaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_commentaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_commentaireActionPerformed

    private void Bt_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_UpdateActionPerformed
        // TODO add your handling code here:
        Categorie categorie=new Categorie();
        
        categorie.setTitre(tx_tag.getText());
        categorie.setCommentaire(tx_commentaire.getText());
   
        categorie.setId(Integer.parseInt((tx_id.getText())));
        ICategorieDAO catdao= CategorieDAO.getInstance();
        catdao.updateCategorie(categorie);
        setVisible(false);
        new GestionTagAdminAdd().setVisible(true);
        
    }//GEN-LAST:event_Bt_UpdateActionPerformed

    private void Tb_ProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tb_ProjectsMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_Tb_ProjectsMouseClicked

    private void Bt_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_DeleteActionPerformed
        // TODO add your handling code here:
        Categorie categorie=new Categorie();
        categorie.setId(Integer.parseInt((tx_id.getText())));
        ICategorieDAO catdao= CategorieDAO.getInstance();
        catdao.deleteCategorie(Integer.parseInt((tx_id.getText())));
        setVisible(false);
        new GestionTagAdminAdd().setVisible(true);
      
    }//GEN-LAST:event_Bt_DeleteActionPerformed

    private void tx_tagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_tagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_tagActionPerformed

    private void tx_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_idActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        AbstractTableModel model =(AbstractTableModel) jTable1.getModel();
        tx_id.setText(model.getValueAt(jTable1.getSelectedRow(), 0).toString());
        tx_tag.setText(model.getValueAt(jTable1.getSelectedRow(), 1).toString());
        tx_commentaire.setText(model.getValueAt(jTable1.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void tx_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tx_idFocusLost
        // TODO add your handling code here:
       
//        JTextField source = (JTextField) evt.getSource();
//				String textFieldContent = source.getText();
//				test = true;
//                                Color bgColor = Color.WHITE;
//                                if(!(source.getText().equals("")))
//                                {
//                                test=false;
//                                
//                                
//                                }
//                                else
//                                {
//
//				try {
//                                    
//					Float.parseFloat(source.getText().charAt(0)+"");
//					test = false;
//                                        
//
//				} catch (Exception e) {
//                                    // ne fait rien: la couleur de
//					// fond sera rouge
//				}}
//				source.setBackground(bgColor);
//                       //****************************************
//                                
//                                if(source.getText().equals(""))
//                                {
//                                test=false;
//                                
//                                
//                                }
//                                else
//                                {
//
//				try {
//                                    
//					Float.parseFloat(source.getText().charAt(0)+"");
//					test = false;
//                                       
//
//				} catch (Exception e) {
//                                    // ne fait rien: la couleur de
//					// fond sera rouge
//				}}
//				source.setBackground(bgColor);
//                                

    }//GEN-LAST:event_tx_idFocusLost

    private void tx_tagFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tx_tagFocusLost
        // TODO add your handling code here:
        JTextField source = (JTextField) evt.getSource();
				String textFieldContent = source.getText();
				test2 = true;
                                Color bgColor = Color.WHITE;
                                if(!(source.getText().equals("")))
                                {
                                test2=false;
                                valid2.setVisible(true);
                                
                                }
                                else
                                {

				try {
                                    
					Float.parseFloat(source.getText().charAt(0)+"");
					test2 = false;
                                        valid2.setVisible(true);

				} catch (Exception e) {
                                    // ne fait rien: la couleur de
					// fond sera rouge
				}}
				source.setBackground(bgColor);
                       //****************************************
                                
                                if(source.getText().equals(""))
                                {
                                test2=false;
                                invalid2.setVisible(true);
                                
                                }
                                else
                                {

				try {
                                    
					Float.parseFloat(source.getText().charAt(0)+"");
					test2 = false;
                                        invalid2.setVisible(true);

				} catch (Exception e) {
                                    // ne fait rien: la couleur de
					// fond sera rouge
				}}
				source.setBackground(bgColor);

    }//GEN-LAST:event_tx_tagFocusLost

    private void tx_commentaireFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tx_commentaireFocusLost
        // TODO add your handling code here:
        JTextField source = (JTextField) evt.getSource();
				String textFieldContent = source.getText();
				test2 = true;
                                Color bgColor = Color.WHITE;
                                if(!(source.getText().equals("")))
                                {
                                test2=false;
                                valid3.setVisible(true);
                                
                                }
                                else
                                {

				try {
                                    
					Float.parseFloat(source.getText().charAt(0)+"");
					test2 = false;
                                        valid3.setVisible(true);

				} catch (Exception e) {
                                    // ne fait rien: la couleur de
					// fond sera rouge
				}}
				source.setBackground(bgColor);
                       //****************************************
                                
                                if(source.getText().equals(""))
                                {
                                test2=false;
                                invalid3.setVisible(true);
                                
                                }
                                else
                                {

				try {
                                    
					Float.parseFloat(source.getText().charAt(0)+"");
					test2 = false;
                                        invalid3.setVisible(true);

				} catch (Exception e) {
                                    // ne fait rien: la couleur de
					// fond sera rouge
				}}
				source.setBackground(bgColor);

    }//GEN-LAST:event_tx_commentaireFocusLost

    private void tx_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tx_idFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tx_idFocusGained

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
            java.util.logging.Logger.getLogger(GestionTagAdminAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionTagAdminAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionTagAdminAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionTagAdminAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionTagAdminAdd().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Add;
    private javax.swing.JButton Bt_Delete;
    private javax.swing.JButton Bt_Update;
    private javax.swing.JButton Bt_add_back;
    private javax.swing.JLabel Lb_Add_category1;
    private javax.swing.JLabel Lb_Add_category2;
    private javax.swing.JLabel Lb_add_commentary;
    private javax.swing.JTable Tb_Projects1;
    private javax.swing.JLabel invalid2;
    private javax.swing.JLabel invalid3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tx_commentaire;
    private javax.swing.JTextField tx_id;
    private javax.swing.JTextField tx_tag;
    private javax.swing.JLabel valid2;
    private javax.swing.JLabel valid3;
    // End of variables declaration//GEN-END:variables
}
