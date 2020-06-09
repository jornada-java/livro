package com.jornadajava;

public class OperadorBit {

    /**
     * Neste exemplo, vamos utilizar operadores bit a bit e curto circuito para verificar o seu funcionamento
     * As variáveis valor1 e valor2 são incrementadas antes de serem comparadas
     * Operadores bit a bit = & | ^
     * Operadores curto-circuito = && ||
     */
    public static void main(String[] args) {
        int valor1 = 0;
        int valor2 = 0;

        // Operador AND curto circuito
        // A segunda parte do if não vai ser verificada, pois a primeira parte já é false
        // então o valor1 vai ser zero
        System.out.println(false && ++valor1 > 0);
        System.out.println(valor1);

        // Operador AND bit a bit
        // A segunda parte será validada independente da primeira parte ser false
        // Então o valor1 será incrementado
        System.out.println(false & ++valor1 > 0);
        System.out.println(valor1);

        // Operador OR curto circuito
        // A segunda parte não será validada pois a primeira já é true
        // O valor1 não será incrementado
        System.out.println(true || ++valor1 > 0);
        System.out.println(valor1);

        System.out.println(true | ++valor1 > 0);
        System.out.println(valor1);

        System.out.println("---- Invertendo primeira parte ----");

        // Operador AND curto circuito
        // A segunda parte do if vai ser verificada, pois a primeira parte é true
        // Ainda precisa ser checada a segunda parte, pois ela pode ser false o que fará o resultado false
        // então o valor1 vai ser 1
        System.out.println(true && ++valor2 > 0);
        System.out.println(valor2);

        System.out.println(true & ++valor2 > 0);
        System.out.println(valor2);

        System.out.println(false || ++valor2 > 0);
        System.out.println(valor2);

        System.out.println(false | ++valor2 > 0);
        System.out.println(valor2);
    }
}
