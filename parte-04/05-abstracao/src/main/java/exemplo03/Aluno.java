package exemplo03;

public class Aluno extends Pessoa {

    private String serie;

    public Aluno(String nome, int idade, String serie) {
        super(nome, idade);
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    // implementando o método abstrato
    public void fazerAdmissao() {
        System.out.println("Peça a seus pais para fazerem sua matrícula na secretaria!");
    }

    @Override
    public void fazerAniversario() {
        idade++;
        System.out.println("Feliz aniversário, querido(a) aluno(a)!");
    }

    // declarando um novo método concreto
    public void estudar() {
        System.out.println("Estude muito!");
    }

}
