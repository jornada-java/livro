package com.jornadajava;

import java.util.Arrays;
import java.util.List;

public class GenericosNumero {

    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 2, 3);
        System.out.println(soma(lista1));

        List<Double> lista2 = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println(soma(lista2));
    }

    //Recebe como parâmetro qualquer lista cujos elementos estendam de Number
    public static double soma(List<? extends Number> lista) {
        double soma = 0;

        for (Number numero : lista) {
            soma += numero.doubleValue();
        }

        return soma;
    }


}
