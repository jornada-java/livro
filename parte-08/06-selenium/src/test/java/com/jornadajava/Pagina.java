package com.jornadajava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagina {

    public boolean validaTituloDaPaginaInicial(WebDriver driver) {
        // busca o titulo da página inicial pelo id
        WebElement titulo = driver.findElement(By.id("the-selenium-browser-automation-project"));
        // verifica se o título da página inicial é o título esperado
        if (titulo.getText().equals("The Selenium Browser Automation Project")) {
            return true;
        } else {
            return false;
        }
    }

    public WebDriver iniciaWebDriver() {

        //http://chromedriver.storage.googleapis.com/index.html?path=83.0.4103.39/

        // define o diretório do chrome driver. Windows
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        //Linux:
        System.setProperty("webdriver.chrome.driver", "/tmp/chromedriver");
        // cria instância do chrome driver
        WebDriver driver = new ChromeDriver();
        // define que o navegador será aberto em tela cheia
        driver.manage().window().maximize();
        // Acessa a página de documentação do selenium
        driver.get("https://selenium.dev/documentation/en/");
        return driver;
    }

    public void encerraWebDriver(WebDriver driver) {
        // método que encerra o WebDriver e fecha o navegador
        driver.close();
    }
}
