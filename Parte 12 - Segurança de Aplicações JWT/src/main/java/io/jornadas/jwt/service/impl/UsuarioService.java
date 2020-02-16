package io.jornadas.jwt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.jornadas.jwt.dto.LoginDTO;
import io.jornadas.jwt.model.Usuario;
import io.jornadas.jwt.repository.IUsuarioRepository;
import io.jornadas.jwt.security.JWTUtil;
import io.jornadas.jwt.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public Usuario buscarUsuarioPorLogin(LoginDTO dto) {
		return this.usuarioRepository.procurarPorLoginESenha(dto.getLogin(), dto.getSenha());
	}

	@Override
	public Usuario buscarPorToken(String token) {
		return this.usuarioRepository.procuparPorId(JWTUtil.recuperaIdUsuario(token));
	}

}
