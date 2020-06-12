package com.jornadajava;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        // Abre um canal de leitura padrão do sistema e aguarda.
        Scanner scanner = new Scanner(System.in);
        // Mostra um informação na tela para o usuário saber o que se espera
        System.out.println("Qual o nome do seu animal de estimação?");
        // Efetua a operação de leitura de toda a linha digitada
        String input = scanner.nextLine();
        // Informa ao usuário o dado lido
        System.out.printf("A sua resposta foi: %s\n", input);
        // Fecha o canal de leitura
        scanner.close();
    }
}
