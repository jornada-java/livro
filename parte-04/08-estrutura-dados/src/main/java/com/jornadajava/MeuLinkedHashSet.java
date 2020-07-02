package com.jornadajava;

import java.util.LinkedHashSet;
import java.util.Set;

public class MeuLinkedHashSet {
    public static void main(String[] args) {
        Set colecao = new LinkedHashSet();

        colecao.add("Alexandre");
        colecao.add("Allan");
        colecao.add("Alice");

        for (Object obj : colecao) {
            //Exibe Alexandre, Allan e Alice
            System.out.println(obj);
        }

        System.out.println(colecao.size()); //Exibe 3
    }
}
