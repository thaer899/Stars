/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpIDAO;

import entities.Administrateur;
import java.util.List;

/**
 *
 * @author attia
 */
public interface IAdministrateurDAO {
    void createAdministrateur(Administrateur administrateur);

    void updateAdministratur(Administrateur administrateur);

    void deleteAdministrateur(int Id);

    List<Administrateur> DisplayAllAdministrateur();
    
}
