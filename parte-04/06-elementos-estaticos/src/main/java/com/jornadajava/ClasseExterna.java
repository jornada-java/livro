package com.jornadajava;

public class ClasseExterna {
    private static String msgEstatica = "Sou estática";
    private String msgNaoEstatica = "Não sou estática";

    // Classe aninhada estática
    public static class ClasseInternaEstatica {

        public void metodo1() {
            System.out.println(msgEstatica); // imprime "Sou estática"
            //System.out.println(msgNaoEstatica); // erro de compilação
        }
    }

    // Classe aninhada não estática - Inner class
    public class ClasseInterna {

        public void metodo2() {
            System.out.println(msgEstatica); // imprime "Sou estática"
            System.out.println(msgNaoEstatica); // imprime "Não sou estática"

        }
    }
}
