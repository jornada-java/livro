import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    /* Atributo para armazenar a data de nascimento */
    LocalDate dataNascimento;

    /* Atributo para armazenar a altura */
    float altura;

    /* Atributo para armazenar o estado civil */
    String situacaoCivil;

    /* Atributo para armazenar o gênero */
    String genero;

    /* Construtor para a inicialização dos atributos de pessoa */
    public Pessoa(LocalDate dataNascimento,
            float altura,
            String situacaoCivil,
            String genero) {
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.situacaoCivil = situacaoCivil;
        this.genero = genero;
    }

    /* Método para exibir a idade a partir da data de nascimento */
    public void exibeIdade() {
        //Recupera a data atual
        LocalDate hoje = LocalDate.now();

        //Obtém o período entre a data atual e a data de nascimento
        // e retorna o período em anos
        int idade = Period.between(dataNascimento, hoje).getYears();

        //Exibe a idade atual da pessoa
        System.out.println(idade);
    }
}
