/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpDAO;

import StarsUpConnexion.DataSource;
import StarsUpIDAO.IauthentificationDAO;
import entities.Administrateur;
import entities.Client;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import StarsUpInterface.Authentification;

/**
 *
 * @author attia
 */
public class AuthentificationDAO implements IauthentificationDAO{
    public static AuthentificationDAO instance;
   Connection conn =null;
    ResultSet rs =null;
    PreparedStatement pst=null;
    public AuthentificationDAO() {
    
        conn= DataSource.getInstance().getConnection();
    
}
    
  // public static IauthentificationDAO iauthentificationdao;
  //  public static IauthentificationDAO getInstance()
  //  {
   //    if(iauthentificationdao ==null){
   //     iauthentificationdao=new AuthentificationDAO();
   // }
   // return instance;
   // }
    
     
    
    
    public Client findClient(String login,String password) {
        Client client=null;
        String sql ="select * from client where pseudo=? and mot_de_passe = ?";
            try {
             pst=conn.prepareStatement(sql);
             pst.setString(1,login);
             pst.setString(2,password);
             rs=pst.executeQuery();
             if(rs.next()){
             client=new Client(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6), rs.getString(7),  rs.getString(8),rs.getString(9),  rs.getString(10), rs.getBytes("image"));
            
             
             return client;
             }
             
             
            } catch (Exception e) {  
            }
            return client;
        
        
    }

    @Override
    public boolean findAdministrateur(String login,String password) {
        String sql ="select * from administrateur where pseudo=? and mot_de_passe = ?";
           try{
             pst=conn.prepareStatement(sql);
             pst.setString(1,login);
             pst.setString(2,password);
             rs=pst.executeQuery();
         if(rs.next()){
             return true ;
             
             }
           } catch (Exception e) {  
           } 
           return false;
    }
}
    
    
    


