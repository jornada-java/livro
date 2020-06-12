package exemplo02;

public class FabricaPessoas {
    public static void main(String[] args) {

        // Criando duas pessoas
        Pessoa pessoa1 = new Pessoa("Maria");
        Pessoa pessoa2 = new Pessoa("Pedro");

        // Alterando a idade das pessoas usando o método de acesso
        pessoa1.setIdade(20);
        pessoa1.setIdade(-23);

        // Imprimindo a idade das pessoas
        System.out.println(pessoa1.getIdade()); // imprime 20
        System.out.println(pessoa2.getIdade()); // imprime 0
    }
}
