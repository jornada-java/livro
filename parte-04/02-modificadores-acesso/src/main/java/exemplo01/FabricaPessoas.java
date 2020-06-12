package exemplo01;

public class FabricaPessoas {
    public static void main(String[] args) {
        // Criando duas pessoas
        Pessoa pessoa1 = new Pessoa("Maria");
        Pessoa pessoa2 = new Pessoa("Pedro");

        // Alterando a idade das pessoas
        pessoa1.idade = 20;
        pessoa2.idade = -23;

        // Imprimindo a idade das pessoas
        System.out.println(pessoa1.idade); // imprime 20
        System.out.println(pessoa2.idade); // imprime -23
    }
}
