import java.io.File;
import java.io.IOException;

public class EnviaArquivoPorEmail {

    public void enviarArquivoPara(String email, String caminhoArquivo, String assunto, String texto) throws IOException, EmailException {
        File arquivo = getLeitorArquivo().ler(caminhoArquivo);
        getEnviaEmail().envia(email, assunto, texto, arquivo);
    }

    private EnviaEmail getEnviaEmail() {
        return new EnviaEmail();
    }

    private LeitorArquivo getLeitorArquivo() {
        return new LeitorArquivo();
    }

}
