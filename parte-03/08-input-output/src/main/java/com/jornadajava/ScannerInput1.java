package com.jornadajava;

import java.util.Scanner;

public class ScannerInput1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual o nome do seu animal de estimação?");
            String input = scanner.nextLine();
            System.out.printf("A sua resposta foi: %s\n", input);
        }
    }
}
