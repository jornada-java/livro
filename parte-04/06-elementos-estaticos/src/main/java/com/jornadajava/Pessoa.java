package com.jornadajava;

public class Pessoa {
    static {
        System.out.println("Bloco estático");
    }

    static int contador;
    String nome;

    public Pessoa() {
        System.out.println("Nova pessoa");
        contador++;
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
    }
}
