import java.io.File;
import java.io.IOException;

public class Arquivo {

    public void enviarArquivoPara(String email, String caminhoArquivo, String assunto, String texto) throws IOException, MailException {
        File arquivo = getFileReader().ler(caminhoArquivo);
        getEmailSender().send(email, assunto, texto, arquivo);
    }

    private SendEmail getEmailSender() {
        return new SendEmail();
    }

    private FileReader getFileReader() {
        return new FileReader();
    }

}
