package com.jornada.demo.service;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jornada.demo.domain.Usuario;

@Service
public class UsuarioExterno {

    private final RestTemplate restTemplate;

    public UsuarioExterno(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void criaUsuario(Usuario usuario) throws Exception {
        final String baseUrl = "http://servico-parceiro/api/usuarios";
        URI uri = new URI(baseUrl);
        ResponseEntity<?> result = restTemplate.postForEntity(uri, usuario, ResponseEntity.class);
        System.out.println(result.getStatusCodeValue());
    }
}
