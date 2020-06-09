package com.jornadajava;

public class ControleFluxo3 {

    public static void main(String[] args) {
        int numero;
        for (numero = 0; numero < 15; numero++) {
            System.out.println("Valor: " + numero);
            //serão impressos os valores diferentes de 10 (de 1 até 15)
            if (numero == 10) {
                break;
            }
        }
        System.out.println("Valor fora do laço: " + numero);
    }
}
