import java.time.LocalDate;

public class MainPessoa {
    public static void main(String[] args) {
        //Cria uma instância de pessoa
        Pessoa pessoa = new Pessoa(
                LocalDate.of(1995, 2, 10), //data de nascimento
                1.8f, //altura
                "Solteiro", //situação civil
                "Masculino"); //gênero

        pessoa.exibeIdade();
    }
}
