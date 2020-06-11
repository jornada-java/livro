import jornada.java.auditoria.impl.AuditoriaImpl;
import jornada.java.auditoria.servico.Auditoria;

//open module auditoria {
module auditoria {
	
	requires auditoriaservico;
	
	provides Auditoria with AuditoriaImpl;
	
//	opens jornada.java.auditoria.impl;
//	opens jornada.java.auditoria.impl to apptelefone;

}