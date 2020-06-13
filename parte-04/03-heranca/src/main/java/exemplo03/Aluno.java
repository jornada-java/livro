package exemplo03;

public class Aluno extends Pessoa {

    private String serie;

    public Aluno(String nome, int idade, String serie) {
        super(nome, idade);
        this.serie = serie;
    }

    @Override
    public void fazerAniversario() {
        //idade++; ou
        super.fazerAniversario();
        System.out.println("Feliz aniversário, querido(a) aluno(a)!");
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
