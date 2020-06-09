package com.jornadajava;

public class ControleFluxo {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        if ((num1 == (num2 * 2)) && (num2 == (num1 - 5))) {
            System.out.println("As expressões são verdadeiras");
        }

        if ((num1 == (num2 + 2)) || (num2 == (num1 - 2))) {
            System.out.println("Somente uma das opções é verdadeira");
        }
    }
}
