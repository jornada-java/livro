package com.jornadajava;

import java.util.LinkedList;
import java.util.List;

public class MeuLinkedList {
    public static void main(String[] args) {
        List colecao = new LinkedList();

        colecao.add("Allan");
        colecao.add("Rodrigo");
        colecao.add("Leite");

        colecao.remove(1);

        System.out.println(colecao.get(0)); //Exibe Allan
        System.out.println(colecao.size()); //Exibe 2
    }
}
