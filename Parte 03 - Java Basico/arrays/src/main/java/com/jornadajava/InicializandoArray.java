package com.jornadajava;

import java.util.Arrays;

public class InicializandoArray {

    public static void main(String[] args) {
        String[] palavras = new String[12];
        System.out.println(Arrays.toString(palavras));

        int[] fibonacci = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233};
        System.out.println(Arrays.toString(fibonacci));

        //Lendo elemento
        System.out.println(fibonacci[4]);

        System.out.println(fibonacci.length); // resultado = 12
        System.out.println(fibonacci[11]); // lê o último elemento do array
    }
}
