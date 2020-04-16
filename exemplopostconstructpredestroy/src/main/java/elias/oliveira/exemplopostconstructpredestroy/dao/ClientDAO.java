package elias.oliveira.exemplopostconstructpredestroy.dao;

import elias.oliveira.exemplopostconstructpredestroy.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Elias
 * @version 1.0
 * @since 16/04/2020
 */
@Component

public class ClientDAO {

    @Autowired
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @PostConstruct
    public void postConstructor() {
        System.out.println("Objeto criado na memória!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Objeto finalizado");
    }


}

