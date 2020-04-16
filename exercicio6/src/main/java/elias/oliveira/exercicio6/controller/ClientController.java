package elias.oliveira.exercicio6.controller;

import elias.oliveira.exercicio6.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClientController {

    @GetMapping ("/clientes")
    public Cliente getClient () {

        Cliente cliente = new Cliente();
        cliente.setNome("Elias Oliveira");

        return cliente;
    }

    @GetMapping("/arrayclientes")
    public ArrayList<Cliente> getClients() {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Elias");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Edinei ");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Tarcisio");

        Cliente cliente4 = new Cliente();
        cliente4.setNome("Renata");

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        return clientes;
    }
}
