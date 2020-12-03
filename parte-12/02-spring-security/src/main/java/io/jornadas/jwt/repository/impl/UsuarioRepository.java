package io.jornadas.jwt.repository.impl;

import java.util.Arrays;
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
    public Usuario procurarPorLogin(String login) {
        return this.buscarTodos().stream().filter(usuario -> usuario.getLogin().equals(login)).collect(Collectors.toList())
                .get(0);
    }

    @Override
    public List<Usuario> buscarTodos() {
        return Arrays.asList(
                new Usuario(1l, "Jornada Colaborativa", "jornada.colaborativa", "contato@jornadas.io"),
                new Usuario(2l, "Bruno Kaufmann", "bruno.kaufmann", "bruno.kaufmann@jornadas.io"),
                new Usuario(3l, "Jonas Santos", "jonas.santos", "jonas.santos@jornadas.io"));
    }

    @Override
    public Usuario procuparPorId(Long id) {
        return this.buscarTodos().stream().filter(usuario -> usuario.getId().equals(id)).collect(Collectors.toList())
                .get(0);
    }

}
