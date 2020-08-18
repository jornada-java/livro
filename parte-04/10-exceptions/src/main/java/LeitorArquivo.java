import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeitorArquivo {

    public File ler(String caminhoArquivo) throws IOException {
        File arquivo = new File(caminhoArquivo);
        if (!arquivo.exists()) {
            throw new FileNotFoundException("Arquivo não existe!");
        }
        return arquivo;
    }

}
