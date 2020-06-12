package com.jornadajava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClasseArrays {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{1, 2, 3, 465, 742};
        List<Integer> lista = Arrays.asList(array);

        String[] palavras = new String[]{"metodos", "devem", "fazer", "apenas", "uma", "coisa"};
        Stream fluxo = Arrays.stream(palavras);
        

    }
}
