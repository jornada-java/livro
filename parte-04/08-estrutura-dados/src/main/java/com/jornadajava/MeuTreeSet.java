package com.jornadajava;

import java.util.Set;
import java.util.TreeSet;

public class MeuTreeSet {
    public static void main(String[] args) {
        Set colecao = new TreeSet();

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
