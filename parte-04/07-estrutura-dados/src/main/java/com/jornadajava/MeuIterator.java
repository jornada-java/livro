package com.jornadajava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MeuIterator {
    public static void main(String[] args) {
        List colecao = new ArrayList();

        colecao.add("Allan");
        colecao.add("Rodrigo");
        colecao.add("Leite");

        for (Iterator it = colecao.iterator(); it.hasNext(); ) {
            String object = (String) it.next();

            //Exibe Allan, Rodrigo, Leite
            System.out.println(object);

            if ("Rodrigo".equals(object)) {
                it.remove();
            }
        }

        System.out.println(colecao.size()); //Exibe 2
    }

}
