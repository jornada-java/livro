package exemplo01;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome) {
        idade = 0;
        this.nome = nome;
    }

    public void fazerAniversario() {
        idade++;
    }
}
