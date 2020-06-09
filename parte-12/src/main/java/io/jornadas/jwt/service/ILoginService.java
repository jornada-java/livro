package io.jornadas.jwt.service;

import org.springframework.stereotype.Component;

import io.jornadas.jwt.dto.LoginDTO;
import io.jornadas.jwt.exception.NotFoundException;
import io.jornadas.jwt.security.JWTToken;

@Component
public interface ILoginService {

	JWTToken login(LoginDTO dto) throws NotFoundException;

}
