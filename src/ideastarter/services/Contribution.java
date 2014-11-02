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

   public class Contribution {
    private int valeur;
    public Contribution(){
    }
    public Contribution (int valeur){
        this.valeur=valeur;

    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }



    
}
