package com.jornadajava;

import java.util.ArrayList;
import java.util.List;

public class MeuArrayList {
    public static void main(String[] args) {
        List colecao = new ArrayList();

        colecao.add("Allan");
        colecao.add("Rodrigo");
        colecao.add("Leite");

        colecao.remove(1);

        System.out.println(colecao.get(0)); //Exibe Allan
        System.out.println(colecao.size()); //Exibe 2
    }
}
