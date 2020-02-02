package com.jornada.demo.service;

import com.jornada.demo.domain.Usuario;
import com.jornada.demo.persistence.UsuarioRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
public class UsuarioServico {

    private UsuarioRepositorio usuarioRepositorio;

    public UsuarioServico(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Usuario criar(Usuario usuario) {
        if(!usuario.getContatos().isEmpty()){
            usuario.getContatos().stream().forEach(contato -> contato.setUsuario(usuario));
        }
        return usuarioRepositorio.save(usuario);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public Usuario buscarPeloId(Long id) {
        return usuarioRepositorio.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Usuário não encontrado com id: " + id));
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void remover(Long id) {
        usuarioRepositorio.delete(buscarPeloId(id));
    }
}
