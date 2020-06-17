import java.io.File;
import java.io.IOException;

public class FileReader {
    public File ler(String caminhoArquivo) throws IOException {
        return new File(caminhoArquivo);
    }
}
