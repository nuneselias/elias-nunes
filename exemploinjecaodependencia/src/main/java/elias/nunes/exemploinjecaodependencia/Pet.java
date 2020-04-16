package elias.nunes.exemploinjecaodependencia;

import elias.nunes.exemploinjecaodependencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pet {

    @Autowired
    @Qualifier("dog") // <- controlo por aqui. ele muda td gerenciamento de spring
    private IAnimal iAnimal;

    //public Pet(IAnimal iAnimal) {
    //   this.iAnimal = iAnimal;
    //}

    public void execute() {
        iAnimal.comunicar();
    }
        //Primeira maneira//
        //Forte Acoplamento.
        //public void execute() {
        //   iAnimal = new Cat(); //or Dog();
        // iAnimal.comunicar();

}
