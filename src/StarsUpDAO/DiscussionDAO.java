/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpDAO;

import StarsUpConnexion.DataSource;
import StarsUpIDAO.IDiscussionDAO;
import entities.Discussion;
import entities.Discussion;
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
public class DiscussionDAO implements IDiscussionDAO{

   
        private Connection connection;
       
  private DiscussionDAO() {
    
       connection = DataSource.getInstance().getConnection();
    
        }
       
     private static DiscussionDAO instance;
     public static DiscussionDAO getInstance()
    {
        if(instance ==null)
        instance=new DiscussionDAO();
     
     return instance;
    }
        
    

    @Override
    public List<Discussion> DisplayAllDiscussion() {
        List<Discussion> ListeDiscussion = new ArrayList<>();

        String requete = "select sujet,contenu,date_discussion from discussion";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Discussion discussion = new Discussion();
                
                discussion.setSujet(resultat.getString(1));
                discussion.setContenu(resultat.getString(2));
                discussion.setDate_discussion(resultat.getString(3));  
                ListeDiscussion.add(discussion);
            }
            return ListeDiscussion;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Categories " + ex.getMessage());
            return null;
        }             
    }

    @Override
    public void insertDiscussion(Discussion discussion) {
       String requete = "insert into forum ( sujet,contenu,date_discussion) values (?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, discussion.getSujet());
             ps.setString(2, discussion.getContenu());
             ps.setString(3, discussion.getContenu());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Discussion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateDiscussion(Discussion discussion) {
        String requete = "update forum set sujet=?,contenu=? ,date_discussion where Id=?";
        try {
          PreparedStatement ps = connection.prepareStatement(requete);
          ResultSet resultat = ps.executeQuery();
            ps.setString(1,discussion.getSujet());
            ps.setString(2,discussion.getContenu());
             ps.setString(3,discussion.getDate_discussion());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
    }
    }

    @Override
    public void deleteDiscussion(int Id) {
       String requete = "delete from discussion where sujet =?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, Id);
            ps.executeUpdate();
            System.out.println("Discussion deleted");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    
    }

    @Override
    public Discussion FindById(int Id) {
        
        Discussion discussion = new Discussion();
       String requete = "select sujet,contenu,date_discussion from discussion where Id=?";

        try {
            PreparedStatement ps = connection.prepareStatement(requete);
             ps.setInt(1, Id);
            ResultSet resultat = ps.executeQuery();
////            CategorieDao categorieDAO = new CategorieDao();
          while (resultat.next()) {
                discussion.setSujet(resultat.getString(1));
                discussion.setContenu(resultat.getString(2));
                discussion.setDate_discussion(resultat.getString(3));
            }
            return discussion;
        } 
        catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return discussion;
        }
    }

    @Override
    public Discussion FindBySubject(String Subject) {
       Discussion discussion = new Discussion();
       String requete = "select sujet,contenu,date_discussion from discussion where sujet = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            ps.setString(1, Subject);

            
            while (resultat.next()) {

                discussion.setSujet(resultat.getString(1));
                discussion.setContenu(resultat.getString(2));
                discussion.setDate_discussion(resultat.getString(3));
            }
            return discussion;
        }
        
        catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return discussion;
        }
    }
    }
    
   
