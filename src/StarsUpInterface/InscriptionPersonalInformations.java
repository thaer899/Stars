/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpInterface;

import StarsUpConnexion.DataSource;
import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author Administrateur
 */
public class InscriptionPersonalInformations extends javax.swing.JFrame {
    boolean test,test2,test3,test4,test5,test6,test7;
    boolean x;
    boolean y;
     private Connection conn ;
     
   
    ResultSet rs =null;
    PreparedStatement pst=null;
    

    /**
     * Creates new form InscriptionPersonalInformations
     */
    public InscriptionPersonalInformations() {
        
        
        initComponents();
        conn= DataSource.getInstance().getConnection();
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_LastN = new javax.swing.JTextField();
        txt_N = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_adress = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboBox_card = new javax.swing.JComboBox();
        jRadioButton_contributeur = new javax.swing.JRadioButton();
        jRadioButton_createur = new javax.swing.JRadioButton();
        txt_city = new javax.swing.JTextField();
        txt_pw = new javax.swing.JPasswordField();
        jComboBox_country = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        attch_image = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txt_pseudo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(517, 442));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Last Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 80, 78, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 370, 90, 23);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 80, 78, 20);

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("E-mail");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 140, 78, 20);

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Country");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 130, 78, 20);

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("City");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 190, 78, 20);

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Adress");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 190, 78, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 204));
        jLabel12.setText("Home     |      Registration   ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(240, 0, 170, 32);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StarsUpInterface/icone_validation.png"))); // NOI18N
        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(250, 80, 20, 20);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StarsUpInterface/icon_warningbox.png"))); // NOI18N
        jLabel18.setText("jLabel18");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(250, 80, 20, 20);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StarsUpInterface/icone_validation.png"))); // NOI18N
        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(250, 140, 20, 20);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StarsUpInterface/icone_validation.png"))); // NOI18N
        jLabel22.setText("jLabel19");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(250, 200, 20, 20);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StarsUpInterface/icon_warningbox.png"))); // NOI18N
        jLabel21.setText("jLabel21");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(250, 140, 20, 20);

        txt_LastN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LastNActionPerformed(evt);
            }
        });
        txt_LastN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_LastNFocusLost(evt);
            }
        });
        getContentPane().add(txt_LastN);
        txt_LastN.setBounds(100, 70, 173, 30);

        txt_N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NActionPerformed(evt);
            }
        });
        txt_N.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NFocusLost(evt);
            }
        });
        getContentPane().add(txt_N);
        txt_N.setBounds(400, 70, 173, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Account Type");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 310, 90, 20);

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_emailFocusLost(evt);
            }
        });
        getContentPane().add(txt_email);
        txt_email.setBounds(100, 130, 173, 30);

        txt_adress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_adressActionPerformed(evt);
            }
        });
        txt_adress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_adressFocusLost(evt);
            }
        });
        getContentPane().add(txt_adress);
        txt_adress.setBounds(400, 180, 173, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Card Type");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 360, 70, 20);

        jComboBox_card.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Master Card", "Visa", "Universal", "Other" }));
        getContentPane().add(jComboBox_card);
        jComboBox_card.setBounds(130, 360, 140, 30);

        jRadioButton_contributeur.setText("Funder");
        jRadioButton_contributeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_contributeurActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton_contributeur);
        jRadioButton_contributeur.setBounds(410, 310, 120, 23);

        jRadioButton_createur.setText("Idea Inventor");
        jRadioButton_createur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_createurActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton_createur);
        jRadioButton_createur.setBounds(130, 310, 140, 23);

        txt_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cityActionPerformed(evt);
            }
        });
        txt_city.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cityFocusLost(evt);
            }
        });
        getContentPane().add(txt_city);
        txt_city.setBounds(100, 190, 170, 30);

        txt_pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwActionPerformed(evt);
            }
        });
        txt_pw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_pwFocusLost(evt);
            }
        });
        getContentPane().add(txt_pw);
        txt_pw.setBounds(400, 240, 170, 30);

        jComboBox_country.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afghanistan", "Afrique du Sud", "Albanie", "Algérie", "Allemagne", "Andorre", "Angola", "Antigua et Barbuda", "Arabie saoudite", "Argentine", "Arménie", "Australie", "Autriche", "Azerbaïdjan", "Bahamas", "Bahrein", "Bangladesh", "Barbade", "Belgique", "Bélize", "Benin", "Bhoutan", "Biélorussie", "Bolivie", "Bosnie-Herzégovine", "Botswana", "Brésil", "Brunei", "Bulgarie", "Burkina Faso", "Burundi", "Cambodge", "Cameroun", "Canada", "Cap Vert", "Centrafrique", "Chili", "Chine", "Chypre", "Colombie", "Comores", "Congo démocratique", "Congo", "Corée du Nord", "Corée du Sud", "Costa Rica", "Côte d'Ivoire", "Croatie", "Cuba", "Danemark", "Djibouti", "Dominique", "RépubliqueDominicaine", "Egypte", "Emirats Arabes Unis", "Equateur", "Erythrée", "Espagne", "Estonie", "Etats-Unis", "Ethiopie", "Fidji", "Finlande", "France", "Gabon", "Gambie", "Géorgie", "Ghana", "Grèce", "Grenade", "Groenland", "Guatémala", "Guinée", "Guinée Bissau", "Guinée équatoriale", "Guyana", "Haïti", "Honduras", "Hong Kong", "Hongrie", "Inde", "Indonésie", "Irak", "Iran", "Irlande", "Islande", "Israël", "Italie", "Jamaïque", "Japon", "Jordanie", "Kazakhstan", "Kenya", "Kirghizstan", "Kiribati", "Koweït", "Laos", "Lesotho", "Lettonie", "Liban", "Liberia", "Libye", "Liechtenstein", "Lituanie", "Luxembourg", "Macédoine", "Madagascar", "Malaisie", "Malawi", "Maldives", "Mali", "Malte", "Maroc", "Marshall", "Maurice", "Mauritanie", "Mexique", "Micronésie", "Moldavie", "Monaco", "Mongolie", "Mozambique", "Myanmar", "Namibie", "Népal", "Nicaragua", "Niger", "Nigeria", "Norvège", "Nouvelle Zélande", "Oman", "Ouganda", "Ouzbekistan", "Pakistan", "Palau", "Palestine", "Panama", "Papouasie - Nouvelle Guinée", "Paraguay", "Pays-Bas", "Pérou", "Philippines", "Pologne", "Porto Rico", "Portugal", "Qatar", "Roumanie", "Royaume-Uni", "Russie", "Rwanda", "Saint Christophe et Nevis", "Saint Vincent et les Grenadines", "Sainte Lucie", "Salomon", "Salvador", "Samoa", "São Tomé et Príncipe", "Sénégal", "Seychelles", "Sierra Leone", "Singapour", "Slovaquie", "Slovénie", "Somalie", "Somaliland", "Soudan", "Sri Lanka", "Suède", "Suisse", "Surinam", "Syrie", "Swaziland", "Tadjikistan", "Taïwan", "Tanzanie", "Tchad", "Tchéquie", "Thaïlande", "Tibet", "Timor Oriental", "Togo", "Tonga", "Trinité et Tobago", "Tunisie", "Turkmenistan", "Turquie", "Tuvalu", "Ukraine", "Uruguay", "Vanuatu", "Vatican", "Vénézuéla", "Vietnam", "Yémen", "Yougoslavie", "Zambie", "Zimbabwe", " " }));
        jComboBox_country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_countryActionPerformed(evt);
            }
        });
        jComboBox_country.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox_countryFocusLost(evt);
            }
        });
        getContentPane().add(jComboBox_country);
        jComboBox_country.setBounds(400, 130, 170, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Pseudo ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 250, 70, 20);

        attch_image.setText("Add picture");
        attch_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attch_imageActionPerformed(evt);
            }
        });
        getContentPane().add(attch_image);
        attch_image.setBounds(390, 370, 90, 23);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Password");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(320, 250, 60, 20);

        txt_pseudo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_pseudoFocusLost(evt);
            }
        });
        getContentPane().add(txt_pseudo);
        txt_pseudo.setBounds(100, 250, 170, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/fond.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 610, 400);

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Adress");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(100, 250, 78, 20);

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Adress");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(100, 250, 78, 20);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 284, 60, 30);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 294, 50, 20);

        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(100, 300, 40, 14);

        jRadioButton1.setText("jRadioButton1");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(310, 350, 93, 23);

        jLabel23.setText("jLabel23");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(250, 194, 20, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if (test==false||test2==false||test3==false||test4==false||test5==false||test6==false||test7==false)
{JOptionPane.showMessageDialog(null, "Champs vides ou  incorrects");}
else
{ try {
            String sql ="Insert into Client (nom,prenom,mot_de_passe,pays,ville,adresse,email,pseudo,type_carte_bancaire,contributeur,createur_idee,image)values(?,?,?,?,?,?,?,?,?,?,?,?)";
             pst=conn.prepareStatement(sql);
             pst.setString(1,txt_LastN.getText());
             pst.setString(2,txt_N.getText());
             pst.setString(3,txt_pw.getText());
             pst.setString(4, (String) jComboBox_country.getSelectedItem());
             pst.setString(5,txt_city.getText());
             pst.setString(6,txt_adress.getText());
             pst.setString(7,txt_email.getText());
             pst.setString(8,txt_pseudo.getText());
             pst.setString(9, (String) jComboBox_card.getSelectedItem());
             pst.setBoolean(10,(boolean) x);
             pst.setBoolean(11,(boolean) y);
             pst.setBytes(12,person_image );
             
            
          
             pst.execute();
          
              
        } catch (SQLException ex) {
           // Logger.getLogger(ImporterImage.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
              
        Authentification gh = new Authentification();
        gh.setVisible(true);
        this.setVisible(false);
        
}  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_LastNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LastNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LastNActionPerformed

    private void txt_NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_adressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_adressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_adressActionPerformed

    private void txt_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cityActionPerformed

    private void jComboBox_countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_countryActionPerformed

    private void txt_pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwActionPerformed

    private void jRadioButton_contributeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_contributeurActionPerformed
         x = true;
    }//GEN-LAST:event_jRadioButton_contributeurActionPerformed

    private void jRadioButton_createurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_createurActionPerformed
        y= true;// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_createurActionPerformed

    private void attch_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attch_imageActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
        String filename =f.getAbsolutePath();
       // txt_attach.setText(filename);
        try {
            File image =new File(filename);
            FileInputStream fis =new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf =new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!= -1;){
                bos.write(buf, 0, readNum);
            }
             person_image=bos.toByteArray();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        }
          
    
    }//GEN-LAST:event_attch_imageActionPerformed

    private void txt_pseudoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pseudoFocusLost
        JTextField source = (JTextField) evt.getSource();
				String textFieldContent = source.getText();
				test4 = true;
                                Color bgColor = Color.WHITE;
                                if(source.getText().equals(""))
                                {
                                test4=false;
                                bgColor = Color.RED;
                                }
                                else
                                {

				try {
                                    
					Float.parseFloat(source.getText().charAt(0)+"");
					test4 = false;
                                        bgColor = Color.RED;

				} catch (Exception e) {
                                    // ne fait rien: la couleur de
					// fond sera rouge
				}}
				source.setBackground(bgColor);
        
    }//GEN-LAST:event_txt_pseudoFocusLost

    private void txt_NFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NFocusLost
       JTextField source = (JTextField) evt.getSource();
				String textFieldContent = source.getText();
				test5 = true;
                                Color bgColor = Color.WHITE;
                                if(source.getText().equals(""))
                                {
                                test5=false;
                                bgColor = Color.RED;
                                }
                                else
                                {

				try {
                                    
					Float.parseFloat(source.getText().charAt(0)+"");
					test5 = false;
                                        bgColor = Color.RED;

				} catch (Exception e) {
                                    // ne fait rien: la couleur de
					// fond sera rouge
				}}
				source.setBackground(bgColor);
        
    }//GEN-LAST:event_txt_NFocusLost

    private void jComboBox_countryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox_countryFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_countryFocusLost

    private void txt_adressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_adressFocusLost
        JTextField source = (JTextField) evt.getSource();
				String textFieldContent = source.getText();
				test6 = true;
                                Color bgColor = Color.WHITE;
                                if(source.getText().equals(""))
                                {
                                test6=false;
                                bgColor = Color.RED;
                                }
                                else
                                {

				try {
                                    
					Float.parseFloat(source.getText().charAt(0)+"");
					test6 = false;
                                        bgColor = Color.RED;

				} catch (Exception e) {
                                    // ne fait rien: la couleur de
					// fond sera rouge
				}}
				source.setBackground(bgColor);
        
    }//GEN-LAST:event_txt_adressFocusLost

    private void txt_pwFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pwFocusLost
        JTextField source = (JTextField) evt.getSource();
				String textFieldContent = source.getText();
				test7 = true;
                                Color bgColor = Color.WHITE;
                                if(source.getText().equals(""))
                                {
                                test7=false;
                                bgColor = Color.RED;
                                }
                                else
                                {

				try {
                                    
					Float.parseFloat(source.getText().charAt(0)+"");
					test7 = false;
                                        bgColor = Color.RED;

				} catch (Exception e) {
                                    // ne fait rien: la couleur de
					// fond sera rouge
				}}
				source.setBackground(bgColor);
        
    }//GEN-LAST:event_txt_pwFocusLost

    private void txt_LastNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_LastNFocusLost
        JTextField source = (JTextField) evt.getSource();
				String textFieldContent = source.getText();
				test = true;
                                Color bgColor = Color.WHITE;
                                if(source.getText().equals(""))
                                {
                                test=false;
                                jLabel21.setVisible(true);
                                }
                                else if (!(source.getText().equals(""))){ 
                                    test=false;
                                jLabel20.setVisible(true);}
                                {

				try {
                                    
					Float.parseFloat(source.getText().charAt(0)+"");
					test = false;
                                        jLabel21.setVisible(true);

				} 
                                catch (Exception e) {
                                    // ne fait rien: la couleur de
					// fond sera rouge
				}}

        
    }//GEN-LAST:event_txt_LastNFocusLost

    private void txt_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusLost
      JTextField source = (JTextField) evt.getSource();
				String textFieldContent = source.getText();
				test = true;
                                Color bgColor = Color.WHITE;
                                if(source.getText().equals(""))
                                {
                                test=false;
                                jLabel18.setVisible(true);
                                }
                                else if (!(source.getText().equals(""))){ 
                                    test=false;
                                jLabel19.setVisible(true);}
                                {

				try {
                                    
					Float.parseFloat(source.getText().charAt(0)+"");
					test = false;
                                        jLabel18.setVisible(true);

				} 
                                catch (Exception e) {
                                    // ne fait rien: la couleur de
					// fond sera rouge
				}}
        
    }//GEN-LAST:event_txt_emailFocusLost

    private void txt_cityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cityFocusLost
        JTextField source = (JTextField) evt.getSource();
				String textFieldContent = source.getText();
				test3 = true;
                                Color bgColor = Color.WHITE;
                                if(source.getText().equals(""))
                                {
                                test3=false;
                                bgColor = Color.RED;
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
        
    }//GEN-LAST:event_txt_cityFocusLost

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
            java.util.logging.Logger.getLogger(InscriptionPersonalInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscriptionPersonalInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscriptionPersonalInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscriptionPersonalInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscriptionPersonalInformations().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attch_image;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox_card;
    private javax.swing.JComboBox jComboBox_country;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton_contributeur;
    private javax.swing.JRadioButton jRadioButton_createur;
    private javax.swing.JTextField txt_LastN;
    private javax.swing.JTextField txt_N;
    private javax.swing.JTextField txt_adress;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_pseudo;
    private javax.swing.JPasswordField txt_pw;
    // End of variables declaration//GEN-END:variables
  byte[] person_image=null;
}