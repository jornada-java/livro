package com.jornadajava;

public class InstanciaString {

    public static void main(String[] args) {
        String nome = "Oswaldo"; // instanciar
        String apelido = nome; // copiar a referência
        nome = nome.replace("s", "x"); // efetuar uma operação qualquer
        // imprimir o resultado
        System.out.printf("Nome: %s \n", nome);
        System.out.printf("Apelido: %s \n", apelido);
    }
}
