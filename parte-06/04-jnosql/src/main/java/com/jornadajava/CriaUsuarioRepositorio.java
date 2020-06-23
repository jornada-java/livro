package com.jornadajava;

import java.util.Optional;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import org.eclipse.jnosql.artemis.DatabaseQualifier;

public class CriaUsuarioRepositorio {

    public static void main(String[] args) {

        Usuario usuario = UsuarioBuilder.of()
                .id("01")
                .nome("Usuario 01")
                .telefone("000000000000")
                .build();

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            UsuarioRepositorio repositorio = container.select(UsuarioRepositorio.class, DatabaseQualifier.ofKeyValue()).get();
            repositorio.save(usuario);
            Optional<Usuario> usuarioSalvo = repositorio.findById("01");
            System.out.println("Usuario Salvo: " + usuarioSalvo);
        }

    }


}
