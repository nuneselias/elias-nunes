package externalclasses;

import org.springframework.stereotype.Component;

/**
 * @author Elias
 * @version 1.0
 * @since 16/04/2020
 */
@Component
public class ClassJDBC {

    public ClassJDBC () {
        System.out.println("Conexão de JDBC!");
    }

}
