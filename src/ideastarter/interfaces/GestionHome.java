/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.interfaces;

/**
 *
 * @author thaer
 */
public class GestionHome extends javax.swing.JFrame {

    /**
     * Creates new form GestionHome
     */
    public GestionHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cb_Connexion = new javax.swing.JComboBox();
        jToolBar1 = new javax.swing.JToolBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bt_Client = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bt_admin1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_Tag1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Bt_Admin_Project_Update = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Bt_Admin_Tag_Add = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        LIcon = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        Cb_Connexion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Connected", "Log out", "Help" }));
        Cb_Connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_ConnexionActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 460));
        setPreferredSize(new java.awt.Dimension(620, 440));
        getContentPane().setLayout(null);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(412, 280));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(413, 270));

        jPanel9.setPreferredSize(new java.awt.Dimension(400, 260));
        jPanel9.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\esprit\\4eme\\Pi-Dev\\Design\\Icons\\homeIcon.png")); // NOI18N
        jPanel9.add(jLabel2);
        jLabel2.setBounds(0, 0, 490, 260);

        jTabbedPane1.addTab("Home", jPanel9);

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(null);

        bt_Client.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_Client.setForeground(new java.awt.Color(102, 102, 255));
        bt_Client.setText("Client");
        bt_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ClientActionPerformed(evt);
            }
        });
        jPanel1.add(bt_Client);
        bt_Client.setBounds(80, 160, 100, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/admin.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 60, 85, 93);

        bt_admin1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_admin1.setForeground(new java.awt.Color(51, 51, 255));
        bt_admin1.setText("Administrator");
        bt_admin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_admin1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_admin1);
        bt_admin1.setBounds(210, 160, 140, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/user.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 60, 85, 93);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/management-icon.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 490, 270);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Account Management", jPanel2);

        jPanel4.setLayout(null);

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(180, 230, 51, 23);

        Table_Tag1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tag Name", "Creation date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table_Tag1.setName("TableTag"); // NOI18N
        jScrollPane3.setViewportView(Table_Tag1);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(50, 10, 330, 210);

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\esprit\\4eme\\Pi-Dev\\Design\\Icons\\management-icon.png")); // NOI18N
        jPanel4.add(jLabel6);
        jLabel6.setBounds(0, 0, 490, 260);

        jTabbedPane1.addTab("Tags Management", jPanel4);

        jPanel5.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title", "Tag", "Date", "Score", "Views", "Contributions"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(20, 35, 360, 180);

        Bt_Admin_Project_Update.setText("Update");
        Bt_Admin_Project_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Admin_Project_UpdateActionPerformed(evt);
            }
        });
        jPanel5.add(Bt_Admin_Project_Update);
        Bt_Admin_Project_Update.setBounds(150, 230, 80, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\esprit\\4eme\\Pi-Dev\\Design\\Icons\\management-icon.png")); // NOI18N
        jPanel5.add(jLabel7);
        jLabel7.setBounds(0, 0, 490, 260);

        jTabbedPane1.addTab("Project Management", jPanel5);

        jPanel6.setLayout(null);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "User Name", "Message", "E-mail", "Facebook", "SMS", "Start date"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jPanel6.add(jScrollPane4);
        jScrollPane4.setBounds(12, 30, 380, 185);

        Bt_Admin_Tag_Add.setText("Add ");
        Bt_Admin_Tag_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Admin_Tag_AddActionPerformed(evt);
            }
        });
        jPanel6.add(Bt_Admin_Tag_Add);
        Bt_Admin_Tag_Add.setBounds(180, 220, 55, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\esprit\\4eme\\Pi-Dev\\Design\\Icons\\management-icon.png")); // NOI18N
        jPanel6.add(jLabel8);
        jLabel8.setBounds(0, 0, 490, 260);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField2);
        jTextField2.setBounds(0, -40, 353, 170);

        jTabbedPane1.addTab("Notification Management", jPanel6);

        jPanel8.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\esprit\\4eme\\Pi-Dev\\Design\\Icons\\management-icon.png")); // NOI18N
        jPanel8.add(jLabel9);
        jLabel9.setBounds(0, 0, 490, 260);

        jTabbedPane1.addTab("Forum Management", jPanel8);

        jPanel7.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\esprit\\4eme\\Pi-Dev\\Design\\Icons\\management-icon.png")); // NOI18N
        jPanel7.add(jLabel10);
        jLabel10.setBounds(0, 0, 490, 260);

        jTabbedPane1.addTab("Statistic Management", jPanel7);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 80, 560, 270);

        LIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/logoPi.png"))); // NOI18N
        getContentPane().add(LIcon);
        LIcon.setBounds(20, 20, 51, 50);

        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(490, 10, 71, 23);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/fond.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 600, 400);

        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("D:\\esprit\\4eme\\Pi-Dev\\Sprint1\\home-icon.jpg")); // NOI18N
        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("D:\\esprit\\4eme\\Pi-Dev\\Sprint1\\quit-icon.jpg")); // NOI18N
        jMenuItem2.setText("Quit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem3.setIcon(new javax.swing.ImageIcon("D:\\esprit\\4eme\\Pi-Dev\\Sprint1\\helpIcon.jpg")); // NOI18N
        jMenuItem3.setText("Help");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("About");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        GestionHome appelFenetre = new GestionHome();
        appelFenetre.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void Cb_ConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_ConnexionActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Cb_ConnexionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Authentification().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Bt_Admin_Project_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Admin_Project_UpdateActionPerformed
        // TODO add your handling code here:
        GestionProjectAdminUpdate appelFenetre = new GestionProjectAdminUpdate();
        appelFenetre.setVisible(true);
        
    }//GEN-LAST:event_Bt_Admin_Project_UpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new ManagementTag().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_admin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_admin1ActionPerformed
       GestionDesComptesAdmins appelFenetre = new GestionDesComptesAdmins();
        appelFenetre.setVisible(true);
    }//GEN-LAST:event_bt_admin1ActionPerformed

    private void bt_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ClientActionPerformed
        GestionDesComptesClients appelFenetre = new GestionDesComptesClients();
        appelFenetre.setVisible(true);
    }//GEN-LAST:event_bt_ClientActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void Bt_Admin_Tag_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Admin_Tag_AddActionPerformed
        // TODO add your handling code here:
        GestionTagAdminAdd appelFenetre = new GestionTagAdminAdd();
        appelFenetre.setVisible(true);
    }//GEN-LAST:event_Bt_Admin_Tag_AddActionPerformed

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
            java.util.logging.Logger.getLogger(GestionHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionHome().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Admin_Project_Update;
    private javax.swing.JButton Bt_Admin_Tag_Add;
    private javax.swing.JComboBox Cb_Connexion;
    private javax.swing.JLabel LIcon;
    private javax.swing.JTable Table_Tag1;
    private javax.swing.JButton bt_Client;
    private javax.swing.JButton bt_admin1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    void destroy(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Categorie {

        public Categorie() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}