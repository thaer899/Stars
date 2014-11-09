/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpInterface;

import StarsUpDAO.AdministrateurDao;
import StarsUpIDAO.IAdministrateurDAO;
import entities.Administrateur;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author WIEM
 */
public class ListAdmin extends AbstractTableModel{

    String [] header={"Id", "Nom", "Prenom","Pseudo", "MotDePasse","Email"};
    List<Administrateur> administrateurs=new ArrayList<Administrateur>();
    
    public ListAdmin() {
        IAdministrateurDAO admindao=AdministrateurDao.getInstance();
        administrateurs=admindao.DisplayAllAdministrateur();
    
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
    
    
    @Override
    public int getRowCount() {
        return administrateurs.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0:
                return administrateurs.get(rowIndex).getId();
            case 1: 
                return administrateurs.get(rowIndex).getName();
            case 2: 
                return administrateurs.get(rowIndex).getLast_Name();
            case 3: 
                return administrateurs.get(rowIndex).getLogin();
            case 4: 
                return administrateurs.get(rowIndex).getPassword();
            case 5:
                return administrateurs.get(rowIndex).getEmail();
            default:
                return null;
        }
    }
    
}