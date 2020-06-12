package com.jornadajava;

import java.io.File;
import java.util.Scanner;

public class LeituraArquivo2 {
    public static void main(String[] args) {
        try {
            // Criar uma referência ao arquivo desejado
            // utilizando a classe java.io.File
            File arquivo = new File("caminho/do/arquivo.txt");
            System.out.printf("Buscando %s\n", arquivo.getAbsolutePath());
            // Verificamos se o arquivo existe e é realmente um arquivo
            if (arquivo.exists() && arquivo.isFile()) {
                try (Scanner scanner = new Scanner(arquivo)) {
                    while (scanner.hasNextLine()) {
                        System.out.println(scanner.nextLine());
                    }
                }
            } else {
                // Caso o arquivo não exista ou esteja apontando para um diretório,
                // emitimos um alerta ao usuário com uma mensagem clara
                System.out.println("Arquivo informado não existe ou não é um arquivo");
            }
        } catch (Exception ex) {
            // Qualquer outro tipo de exceção que ocorra,
            // informaremos ao usuário o erro.
            ex.printStackTrace();
        }
    }
}
