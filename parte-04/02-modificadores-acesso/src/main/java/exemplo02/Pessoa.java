package exemplo02;

public class Pessoa {
    String nome;
    private int idade;

    public Pessoa(String nome) {
        idade = 0;
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void fazerAniversario() {
        idade++;
    }
}
