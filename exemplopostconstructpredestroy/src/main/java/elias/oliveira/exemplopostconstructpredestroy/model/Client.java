package elias.oliveira.exemplopostconstructpredestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Elias
 * @version 1.0
 * @since 16/04/2020
 */
@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {

    private String name;

    public Client() {
        System.out.println("Passando pelo construtor de Client!");
    }

    public Client(String name) {
    }
}
