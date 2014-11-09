/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpInterface;

import StarsUpDAO.ClientDao;
import StarsUpIDAO.IClientDAO;
import entities.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author WIEM
 */
public class ListClient extends AbstractTableModel{

    String [] header={"Id", "Nom", "Prenom","Mot_de_Passe","Pays","Ville","Adresse","Email","Pseudo","Type_carte_bancaire","contributeur","createur_idee"};
    List<Client> clients=new ArrayList<Client>();
    
    public ListClient() {
        IClientDAO clientdao=ClientDao.getInstance();
        clients=clientdao.DisplayAllClients();
    
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
    
    
    @Override
    public int getRowCount() {
        return clients.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0:
                return clients.get(rowIndex).getId();
            case 1: 
                return clients.get(rowIndex).getNom();
            case 2: 
                return clients.get(rowIndex).getPrenom();
            case 3: 
                return clients.get(rowIndex).getMot_de_Passe();
            case 4: 
                return clients.get(rowIndex).getPays();
            case 5:
                return clients.get(rowIndex).getVille();
            case 6:
                return clients.get(rowIndex).getAdresse();
            case 7:
                return clients.get(rowIndex).getEmail();
            case 8:
                return clients.get(rowIndex).getPseudo();
            case 9:
                return clients.get(rowIndex).getType_Carte_Bancaire();
            case 10:
                return clients.get(rowIndex).isContributeur();
            case 11:
                return clients.get(rowIndex).isCreateur_idee();
            default:
                return null;
        }
    }
    
}