package elias.oliveira.exemploescopo.dao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author Elias
 * @version 1.0
 * @since 16/04/2020
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ClassJDBC {

    private ClassJDBC() {
        System.out.println("Classe JDBC");
    }

}
