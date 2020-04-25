package com.jornadacolaborativa;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TesteExemplo {

    @BeforeAll
    static void executarAntesDeTodosOsTestes() {
        //@BeforeAll: define um método que é executado antes de todo o conjunto de testes da classe.
    }

    @BeforeEach
    void executarAntesDeCadaTeste() {
        //@BeforeEach: define um método que é executado antes de cada um dos testes.
    }

    @Test
    public void test1() {
    }

    @Test
    @DisplayName("TESTE 2")
    @Tag("minha-tag")
    public void test2() {
        //@DisplayName(String): usada para dar um nome (String) para o teste,
        //  que aparecerá em relatórios, logs… Podem ser usados inclusive emojis e caracteres especiais.
        //@Tag: marca o método, ou até mesmo a classe inteira com um identificador (tag),
        //  que depois pode ser usado para selecionar, filtrar, e executar testes de maneira automática.
    }

    @Test
    void testeQueFalha() {
        //fail: método utilizado para sinalizar uma falha no teste
        fail("um teste que falha");
    }

    @Test
    @Disabled("para propósito de demonstração")
    void testeDesabilitado() {
        //@Disabled(String): desabilita um teste ou uma classe de teste inteira
    }

    @Test
    void testeAbortado() {
        //assumeTrue(argumento): método que estabelece uma condição para que o teste continue.
        // Nesse caso, assumeTrue checa se o argumento é True, caso contrário o teste é abortado
        assumeTrue("abc".contains("Z"));
        fail("Teste deveria ser abortado");
    }

    @AfterEach
    void executarDepoisDeCadaTeste() {
        //@AfterEach: define um método que é executado depois de cada um dos testes.
    }

    @AfterAll
    static void executarDepoisDeTodosOsTestes() {
        //@AfterAll: define um método que é executado depois de todo o conjunto de testes.
    }

}
