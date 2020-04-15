package nunes.elias.exercicio5.model;

public class Teste {

    private String mensagem;

    public Teste(String mensagem) {
        this.mensagem = mensagem;
    }

    public Teste() {
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Teste"
                + "\nBem-vindo " + this.mensagem;
    }
}
