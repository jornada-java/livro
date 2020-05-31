package com.jornadajava;

public class OperadorAtribuicao2 {

    public static void main(String[] args) {
        int numero = 15;
        System.out.println(numero++);
        //o valor impresso acima será de 15, pois o incremento será feito depois da impressão

        System.out.println(numero);
        //o valor impresso acima será 16, pois numero já foi incrementado

        System.out.println(++numero);

    }
}
