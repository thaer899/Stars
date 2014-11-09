/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import StarsUpConnexion.CreateConnection;

/**
 *
 * @author attia
 */
public class Categorie extends Idee {

    private int id;
    private String titre;
    private String commentaire;

    public Categorie() {
    }

    public Categorie(int id, String titre, String commentaire) {
        this.id = id;
        this.titre = titre;
        this.commentaire = commentaire;


    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getTitre() {
        return titre;
    }

    /**
     *
     * @param titre
     */
    @Override
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
