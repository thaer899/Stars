/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Emna
 */
public class Discussion {
    private String Sujet;
    private String Contenu;
    private int client_id;
    private String date_discussion;

   
    public Discussion() {
       
    }

    public Discussion(String Sujet, String Contenu, int client_id, String date_discussion) {
        this.Sujet = Sujet;
        this.Contenu = Contenu;
        this.client_id = client_id;
        this.date_discussion = date_discussion;
    }

    public String getSujet() {
        return Sujet;
    }

    public void setSujet(String Sujet) {
        this.Sujet = Sujet;
    }

    public String getContenu() {
        return Contenu;
    }

    public void setContenu(String Contenu) {
        this.Contenu = Contenu;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getDate_discussion() {
        return date_discussion;
    }

    public void setDate_discussion(String date_discussion) {
        this.date_discussion = date_discussion;
    }

    
}
