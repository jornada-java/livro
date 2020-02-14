package io.jornadas.jwt.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import io.jornadas.jwt.model.Usuario;

@Component
public interface IUsuarioRepository {

	Usuario findByLoginAndSenha(String login, String senha);

	List<Usuario> findAll();

	Usuario findById(Long id);

}
