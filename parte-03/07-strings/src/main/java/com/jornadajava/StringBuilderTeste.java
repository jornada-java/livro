package com.jornadajava;

public class StringBuilderTeste {
    public static void main(String[] args) {
        StringBuilder nome = new StringBuilder("Oswaldo"); // instanciar
        StringBuilder apelido = nome; // copiar a referência
        nome.reverse(); // efetuar uma operação qualquer
        // imprimir o resultado
        System.out.printf("Nome: %s \n", nome.toString());
        System.out.printf("Apelido: %s \n", apelido.toString());
    }
}
