import jornada.java.auditoria.servico.Auditoria;

module apptelefone {
	
	requires auditoriaservico;
	
//	exports jornada.java.apptelefone.api;
	exports jornada.java.apptelefone.api to aplicacao;
	
	uses Auditoria;
	
}