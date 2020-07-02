package com.jornadajava;

public class Teste {
    public static void main(final String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Tatiana";
        System.out.println(p1.nome + " - " + Pessoa.contador);

        Pessoa p2 = new Pessoa();
        p2.nome = "Rubens";
        System.out.println(p2.nome + " - " + Pessoa.contador);

    }
}
