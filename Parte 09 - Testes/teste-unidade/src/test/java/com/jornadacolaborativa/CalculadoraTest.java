package com.jornadacolaborativa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    public void somaDeDoisPorDoisRetornaQuatro() {
        // Dado que desejo somar dois número
        Calculadora calculadora = new Calculadora();
        var entrada1 = 2D;
        var entrada2 = 2D;
        var resultadoEsperado = 4D;
        // Quando informado como parâmetro os números 2 e 2
        var resultado = calculadora.soma(entrada1, entrada2);
        // Então a função de soma retorna o número 4
        assertEquals(resultadoEsperado, resultado, "2 + 2 tem que ser igual a 4");
    }

    @Test
    public void subtracaoDeTresPorDoisRetornaUm() {
        // Dado que desejo subtrair dois número
        Calculadora calculadora = new Calculadora();
        var entrada1 = 3D;
        var entrada2 = 2D;
        var resultadoEsperado = 1D;
        // Quando informado como parâmetro os números 3 e 2
        var resultado = calculadora.subtracao(entrada1, entrada2);
        // Então a função de subtração retorna o número 1
        assertEquals(resultadoEsperado, resultado, "3 - 2 tem que ser igual a 1");
    }

    @Test
    public void multiplicacaoDeTresPorsDoisRetornaSeis() {
        // Dado que desejo multiplicar dois número
        Calculadora calculadora = new Calculadora();
        var entrada1 = 3D;
        var entrada2 = 2D;
        var resultadoEsperado = 6D;
        // Quando informado como parâmetro os números 3 e 2
        var resultado = calculadora.multiplicao(entrada1, entrada2);
        // Então a função de multiplicação retorna o número 6
        assertEquals(resultadoEsperado, resultado, "3 * 2 tem que ser igual a 6");
    }

    @Test
    public void divisaoDeSeisPorDoisRetornaSeis() {
        // Dado que desejo dividir dois número
        Calculadora calculadora = new Calculadora();
        var entrada1 = 6D;
        var entrada2 = 2D;
        var resultadoEsperado = 3D;
        // Quando informado como parâmetro os números 6 e 2
        var resultado = calculadora.divisao(entrada1, entrada2);
        // Então a função de divisão retorna o número 3
        assertEquals(resultadoEsperado, resultado, "6 / 2 tem que ser igual a 3");
    }

}
