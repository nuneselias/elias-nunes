package elias.nunes.exemploinjecaodependencia;

import elias.nunes.exemploinjecaodependencia.model.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class ExemploinjecaodependenciaApplication {

	public static void main(String[] args) {

		//Terceira maneira
		ApplicationContext applicationContext = SpringApplication.run(ExemploinjecaodependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();

		//INVERSÃO DE CONTROLE


		//Segunda maneira
		//Pet pet = new Pet (new Dog());
		//pet.execute();//au auuu

		//Primeira maneira
		//Pet pet = new Pet();
		//pet.execute();
	}

}
