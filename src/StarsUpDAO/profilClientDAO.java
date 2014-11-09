/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpDAO;
import StarsUpDAO.ClientDao;
import StarsUpIDAO.IprofilClientDAO;
import entities.Client;
import entities.Idee;
import StarsUpConnexion.DataSource;
import entities.Contribution;
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
 * @author karim
 */
public class profilClientDAO implements IprofilClientDAO {        
    private Connection connection;
     public profilClientDAO() {
        connection = DataSource.getInstance().getConnection();
    }

     @Override
    public List<Idee> RechercherIdeeClient(Client C) {
        
        List<Idee> listeIdees = new ArrayList<>();
        String requete ="select titre,date_debut from idee where client_id ='"+C.getId()+"'";
        try {
              PreparedStatement ps = connection.prepareStatement(requete);
         
           // ps.setInt(1,C.getId() );
             ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {               
            Idee idee = new Idee();
                idee.setTitre(resultat.getString(1));
                idee.setDateDebut(resultat.getDate(2));
                listeIdees.add(idee);
            }
            return listeIdees;
              
        } catch (SQLException ex) {
            Logger.getLogger(profilClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
    @Override
    public List<Contribution> DisplayAlLContributions(Client c) {
      List<Contribution> listeContributions = new ArrayList<>();
      profilClientDAO profilclientdao = new profilClientDAO();
        String requete = "select idee_id , valeur , date_contribution from contribution where client_id='"+c.getId()+"'";
        
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
           // ps.setInt(1 ,c.getId());
            ResultSet resultat = ps.executeQuery(requete);
            while (resultat.next()) {
                Idee idee= profilclientdao.FindIdeeById(resultat.getInt(1));
                
                Contribution contribution = new Contribution();
                
                contribution.setIdee(idee);
                contribution.setValeur(resultat.getInt(2));
                contribution.setDateContribution(resultat.getDate(3));
                listeContributions.add(contribution);
            }
            return listeContributions;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des contributions " + ex.getMessage());
            return null;
        }
    }  
    

    
    public void ModifierInfoClient(int id_client,String login,String password, String Email, String cbancaire) {
       String requete = "update client set pseudo=?, mot_de_passe=?, type_carte_bancaire=? , email=?  where Id='"+id_client+"'";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, login);
            ps.setString(2, password);
            ps.setString(3, cbancaire);
            ps.setString(4,Email);
             //ps.setInt(5,id_client);
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    
    
 private static IprofilClientDAO iprofilclientdao;

    public static IprofilClientDAO getInstance() {
        if (iprofilclientdao == null) {
            iprofilclientdao = new profilClientDAO();
        }
        return iprofilclientdao;
    }

    @Override
    public Client FindById(int id) {
          Client client = new Client();
        String requete = "select * from client where Id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                client.setId(resultat.getInt(1));
            }
            return client;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du client " + ex.getMessage());
            return null;
        }
    }
    
    public Idee FindIdeeById(int id) {
          Idee idee = new Idee();
        String requete = "select titre from idee where Id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                idee.setTitre(resultat.getString(1));
            }
            return idee ;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'id " + ex.getMessage());
            return null;
        }
    }

    
    public int FindByNom(String nom) {

    Client client = new Client();
        String requete = "select Id from Client where nom=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                client.setId(resultat.getInt(1));
            }
            return client.getId();

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du nom " + ex.getMessage());
            return 0;
        }
    }
    
}

    
    
     
     

