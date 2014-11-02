/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.services;
import ideastarter.util.CreateConnection;
/**
 *
 * @author attia
 */
public class Notification {

    public static void add(Notification noti) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String textNotif;

    public Notification(){}
    public Notification(String textNotif) {
        this.textNotif = textNotif;
    }

    public String getTextNotif() {
        return textNotif;
    }

    public void setTextNotif(String textNotif) {
        this.textNotif = textNotif;
    }
    
    
}
