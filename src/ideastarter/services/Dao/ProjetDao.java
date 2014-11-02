/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.services.Dao;
import ideastarter.services.Projet;
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
public class ProjetDao implements Idao<Projet, Integer>{
    
     private static ProjetDao instance;
    private Connection connexion;

    private ProjetDao() {
    
        connexion= CreateConnection.getInstance();
    
        }
    
    public static ProjetDao getInstance()
    {
        if(instance ==null)
        instance=new ProjetDao();
     
     return instance;
    }
    
    /**
     *
     * @return
     */
    @Override
    public List<Projet> readAll()
    {
        List<Projet> projets;
        projets = new ArrayList<>();
            Projet prj;
        try {
            
            String sql="select * from projet";
            Statement stmt=connexion.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {prj=new Projet();
            prj.setNom(rs.getString(1));
            prj.setDescription(rs.getString(2));
            prj.setNbrVues(rs.getInt(3));
            prj.setNbrContributions(rs.getInt(4));
            prj.setDateDebut(rs.getString(5));
            prj.setCommentaire(rs.getString(6));
            prj.setBudgetRequis(rs.getInt(7));
           
          
            projets.add(prj);
                        }
                
        } catch (SQLException ex) {
            Logger.getLogger(ProjetDao.class.getName()).log(Level.SEVERE, null, ex);
        }
              return projets;    

    
    }
    public boolean insert(Projet obj) {
    try {
        PreparedStatement preparProjet=connexion.prepareStatement("insert into projet(nom,description,nbrVues,nbrContributions,dateDebut,Commentaire,budgetRequis) values(?,?,?,?,?,?,?)");

        preparProjet.setString(1, obj.getNom());
        preparProjet.setString(2, obj.getDescription());
        preparProjet.setInt(3, obj.getNbrVues());
        preparProjet.setInt(4, obj.getNbrContributions());
        preparProjet.setString(5, obj.getDateDebut());
        preparProjet.setString(6, obj.getCommentaire());
        preparProjet.setInt(7, obj.getBudgetRequis());
        
        int var=preparProjet.executeUpdate();
        if(var==0)
            return false; 
                    else 
            return true;


    } catch (SQLException ex) {
        Logger.getLogger(ProjetDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}

    @Override
    public boolean create(Projet obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Projet readById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Projet obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Projet obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
