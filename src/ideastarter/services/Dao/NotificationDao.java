/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.services.Dao;
import ideastarter.services.Notification;
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

   public class NotificationDao implements  Idao<Notification, Integer>{
    private static NotificationDao instance;
    private Connection connexion;
    private NotificationDao() {
    
        connexion= CreateConnection.getInstance();
    
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
    @Override
    public List<Notification> readAll()
    {
        List<Notification>notifications;
        notifications = new ArrayList<>();
            Notification noti;
        try {
            
            String sql="select TextNotif from notification";
            Statement stmt=connexion.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
            noti=new Notification();
            noti.setTextNotif(rs.getString(1));
            
            Notification.add(noti);
                        }
                
        } catch (SQLException ex) {
            Logger.getLogger(NotificationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
              return notifications;    

    
    }
    public boolean insert(Notification obj) {
    try {
        PreparedStatement preparNotification =connexion.prepareStatement("insert into notification(TextNotif) values(?)");

        preparNotification .setString(1, obj.getTextNotif());
       
        int var=preparNotification .executeUpdate();
        if(var==0)
            return false; 
                    else 
            return true;


    } catch (SQLException ex) {
        Logger.getLogger(NotificationDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}

    @Override
    public boolean create(Notification  obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Notification readById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Notification  obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Notification  obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
     
}
