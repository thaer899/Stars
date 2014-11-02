/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.services.Dao;
import ideastarter.services.Categorie;
import ideastarter.util.CreateConnection;
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
public class CategorieDao implements Idao<Categorie, Integer>{
    private static CategorieDao instance;
    private Connection connexion;

    
    
    private CategorieDao() {
    
        connexion= CreateConnection.getInstance();
    
        }
    
    public static CategorieDao getInstance()
    {
        if(instance ==null)
        instance=new CategorieDao();
     
     return instance;
    }
    
    /**
     *
     * @return
     */
    @Override
    public List<Categorie> readAll()
    {
        List<Categorie> categories;
        categories = new ArrayList<>();
            Categorie cat;
        try {
            
            String sql="select id,titre from categorie";
            Statement stmt=connexion.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {cat=new Categorie();
             cat.setId(rs.getInt(1));
             cat.setTitre(rs.getString(2));
            categories.add(cat);
                        }
                
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDao.class.getName()).log(Level.SEVERE, null, ex);
        }
              return categories;    

    
    }
    public boolean insert(Categorie obj) {
    try {
        PreparedStatement preparcategories=connexion.prepareStatement("insert into categorie(id,titre) values(?,?)");//requette

       preparcategories.setInt(1, obj.getId());
        preparcategories.setString(2, obj.getTitre());
        int var=preparcategories.executeUpdate();
        if(var==0)
            return false; 
                    else 
            return true;


    } catch (SQLException ex) {
        Logger.getLogger(CategorieDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}

    @Override
    public boolean create(Categorie obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categorie readById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Categorie obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Categorie obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
