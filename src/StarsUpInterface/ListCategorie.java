/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpInterface;

import StarsUpDAO.CategorieDAO;
import StarsUpIDAO.ICategorieDAO;
import entities.Categorie;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MAHER
 */
public class ListCategorie extends AbstractTableModel{
    
    String [] header={"Id", "titre","commentaire"};
    List<Categorie> categories=new ArrayList<Categorie>();
    
    public ListCategorie() {
        ICategorieDAO catdao=CategorieDAO.getInstance();
        categories=catdao.DisplayAllCategorie();
    
    }
    public String getColumnName(int column)
    {
        return header[column];
    }

    @Override
    public int getRowCount() {
        return categories.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){  
        case 0:
                return categories.get(rowIndex).getId();
            case 1: 
                return categories.get(rowIndex).getTitre();
            case 2: 
                return categories.get(rowIndex).getCommentaire();
                default:
                return null;
    }
    
}
    
}
