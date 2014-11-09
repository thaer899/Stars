/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpDAO;
import entities.Notification;
import StarsUpIDAO.INotificationDao;
import StarsUpConnexion.DataSource;
import StarsUpIDAO.INotificationDao;
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
 * 
 */

   public  class NotificationDao implements INotificationDao{
    private static NotificationDao instance;
    private Connection connexion;
    
    public NotificationDao() {
        connexion = DataSource.getInstance().getConnection();
    }
    
    
    
    public static NotificationDao getInstance()
    {
        if(instance ==null)
        instance = new NotificationDao();
     
     return instance;
    }
    
    /**
     *
     * @return
     */
        public List<Notification> readAll()
    {
        List<Notification>notifications;
        notifications = new ArrayList<>();
            Notification noti;
        try {
            
            String sql="select * from notification";
            Statement stmt=connexion.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
            noti=new Notification();
            noti.setTextNotif(rs.getString(1));
            noti.setDay(rs.getInt(2));
            noti.setMonth(rs.getInt(3));
            noti.setYear(rs.getInt(4));
            Notification.add(noti);
                        }
                
        } catch (SQLException ex) {
            Logger.getLogger(NotificationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
              return notifications;    

    
    }
    /**
     *
     * @param obj
     */
    @Override
    public void insert(Notification obj) {
    try {
        PreparedStatement preparNotification =connexion.prepareStatement("insert into notification(texte_notification,day,month,year,administrateur_id,client_id) values(?,?,?,?,?,?)");

        preparNotification .setString(1, obj.getTextNotif());
        preparNotification .setInt(2, obj.getDay());
         preparNotification .setInt(3, obj.getMonth());
          preparNotification .setInt(4, obj.getYear());
        preparNotification .setInt(5, obj.getAdministrateur().getId());
        preparNotification .setInt(6, obj.getClient().getId());
        preparNotification .executeUpdate();
        System.out.println("Notification is send");
         
    } catch (SQLException ex) {
        Logger.getLogger(NotificationDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}

    @Override
    public void delete(Notification obj) {
          String requete = "delete from notification where (administrateur_id=? && client_id=?)";
        try {
            PreparedStatement ps = connexion.prepareStatement(requete);
            ps.setInt(1, obj.getAdministrateur().getId());
            ps.setInt(1, obj.getClient().getId());
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
       
    }

   
    
     
}
