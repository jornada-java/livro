package com.jornadajava;

import java.util.LinkedHashMap;
import java.util.Map;

public class MeuLinkedHashMap {
    public static void main(String[] args) {
        Map mapa = new LinkedHashMap();

        mapa.put("Alexandre", 1);
        mapa.put("Allan", 2);
        mapa.put("Alice", 3);

        for (Object chave : mapa.keySet()) {
            //Exibe Alexandre: 1, Allan: 2 e Alice: 3
            System.out.println(chave + ": " + mapa.get(chave));
        }

        System.out.println(mapa.size()); //Exibe 3
    }
}
