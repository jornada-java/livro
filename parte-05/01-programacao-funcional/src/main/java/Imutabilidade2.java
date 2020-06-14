public class Imutabilidade2 {

    static String nome = "Marcos";
    static String sobreNome = "Paulo";

    public static void main(String[] args) {

        String nomeCompleto = nomeCompleto(nome, sobreNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String nome, String sobreNome) {
        return nome.concat(" ").concat(sobreNome);
    }
}
