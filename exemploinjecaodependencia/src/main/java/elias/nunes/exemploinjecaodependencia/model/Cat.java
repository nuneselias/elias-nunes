package elias.nunes.exemploinjecaodependencia.model;

import elias.nunes.exemploinjecaodependencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class Cat implements IAnimal {

    @Override
    public void comunicar() {
        System.out.println("Miau");
    }
}
