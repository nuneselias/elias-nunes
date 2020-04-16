package elias.oliveira.exemploescopo;

import elias.oliveira.exemploescopo.dao.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Elias
 * @version 1.0
 * @since 16/04/2020
 */
@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploescopoApplication.class, args);

        ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);
        ClassDAO objectDAO2 = applicationContext.getBean(ClassDAO.class);

        System.out.println("ObjetoDAO1: " + objectDAO1);
        System.out.println("ObjetoDAO2: " + objectDAO1.getObjectJDBC());

        System.out.println("ObjetoJDBC1: " + objectDAO2);
        System.out.println("ObjetoJDBC1: " + objectDAO2.getObjectJDBC());

	}

}
