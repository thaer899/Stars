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
public class Projet {
    
    private String nom;
    private String description;
    private int nbrVues;
    private int nbrContributions;
    private String dateDebut;
    private String commentaire;
    private int budgetRequis;

    public Projet() {
    }

    public Projet(String nom, String description, int nbrVues, int nbrContributions, String dateDebut, String commentaire, int budgetRequis) {
        this.nom = nom;
        this.description = description;
        this.nbrVues = nbrVues;
        this.nbrContributions = nbrContributions;
        this.dateDebut = dateDebut;
        this.commentaire = commentaire;
        this.budgetRequis = budgetRequis;
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbrVues() {
        return nbrVues;
    }

    public void setNbrVues(int nbrVues) {
        this.nbrVues = nbrVues;
    }

    public int getNbrContributions() {
        return nbrContributions;
    }

    public void setNbrContributions(int nbrContributions) {
        this.nbrContributions = nbrContributions;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getBudgetRequis() {
        return budgetRequis;
    }

    public void setBudgetRequis(int budgetRequis) {
        this.budgetRequis = budgetRequis;
    }
    
    
}
