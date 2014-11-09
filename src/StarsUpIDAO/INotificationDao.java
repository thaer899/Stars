/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpIDAO;

import entities.Notification;

/**
 *
 * @author MAHER
 */
public interface INotificationDao {
    
    void insert(Notification obj);
    
    void delete(Notification  obj);
    
}
