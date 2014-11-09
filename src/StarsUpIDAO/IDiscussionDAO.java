/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpIDAO;


import entities.Discussion;
import java.util.List;

/**
 *
 * @author Emna
 */
public interface IDiscussionDAO {
     List<Discussion> DisplayAllDiscussion();
    void insertDiscussion(Discussion discussion);
    void updateDiscussion(Discussion discussion);
    void deleteDiscussion(int Id);
    Discussion FindById(int Id);
    Discussion FindBySubject(String Subject); 
}
