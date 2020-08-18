import java.io.IOException;

public class SistemaEnvio {

    public static void main(String[] args) {
        EnviaArquivoPorEmail envia = new EnviaArquivoPorEmail();
        try {
            envia.enviarArquivoPara("aaaaa@aaaa.com", "caminho arquivo"
                    , "Assunto", "Corpo do email");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }

}
