package elias.oliveira.exercicio6.model;

public class Cliente {

    public String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Clientes" +
                "\nNome: " + this.nome ;
    }
}
