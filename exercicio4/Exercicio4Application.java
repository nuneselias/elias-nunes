package oliveira.elias.exercicio4;

import oliveira.elias.exercicio4.model.Aluno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio4Application {

	public static void main(String[] args) {

		SpringApplication.run(Exercicio4Application.class, args);

		Aluno aluno = new Aluno();

		aluno.setNota1(6.5);
		aluno.setNota2(9);
		aluno.mediaAritmetica();

		System.out.println("\f");
		System.out.println(aluno.toString());
	}
}

