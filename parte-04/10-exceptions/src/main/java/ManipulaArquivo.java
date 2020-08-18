import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ManipulaArquivo {

    public String lerConteudo(File arquivo) throws IOException {
        return new String(new FileInputStream(arquivo).readAllBytes());
    }

    public void gravarConteudo(File arquivo, String conteudo) throws IOException {
        if (conteudo == null) {
            throw new NullPointerException("Conteúdo não pode ser nulo!");
        }
        new FileOutputStream(arquivo).write(conteudo.getBytes());
    }

    public static void main(String[] args) throws IOException {
        ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
        String caminhoArquivo = null;
        try {
            caminhoArquivo = "/tmp/teste.txt";
            manipulaArquivo.gravarConteudo(new File(caminhoArquivo), null);
        } catch (NullPointerException | FileNotFoundException e) {
            if (e instanceof NullPointerException) {
                e.printStackTrace();
            }
            if (e instanceof FileNotFoundException) {
                caminhoArquivo = "/tmp/teste1.txt";
                manipulaArquivo.gravarConteudo(new File(caminhoArquivo), "Conteudo do arquivo");
            }
        } catch (IOException e) {
            throw e;
        }
        System.out.println("Conteudo gravado no arquivo " + caminhoArquivo);
    }
}
