package jornada.java.aplicacao.app;

import jornada.java.aplicacao.interno.Celular;

public class Aplicacao {

	public static void main(String[] args) {
		Celular celular = new Celular();
		celular.realizeLigacao("61999999999");
		celular.falePor(3);
		celular.encerreLigacao();
	}
	
}
