package com.jornadajava;

import java.util.Map;
import java.util.TreeMap;

public class MeuTreeMap {
    public static void main(String[] args) {
        Map mapa = new TreeMap();

        mapa.put("Alexandre", 1);
        mapa.put("Allan", 2);
        mapa.put("Alice", 3);

        for (Object chave : mapa.keySet()) {
            //Exibe Alexandre: 1, Alice: 3 e Allan: 2
            System.out.println(chave + ": " + mapa.get(chave));
        }

        System.out.println(mapa.size()); //Exibe 3
    }
}
