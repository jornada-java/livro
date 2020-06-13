package com.jornadajava;

import java.util.ArrayList;
import java.util.List;

public class MeuForeach {
    public static void main(String[] args) {
        List colecao = new ArrayList();

        colecao.add("Allan");
        colecao.add("Rodrigo");
        colecao.add("Leite");

        for (Object object : colecao) {
            //Exibe Allan, Rodrigo, Leite
            System.out.println(object);
        }
    }
}
