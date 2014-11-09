/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpIDAO;

import entities.Administrateur;
import entities.Client;

/**
 *
 * @author attia
 */
public interface IauthentificationDAO {
    Client findClient(String login,String password);
   boolean findAdministrateur(String login,String password);
    
}
