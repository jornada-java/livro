package com.jornadajava.soma.service;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

/**
 * Execute os testes utilizando o comando maven "mvn test" ou "mvn install" na raiz do projeto
 * para gerar o relatório de mutação (<projeto>/target/pit-reports/<date>/index.html.)
 */
public class SomaServiceTest {

    @InjectMocks
    private SomaService somaService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void verificaResultado() {
        //     Teste fraco. O processo de mutação inverterá o sinal na camada de negócio,
        //     ou seja, teremos 2-1. O teste continuará passando pois continua sendo um retorno positivo,
        //     porém, para o Pitest (ver relatório) irá mostrar que a alteração do operador matemático
        //     não quebrou nenhum teste.
        //     1. Replaced integer addition with subtraction → SURVIVED
        Assertions.assertThat(somaService.sum(2, 1)).isPositive();
    }

    /**
     * Comente este teste para ver o relatório de mutação do cenário acima.
     * Este teste garante que o mutante gerado será morto.
     */
    @Test
    public void verificaResultadoForte() {
        Assertions.assertThat(somaService.sum(1, 2)).isEqualTo(3);
    }
}
