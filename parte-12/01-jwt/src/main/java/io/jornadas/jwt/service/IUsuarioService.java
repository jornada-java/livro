package io.jornadas.jwt.service;

import org.springframework.stereotype.Component;

import io.jornadas.jwt.dto.LoginDTO;
import io.jornadas.jwt.model.Usuario;

@Component
public interface IUsuarioService {

	Usuario buscarUsuarioPorLogin(LoginDTO dto);

	Usuario buscarPorToken(String token);

}
