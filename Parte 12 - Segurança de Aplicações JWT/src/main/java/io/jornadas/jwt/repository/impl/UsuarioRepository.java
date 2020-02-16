package io.jornadas.jwt.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import io.jornadas.jwt.model.Usuario;
import io.jornadas.jwt.repository.IUsuarioRepository;

@Repository
public class UsuarioRepository implements IUsuarioRepository {

	@Override
	public Usuario procurarPorLoginESenha(String login, String senha) {
		return new Usuario(1l, "Jornada Colaborativa", "jornada.colaborativa", "contato@jornadas.io");
	}

	@Override
	public List<Usuario> buscarTodos() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario(1l, "Jornada Colaborativa", "jornada.colaborativa", "contato@jornadas.io"));
		usuarios.add(new Usuario(2l, "Bruno Kaufmann", "bruno.kaufmann", "bruno.kaufmann@jornadas.io"));
		usuarios.add(new Usuario(3l, "Jonas Santos", "jonas.santos", "jonas.santos@jornadas.io"));
		return usuarios;
	}

	@Override
	public Usuario procuparPorId(Long id) {
		return this.buscarTodos().stream().filter(usuario -> usuario.getId().equals(id)).collect(Collectors.toList())
				.get(0);
	}

}
