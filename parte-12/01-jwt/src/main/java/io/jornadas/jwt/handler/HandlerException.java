package io.jornadas.jwt.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;

import io.jornadas.jwt.exception.ErroResponse;
import io.jornadas.jwt.exception.NotFoundException;

@ControllerAdvice
public class HandlerException extends ResponseEntityExceptionHandler {

	@ResponseBody
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	@ExceptionHandler(TokenExpiredException.class)
	public ErroResponse handlerExpired(TokenExpiredException ex) {
		return new ErroResponse(HttpStatus.UNAUTHORIZED, ex.getMessage());
	}

	@ResponseBody
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	@ExceptionHandler(JWTVerificationException.class)
	public ErroResponse handlerUnauthorized(JWTVerificationException ex) {
		return new ErroResponse(HttpStatus.UNAUTHORIZED, ex.getMessage());
	}

	@ResponseBody
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(NotFoundException.class)
	public ErroResponse handlerNotFound(NotFoundException ex) {
		return new ErroResponse(HttpStatus.NOT_FOUND, ex.getMessage());
	}
}
