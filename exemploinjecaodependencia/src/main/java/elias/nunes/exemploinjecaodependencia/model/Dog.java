package elias.nunes.exemploinjecaodependencia.model;

import elias.nunes.exemploinjecaodependencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
@Qualifier
public class Dog implements IAnimal {

    @Override
    public void comunicar() {
        System.out.println("Au au");
    }
}
