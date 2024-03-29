/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpInterface;

import entities.Client;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 *
 * @author thaer
 */
public class GestionHomeUser extends javax.swing.JFrame {

    /**
     * Creates new form GestionProjectAdmin
     */
    
    Client currentClient;
    
    public GestionHomeUser() {
        initComponents();
        
    }
    public GestionHomeUser(Client client) {
        currentClient=client;
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

        New_projects = new javax.swing.JTextField();
        Lb_Notification = new javax.swing.JLabel();
        JTabbedPane = new javax.swing.JTabbedPane();
        pan_home = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        New_project_pan1 = new javax.swing.JPanel();
        labproject1 = new javax.swing.JLabel();
        labproject2 = new javax.swing.JLabel();
        labproject3 = new javax.swing.JLabel();
        labproject4 = new javax.swing.JLabel();
        project1 = new javax.swing.JLabel();
        project2 = new javax.swing.JLabel();
        project3 = new javax.swing.JLabel();
        project4 = new javax.swing.JLabel();
        SeeAllProjects = new javax.swing.JButton();
        pan_feed = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Most_liked_pan = new javax.swing.JPanel();
        liked_labproject1 = new javax.swing.JLabel();
        liked_labproject2 = new javax.swing.JLabel();
        liked_labproject3 = new javax.swing.JLabel();
        liked_project1 = new javax.swing.JLabel();
        liked_project2 = new javax.swing.JLabel();
        liked_project3 = new javax.swing.JLabel();
        Most_liked = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Most_viewed_pan = new javax.swing.JPanel();
        viewed_labproject1 = new javax.swing.JLabel();
        viewed_labproject2 = new javax.swing.JLabel();
        viewed_labproject3 = new javax.swing.JLabel();
        viewed_projet1 = new javax.swing.JLabel();
        viewed_projet2 = new javax.swing.JLabel();
        viewed_projet3 = new javax.swing.JLabel();
        Most_viewed = new javax.swing.JTextField();
        pan_explore = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Rechercher_Text = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Lb_Add_Project = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Tag = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MenuBar1 = new javax.swing.JMenuBar();
        File_Menu = new javax.swing.JMenu();
        File_Home_Menu = new javax.swing.JMenuItem();
        File_Quit_Menu = new javax.swing.JMenuItem();
        Help_Menu = new javax.swing.JMenu();
        Help_Help_Menu = new javax.swing.JMenuItem();
        Help_About_Menu = new javax.swing.JMenuItem();

        New_projects.setText("New projects");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(600, 450));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        Lb_Notification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/message-xxl.png"))); // NOI18N
        getContentPane().add(Lb_Notification);
        Lb_Notification.setBounds(360, 30, 30, 20);

        JTabbedPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        JTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pan_home.setAutoscrolls(true);

        labproject1.setText("Learn more");
        labproject1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labproject1MouseClicked(evt);
            }
        });

        labproject2.setText("Learn more");

        labproject3.setText("Learn more");

        labproject4.setText("Learn more");

        project1.setText("project1");
        project1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                project1MouseClicked(evt);
            }
        });

        project2.setText("project2");

        project3.setText("project4");

        project4.setText("project3");

        javax.swing.GroupLayout New_project_pan1Layout = new javax.swing.GroupLayout(New_project_pan1);
        New_project_pan1.setLayout(New_project_pan1Layout);
        New_project_pan1Layout.setHorizontalGroup(
            New_project_pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(New_project_pan1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(New_project_pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(project1)
                    .addComponent(project2)
                    .addComponent(project3)
                    .addComponent(project4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(New_project_pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, New_project_pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labproject1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labproject2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labproject4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labproject3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(64, 64, 64))
        );
        New_project_pan1Layout.setVerticalGroup(
            New_project_pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(New_project_pan1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(New_project_pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labproject1)
                    .addComponent(project1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(New_project_pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labproject2)
                    .addComponent(project2))
                .addGap(18, 18, 18)
                .addGroup(New_project_pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labproject3)
                    .addComponent(project4))
                .addGap(18, 18, 18)
                .addGroup(New_project_pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labproject4)
                    .addComponent(project3))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        SeeAllProjects.setText("SeeAllProjects ");
        SeeAllProjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeeAllProjectsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SeeAllProjects)
                    .addComponent(New_project_pan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(New_project_pan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeeAllProjects)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel3);

        javax.swing.GroupLayout pan_homeLayout = new javax.swing.GroupLayout(pan_home);
        pan_home.setLayout(pan_homeLayout);
        pan_homeLayout.setHorizontalGroup(
            pan_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
        );
        pan_homeLayout.setVerticalGroup(
            pan_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_homeLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        JTabbedPane.addTab("Home", pan_home);

        pan_feed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pan_feed.setForeground(new java.awt.Color(255, 255, 51));
        pan_feed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        liked_labproject1.setText("Learn more");

        liked_labproject2.setText("Learn more");

        liked_labproject3.setText("Learn more");

        liked_project1.setText("liked_project1");

        liked_project2.setText("liked_project2");

        liked_project3.setText("liked_project3");

        javax.swing.GroupLayout Most_liked_panLayout = new javax.swing.GroupLayout(Most_liked_pan);
        Most_liked_pan.setLayout(Most_liked_panLayout);
        Most_liked_panLayout.setHorizontalGroup(
            Most_liked_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Most_liked_panLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(Most_liked_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(liked_project1)
                    .addComponent(liked_project2)
                    .addComponent(liked_project3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(Most_liked_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(liked_labproject1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(liked_labproject2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(liked_labproject3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        Most_liked_panLayout.setVerticalGroup(
            Most_liked_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Most_liked_panLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Most_liked_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liked_labproject1)
                    .addComponent(liked_project1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Most_liked_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liked_labproject2)
                    .addComponent(liked_project2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Most_liked_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liked_labproject3)
                    .addComponent(liked_project3))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(Most_liked_pan);

        Most_liked.setText("Most liked");

        viewed_labproject1.setText("Learn more");

        viewed_labproject2.setText("Learn more");

        viewed_labproject3.setText("Learn more");

        viewed_projet1.setText("viewed_projet1");

        viewed_projet2.setText("viewed_projet2");

        viewed_projet3.setText("viewed_projet3");

        javax.swing.GroupLayout Most_viewed_panLayout = new javax.swing.GroupLayout(Most_viewed_pan);
        Most_viewed_pan.setLayout(Most_viewed_panLayout);
        Most_viewed_panLayout.setHorizontalGroup(
            Most_viewed_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Most_viewed_panLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(Most_viewed_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewed_projet1)
                    .addComponent(viewed_projet2)
                    .addComponent(viewed_projet3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(Most_viewed_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewed_labproject1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewed_labproject2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewed_labproject3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        Most_viewed_panLayout.setVerticalGroup(
            Most_viewed_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Most_viewed_panLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Most_viewed_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewed_labproject1)
                    .addComponent(viewed_projet1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Most_viewed_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewed_labproject2)
                    .addComponent(viewed_projet2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Most_viewed_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewed_labproject3)
                    .addComponent(viewed_projet3))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(Most_viewed_pan);

        Most_viewed.setText("Most viewed");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Most_viewed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(Most_liked, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Most_liked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Most_viewed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel2);

        javax.swing.GroupLayout pan_feedLayout = new javax.swing.GroupLayout(pan_feed);
        pan_feed.setLayout(pan_feedLayout);
        pan_feedLayout.setHorizontalGroup(
            pan_feedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );
        pan_feedLayout.setVerticalGroup(
            pan_feedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_feedLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        JTabbedPane.addTab("Feed", pan_feed);

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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
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
                "Title", "Tag", "Date", "Views", "Score", "Contributions"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pan_exploreLayout = new javax.swing.GroupLayout(pan_explore);
        pan_explore.setLayout(pan_exploreLayout);
        pan_exploreLayout.setHorizontalGroup(
            pan_exploreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_exploreLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        pan_exploreLayout.setVerticalGroup(
            pan_exploreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_exploreLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JTabbedPane.addTab("Explore", pan_explore);

        getContentPane().add(JTabbedPane);
        JTabbedPane.setBounds(10, 108, 400, 270);

        Rechercher_Text.setText("search");
        Rechercher_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rechercher_TextActionPerformed(evt);
            }
        });
        getContentPane().add(Rechercher_Text);
        Rechercher_Text.setBounds(510, 30, 62, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(430, 180, 150, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/logoPi.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 19, 51, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/Smalluser.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfilUtilisateur(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 10, 50, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/SearchIcon.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 30, 14, 15);

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
        Lb_Add_Project.setBounds(460, 100, 80, 60);

        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 60, 82, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/statisticIcon.png"))); // NOI18N
        jLabel5.setText("statistics");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 250, 110, 50);

        Tag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/tag_icon.png"))); // NOI18N
        Tag.setText("Tag");
        Tag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TagMouseClicked(evt);
            }
        });
        getContentPane().add(Tag);
        Tag.setBounds(440, 310, 100, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/ForumIcon.png"))); // NOI18N
        jLabel6.setText("Forum");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 190, 90, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/fond.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -10, 600, 400);

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

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseClicked

    private void Rechercher_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rechercher_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rechercher_TextActionPerformed

    private void SeeAllProjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeeAllProjectsActionPerformed
        
    }//GEN-LAST:event_SeeAllProjectsActionPerformed

    private void ProfilUtilisateur(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfilUtilisateur
        new ProfilUtilisateur(currentClient).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ProfilUtilisateur

    private void Lb_Add_ProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lb_Add_ProjectMouseClicked
        // TODO add your handling code here:
        GestionProjectUserUpdate appelFenetre = new GestionProjectUserUpdate();
        appelFenetre.setVisible(true);
    }//GEN-LAST:event_Lb_Add_ProjectMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Authentification().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TagMouseClicked
        // TODO add your handling code here:
        new GestionTagClient().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_TagMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new Statistic().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void project1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_project1MouseClicked
        // TODO add your handling code here:
        new ProjectHome().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_project1MouseClicked

    private void labproject1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labproject1MouseClicked
        // TODO add your handling code here:
        new ProjectHome(7,currentClient).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_labproject1MouseClicked

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
            java.util.logging.Logger.getLogger(GestionHomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionHomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionHomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionHomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                               
                new GestionHomeUser().setVisible(true);
                
                
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
    private javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.JLabel Lb_Add_Project;
    private javax.swing.JLabel Lb_Notification;
    private javax.swing.JMenuBar MenuBar1;
    private javax.swing.JTextField Most_liked;
    private javax.swing.JPanel Most_liked_pan;
    private javax.swing.JTextField Most_viewed;
    private javax.swing.JPanel Most_viewed_pan;
    private javax.swing.JPanel New_project_pan1;
    private javax.swing.JTextField New_projects;
    private javax.swing.JTextField Rechercher_Text;
    private javax.swing.JButton SeeAllProjects;
    private javax.swing.JLabel Tag;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labproject1;
    private javax.swing.JLabel labproject2;
    private javax.swing.JLabel labproject3;
    private javax.swing.JLabel labproject4;
    private javax.swing.JLabel liked_labproject1;
    private javax.swing.JLabel liked_labproject2;
    private javax.swing.JLabel liked_labproject3;
    private javax.swing.JLabel liked_project1;
    private javax.swing.JLabel liked_project2;
    private javax.swing.JLabel liked_project3;
    private javax.swing.JPanel pan_explore;
    private javax.swing.JPanel pan_feed;
    private javax.swing.JPanel pan_home;
    private javax.swing.JLabel project1;
    private javax.swing.JLabel project2;
    private javax.swing.JLabel project3;
    private javax.swing.JLabel project4;
    private javax.swing.JLabel viewed_labproject1;
    private javax.swing.JLabel viewed_labproject2;
    private javax.swing.JLabel viewed_labproject3;
    private javax.swing.JLabel viewed_projet1;
    private javax.swing.JLabel viewed_projet2;
    private javax.swing.JLabel viewed_projet3;
    // End of variables declaration//GEN-END:variables
}
