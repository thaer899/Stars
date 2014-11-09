/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpIDAO;

import entities.Contribution;
import entities.Client;
import entities.Idee;
import java.util.List;
/**
 *
 * @author karim
 */
public interface IprofilClientDAO {
    
    List<Idee> RechercherIdeeClient(Client C);
    List<Contribution> DisplayAlLContributions(Client c);
    void ModifierInfoClient(int id, String login, String password , String Email, String carte_bancaire);
     Client FindById(int id);
     Idee FindIdeeById(int id);
     int FindByNom(String nom);
}
