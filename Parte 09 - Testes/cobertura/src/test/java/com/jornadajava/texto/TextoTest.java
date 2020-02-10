package com.jornadajava.texto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TextoTest {

    private Texto texto = new Texto();

    @Test
    public void verificaPossuiChave() {
        String valor = "Olá mundo! Este é um exemplo para o relatório de cobertura!";
        assertThat(texto.verificarChave(valor, "cobertura")).isTrue();
    }

    @Test
    public void verificaVazio() {
        assertThat(texto.verificarChave("", "")).isFalse();
    }
}
