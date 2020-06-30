package com.jornadajava.demo.persistence;

import com.jornadajava.demo.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {

}

