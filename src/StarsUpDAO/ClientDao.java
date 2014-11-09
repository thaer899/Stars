/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpDAO;
import StarsUpIDAO.IClientDAO;
import StarsUpConnexion.DataSource;
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
/**
 *
 * @author Emna
 */
public class ClientDao implements  IClientDAO{
     public static ClientDao instance;
    public Connection connexion;
    public ClientDao() {
    
        connexion= DataSource.getInstance().getConnection();
    
        }
    
     public static ClientDao getInstance()
    {
        if(instance ==null)
        instance=new ClientDao();
     
     return instance;
    }
    
    /**
     *
     * @return
     */
    @Override
    public List<Client> DisplayAllClients()
    {
        List<Client> clients;
        clients = new ArrayList<>();
            Client cl;
        try {
            
            String sql="select id,nom,prenom,mot_de_passe,pays,ville,adresse,email,pseudo,type_carte_bancaire,contributeur,createur_idee from client";
            Statement stmt=connexion.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
            cl=new Client();
            
            cl.setId(rs.getInt(1));
            cl.setNom(rs.getString(2));
            cl.setPrenom(rs.getString(3));
            cl.setMot_de_Passe(rs.getString(4));
            cl.setPays(rs.getString(5));
            cl.setVille(rs.getString(6));
            cl.setAdresse(rs.getString(7));
            cl.setEmail(rs.getString(8));
            cl.setPseudo(rs.getString(9));
            cl.setType_Carte_Bancaire(rs.getString(10));
            cl.setContributeur(rs.getBoolean(11));
            cl.setCreateur_idee(rs.getBoolean(12));
            clients.add(cl);
                        }
                
        } catch (SQLException ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
              return clients;    

    
    }
    public void createClient(Client obj) {
        String requete = "insert into client(nom,prenom,pays,ville,adresse,email,pseudo,type_carte_bancaire,contributeur,createur_idee from client) values(?,?,?,?,?,?,?,?,?,?)";
    try {
        PreparedStatement preparClient=connexion.prepareStatement(requete);
   
        preparClient.setString(1, obj.getNom());
        preparClient.setString(2, obj.getPrenom());
        preparClient.setString(3, obj.getMot_de_Passe());
        preparClient.setString(4, obj.getPays());
        preparClient.setString(5, obj.getVille());
        preparClient.setString(6, obj.getAdresse());
        preparClient.setString(7, obj.getPseudo());
        preparClient.setString(8, obj.getType_Carte_Bancaire());
        preparClient.setBoolean(9, obj.isContributeur());
        preparClient.setBoolean(10, obj.isCreateur_idee());
        preparClient.executeUpdate();
        
    } catch (SQLException ex) {
        Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
    }
   
}
 
    @Override
    public void deleteClient(int Id) {
       String requete = "delete from client where Id=?";
        try {
            PreparedStatement ps = connexion.prepareStatement(requete);
            ps.setInt(1, Id);
            ps.executeUpdate();
            System.out.println("Client supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    @Override
    public Client findClientById(int Id) {
         Client client = new Client();
        String requete = "select * from client where Id=?";
        try {
            PreparedStatement ps = connexion.prepareStatement(requete);
            ps.setInt(1, Id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                client.setId(resultat.getInt(1));
                client.setNom(resultat.getString(2));
            }
            return client;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot " + ex.getMessage());
            return null;
        }
    }

    @Override
    public void updateClient(Client obj) {
        String requete = "update client set nom=?,prenom=?, mot_de_passe=?,pays=?,ville=?,adresse=?,email=?,pseudo=?,type_carte_bancaire=?,contributeur=?,createur_idee=? where Id=?";
    try {
        PreparedStatement preparClient=connexion.prepareStatement(requete);
        preparClient.setString(1, obj.getNom());
        preparClient.setString(2, obj.getPrenom());
        preparClient.setString(3, obj.getMot_de_Passe());
        preparClient.setString(4, obj.getPays());
        preparClient.setString(5, obj.getVille());
        preparClient.setString(6, obj.getAdresse());
        preparClient.setString(7, obj.getPseudo());
        preparClient.setString(8, obj.getType_Carte_Bancaire());
        preparClient.setBoolean(9, obj.isContributeur());
        preparClient.setBoolean(10, obj.isCreateur_idee());
        preparClient.setInt(11, obj.getId());
        preparClient.executeUpdate();
        
    } catch (SQLException ex) {
        Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

   

    
}