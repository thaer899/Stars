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
public class Categorie extends Projet{
    private int id;
    private String titre;
   

    
    
    
    public Categorie(int id, String titre){
        this.id=id;
        this.titre=titre;
        
    
    }

    public Categorie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    
    
    
    
}
