package com.jornadajava;

import java.nio.charset.Charset;

public class CriandoString {

    public static void main(String[] args) {
        String nome = "Oswaldo";
        System.out.println(nome);

        String nome2 = new String("Oswaldo");
        System.out.println(nome2);

        byte[] letras = new byte[]{'a', 'b', 'c', 'd'};
        String palavra = new String(letras, Charset.forName("UTF-8"));
        System.out.println(palavra);

        String nome3 = String.valueOf("Oswaldo");
        System.out.println(nome3);

    }
}
