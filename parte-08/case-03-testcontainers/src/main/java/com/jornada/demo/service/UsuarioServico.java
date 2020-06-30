package com.jornada.demo.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jornada.demo.domain.Usuario;
import com.jornada.demo.persistence.UsuarioRepositorio;

@Service
public class UsuarioServico {

    private UsuarioRepositorio usuarioRepositorio;
    private UsuarioExterno usuarioExterno;

    public UsuarioServico(UsuarioRepositorio usuarioRepositorio, UsuarioExterno usuarioExterno) {
        this.usuarioRepositorio = usuarioRepositorio;
        this.usuarioExterno = usuarioExterno;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Usuario criar(Usuario usuario) throws Exception {
        if (!usuario.getContatos().isEmpty()) {
            usuario.getContatos().stream().forEach(contato -> contato.setUsuario(usuario));
        }
        Usuario usuarioCriado = usuarioRepositorio.save(usuario);

        //Cria o usuário no serviço externo
        try {
            criaUsuarioNoServicoExterno(usuarioCriado);
        } catch (Exception e) {
            throw e;
        }

        return usuarioCriado;
    }

    /**
     * Cria usuário no sistema externo
     */
    private void criaUsuarioNoServicoExterno(Usuario usuario) throws Exception {
        usuarioExterno.criaUsuario(usuario);
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
