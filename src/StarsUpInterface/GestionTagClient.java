/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpInterface;


/**
 *
 * @author Emna
 */
public class GestionTagClient extends javax.swing.JFrame {

    /**
     * Creates new form GestionTagClient
     */
    public GestionTagClient() {
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

        bt_ArtTag = new javax.swing.JButton();
        bt_MusicTag = new javax.swing.JButton();
        bt_FilmTag = new javax.swing.JButton();
        bt_TechnologyTag = new javax.swing.JButton();
        bt_PhotographyTag = new javax.swing.JButton();
        bt_DesignTag = new javax.swing.JButton();
        bt_GamesTag = new javax.swing.JButton();
        bt_FoodTag = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bt_Back = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Lb_HomeIcon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        bt_ArtTag.setText("Art");
        bt_ArtTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ArtTagActionPerformed(evt);
            }
        });
        getContentPane().add(bt_ArtTag);
        bt_ArtTag.setBounds(89, 150, 83, 36);

        bt_MusicTag.setText("Music");
        bt_MusicTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_MusicTagActionPerformed(evt);
            }
        });
        getContentPane().add(bt_MusicTag);
        bt_MusicTag.setBounds(337, 150, 77, 36);

        bt_FilmTag.setText("Film & Video");
        bt_FilmTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_FilmTagActionPerformed(evt);
            }
        });
        getContentPane().add(bt_FilmTag);
        bt_FilmTag.setBounds(215, 255, 89, 35);

        bt_TechnologyTag.setText("Technology");
        bt_TechnologyTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_TechnologyTagActionPerformed(evt);
            }
        });
        getContentPane().add(bt_TechnologyTag);
        bt_TechnologyTag.setBounds(148, 204, 87, 37);

        bt_PhotographyTag.setText("Photography");
        bt_PhotographyTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PhotographyTagActionPerformed(evt);
            }
        });
        getContentPane().add(bt_PhotographyTag);
        bt_PhotographyTag.setBounds(201, 151, 108, 34);

        bt_DesignTag.setText("Design");
        bt_DesignTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DesignTagActionPerformed(evt);
            }
        });
        getContentPane().add(bt_DesignTag);
        bt_DesignTag.setBounds(89, 255, 95, 34);

        bt_GamesTag.setText("Games");
        bt_GamesTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_GamesTagActionPerformed(evt);
            }
        });
        getContentPane().add(bt_GamesTag);
        bt_GamesTag.setBounds(253, 205, 88, 34);

        bt_FoodTag.setText("Food");
        bt_FoodTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_FoodTagActionPerformed(evt);
            }
        });
        getContentPane().add(bt_FoodTag);
        bt_FoodTag.setBounds(330, 256, 71, 33);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setText("Explore an innovative Creative Universe");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 100, 300, 49);

        bt_Back.setText("<  Back");
        bt_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_BackActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Back);
        bt_Back.setBounds(10, 351, 69, 23);

        jTextField1.setText("Search");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(490, 20, 79, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/logoPi.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(53, 11, 53, 50);

        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 50, 99, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/SearchIcon.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 20, 18, 15);

        Lb_HomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/MB__home.png"))); // NOI18N
        Lb_HomeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lb_HomeIconMouseClicked(evt);
            }
        });
        getContentPane().add(Lb_HomeIcon);
        Lb_HomeIcon.setBounds(420, 0, 60, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/fond.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-10, 0, 600, 400);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Help");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ArtTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ArtTagActionPerformed

         ListeDesIdeesParCategorie appelFenetre = new ListeDesIdeesParCategorie();
        appelFenetre.setVisible(true);
    }//GEN-LAST:event_bt_ArtTagActionPerformed

    private void bt_MusicTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_MusicTagActionPerformed
       ListeDesIdeesParCategorie appelFenetre = new ListeDesIdeesParCategorie();
        appelFenetre.setVisible(true);
    }//GEN-LAST:event_bt_MusicTagActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void bt_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_BackActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_bt_BackActionPerformed

    private void bt_FilmTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_FilmTagActionPerformed
        ListeDesIdeesParCategorie appelFenetre = new ListeDesIdeesParCategorie();
        appelFenetre.setVisible(true);
    }//GEN-LAST:event_bt_FilmTagActionPerformed

    private void bt_TechnologyTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_TechnologyTagActionPerformed
        ListeDesIdeesParCategorie appelFenetre = new ListeDesIdeesParCategorie();
        appelFenetre.setVisible(true);
       
    }//GEN-LAST:event_bt_TechnologyTagActionPerformed

    private void bt_PhotographyTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PhotographyTagActionPerformed
        ListeDesIdeesParCategorie appelFenetre = new ListeDesIdeesParCategorie();
        appelFenetre.setVisible(true);
    }//GEN-LAST:event_bt_PhotographyTagActionPerformed

    private void bt_DesignTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DesignTagActionPerformed
        ListeDesIdeesParCategorie appelFenetre = new ListeDesIdeesParCategorie();
        appelFenetre.setVisible(true);
    }//GEN-LAST:event_bt_DesignTagActionPerformed

    private void bt_GamesTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_GamesTagActionPerformed
        ListeDesIdeesParCategorie appelFenetre = new ListeDesIdeesParCategorie();
        appelFenetre.setVisible(true);
                
    }//GEN-LAST:event_bt_GamesTagActionPerformed

    private void bt_FoodTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_FoodTagActionPerformed
        // TODO add your handling code here:
        ListeDesIdeesParCategorie appelFenetre = new ListeDesIdeesParCategorie();
        appelFenetre.setVisible(true);
    }//GEN-LAST:event_bt_FoodTagActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Authentification().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Lb_HomeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lb_HomeIconMouseClicked
        // TODO add your handling code here:
        new GestionHomeUser().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Lb_HomeIconMouseClicked

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
            java.util.logging.Logger.getLogger(GestionTagClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionTagClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionTagClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionTagClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionTagClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb_HomeIcon;
    private javax.swing.JButton bt_ArtTag;
    private javax.swing.JButton bt_Back;
    private javax.swing.JButton bt_DesignTag;
    private javax.swing.JButton bt_FilmTag;
    private javax.swing.JButton bt_FoodTag;
    private javax.swing.JButton bt_GamesTag;
    private javax.swing.JButton bt_MusicTag;
    private javax.swing.JButton bt_PhotographyTag;
    private javax.swing.JButton bt_TechnologyTag;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
