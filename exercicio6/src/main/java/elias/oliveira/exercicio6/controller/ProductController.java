package elias.oliveira.exercicio6.controller;

import elias.oliveira.exercicio6.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProductController {

    @GetMapping ("/produtos")
    public Produto getProduct () {

        Produto produto = new Produto();
        produto.setNome("Sucrilhos");

        return produto;
    }
    @GetMapping("/arrayprodutos")
    public ArrayList<Produto> getProducts() {
        Produto produto1 = new Produto();
        produto1.setNome("Bolacha");

        Produto produto2 = new Produto();
        produto2.setNome("Nescau");

        Produto produto3 = new Produto();
        produto3.setNome("Refrigerante");

        Produto produto4 = new Produto();
        produto4.setNome("Pizza");

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        return produtos;
    }
}
