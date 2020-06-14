package jornada.java.auditoria.impl;

import jornada.java.auditoria.servico.Auditoria;

public class AuditoriaImpl implements Auditoria {

	@Override
	public void registre(String mensagem) {
		System.out.println("Gravando log de auditoria! Registro: " + mensagem);
	}
	
}
