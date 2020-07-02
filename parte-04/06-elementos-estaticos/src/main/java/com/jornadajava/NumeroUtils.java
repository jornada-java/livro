package com.jornadajava;

public class NumeroUtils {
    public static void comparaDoisInts(int int1, int int2) {
        if (int1 == int2) {
            System.out.println("Os números são iguais.");
        } else if (int1 > int2) {
            System.out.println("O primeiro número é maio.");
        } else if (int1 < int2) {
            System.out.println("O segundo número é maior.");
        }
    }
}
