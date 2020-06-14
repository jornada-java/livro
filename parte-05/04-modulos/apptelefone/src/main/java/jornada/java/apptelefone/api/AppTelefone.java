package jornada.java.apptelefone.api;

import java.util.ServiceLoader;

import jornada.java.apptelefone.interno.LinhaTelefonica;
import jornada.java.auditoria.servico.Auditoria;

public class AppTelefone {

    private LinhaTelefonica linhaTelefonica = new LinhaTelefonica();

    private Auditoria auditoria = ServiceLoader.load(Auditoria.class).findFirst().get();

    private boolean iniciado = false;

    public void inicieApp() {
        System.out.println("Iniciando App Telefone!");
        iniciado = true;
    }

    public void disqueNumero(String numero) {
        if (!iniciado) {
            throw new IllegalStateException("O app não está iniciado!");
        }

        linhaTelefonica.conecteNaRede();
        linhaTelefonica.espereSinal();
        System.out.println("Dicando para " + numero);
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Conectado com " + numero);

        auditoria.registre("Atenção! Foi realizada uma chamada para o número " + numero);
    }

    public void feche() {
        linhaTelefonica.desconecteDaRede();
        System.out.println("Fechando App Telefone!");
        iniciado = false;
    }

}
