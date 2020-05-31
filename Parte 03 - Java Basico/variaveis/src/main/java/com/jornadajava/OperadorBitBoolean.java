package com.jornadajava;

public class OperadorBitBoolean {

    public static void main(String[] args) {
        boolean valor1 = true;
        boolean valor2 = false;

        System.out.println(valor1 && valor2);
        System.out.println(valor1 & valor2);
        System.out.println(valor1 | valor2);
        System.out.println(valor1 || valor2);

        System.out.println(valor2 && valor1);
        System.out.println(valor2 & valor1);
        System.out.println(valor2 | valor1);
        System.out.println(valor2 || valor1);

    }
}
