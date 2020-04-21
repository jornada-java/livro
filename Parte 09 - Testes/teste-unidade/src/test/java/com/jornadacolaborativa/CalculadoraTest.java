package com.jornadacolaborativa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    public void somaDeDoisPorDoisRetornaQuatro() {
        // Dado que desejo somar dois número
        Calculadora calculadora = new Calculadora();
        double entrada1 = 2;
        double entrada2 = 2;
        double resultadoEsperado = 4;

        // Quando informado como parâmetro os números 2 e 2
        double resultado = calculadora.soma(entrada1, entrada2);

        // Então a função de soma retorna o número 4
        assertEquals(resultadoEsperado, resultado, "2 + 2 tem que ser igual a 4");
    }

    @Test
    public void subtracaoDeTresPorDoisRetornaUm() {
        // Dado que desejo subtrair dois número
        Calculadora calculadora = new Calculadora();
        double entrada1 = 3;
        double entrada2 = 2;
        double resultadoEsperado = 1;

        // Quando informado como parâmetro os números 3 e 2
        double resultado = calculadora.subtracao(entrada1, entrada2);

        // Então a função de subtração retorna o número 1
        assertEquals(resultadoEsperado, resultado, "3 - 2 tem que ser igual a 1");
    }

    @Test
    public void multiplicacaoDeTresPorsDoisRetornaSeis() {
        // Dado que desejo multiplicar dois número
        Calculadora calculadora = new Calculadora();
        double entrada1 = 3;
        double entrada2 = 2;
        double resultadoEsperado = 6;

        // Quando informado como parâmetro os números 3 e 2
        var resultado = calculadora.multiplicao(entrada1, entrada2);

        // Então a função de multiplicação retorna o número 6
        assertEquals(resultadoEsperado, resultado, "3 * 2 tem que ser igual a 6");
    }

    @Test
    public void divisaoDeSeisPorDoisRetornaSeis() {
        // Dado que desejo dividir dois número
        Calculadora calculadora = new Calculadora();
        double entrada1 = 6;
        double entrada2 = 2;
        double resultadoEsperado = 3;

        // Quando informado como parâmetro os números 6 e 2
        var resultado = calculadora.divisao(entrada1, entrada2);
        
        // Então a função de divisão retorna o número 3
        assertEquals(resultadoEsperado, resultado, "6 / 2 tem que ser igual a 3");
    }

}
