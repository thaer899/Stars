/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.administrateur;
import ideastarter.util.CreateConnection;
/**
 *
 * @author attia
 */
public class Administrateur {
    private int id;
    private String Name;
    private String Last_Name;
    private String Login;
    private String Password;
    private String Email;

    public Administrateur() {
    }

   public Administrateur(int id,String Name,String Last_Name,String Login,String Password,String Email){
    this.id=id;   
    this.Name=Name;
    this.Last_Name=Last_Name;
    this.Login=Login;
    this.Password=Password;
    this.Email=Email;
   }
   public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
   
   
}
