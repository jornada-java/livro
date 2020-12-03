package io.jornadas.jwt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.jornadas.jwt.dto.LoginDTO;
import io.jornadas.jwt.exception.NotFoundException;
import io.jornadas.jwt.model.Usuario;
import io.jornadas.jwt.security.JWTToken;
import io.jornadas.jwt.security.JWTUtil;
import io.jornadas.jwt.service.ILoginService;
import io.jornadas.jwt.service.IUsuarioService;

@Service
public class LoginService implements ILoginService {

    @Autowired
    private IUsuarioService usuarioService;

    @Override
    public JWTToken login(LoginDTO dto) throws NotFoundException {
        if (dto.getLogin().equals("jornada.colaborativa") && dto.getSenha().equals("123456")) {
            Usuario usuario = this.usuarioService.buscarUsuarioPorLoginESenha(dto.getLogin(), dto.getSenha());
            return new JWTToken(JWTUtil.gerarToken(usuario));
        }
        throw new NotFoundException("Login ou senha não encontrado");
    }
}
