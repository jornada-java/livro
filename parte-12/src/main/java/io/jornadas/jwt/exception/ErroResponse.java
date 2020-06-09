package io.jornadas.jwt.exception;

import org.springframework.http.HttpStatus;

public class ErroResponse {

	private int status;
	private String mensagem;

	public ErroResponse(HttpStatus status, String mensagem) {
		this.status = status.value();
		this.mensagem = mensagem;
	}

	public int getStatus() {
		return status;
	}

	public String getMensagem() {
		return mensagem;
	}
}
