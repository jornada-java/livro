package com.jornadajava;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LeituraArquivo {
    public static void main(String[] args) {
        Path diretorioCorrente = Paths.get("");
        String diretorioDoArquivo = diretorioCorrente.toAbsolutePath().toString() +
                "/parte-03/08-input-output/src/main/java/com/jornadajava/";
        String arquivo = diretorioDoArquivo + "arquivo_original.txt";

        try (Scanner scanner = new Scanner(new File(arquivo))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
