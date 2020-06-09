package com.jornada.demo.persistence;

import org.springframework.data.repository.CrudRepository;

import com.jornada.demo.domain.Usuario;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {

}

