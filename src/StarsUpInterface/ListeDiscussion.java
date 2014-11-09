/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpInterface;


import StarsUpDAO.DiscussionDAO;
import entities.Discussion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Emna
 */
public class ListeDiscussion extends AbstractTableModel{
    String [] header={"sujet","contenu","Client id ","date De discussion"};
    List<Discussion> discussion=new ArrayList<>();

    
    
     public ListeDiscussion() {
        DiscussionDAO disc=DiscussionDAO.getInstance();
        discussion=disc.DisplayAllDiscussion();}
    
    public String getColumnName(int column) {
        return header[column];
    }
    @Override

    public int getRowCount() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return discussion.size();    
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 switch(columnIndex){
            case 0: 
                return discussion.get(rowIndex).getSujet();
            case 1:
                return discussion.get(rowIndex).getContenu();
            case 2:
                return discussion.get(rowIndex).getClient_id();
            case 3:
                return discussion.get(rowIndex).getDate_discussion();
            default:
                return null;
        }    
    }
}
