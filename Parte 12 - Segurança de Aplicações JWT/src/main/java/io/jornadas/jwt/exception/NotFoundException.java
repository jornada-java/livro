package io.jornadas.jwt.exception;

public class NotFoundException extends Exception {
	private static final long serialVersionUID = -9079454849611061074L;

	public NotFoundException() {
		super();
	}

	public NotFoundException(final String mensagem) {
		super(mensagem);
	}
}
