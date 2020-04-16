package elias.oliveira.exercicio6.model;

public class Produto {

    public String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produtos" +
                "\nNome: " + this.nome ;
    }
}
