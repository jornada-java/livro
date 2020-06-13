package exemplo02;

public abstract class Pessoa {

    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // método concreto
    public void fazerAniversario() {
        idade++;
    }

    // método abstrato
    public abstract void fazerAdmissao();
}
