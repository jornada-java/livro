import java.io.File;

public class EnviaEmail {
    public void envia(String email, String assunto, String texto, File arquivo) throws EmailException {
        if (email == null || email.isBlank()) {
            throw new EmailException("Email inválido!");
        }
        if (assunto == null || assunto.isBlank()) {
            throw new EmailException("Assunto inválido!");
        }
        if (texto == null || texto.isBlank()) {
            throw new EmailException("Corpo do email inválido!");
        }
        System.out.println("EnviaEmail.envia");
    }
}



