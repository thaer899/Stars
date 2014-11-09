/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpConnexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Emna
 */
public class Connexion {
    Connection con;
public static  Statement st;
public static ResultSet rs;
static Connexion CON;


public Connexion(){
 try {
                    Class.forName("org.gjt.mm.mysql.Driver");

                } catch (Exception E) {
                    System.out.println("Pas de pilote !");
                }
                        try {
                String url = "jdbc:mysql://localhost/starsup";
                con = DriverManager.getConnection(url, "root", "");

                   st = con.createStatement();
            } catch (SQLException E) {
                System.err.println(E.getMessage());
            }
       

}

 
    
    
}
