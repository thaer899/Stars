/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.utilisateurs.Dao;
import ideastarter.util.CreateConnection;
import ideastarter.util.Idao;
import ideastarter.utilisateurs.Client;
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
public class ClientDao implements  Idao<Client, Integer>{
     private static ClientDao instance;
    private Connection connexion;
    private ClientDao() {
    
        connexion= CreateConnection.getInstance();
    
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
    public List<Client> readAll()
    {
        List<Client> clients;
        clients = new ArrayList<>();
            Client cl;
        try {
            
            String sql="select id,nom,prenom,pays,ville,adresse,email,pseudo,type_carte_bancaire,contributeur,createur_idee from client";
            Statement stmt=connexion.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
            cl=new Client();
            
            cl.setId(rs.getInt(1));
            cl.setNom(rs.getString(2));
            cl.setPrenom(rs.getString(3));
            cl.setPays(rs.getString(4));
            cl.setVille(rs.getString(5));
            cl.setAdresse(rs.getString(6));
            cl.setPseudo(rs.getString(7));
            cl.setMotDePasse(rs.getString(8));
            cl.setTypeCarteBancaire(rs.getString(9));
            cl.setContributeur(rs.getBoolean(10));
            cl.setCreateur_idee(rs.getBoolean(11));
            clients.add(cl);
                        }
                
        } catch (SQLException ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
              return clients;    

    
    }
    public boolean create(Client obj) {
    try {
        PreparedStatement preparClient=connexion.prepareStatement("insert into client(id,nom,prenom,pays,ville,adresse,email,pseudo,type_carte_bancaire,contributeur,createur_idee from client) values(?,?,?,?,?,?,?,?,?,?)");
        preparClient.setInt(1, obj.getId());
        preparClient.setString(2, obj.getNom());
        preparClient.setString(3, obj.getPrenom());
        preparClient.setString(4, obj.getPays());
        preparClient.setString(5, obj.getVille());
        preparClient.setString(6, obj.getAdresse());
        preparClient.setString(7, obj.getPseudo());
        preparClient.setString(8, obj.getMotDePasse());
        preparClient.setString(9, obj.getTypeCarteBancaire());
        preparClient.setBoolean(10, obj.isContributeur());
        preparClient.setBoolean(11, obj.isCreateur_idee());
        int var=preparClient.executeUpdate();
        if(var==0)
            return false; 
                    else 
            return true;


    } catch (SQLException ex) {
        Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}

//    @Override
//    public boolean create(Client obj) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public Client readById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Client obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Client obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}