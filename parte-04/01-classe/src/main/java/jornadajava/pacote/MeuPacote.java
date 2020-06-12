package jornadajava.pacote;

public class MeuPacote {
    public static void main(String[] args) {
        //Exibe o diretório absoluto do projeto
        System.out.println(System.getProperty("java.class.path"));

        //Exibe o diretório absoluto da classe, considerando o pacote
        System.out.println(MeuPacote.class.getResource("MeuPacote.class"));
    }
}
