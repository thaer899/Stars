/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpInterface;

import StarsUpDAO.profilClientDAO;
import StarsUpIDAO.IprofilClientDAO;
import entities.Contribution;
import entities.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author WIEM
 */
public class listContributions extends AbstractTableModel{
    
    String [] header={"project's name", "value","Date"};
    List<Contribution> contributions;
    
    public listContributions(Client currentClient) {
        IprofilClientDAO profilclientdao=profilClientDAO.getInstance();
        contributions=profilclientdao.DisplayAlLContributions(currentClient);
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
    
    
    @Override
    public int getRowCount() {
        return contributions.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0: 
                return contributions.get(rowIndex).getIdee().getTitre();
            case 1: 
                return contributions.get(rowIndex).getValeur();
            case 2: 
                return contributions.get(rowIndex).getDateContribution();
            default:
                return null;
        }
    }
    
}
