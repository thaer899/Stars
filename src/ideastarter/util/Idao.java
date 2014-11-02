/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.util;

import java.util.List;

/**
 *
 * @author Emna
 */
public interface Idao <T,P> {
    boolean create(T obj);
    List<T> readAll();
    T readById(P id);
    boolean update(T obj);
    boolean delete(T obj);
}
