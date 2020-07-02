package com.jornadajava;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

@Ignore
//Ignorado, pois depende do driver do chrome
public class TestaPagina {
    private Pagina pagina;
    private WebDriver novoDriver;

    @Before
    public void configuraWebDriver() {
        pagina = new Pagina();
        novoDriver = pagina.iniciaWebDriver();
    }

    @Test
    public void validaTituloDaPaginaInicial() {
        Assert.assertTrue(pagina.validaTituloDaPaginaInicial(novoDriver));
    }

    @After
    public void encerraWebDriver() {
        pagina.encerraWebDriver(novoDriver);
    }

}
