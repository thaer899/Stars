/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpInterface;

import StarsUpDAO.profilClientDAO;
import StarsUpIDAO.IprofilClientDAO;
import entities.Idee;
import entities.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author WIEM
 */
public class listIdees extends AbstractTableModel{
    
    String [] header={"project's name", "Depot's date"};
    List<Idee> idees;
    
    public listIdees(Client currentClient) {
        IprofilClientDAO profilclientdao=profilClientDAO.getInstance();
        idees=profilclientdao.RechercherIdeeClient(currentClient);
    
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
    
    
    @Override
    public int getRowCount() {
        return idees.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0: 
                return idees.get(rowIndex).getTitre();
            case 1: 
                return idees.get(rowIndex).getDateDebut();
            default:
                return null;
        }
    }
    
}
