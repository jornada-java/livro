package io.jornadas.jwt.service;

import java.util.List;

import org.springframework.stereotype.Component;

import io.jornadas.jwt.dto.LoginDTO;
import io.jornadas.jwt.model.Usuario;

@Component
public interface IUsuarioService {

	Usuario buscarUsuarioPorLoginESenha(String login, String senha);

	Usuario buscarPorToken(String token);

	List<Usuario> buscarTodos();
}
