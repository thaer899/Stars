/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.administrateur.dao;
import ideastarter.util.CreateConnection; 
import ideastarter.administrateur.Administrateur;
import ideastarter.util.Idao;
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
public class AdministrateurDao implements Idao <Administrateur, Integer>{

    private static AdministrateurDao instance;
    private Connection connexion;

    private AdministrateurDao() {
    
        connexion= CreateConnection.getInstance();
    
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
    public List<Administrateur> readAll()
    {
        List<Administrateur> administrateurs;
        administrateurs = new ArrayList<>();
            Administrateur ad;
        try {
            
            String sql="select id,nom,prenom,pseudo,mot_de_passe,email from administrateur";
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
    public boolean create(Administrateur obj) {
    try {
        PreparedStatement preparAdmin=connexion.prepareStatement("insert into admin(login,Mot_de_passe) values(?,?)");

        preparAdmin.setString(1, obj.getName());
        preparAdmin.setString(2, obj.getLast_Name());
        preparAdmin.setString(3, obj.getLogin());
        preparAdmin.setString(4, obj.getPassword());
        preparAdmin.setString(5, obj.getEmail());
        int var=preparAdmin.executeUpdate();
        if(var==0)
            return false; 
                    else 
            return true;


    } catch (SQLException ex) {
        Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}



    @Override
    public boolean update(Administrateur obj) {
        try {
        PreparedStatement preparAdmin=connexion.prepareStatement("update administrateur set id=?,nom=?,prenom=?,pseudo=?,mot_de_passe=?,email=?");

        preparAdmin.setString(1, obj.getName());
        preparAdmin.setString(2, obj.getLast_Name());
        preparAdmin.setString(3, obj.getLogin());
        preparAdmin.setString(4, obj.getPassword());
        preparAdmin.setString(5, obj.getEmail());
        int var=preparAdmin.executeUpdate();
        if(var==0)
            return false; 
                    else 
            return true;


    } catch (SQLException ex) {
        Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
    }

    @Override
    public boolean delete(Administrateur obj) {
          
        try {
            PreparedStatement preparAdmin= connexion.prepareStatement( "delete from administrateur where id=?");
            preparAdmin.setInt(1, obj.getId());
            int var=preparAdmin.executeUpdate();
            if(var==0)
            return false; 
                    else 
            return true;
            
        } catch (SQLException ex) {
           Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return false;
    }

    {
    
}

    @Override
    public Administrateur readById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
