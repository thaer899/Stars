/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarsUpIDAO;

import entities.Client;
import java.util.List;

/**
 *
 * @author attia
 */
public interface IClientDAO {
    void createClient(Client client);

    void updateClient(Client client);

    void deleteClient(int id);

    Client findClientById(int id);

    List<Client> DisplayAllClients();
    
}
