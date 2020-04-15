package nunes.elias.exercicio5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping ("/")
    public String index () {
        return "Hello world!";
    }



}