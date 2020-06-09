package com.jornadajava.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.RestAssured;
import com.jornadajava.demo.domain.Contato;
import com.jornadajava.demo.domain.TipoTelefoneEnum;
import com.jornadajava.demo.domain.Usuario;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UsuarioControllerIT {

    @LocalServerPort
    private int port;

    @Before
    public void setUp() {
        RestAssured.port = port;
    }

    /**
     * Utilizando Map como entrada
     */
    @Test
    public void quandoCriarUsuarioEntaoRetornaObjetoUsuario() {

        Map<String, String> usuarioMap = new HashMap<>();
        usuarioMap.put("nome", "Forrest");
        usuarioMap.put("sobrenome", "Gump");
        usuarioMap.put("idade", String.valueOf(20));

        given()
                .header("Content-Type", "application/json")
                .body(usuarioMap)//o Rest Assured faz a "conversão" para JSON de forma automática.
                .when()
                .post("/usuarios")
                .then()
                .statusCode(HttpStatus.CREATED.value())
                .body("id", notNullValue())
                .body("nome", equalTo("Forrest"))
                .body("sobrenome", equalTo("Gump"))
                .body("idade", equalTo(20))
                .body("contatos", empty());
    }

    /**
     * Utilizando Objeto java como entrada
     */
    @Test
    public void quandoCriarUsuarioComContatoEntaoRetornaObjetoComListaContatos() throws JsonProcessingException {
        Usuario usuario = montarObjetoUsuarioParaCriacao("Forrest", "Gump", 50, TipoTelefoneEnum.CELULAR, "1234-5678");
        //Isto é somente para visualizarmos o JSON que será enviado no corpo da nossa requisição
        String result = new ObjectMapper().writeValueAsString(usuario);
        System.out.println("JSON -> " + result);

        given()
                .header("Content-Type", "application/json")
                .body(usuario)//o Rest Assured faz a "conversão" para JSON de forma automática.
                .when()
                .post("/usuarios")
                .then()
                .statusCode(HttpStatus.CREATED.value())
                .body("id", notNullValue())
                .body("nome", equalTo("Forrest"))
                .body("sobrenome", equalTo("Gump"))
                .body("idade", equalTo(50))
                .body("contatos[0].id", notNullValue())
                .body("contatos[0].tipo", equalTo("CELULAR"))
                .body("contatos[0].telefone", equalTo("1234-5678"));
    }

    @Test
    public void quandoBuscarPeloIdValidoEntaoRetornaUsuario() {
        Usuario usuarioCriado = criarUsuarioPelaAPI();
        given()
                .when()
                .get("/usuarios/".concat(usuarioCriado.getId().toString()))
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("id", equalTo(usuarioCriado.getId().intValue()))
                .body("nome", equalTo("Joseph"))
                .body("sobrenome", equalTo("Cooper Murphy"))
                .body("idade", equalTo(50))
                .body("contatos[0].id", notNullValue())
                .body("contatos[0].tipo", equalTo("CELULAR"))
                .body("contatos[0].telefone", equalTo("1234-5678"));
    }

    /**
     * O teste valida a mensagem e o código de erro que veio do servidor.
     * <p>
     * Note que está retornando o erro 500 pois não tratamos os erros de API (4XX e 5XX) neste projeto de demonstração.
     * O ideal é possuir um tratamento de exceções HTTP e filtros para padronização das mensagens de erros.
     */
    @Test
    public void quandoBuscarPeloIdInvalidoEntaoRetornaErro() {
        given()
                .when()
                .get("/usuarios/99999999")
                .then()
                .statusCode(500)
                .body("message", equalTo("Usuário não encontrado com id: 99999999"));
    }

    private Usuario montarObjetoUsuarioParaCriacao(String nome, String sobrenome, int idade, TipoTelefoneEnum tipo, String telefone) {
        Usuario usuario = new Usuario(nome, sobrenome, idade);
        Contato contato = new Contato();
        contato.setTipo(tipo);
        contato.setTelefone(telefone);
        contato.setUsuario(usuario);
        usuario.getContatos().add(contato);
        return usuario;
    }

    private Usuario criarUsuarioPelaAPI() {
        Usuario usuario = montarObjetoUsuarioParaCriacao("Joseph", "Cooper Murphy", 50, TipoTelefoneEnum.CELULAR, "1234-5678");
        return given()
                .header("Content-Type", "application/json")
                .body(usuario) //a biblioteca faz a "conversão" para JSON de forma automática.
                .when()
                .post("/usuarios")
                .body()
                .as(Usuario.class);
    }
}
