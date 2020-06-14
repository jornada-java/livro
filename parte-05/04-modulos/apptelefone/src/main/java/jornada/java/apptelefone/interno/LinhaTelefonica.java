package jornada.java.apptelefone.interno;

public class LinhaTelefonica {

    public void conecteNaRede() {
        System.out.println("Conectando na rede telefônica.");
    }

    public void espereSinal() {
        System.out.println("Esperando sinal de linha.");
        try {
            Thread.sleep(1000);
            System.out.println("Sinal obtido!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void desconecteDaRede() {
        System.out.println("Desconectado da rede telefônica.");
    }

}
