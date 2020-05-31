package com.jornadajava;

public class OperadorRelacional {

    public static void main(String[] args) {
        int valorA = 10;
        int valorB = 11;

        if (valorA > valorB) {
            System.out.println("Maior");
        }

        if (valorA >= valorB) {
            System.out.println("Maior ou igual");
        }

        if (valorA < valorB) {
            System.out.println("Menor");
        }

        if (valorA <= valorB) {
            System.out.println("Menor ou igual");
        }
    }
}
