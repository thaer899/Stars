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

   public class Contribution {
    private int valeur;
    private Date dateContribution;
    private Client client;
    private Idee idee;
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

    public Date getDateContribution() {
        return dateContribution;
    }

    public void setDateContribution(Date dateContribution) {
        this.dateContribution = dateContribution;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Idee getIdee() {
        return idee;
    }

    public void setIdee(Idee idee) {
        this.idee = idee;
    }




    
}