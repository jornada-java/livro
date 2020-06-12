package com.jornadajava;

public class IterandoArray {

    public static void main(String[] args) {
        String[] palavras = new String[]{"MACA", "BANANA", "ABACATE", "LIMAO", "ABACAXI"};
        System.out.println(trazerConteudoSemA(palavras));
    }

    public static String trazerConteudoSemA(String[] palavras) {
        String resultado = "";
        if (palavras != null && palavras.length > 0) {
            for (int i = 0; i < palavras.length; i++) {
                resultado = resultado + palavras[i].replace("A", "");
            }
        }
        return resultado;
    }
}
