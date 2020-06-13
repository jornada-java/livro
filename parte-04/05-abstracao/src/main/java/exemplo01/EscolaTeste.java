package exemplo01;

public class EscolaTeste {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Tatiana", 35);
        pessoa.fazerAniversario();

        Escola escola = new Escola();
        escola.cadastrarPessoa(pessoa);
    }
}
