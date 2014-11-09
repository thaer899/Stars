/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpInterface;

import StarsUpDAO.IdeeDAO;
import StarsUpRSS.Feed;
import StarsUpRSS.FeedMessage;
import StarsUpRSS.RSSFeedParser;
import entities.Client;
import entities.Contribution;
import entities.Idee;
import java.awt.Graphics;
import java.util.List;
import javax.swing.ImageIcon;
import sun.misc.Cleaner;

/**
 *
 * @author thaer
 */
public class ProjectHome extends javax.swing.JFrame {

    /**
     * Creates new form ProjectHome
     */
    public ProjectHome() {
        initComponents();
    }
    
    Client currentClient = new Client();
    int currentClientId = currentClient.getId();
    
    public ProjectHome(int id,Client currentClient) {
        initComponents();
        
        Idee idee = new Idee();
        IdeeDAO idao = new IdeeDAO();
        
        
        idee = idao.getById(id);
        
       
        Lb_Project_ProjectName.setText(idee.getTitre());
        Lb_Project_NameUser.setText(currentClient.getNom());
        Lb_Project_Description.setText(idee.getDescription());
        Lb_Project_DateCreation.setText(idee.getDateDebut().toString());
        Lb_Project_DateLimit.setText(idee.getDateLimite().toString());
        
             byte[] imagedata=currentClient.getPerson_image();
            ImageIcon format = new ImageIcon(imagedata);
            UserIcon.setIcon(format);
        
    }
    
     public ProjectHome(int id,int currentClientId) {
        initComponents();
        
        Idee idee = new Idee();
        IdeeDAO idao = new IdeeDAO();
        
        
        idee = idao.getById(id);
        
        Lb_Project_ProjectName.setText(idee.getTitre());
       
        Lb_Project_NameUser.setText(currentClient.getNom());
        Lb_Project_Description.setText(idee.getDescription());
        Lb_Project_DateCreation.setText(idee.getDateDebut().toString());
        Lb_Project_DateLimit.setText(idee.getDateLimite().toString());

    }
    
    
    
    
    
    
            public ProjectHome(Client currentClient) {
                    initComponents();
                    Idee idee = new Idee();
                    IdeeDAO idao = new IdeeDAO();
        
                     Lb_Project_ProjectName.setText(idee.getTitre());

                
            }
            
            
    
    
     
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        Lb_Project_Description = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lb_Project_DateLimit = new javax.swing.JLabel();
        Lb_Project_NameUser = new javax.swing.JLabel();
        Lb_Project_ProjectName = new javax.swing.JLabel();
        Lb_Logo = new javax.swing.JLabel();
        Lb_Photo = new javax.swing.JLabel();
        Lb_fb_like = new javax.swing.JLabel();
        Lb_fb_Share = new javax.swing.JLabel();
        Tf_Search = new javax.swing.JTextField();
        Lb_Icon_Search = new javax.swing.JLabel();
        Log_out = new javax.swing.JButton();
        Lb_notification_Icon = new javax.swing.JLabel();
        Lb_HomeIcon = new javax.swing.JLabel();
        Lb_contribuer = new javax.swing.JLabel();
        Lb_Project_DateCreation = new javax.swing.JLabel();
        UserIcon = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        Lb_Add_Project = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 450));
        getContentPane().setLayout(null);

        Lb_Project_Description.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Project_Description.setMinimumSize(new java.awt.Dimension(100, 30));
        Lb_Project_Description.setOpaque(true);
        Lb_Project_Description.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(Lb_Project_Description);
        Lb_Project_Description.setBounds(10, 310, 570, 80);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Description");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 290, 80, 20);

        Lb_Project_DateLimit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lb_Project_DateLimit.setText("Limit Date");
        Lb_Project_DateLimit.setOpaque(true);
        getContentPane().add(Lb_Project_DateLimit);
        Lb_Project_DateLimit.setBounds(330, 230, 80, 20);

        Lb_Project_NameUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Lb_Project_NameUser.setText("Star's Inventor");
        Lb_Project_NameUser.setOpaque(true);
        getContentPane().add(Lb_Project_NameUser);
        Lb_Project_NameUser.setBounds(190, 190, 170, 30);

        Lb_Project_ProjectName.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Lb_Project_ProjectName.setText("Star's Name");
        Lb_Project_ProjectName.setOpaque(true);
        getContentPane().add(Lb_Project_ProjectName);
        Lb_Project_ProjectName.setBounds(140, 130, 270, 50);

        Lb_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/logoPi.png"))); // NOI18N
        Lb_Logo.setText("jLabel1");
        getContentPane().add(Lb_Logo);
        Lb_Logo.setBounds(30, 30, 50, 40);

        Lb_Photo.setIcon(new javax.swing.ImageIcon("D:\\esprit\\4eme\\Pi-Dev\\Design\\logoStar.png")); // NOI18N
        Lb_Photo.setText("Photo");
        Lb_Photo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActionMouse(evt);
            }
        });
        getContentPane().add(Lb_Photo);
        Lb_Photo.setBounds(10, 129, 109, 110);

        Lb_fb_like.setIcon(new javax.swing.ImageIcon("D:\\esprit\\4eme\\Pi-Dev\\Design\\FbLike.png")); // NOI18N
        Lb_fb_like.setText("jLabel2");
        getContentPane().add(Lb_fb_like);
        Lb_fb_like.setBounds(490, 250, 46, 20);

        Lb_fb_Share.setIcon(new javax.swing.ImageIcon("D:\\esprit\\4eme\\Pi-Dev\\Design\\FbShare.png")); // NOI18N
        Lb_fb_Share.setText("jLabel2");
        getContentPane().add(Lb_fb_Share);
        Lb_fb_Share.setBounds(540, 250, 40, 23);

        Tf_Search.setText("Search");
        Tf_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Tf_Search);
        Tf_Search.setBounds(479, 26, 96, 20);

        Lb_Icon_Search.setIcon(new javax.swing.ImageIcon("D:\\esprit\\4eme\\Pi-Dev\\Sprint1\\SearchIcon.png")); // NOI18N
        Lb_Icon_Search.setText("jLabel3");
        getContentPane().add(Lb_Icon_Search);
        Lb_Icon_Search.setBounds(458, 29, 15, 15);

        Log_out.setText("Log out");
        Log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_outActionPerformed(evt);
            }
        });
        getContentPane().add(Log_out);
        Log_out.setBounds(380, 80, 69, 23);

        Lb_notification_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/message-xxl.png"))); // NOI18N
        Lb_notification_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lb_notification_IconMouseClicked(evt);
            }
        });
        getContentPane().add(Lb_notification_Icon);
        Lb_notification_Icon.setBounds(280, 30, 30, 20);

        Lb_HomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/MB__home.png"))); // NOI18N
        Lb_HomeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lb_HomeIconMouseClicked(evt);
            }
        });
        getContentPane().add(Lb_HomeIcon);
        Lb_HomeIcon.setBounds(330, 10, 60, 70);

        Lb_contribuer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lb_contribuer.setText("Contribute");
        Lb_contribuer.setOpaque(true);
        Lb_contribuer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lb_contribuerMouseClicked(evt);
            }
        });
        getContentPane().add(Lb_contribuer);
        Lb_contribuer.setBounds(510, 170, 60, 60);

        Lb_Project_DateCreation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lb_Project_DateCreation.setText("Creation Date");
        Lb_Project_DateCreation.setOpaque(true);
        getContentPane().add(Lb_Project_DateCreation);
        Lb_Project_DateCreation.setBounds(140, 230, 80, 20);

        UserIcon.setText("jLabel4");
        getContentPane().add(UserIcon);
        UserIcon.setBounds(390, 20, 60, 60);
        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(390, 20, 50, 60);

        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 70, 34, 14);

        Lb_Add_Project.setBackground(new java.awt.Color(0, 0, 0));
        Lb_Add_Project.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lb_Add_Project.setForeground(new java.awt.Color(0, 0, 255));
        Lb_Add_Project.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IdeaStarter/Image/addasatr.png"))); // NOI18N
        Lb_Add_Project.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lb_Add_ProjectMouseClicked(evt);
            }
        });
        getContentPane().add(Lb_Add_Project);
        Lb_Add_Project.setBounds(510, 100, 80, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/fond.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 410);

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

    private void ActionMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActionMouse
        // TODO add your handling code here:
         FileChooser appelFenetre = new FileChooser();
        appelFenetre.setVisible(true);
        
    }//GEN-LAST:event_ActionMouse

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

    private void Tf_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_SearchActionPerformed

    private void Log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_outActionPerformed
        new Authentification().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Log_outActionPerformed

    private void Lb_notification_IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lb_notification_IconMouseClicked
        // TODO add your handling code here:
        ConsulterNotifications appelFenetre = new ConsulterNotifications();
        appelFenetre.setVisible(true);
    }//GEN-LAST:event_Lb_notification_IconMouseClicked

    private void Lb_HomeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lb_HomeIconMouseClicked
        // TODO add your handling code here:
        new GestionHomeUser(currentClient).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Lb_HomeIconMouseClicked

    private void Lb_contribuerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lb_contribuerMouseClicked
        // TODO add your handling code here:
        new GestionProjectUserContributions().setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_Lb_contribuerMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
     

    
    }//GEN-LAST:event_jLabel3MouseClicked

    private void Lb_Add_ProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lb_Add_ProjectMouseClicked
        // TODO add your handling code here:
        GestionProjectUserUpdate appelFenetre = new GestionProjectUserUpdate();
        appelFenetre.setVisible(true);
    }//GEN-LAST:event_Lb_Add_ProjectMouseClicked

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
            java.util.logging.Logger.getLogger(ProjectHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProjectHome().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb_Add_Project;
    private javax.swing.JLabel Lb_HomeIcon;
    private javax.swing.JLabel Lb_Icon_Search;
    private javax.swing.JLabel Lb_Logo;
    private javax.swing.JLabel Lb_Photo;
    private javax.swing.JLabel Lb_Project_DateCreation;
    private javax.swing.JLabel Lb_Project_DateLimit;
    private javax.swing.JLabel Lb_Project_Description;
    private javax.swing.JLabel Lb_Project_NameUser;
    private javax.swing.JLabel Lb_Project_ProjectName;
    private javax.swing.JLabel Lb_contribuer;
    private javax.swing.JLabel Lb_fb_Share;
    private javax.swing.JLabel Lb_fb_like;
    private javax.swing.JLabel Lb_notification_Icon;
    private javax.swing.JButton Log_out;
    private javax.swing.JTextField Tf_Search;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables

    void paintComponent(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class GestionHome {

        public GestionHome() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
