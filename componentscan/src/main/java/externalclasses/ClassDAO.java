package externalclasses;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Elias
 * @version 1.0
 * @since 16/04/2020
 */
@Component
@Getter @Setter
public class ClassDAO {

    /**
     * gerado pois o Lombok não autenticou ao dar get em ObjectJDBC
     */
    public ClassJDBC getObjectJDBC() {
        return objectJDBC;
    }

    public void setObjectJDBC(ClassJDBC objectJDBC) {
        this.objectJDBC = objectJDBC;
    }

    @Autowired
    ClassJDBC objectJDBC;
}
