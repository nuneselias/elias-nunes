package elias.oliveira.exemplopostconstructpredestroy;

import elias.oliveira.exemplopostconstructpredestroy.dao.ClientDAO;
import elias.oliveira.exemplopostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Elias"));

		System.out.println("clientDAO: " + clientDAO);
		System.out.println("objeto client dentro do DAO: " + clientDAO.getClient());

	}

}
