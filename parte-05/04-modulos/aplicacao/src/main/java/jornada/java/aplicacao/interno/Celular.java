package jornada.java.aplicacao.interno;

import jornada.java.apptelefone.api.AppTelefone;

public class Celular {

	private AppTelefone appTelefone = new AppTelefone();
	
	public void realizeLigacao(String numero) {
		System.out.println("Utilizando celular para realizando ligação.");
		appTelefone.inicieApp();
		appTelefone.disqueNumero(numero);
	}

	public void encerreLigacao() {
		System.out.println("Encerrando ligação no celular.");
		appTelefone.feche();
	}

	public void falePor(int i) {
		System.out.println("Conversando por " + i + " segundos.");
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
