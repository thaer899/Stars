/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpDAO;
import StarsUpConnexion.DataSource; 
import StarsUpIDAO.IAdministrateurDAO;
import entities.Administrateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Emna
 */
public class AdministrateurDao implements IAdministrateurDAO{

    private static AdministrateurDao instance;
    private Connection connexion;

    private AdministrateurDao() {
    
        connexion= DataSource.getInstance().getConnection();
    
        }
    
    public static AdministrateurDao getInstance()
    {
        if(instance ==null)
        instance=new AdministrateurDao();
     
     return instance;
    }
    
    /**
     *
     * @return
     */
    @Override
    public List<Administrateur> DisplayAllAdministrateur()
    {
        List<Administrateur> administrateurs;
        administrateurs = new ArrayList<>();
            Administrateur ad;
        try {
            
            String sql="select *from administrateur";
            Statement stmt=connexion.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {ad=new Administrateur();
            ad.setId(rs.getInt(1));
            ad.setName(rs.getString(2));
            ad.setLast_Name(rs.getString(3));
            ad.setLogin(rs.getString(4));
            ad.setPassword(rs.getString(5));
            ad.setEmail(rs.getString(6));
            
            
            administrateurs.add(ad);
                        }
                
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
              return administrateurs;    

    
    }
    
    @Override
    public void createAdministrateur(Administrateur obj) {
    try {
        PreparedStatement preparAdmin=connexion.prepareStatement("insert into administrateur(nom,prenom,pseudo,mot_de_passe,email) values(?,?,?,?,?)");
        
        preparAdmin.setString(1, obj.getName());
        preparAdmin.setString(2, obj.getLast_Name());
        preparAdmin.setString(3, obj.getLogin());
        preparAdmin.setString(4, obj.getPassword());
        preparAdmin.setString(5, obj.getEmail());
        preparAdmin.executeUpdate();
        
    } catch (SQLException ex) {
        Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}



    @Override
    public void updateAdministratur(Administrateur obj) {
        try {
        PreparedStatement preparAdmin=connexion.prepareStatement("update administrateur set nom=?,prenom=?,pseudo=?,mot_de_passe=?,email=? where Id=?");
        
        preparAdmin.setString(1, obj.getName());
        preparAdmin.setString(2, obj.getLast_Name());
        preparAdmin.setString(3, obj.getLogin());
        preparAdmin.setString(4, obj.getPassword());
        preparAdmin.setString(5, obj.getEmail());
        preparAdmin.setInt(6, obj.getId());
        preparAdmin.executeUpdate();
        


    } catch (SQLException ex) {
        Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    }

    @Override
    public void deleteAdministrateur(int Id) {
          
        String requete = "delete from administrateur where Id=?";
        try {
            PreparedStatement ps = connexion.prepareStatement(requete);
            ps.setInt(1, Id);
            ps.executeUpdate();
            System.out.println("Administrateur supprimé");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }
    
}
    

    
    


 

