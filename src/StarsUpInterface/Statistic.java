/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpInterface;

/**
 *
 * @author MAHER
 */
public class Statistic extends javax.swing.JFrame {

    /**
     * Creates new form Statistic
     */
    public Statistic() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Lb_HomeIcon = new javax.swing.JLabel();
        MenuBar1 = new javax.swing.JMenuBar();
        File_Menu = new javax.swing.JMenu();
        File_Home_Menu = new javax.swing.JMenuItem();
        File_Quit_Menu = new javax.swing.JMenuItem();
        Help_Menu = new javax.swing.JMenu();
        Help_Help_Menu = new javax.swing.JMenuItem();
        Help_About_Menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                "Title ", "Tag", "Date", "Views", "Contribuates", "Like"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 160, 452, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/free-vector-bach-statistics-icon.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, -120, 450, 450);

        Lb_HomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/MB__home.png"))); // NOI18N
        Lb_HomeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lb_HomeIconMouseClicked(evt);
            }
        });
        getContentPane().add(Lb_HomeIcon);
        Lb_HomeIcon.setBounds(510, 10, 60, 70);

        File_Menu.setText("File");

        File_Home_Menu.setText("Home");
        File_Home_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                File_Home_MenuActionPerformed(evt);
            }
        });
        File_Menu.add(File_Home_Menu);

        File_Quit_Menu.setText("Quit");
        File_Quit_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                File_Quit_MenuActionPerformed(evt);
            }
        });
        File_Menu.add(File_Quit_Menu);

        MenuBar1.add(File_Menu);

        Help_Menu.setText("Help");

        Help_Help_Menu.setText("Help");
        Help_Help_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Help_Help_MenuActionPerformed(evt);
            }
        });
        Help_Menu.add(Help_Help_Menu);

        Help_About_Menu.setText("About");
        Help_About_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Help_About_MenuActionPerformed(evt);
            }
        });
        Help_Menu.add(Help_About_Menu);

        MenuBar1.add(Help_Menu);

        setJMenuBar(MenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void File_Home_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_File_Home_MenuActionPerformed
        // TODO add your handling code here:
        GestionHomeUser appelFenetre = new GestionHomeUser();
        appelFenetre.setVisible(true);
    }//GEN-LAST:event_File_Home_MenuActionPerformed

    private void File_Quit_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_File_Quit_MenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_File_Quit_MenuActionPerformed

    private void Help_Help_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Help_Help_MenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Help_Help_MenuActionPerformed

    private void Help_About_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Help_About_MenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Help_About_MenuActionPerformed

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
            java.util.logging.Logger.getLogger(Statistic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistic().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem File_Home_Menu;
    private javax.swing.JMenu File_Menu;
    private javax.swing.JMenuItem File_Quit_Menu;
    private javax.swing.JMenuItem Help_About_Menu;
    private javax.swing.JMenuItem Help_Help_Menu;
    private javax.swing.JMenu Help_Menu;
    private javax.swing.JLabel Lb_HomeIcon;
    private javax.swing.JMenuBar MenuBar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
