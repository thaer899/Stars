/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpConnexion;
import java.sql.*;
import javax.swing.*;
import java.sql.DriverManager;
/**
 *
 * @author Emna
 */
public class CreateConnection {

    public static Connection getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection conn = null;
public static Connection ConnecrDB(){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/starsup","root","");
return conn;
}
catch(Exception e){
JOptionPane.showMessageDialog(null,e);
return null;
}
}
}
