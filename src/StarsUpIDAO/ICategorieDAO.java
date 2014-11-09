/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpIDAO;

import entities.Categorie;
import java.util.List;

/**
 *
 * @author MAHER
 */
public interface ICategorieDAO {
    
    /**
     *
     * @return
     */
    List<Categorie> DisplayAllCategorie();
    
    void createCategorie(Categorie categorie);
    
    void updateCategorie(Categorie categorie);
    
    void deleteCategorie(int Id);
    
}
