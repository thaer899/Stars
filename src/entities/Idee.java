/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import StarsUpConnexion.DataSource;
import java.sql.Date;
/**
 *
 * @author attia
 */
public class Idee {
    private int Id;
    private String titre;
    private String description;
    private int nbrContributions;
    private Date dateDebut;
    private byte avatar;
    private Date dateLimite;
    private int budgetRequis;
    private Client client;
    private String categorie;
    public Idee() {
    }

    public Idee(int Id,String titre, String description, Date dateDebut, Date dateLimite, int budgetRequis) {
        this.Id = Id;
        this.titre = titre;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateLimite = dateLimite;
        this.budgetRequis = budgetRequis;
    }
    public int getId() {
        return Id;
    }

     public void setId(int Id) {
        this.Id = Id;
    }
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Date getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(Date dateLimite) {
        this.dateLimite = dateLimite;
    }

   

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    
    

    public int getBudgetRequis() {
        return budgetRequis;
    }

    /**
     *
     * @param budgetRequis
     */
    public void setBudgetRequis(int budgetRequis) {
        this.budgetRequis = budgetRequis;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

   

    

   

   

    
    
    
}
