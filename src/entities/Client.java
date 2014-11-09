/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author attia
 */
public class Client {
    private int id;
    private String Nom;
    private String Prenom;
    private String Mot_de_Passe;
    private String Pays;
    private String Ville;
    private String Adresse;
    private String Pseudo;
    private String Email;
    private String Type_Carte_Bancaire;
    private boolean contributeur;
    private boolean createur_idee;
    byte[] person_image=null;
    
    
    public Client(){
    }
    

    public Client(int id, String Nom, String Prenom, String Mot_de_Passe,  String Pays, String Ville, String Adresse,  String Pseudo, String Email,  String Type_Carte_Bancaire, boolean contributeur, boolean createur_idee, byte [] person_image) {
        this.id = id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Mot_de_Passe = Mot_de_Passe;
        this.Pays = Pays;
        this.Ville = Ville;
        this.Adresse = Adresse;
        this.Pseudo = Pseudo;
        this.Email = Email;
        this.Type_Carte_Bancaire = Type_Carte_Bancaire;
        this.contributeur = contributeur;
        this.createur_idee = createur_idee;
        this.person_image = person_image;
    }
    
    public Client(int id, String Nom, String Prenom, String Pays, String Ville, String Adresse,  String Pseudo, String Email,  String Type_Carte_Bancaire, byte[] person_image) {
        this.id = id;
        this.Nom = Nom;
        this.Prenom = Prenom;        
        this.Pays = Pays;
        this.Ville = Ville;
        this.Adresse = Adresse;
        this.Pseudo = Pseudo;
        this.Email = Email;
        this.Type_Carte_Bancaire = Type_Carte_Bancaire;
        this.contributeur = contributeur;
        this.createur_idee = createur_idee;
        this.person_image = person_image;
    }
    
    
public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getPays() {
        return Pays;
    }

    public void setPays(String Pays) {
        this.Pays = Pays;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public String getPseudo() {
        return Pseudo;
    }

    public void setPseudo(String Pseudo) {
        this.Pseudo = Pseudo;
    }

    public boolean isContributeur() {
        return contributeur;
    }

    public void setContributeur(boolean contributeur) {
        this.contributeur = contributeur;
    }

    public boolean isCreateur_idee() {
        return createur_idee;
    }

    public void setCreateur_idee(boolean createur_idee) {
        this.createur_idee = createur_idee;
    }

    public String getMot_de_Passe() {
        return Mot_de_Passe;
    }

    public void setMot_de_Passe(String Mot_de_Passe) {
        this.Mot_de_Passe = Mot_de_Passe;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getType_Carte_Bancaire() {
        return Type_Carte_Bancaire;
    }

    public void setType_Carte_Bancaire(String Type_Carte_Bancaire) {
        this.Type_Carte_Bancaire = Type_Carte_Bancaire;
    }

    public byte[] getPerson_image() {
        return person_image;
    }

    public void setPerson_image(byte[] person_image) {
        this.person_image = person_image;
    }
    
    
    
    
}
