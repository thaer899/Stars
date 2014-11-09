/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpIDAO;

import entities.Idee;
import java.util.List;

/**
 *
 * @author thaer
 */

public interface IIdeeDAO  {
    boolean createIdee(Idee idee,int client_id);
    List<Idee> readAll();
    List<Idee> readById(int id);
    boolean updateIdee(Idee idee,int id,int client_id);
    boolean deleteIdee(int id);
}
