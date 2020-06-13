package exemplo01;

public class Aluno {
    private String nome;
    private int idade;
    private String serie;

    public Aluno(String nome, int idade, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void fazerAniversario() {
        idade++;
        System.out.println("Parabéns!");
    }

}
