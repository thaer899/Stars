/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.services.Dao;
import ideastarter.services.Contribution;
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
public class ContributionDao implements Idao<Contribution, Integer>{
    
     private static ContributionDao instance;
    private Connection connexion;

    private ContributionDao() {
    
        connexion= CreateConnection.getInstance();
    
        }
    
    public static ContributionDao getInstance()
    {
        if(instance ==null)
        instance=new ContributionDao();
     
     return instance;
    }
    
    /**
     *
     * @return
     */
    @Override
    public List<Contribution> readAll()
    {
        List<Contribution> contributions;
        contributions = new ArrayList<>();
            Contribution cn;
        try {
            
            String sql="select valeur from contribution";
            Statement stmt=connexion.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {cn=new Contribution();
            cn.setValeur(rs.getInt(1));
          
            contributions.add(cn);
                        }
                
        } catch (SQLException ex) {
            Logger.getLogger(ContributionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
              return contributions;    

    
    }
    public boolean insert(Contribution obj) {
    try {
        PreparedStatement preparContribution=connexion.prepareStatement("insert into contribution(valeur) values(?)");

        preparContribution.setInt(1, obj.getValeur());
        
        int var=preparContribution.executeUpdate();
        if(var==0)
            return false; 
                    else 
            return true;


    } catch (SQLException ex) {
        Logger.getLogger(ContributionDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}

    @Override
    public boolean create(Contribution obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contribution readById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Contribution obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Contribution obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
