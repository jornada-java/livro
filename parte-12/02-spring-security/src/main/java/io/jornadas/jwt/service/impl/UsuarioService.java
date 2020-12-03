package io.jornadas.jwt.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import io.jornadas.jwt.model.Usuario;
import io.jornadas.jwt.repository.IUsuarioRepository;
import io.jornadas.jwt.security.JWTUtil;
import io.jornadas.jwt.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {

    private IUsuarioRepository usuarioRepository;

    public UsuarioService(IUsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario buscarUsuarioPorLoginESenha(String login, String senha) {
        return usuarioRepository.procurarPorLoginESenha(login, senha);
    }

    @Override
    public Usuario buscarPorToken(String token) {
        return usuarioRepository.procuparPorId(JWTUtil.recuperaIdUsuario(token));
    }

    @Override
    public List<Usuario> buscarTodos() {
        return usuarioRepository.buscarTodos();
    }

}
