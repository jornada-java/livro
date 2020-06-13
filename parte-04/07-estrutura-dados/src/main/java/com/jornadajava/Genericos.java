package com.jornadajava;

import java.util.ArrayList;
import java.util.List;

public class Genericos {
    public static void main(String[] args) {
        List<String> colecao = new ArrayList<>();

        colecao.add("Allan");
        colecao.add("Rodrigo");
        //Erro de compilação na próxima linha, tipo incompatível
        //colecao.add(123);
    }

}
