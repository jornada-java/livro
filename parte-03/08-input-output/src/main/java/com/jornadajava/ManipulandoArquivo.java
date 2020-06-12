package com.jornadajava;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ManipulandoArquivo {
    public static void main(String[] args) {
        Path diretorioCorrente = Paths.get("");
        String diretorioDoArquivo = diretorioCorrente.toAbsolutePath().toString() +
                "/parte-03/08-input-output/src/main/java/com/jornadajava/";
        try {
            File origem = new File(diretorioDoArquivo + "arquivo_original.txt");
            File alvo = new File(diretorioDoArquivo + "duplicata.txt");
            Files.copy(origem.toPath(), alvo.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
