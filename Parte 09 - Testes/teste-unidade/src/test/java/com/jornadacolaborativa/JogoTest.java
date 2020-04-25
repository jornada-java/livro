package com.jornadacolaborativa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JogoTest {

    @Test
    void quandoUsuarioEscolheParEntaoVitoriaUsuario() {
        Jogo jogo = new Jogo();
        String escolhaUsuario = "par";
        int numUsuario = 2;
        int numComputador = 2;

        boolean vitoria = jogo.vitoriaUsuario(escolhaUsuario, numUsuario, numComputador);

        Assertions.assertEquals(vitoria, true);
    }

    @Test
    void quandoUsuarioEscolheParEntaoVitoriaComputador() {
        Jogo jogo = new Jogo();
        boolean vitoria = jogo.vitoriaUsuario("par", 2, 1);
        Assertions.assertEquals(vitoria, false);
    }

    @Test
    void quandoUsuarioEscolheImparEntaoVitoriaUsuario() {
        Jogo jogo = new Jogo();
        boolean vitoria = jogo.vitoriaUsuario("impar", 1, 2);
        Assertions.assertEquals(vitoria, true);
    }

    @Test
    void quandoUsuarioEscolheImparEntaoVitoriaComputador() {
        Jogo jogo = new Jogo();
        boolean vitoria = jogo.vitoriaUsuario("impar", 2, 2);
        Assertions.assertEquals(vitoria, false);
    }
}
