package com.jornadajava;

import java.util.HashMap;
import java.util.Map;

public class MeuHashMap {
    public static void main(String[] args) {
        Map mapa = new HashMap();

        mapa.put("Alexandre", 1);
        mapa.put("Allan", 2);
        mapa.put("Alice", 3);

        for (Object chave : mapa.keySet()) {
            //Exibe Alice: 3, Alexandre: 1 e Allan: 2
            System.out.println(chave + ": " + mapa.get(chave));
        }

        System.out.println(mapa.size()); //Exibe 3
    }

}
