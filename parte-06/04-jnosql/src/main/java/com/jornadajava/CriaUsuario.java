package com.jornadajava;

import java.util.Optional;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import jakarta.nosql.mapping.keyvalue.KeyValueTemplate;

public class CriaUsuario {

    public static void main(String[] args) {

        Usuario usuario = UsuarioBuilder.of()
                .id("01")
                .nome("Usuario 01")
                .telefone("000000000000")
                .build();

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            KeyValueTemplate template = container.select(KeyValueTemplate.class).get();
            Usuario usuarioSalvo = template.put(usuario);
            System.out.println("Usuario Salvo: " + usuarioSalvo);
            Optional<Usuario> usuarioBusca = template.get("01", Usuario.class);
            System.out.println("Usuario Encontrado: " + usuarioBusca);

        }
    }
}
