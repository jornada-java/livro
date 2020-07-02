package com.jornadajava;

import java.util.HashSet;
import java.util.Set;

public class MeuHashSet {
    public static void main(String[] args) {
        Set colecao = new HashSet();

        colecao.add("Alexandre");
        colecao.add("Allan");
        colecao.add("Alice");

        for (Object obj : colecao) {
            //Exibe Alice, Alexandre e Allan
            System.out.println(obj);
        }

        System.out.println(colecao.size()); //Exibe 3
    }
}
