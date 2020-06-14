public class Imutabilidade1 {

    static String nome = "Marcos";
    static String sobreNome = "Paulo";

    public static void main(String[] args) {
        concatenarNomeCompleto(sobreNome);
        System.out.print(nome);
    }

    public static void concatenarNomeCompleto(String sobreNome) {
        nome = nome.concat(" ").concat(sobreNome);
    }
}
