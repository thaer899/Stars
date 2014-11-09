/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import StarsUpConnexion.CreateConnection;
import java.sql.Date;
/**
 *
 * @author attia
 */
public class Notification {

    public static void add(Notification noti) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String textNotif;
    private int day, month, year;
    private Administrateur administrateur;
    private Client client;

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

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
       public Administrateur getAdministrateur() {
        return administrateur;
    }
    public void setAdministrateur(Administrateur administrateur) {
        this.administrateur = administrateur;
    }
       public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    
    
}
