/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpInterface;

import StarsUpIDAO.IIdeeDAO;
import StarsUpConnexion.DataSource;
import StarsUpDAO.IdeeDAO;
import entities.Client;
import entities.Idee;
import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import java.sql.Connection;
//import java.sql.Date;
import javax.swing.ImageIcon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thaer
 */
public final class GestionProjectUserUpdate extends javax.swing.JFrame {
    
    
    DefaultTableModel model;
    private IdeeDAO ideeDAO;
    String[] data = new String[]{"id","titre","Category","Description","Start Date","Limit Date","Budget"};
    List<Idee> idees;
    boolean test1,test2,test3;
    Client currentClient = new Client();
    Idee currentIdee = new Idee();

    /**
     * Creates new form GestionProjectAdminUpdate
     */
    public GestionProjectUserUpdate() {
        initComponents();
        
        model = new DefaultTableModel(data, WIDTH);
        TbIdee.setModel(model);
        
        remplirModel();
    }

    public void remplirModel() {
    ideeDAO = new IdeeDAO();
    idees = new ArrayList<>();
    
    idees = ideeDAO.readById(1);
    for (Idee idee : idees)
    {
        //System.err.println(idee.getId());
        model.insertRow(model.getRowCount(), new Object[]{idee.getId(),idee.getTitre(),idee.getCategorie(),idee.getDescription(),idee.getDateDebut(),idee.getDateLimite(),idee.getBudgetRequis()});
    }
    }
    
        public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date){
            if(date != null) {
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            return sqlDate;
                                }
            return null;
                    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCalendarTheme1 = new com.toedter.plaf.JCalendarTheme();
        Bt_add_back = new javax.swing.JButton();
        Bt_Add = new javax.swing.JButton();
        StarDescription = new javax.swing.JTextField();
        Lb_add_commentary = new javax.swing.JLabel();
        Lb_Add_title = new javax.swing.JLabel();
        StarBudget = new javax.swing.JTextField();
        Bt_Delete = new javax.swing.JButton();
        label_msg = new javax.swing.JLabel();
        StarTag = new javax.swing.JComboBox();
        Lb_add_commentary2 = new javax.swing.JLabel();
        Lb_add_commentary4 = new javax.swing.JLabel();
        Lb_add_commentary5 = new javax.swing.JLabel();
        Lb_add_commentary6 = new javax.swing.JLabel();
        imp_avatar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbIdee = new javax.swing.JTable();
        StarName1 = new javax.swing.JTextField();
        Lb_add_commentary7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        Bt_Update = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IdeaStarter/Image/managementFond.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IdeaStarter/Image/managementFond.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 530));
        getContentPane().setLayout(null);

        Bt_add_back.setText("Back");
        Bt_add_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_add_backActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_add_back);
        Bt_add_back.setBounds(40, 430, 55, 23);

        Bt_Add.setText("add");
        Bt_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_AddActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_Add);
        Bt_Add.setBounds(630, 300, 80, 23);

        StarDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StarDescriptionActionPerformed(evt);
            }
        });
        getContentPane().add(StarDescription);
        StarDescription.setBounds(120, 310, 320, 90);

        Lb_add_commentary.setText("Budget Requis");
        getContentPane().add(Lb_add_commentary);
        Lb_add_commentary.setBounds(130, 260, 70, 14);

        Lb_Add_title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Lb_Add_title.setText("Star's Name");
        getContentPane().add(Lb_Add_title);
        Lb_Add_title.setBounds(60, 40, 130, 40);

        StarBudget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StarBudgetActionPerformed(evt);
            }
        });
        StarBudget.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                StarBudgetFocusLost(evt);
            }
        });
        getContentPane().add(StarBudget);
        StarBudget.setBounds(210, 250, 130, 30);

        Bt_Delete.setText("Delete");
        Bt_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_Delete);
        Bt_Delete.setBounds(630, 380, 80, 23);
        getContentPane().add(label_msg);
        label_msg.setBounds(210, 450, 0, 0);

        StarTag.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Technology", "ART", "Design", "Music", "Food", "Publishing", "Gaming", "Other" }));
        getContentPane().add(StarTag);
        StarTag.setBounds(210, 100, 90, 20);

        Lb_add_commentary2.setText("Description");
        getContentPane().add(Lb_add_commentary2);
        Lb_add_commentary2.setBounds(30, 290, 60, 14);

        Lb_add_commentary4.setText("Tag");
        getContentPane().add(Lb_add_commentary4);
        Lb_add_commentary4.setBounds(170, 100, 30, 14);

        Lb_add_commentary5.setText("Avatar");
        getContentPane().add(Lb_add_commentary5);
        Lb_add_commentary5.setBounds(170, 130, 60, 14);

        Lb_add_commentary6.setText("Date Limite");
        getContentPane().add(Lb_add_commentary6);
        Lb_add_commentary6.setBounds(140, 220, 60, 14);

        imp_avatar.setText("Import");
        imp_avatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imp_avatarActionPerformed(evt);
            }
        });
        getContentPane().add(imp_avatar);
        imp_avatar.setBounds(210, 130, 65, 23);

        TbIdee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titre", "Description", "Date Debut", "Date Limite", "Budget requis"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TbIdee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbIdeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbIdee);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(480, 30, 370, 150);

        StarName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StarName1ActionPerformed(evt);
            }
        });
        StarName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                StarName1FocusLost(evt);
            }
        });
        getContentPane().add(StarName1);
        StarName1.setBounds(210, 50, 91, 30);

        Lb_add_commentary7.setText("Date Creation");
        getContentPane().add(Lb_add_commentary7);
        Lb_add_commentary7.setBounds(130, 180, 80, 14);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(210, 180, 130, 20);

        jDateChooser2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooser2FocusLost(evt);
            }
        });
        getContentPane().add(jDateChooser2);
        jDateChooser2.setBounds(210, 220, 130, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IdeaStarter/Image/fondMan.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 870, 500);

        Bt_Update.setText("Update");
        Bt_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_Update);
        Bt_Update.setBounds(630, 340, 80, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_add_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_add_backActionPerformed
        // TODO add your handling code here:

        this.dispose();

    }//GEN-LAST:event_Bt_add_backActionPerformed

    private void Bt_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AddActionPerformed
        // TODO add your handling code here:
        java.sql.Date dateDebut;
        java.sql.Date dateLimit;
        Idee idee=new Idee();
        
        
        idee.setTitre(StarName1.getText());
        idee.setDescription(StarDescription.getText());
        idee.setCategorie(StarTag.getSelectedItem().toString());
        
        dateDebut=convertUtilDateToSqlDate(jDateChooser1.getDate());
        idee.setDateDebut(dateDebut);
        
        dateLimit=convertUtilDateToSqlDate(jDateChooser2.getDate());
        idee.setDateLimite(dateLimit);
        
        idee.setBudgetRequis(Integer.parseInt(StarBudget.getText()));
        
        IdeeDAO ideeDao= new IdeeDAO();
        
        //to update and get the connected client id
        if (ideeDao.createIdee(idee,1)){
          model = new DefaultTableModel(data,WIDTH);
          remplirModel();
         // TbIdee.removeAll();
          TbIdee.setModel(model);
           // model.insertRow(model.getRowCount(), new Object[]{idee.getId(),idee.getTitre(),idee.getDateDebut(),idee.getDateLimite(),idee.getDescription()});
        }
        else {
            JOptionPane.showMessageDialog(null, "echec");
        }
       
    }//GEN-LAST:event_Bt_AddActionPerformed

    private void StarDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StarDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StarDescriptionActionPerformed

    private void StarBudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StarBudgetActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_StarBudgetActionPerformed

    private void Bt_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_UpdateActionPerformed
        // TODO add your handling code here:
//        Idee idee = new Idee();
//        String Id = model.getValueAt(TbIdee.getSelectedRow(), 0).toString();
//        int m = Integer.parseInt(Id);
//        
//        
//        idee.setTitre(StarName1.getText());
//        idee.setDescription(StarDescription.getText());
//        idee.setCategorie(StarTag.getSelectedItem().toString());
//        idee.setDateDebut((java.sql.Date) (Date) jDateChooser1.getDate());
//        idee.setDateLimite((java.sql.Date)(Date)jDateChooser2.getDate());
//        idee.setBudgetRequis(Integer.parseInt(StarBudget.getText()));
//        
//        ideeDAO = new IdeeDAO();
//        if(ideeDAO.updateIdee(idee,idee.getId(),m)){
//            model.removeRow(TbIdee.getSelectedRow());
//            model.insertRow(model.getRowCount(), data);
//            JOptionPane.showMessageDialog(null, "materiel modifié avec");
//            
//        }
//        
//        else{
//            JOptionPane.showMessageDialog(null, "echec");
//        }
//
    }//GEN-LAST:event_Bt_UpdateActionPerformed

    private void Bt_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_DeleteActionPerformed
        // TODO add your handling code here:
        ideeDAO = new IdeeDAO();
        
        for(int i=0;i<=TbIdee.getSelectedRowCount();i++){
        int id = (int)model.getValueAt(TbIdee.getSelectedRows()[i], 0);
            if(!ideeDAO.deleteIdee(id)){
            JOptionPane.showMessageDialog(null, "echec");
            return;
            }
            model.removeRow(TbIdee.getSelectedRows()[i]);
        }
        JOptionPane.showMessageDialog(null, "Idee supprimé avec succes");
    }//GEN-LAST:event_Bt_DeleteActionPerformed

    private void imp_avatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imp_avatarActionPerformed
        // TODO add your handling code here:
//         JFileChooser chooser=new JFileChooser();
//        chooser.showOpenDialog(null);
//        File f=chooser.getSelectedFile();
//        String filename =f.getAbsolutePath();
//        try {
//            File image =new File(filename);
//            FileInputStream fis =new FileInputStream(image);
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            byte[] buf =new byte[1024];
//            for(int readNum;(readNum=fis.read(buf))!= -1;){
//                bos.write(buf, 0, readNum);
//            }
//             avatar=bos.toByteArray();
//            
//        } catch (Exception e) {
//           JOptionPane.showMessageDialog(null, e);
//        }
//       
//       
    }//GEN-LAST:event_imp_avatarActionPerformed

    private void StarName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StarName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StarName1ActionPerformed

    private void TbIdeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbIdeeMouseClicked
       
        // TODO add your handling code here:
        StarName1.setText(String.valueOf(model.getValueAt(TbIdee.getSelectedRow(), 1)));
        StarTag.setSelectedItem(String.valueOf(model.getValueAt(TbIdee.getSelectedRow(), 2)));
        StarDescription.setText(String.valueOf(model.getValueAt(TbIdee.getSelectedRow(), 3)));        
        jDateChooser1.setDateFormatString(String.valueOf(model.getValueAt(TbIdee.getSelectedRow(), 4)));
        jDateChooser2.setDateFormatString(String.valueOf(model.getValueAt(TbIdee.getSelectedRow(), 5)));
        StarBudget.setText(String.valueOf(model.getValueAt(TbIdee.getSelectedRow(), 6)));

    }//GEN-LAST:event_TbIdeeMouseClicked

    private void StarName1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_StarName1FocusLost
        // TODO add your handling code here:
             JTextField source = (JTextField) evt.getSource();
                    String textFieldContent = source.getText();
                    test2 = true;
                     Color bgColor = Color.WHITE;
                        if(source.getText().equals(""))
                            {
                            test2=false;
                            bgColor = Color.BLUE;
                            }
                        else
                            {

                try {

                        Float.parseFloat(source.getText().charAt(0)+"");
                        test2 = false;
                        bgColor = Color.RED;   
                } catch (Exception e) {
// ne fait rien: la couleur de
// fond sera rouge
                }}
                        source.setBackground(bgColor);
    
    }//GEN-LAST:event_StarName1FocusLost

    private void jDateChooser2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser2FocusLost
        // TODO add your handling code here:
        JTextField source = (JTextField) evt.getSource();
                    String textFieldContent = source.getText();
                    test3 = true;
                     Color bgColor = Color.WHITE;
                        if(source.getText().equals(""))
                            {
                            test3=false;
                            bgColor = Color.BLUE;
                            }
                        else
                            {

                try {

                        Float.parseFloat(source.getText().charAt(0)+"");
                        test3 = false;
                        bgColor = Color.RED;   
                } catch (Exception e) {
// ne fait rien: la couleur de
// fond sera rouge
                }}
                        source.setBackground(bgColor);
    
    }//GEN-LAST:event_jDateChooser2FocusLost

    private void StarBudgetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_StarBudgetFocusLost
        // TODO add your handling code here:
        JTextField source = (JTextField) evt.getSource();
                    String textFieldContent = source.getText();
                    test3 = true;
                     Color bgColor = Color.WHITE;
                        if(source.getText().equals(""))
                            {
                            test3=false;
                            bgColor = Color.BLUE;
                            }
                        else
                            {

                try {

                        Float.parseFloat(source.getText().charAt(0)+"");
                        test3 = false;
                        bgColor = Color.RED;   
                } catch (Exception e) {
                            // ne fait rien: la couleur de
                            // fond sera rouge
                }}
                        source.setBackground(bgColor);
    
    }//GEN-LAST:event_StarBudgetFocusLost

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
            java.util.logging.Logger.getLogger(GestionProjectUserUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionProjectUserUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionProjectUserUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionProjectUserUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GestionProjectUserUpdate().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Add;
    private javax.swing.JButton Bt_Delete;
    private javax.swing.JButton Bt_Update;
    private javax.swing.JButton Bt_add_back;
    private javax.swing.JLabel Lb_Add_title;
    private javax.swing.JLabel Lb_add_commentary;
    private javax.swing.JLabel Lb_add_commentary2;
    private javax.swing.JLabel Lb_add_commentary4;
    private javax.swing.JLabel Lb_add_commentary5;
    private javax.swing.JLabel Lb_add_commentary6;
    private javax.swing.JLabel Lb_add_commentary7;
    private javax.swing.JTextField StarBudget;
    private javax.swing.JTextField StarDescription;
    private javax.swing.JTextField StarName1;
    private javax.swing.JComboBox StarTag;
    private javax.swing.JTable TbIdee;
    private javax.swing.JButton imp_avatar;
    private com.toedter.plaf.JCalendarTheme jCalendarTheme1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_msg;
    // End of variables declaration//GEN-END:variables

    
 
 
}