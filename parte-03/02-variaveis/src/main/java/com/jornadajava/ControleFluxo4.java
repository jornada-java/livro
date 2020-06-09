package com.jornadajava;

public class ControleFluxo4 {

    public static void main(String[] args) {
        int numero;
        for (numero = 0; numero < 100; numero++) {
            if (numero > 50 && numero < 60) {
                continue;
            }
            //não serão impressos os numeros entre 51 e 59
            System.out.println("Valor: " + numero);
        }
    }
}
