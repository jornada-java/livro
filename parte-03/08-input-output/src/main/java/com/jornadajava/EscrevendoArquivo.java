package com.jornadajava;

import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EscrevendoArquivo {
    public static void main(String[] args) {

        Path diretorioCorrente = Paths.get("");
        String diretorioDoArquivo = diretorioCorrente.toAbsolutePath().toString() +
                "/parte-03/08-input-output/src/main/java/com/jornadajava/";

        String caminhoArquivoOrigem = diretorioDoArquivo + "arquivo_original.txt";
        String caminhoArquivoDestino = diretorioDoArquivo + "arquivo_destino.txt";

        // Quando recebemos e enviamos dados é sempre interessante
        // definir um mapeamento de caracteres (Charset).
        // Essa variável será utilizada tanto pelo Scanner quanto o FileWriter
        Charset charset = Charset.forName("UTF-8");

        try {
            File arquivo = new File(caminhoArquivoOrigem);
            System.out.printf("Buscando %s\n", arquivo.getAbsolutePath());

            if (arquivo.exists() && arquivo.isFile()) {

                try (Scanner scanner = new Scanner(arquivo, charset)) {
                    File saida = new File(caminhoArquivoDestino);

                    // Caso essa variável seja "true" o arquivo jamais será apagado e
                    // a informação sempre será acrescentada.
                    boolean adicionarDado = false;

                    try (FileWriter escritor = new FileWriter(saida, charset, adicionarDado)) {
                        while (scanner.hasNextLine()) {
                            // Uma operação qualquer. Nesse caso substituímos "a" por "@"
                            String linha = scanner.nextLine().replace("a", "@");
                            // Esse comando mandará nossa nova linha para o arquivo destino
                            escritor.append(linha);
                            // Quando o scanner lê a linha, ele não traz junto o caractere
                            // de nova linha (Enter). Estamos colocando ele aqui
                            escritor.append('\n');
                        }
                    }
                }
            } else {
                System.out.println("Arquivo informado não existe ou não é um arquivo");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
