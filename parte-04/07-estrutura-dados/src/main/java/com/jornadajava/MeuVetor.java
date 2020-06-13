package com.jornadajava;

import java.util.List;
import java.util.Vector;

public class MeuVetor {
    public static void main(String[] args) {
        List colecao = new Vector();

        colecao.add("Allan");
        colecao.add("Rodrigo");
        colecao.add("Leite");

        colecao.remove(1);

        System.out.println(colecao.get(0)); //Exibe Allan
        System.out.println(colecao.size()); //Exibe 2
    }
}
