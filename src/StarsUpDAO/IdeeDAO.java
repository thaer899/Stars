/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpDAO;
import entities.Idee;
import StarsUpConnexion.DataSource;
import StarsUpIDAO.IIdeeDAO;
import entities.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
/**
 *
 * @author Thaer
 */
public class IdeeDAO implements IIdeeDAO{
    private static IdeeDAO instance;
    private Connection connection;
    private Idee idee;
    private Client client;
    private String id;

    public IdeeDAO() {
        connection = DataSource.getInstance().getConnection();
    }
    
     public static IdeeDAO getInstance() {
        if (instance == null) {
            instance = new IdeeDAO();
        }
        return instance;
    }
     
    
    /**
     *
     * @return
     */
     @Override
        public List<Idee> readAll()
    {   
         String requete = "select * from idee";
         try {
              
             PreparedStatement ps = connection.prepareStatement(requete);
             
            ResultSet rs = ps.executeQuery(requete);
            List<Idee> idees = new ArrayList<>();
            while(rs.next()){
                Idee idea =new Idee();
            
            idea.setId(rs.getInt(1));  
            idea.setTitre(rs.getString(2));
            idea.setDescription(rs.getString(3));
            idea.setCategorie(rs.getString(4));
            idea.setDateDebut(rs.getDate(5));
            idea.setDateLimite(rs.getDate(6));
            idea.setBudgetRequis(rs.getInt(7));
                  
               idees.add(idea);
            }
            return idees;
        } catch (SQLException ex) {
            Logger.getLogger(IdeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    
    }
     
     
    @Override
             public List<Idee> readById(int id)
    {   
         String requete = "select * from idee where client_id = '"+id+"'";
         try {
          PreparedStatement ps = connection.prepareStatement(requete);

        
            ResultSet rs = ps.executeQuery(requete);
            List<Idee> idees = new ArrayList<>();
            while(rs.next()){
                Idee idea =new Idee();
            
            idea.setId(rs.getInt(1));  
            idea.setTitre(rs.getString(2));
            idea.setDescription(rs.getString(3));
            idea.setCategorie(rs.getString(4));
            idea.setDateDebut(rs.getDate(5));
            idea.setDateLimite(rs.getDate(6));
            idea.setBudgetRequis(rs.getInt(7));
                  
               idees.add(idea);
            }
            return idees;
        } catch (SQLException ex) {
            Logger.getLogger(IdeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    
    }
     
     
     

        public Idee getById(int id)
    {   
         String requete = "select * from idee where id = '"+id+"'";
         try {
            PreparedStatement ps = connection.prepareStatement(requete);

           
            ResultSet rs = ps.executeQuery(requete);
            rs.next();
            Idee idea =new Idee();
            
            idea.setId(rs.getInt(1));  
            idea.setTitre(rs.getString(2));
            idea.setDescription(rs.getString(3));
            idea.setCategorie(rs.getString(4));
            idea.setDateDebut(rs.getDate(5));
            idea.setDateLimite(rs.getDate(6));
            idea.setBudgetRequis(rs.getInt(7));
                  
            
 
            return idea;
        } catch (SQLException ex) {
            Logger.getLogger(IdeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    
    }

    
        public Idee getByTitre(String titre)
    {   
         String requete = "select * from idee where titre = '"+titre+"'";
         try {
         PreparedStatement ps = connection.prepareStatement(requete);

           
            ResultSet rs = ps.executeQuery(requete);
            rs.next();
            Idee idea =new Idee();
            
            idea.setId(rs.getInt(1));  
            idea.setTitre(rs.getString(2));
            idea.setDescription(rs.getString(3));
            idea.setCategorie(rs.getString(4));
            idea.setDateDebut(rs.getDate(5));
            idea.setDateLimite(rs.getDate(6));
            idea.setBudgetRequis(rs.getInt(7));
                  
            
 
            return idea;
        } catch (SQLException ex) {
            Logger.getLogger(IdeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    
    }

    
    @Override
    public boolean createIdee(Idee idee,int client_id) {
        String requete = "insert into idee(titre,description,categorie,date_debut,date_limite,budget_requis,client_id) values(?,?,?,?,?,?,?)";
        
        try {
        PreparedStatement preparIdee=connection.prepareStatement(requete);
        
        //preparIdee.setInt(1, idee.getId());
        preparIdee.setString(1, idee.getTitre());
        preparIdee.setString(2, idee.getDescription());
        preparIdee.setString(3, idee.getCategorie());
        preparIdee.setDate(4, idee.getDateDebut());
        preparIdee.setDate(5, idee.getDateLimite());
        preparIdee.setInt(6, idee.getBudgetRequis());
        preparIdee.setInt(7, client_id);
        preparIdee.executeUpdate();
//        JOptionPane.showMessageDialog(null, "saved");

    } catch (SQLException ex) {
        Logger.getLogger(IdeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        return true;
}
    
        public boolean updateIdee(Idee idee,int id,int client_id) {
        String requete = "update idee set titre = '"+idee.getTitre()+"',description = '"+idee.getDescription()+"',categorie = '"+idee.getCategorie()+"',date_debut = '"+idee.getDateDebut()+"',date_limite = '"+idee.getDateLimite()+"',budget_requis = '"+idee.getBudgetRequis()+"',client_id = '"+idee.getClient().getId()+"' where Id = '"+id+"';";
        
        try {
        PreparedStatement preparIdee=connection.prepareStatement(requete);
        
        //preparIdee.setInt(1, idee.getId());
        preparIdee.setString(1, idee.getTitre());
        preparIdee.setString(2, idee.getDescription());
        preparIdee.setString(3, idee.getCategorie());
        preparIdee.setDate(4, idee.getDateDebut());
        preparIdee.setDate(5, idee.getDateLimite());
        preparIdee.setInt(6, idee.getBudgetRequis());
        preparIdee.setInt(7, client_id);
        preparIdee.executeUpdate();
            
//        JOptionPane.showMessageDialog(null, "saved");

    } catch (SQLException ex) {
        Logger.getLogger(IdeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        return true;
}
     
    @Override
     public boolean deleteIdee(int id) {
            String requete = "delete from idee where Id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
          return false;
            
        }  
        return true;
}
}
   

     
    
//    @Override
//    public Idee searchById(int Id) {
//        Idee idee = new Idee();
//        String requete = "select * from idee where Id=?";
//        try {
//            PreparedStatement ps = connection.prepareStatement(requete);
//            ps.setInt(1, Id);
//            ResultSet resultat = ps.executeQuery();
//            while (resultat.next()) {
//                idee.setId(resultat.getInt(1));
//                idee.setTitre(resultat.getString(2));
//                idee.setDescription(resultat.getString(3));
//                idee.setNbrContributions(resultat.getInt(4));
//                idee.setDateDebut(resultat.getString(5));
//                idee.setAvatar(resultat.getByte(6));
//                idee.setDateLimite(resultat.getString(7));
//                idee.setBudgetRequis(resultat.getInt(8));
//                idee.getClient().setId(resultat.getInt(9));
//            }
//            return idee;
//
//        } catch (SQLException ex) {
//            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("erreur lors de la recherche de l'idee " + ex.getMessage());
//            return null;
//        }
//        
//    }
//    
//         public Idee searchByTitre(String titre) {
//        Idee idee = new Idee();
//        String requete = "select * from idee where titre=?";
//        try {
//            PreparedStatement ps = connection.prepareStatement(requete);
//            ps.setString(1, titre);
//            ResultSet resultat = ps.executeQuery();
//            while (resultat.next()) {
//                idee.setId(resultat.getInt(1));
//                idee.setTitre(resultat.getString(2));
//                idee.setDescription(resultat.getString(3));
//                idee.setNbrContributions(resultat.getInt(4));
//                idee.setDateDebut(resultat.getString(5));
//                idee.setAvatar(resultat.getByte(6));
//                idee.setDateLimite(resultat.getString(7));
//                idee.setBudgetRequis(resultat.getInt(8));
//                idee.getClient().setId(resultat.getInt(9));
//            }
//            return idee;
//
//        } catch (SQLException ex) {
//            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("erreur lors de la recherche de l'idee " + ex.getMessage());
//            return null;
//        }
        
//    }
    

