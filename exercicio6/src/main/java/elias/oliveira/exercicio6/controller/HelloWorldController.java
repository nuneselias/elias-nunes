package elias.oliveira.exercicio6.controller;

import elias.oliveira.exercicio6.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloWorldController {

    @GetMapping ("/")
    public String index () {
        return "Welcome to the User world!";
    }
}
