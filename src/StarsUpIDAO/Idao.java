/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpIDAO;

import java.util.List;

/**
 *
 * @author Emna
 */
public interface Idao <T,P> {
    void create(T obj);
    List<T> readAll();
    T readById(P id);
    boolean update(T obj);
    boolean delete(T obj);
}
