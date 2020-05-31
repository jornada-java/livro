package com.jornadajava;

public class Operadores {

    public static void main(String[] args) {
        int idade = 18;

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        if (idade >= 18) {
            System.out.println("Adulto");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Criança");
        }

        System.out.println((idade >= 18) ? "Maior de idade" : "Menor de idade");

    }
}
