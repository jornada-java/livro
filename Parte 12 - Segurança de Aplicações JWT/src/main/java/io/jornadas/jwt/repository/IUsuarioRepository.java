package io.jornadas.jwt.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import io.jornadas.jwt.model.Usuario;

@Component
public interface IUsuarioRepository {

	Usuario procurarPorLoginESenha(String login, String senha);

	List<Usuario> buscarTodos();

	Usuario procuparPorId(Long id);

}
