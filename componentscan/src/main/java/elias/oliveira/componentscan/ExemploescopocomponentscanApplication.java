package elias.oliveira.componentscan;

import externalclasses.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("externalclasses") //procurar e importar os beans...
public class ExemploescopocomponentscanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploescopocomponentscanApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("OBJETO DAO: " + objectDAO1);
		System.out.println("OBJETO JDBC dentro do DAO: " + objectDAO1.getObjectJDBC());
	}

}
