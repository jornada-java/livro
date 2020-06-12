package com.jornadajava;

public class ForBreak {

    public static void main(String[] args) {
        int numero;
        for (numero = 0; numero < 15; numero++) {
            System.out.println("Valor: " + numero);
            //serão impressos os valores até 10 dentro do laço
            if (numero == 10) {
                break;
            }
        }
        System.out.println("Valor fora do laço: " + numero);
    }
}
