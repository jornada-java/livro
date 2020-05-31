package com.jornadajava;

public class VarArgs {

    public static void main(String[] args) {
        String[] palavras = new String[]{"metodos", "devem", "fazer", "apenas", "uma", "coisa"};
        String conteudo = trazerConteudoSemA(palavras);
        System.out.println(conteudo);

        String conteudo1 = trazerConteudoSemA("metodos", "devem", "fazer", "apenas", "uma", "coisa");
        System.out.println(conteudo1);

    }

    public static String trazerConteudoSemA(String... palavras) {
        String resultado = "";
        if (palavras != null && palavras.length > 0) {
            for (String palavra : palavras) {
                resultado = resultado + palavra.replace("A", "");
            }
        }
        return resultado;
    }

}
