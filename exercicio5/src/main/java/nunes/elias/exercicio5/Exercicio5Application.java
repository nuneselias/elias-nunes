package nunes.elias.exercicio5;

import nunes.elias.exercicio5.model.Teste;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio5Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio5Application.class, args);

		System.out.println("\f");

		Teste teste = new Teste();

		teste.setMensagem("Hello World!");

		System.out.println(teste.toString());
	}

}
