package br.com.kaiquedemucio.qazando.cadastro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes Automatizados da Funcionalidade de Cadastro")
public class CadastroTests {
    @Test
    @DisplayName("Cadastrar um novo usuário com dados válidos")
    public void testCadastrarUmNovoUsuarioComDadosValidos() throws InterruptedException {
        // Vou abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        // Abrir o site do QAZANDO
        navegador.get("https://automationpratice.com.br/");

        Thread.sleep(1000);
        WebElement BTcadastrar = navegador.findElement(By.xpath("/html/body/div/section[1]/div/div/div[2]/div/ul/li[2]/a"));
        if (BTcadastrar.isDisplayed()) {
           // Vou clicar no botão que tem o ID igual a Cadastro
          By.xpath("/html/body/div/section[1]/div/div/div[2]/div/ul/li[2]/a").findElement(navegador).click();
          Thread.sleep(1000);
          }else {
           Thread.sleep(1000);
           By.xpath("/html/body/div/section[1]/div/div/div[2]/div/ul/li[2]/a").findElement(navegador).click();
        }

        // Vou digitar o nome no campo com ID igual a user
        navegador.findElement(By.id("user")).sendKeys("kaiquedemucio");

        // Vou digitar o login no campo com ID igual a email
        navegador.findElement(By.id("email")).sendKeys("kaiquedemucio@teste.com");

        // Vou digitar a senha no campo com ID igual a password
        navegador.findElement(By.id("password")).sendKeys("teste123");

        // Vou clicar no botão Cadastrar com o ID igual a btnRegister
        navegador.findElement(By.id("btnRegister")).click();

    }

    @Test
    public void testLoginComUsuarioCriado() throws InterruptedException {
        // Vou abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        // Abrir o site do QAZANDO
        navegador.get("https://automationpratice.com.br/");

        Thread.sleep(1000);
        WebElement BTlogin = navegador.findElement(By.xpath("/html/body/div/section[1]/div/div/div[2]/div/ul/li[2]/a"));
        if (BTlogin.isDisplayed()) {
            // Vou clicar no botão login
            By.xpath("//*[@id=\"top_header\"]/div/div/div[2]/div/ul/li[1]/a").findElement(navegador).click();
            Thread.sleep(1000);
        }else {
            Thread.sleep(1000);
            By.xpath("//*[@id=\"top_header\"]/div/div/div[2]/div/ul/li[1]/a").findElement(navegador).click();
        }

        // Vou digitar o e-mail no campo com ID igual a user
        navegador.findElement(By.id("user")).sendKeys("kaiquedemucio@teste.com");

        // Vou digitar a senha no campo com ID igual a password
        navegador.findElement(By.id("password")).sendKeys("teste123");

        // Vou clicar no botão Login com o ID igual a btnLogin
        navegador.findElement(By.id("btnLogin")).click();
    }

    @Test
    public void testNegativoCadastrarUmNovoUsuarioComDadosInvalidos() throws InterruptedException {
        // Vou abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        // Abrir o site do QAZANDO
        navegador.get("https://automationpratice.com.br/");

        Thread.sleep(1000);
        WebElement BTcadastrar = navegador.findElement(By.xpath("/html/body/div/section[1]/div/div/div[2]/div/ul/li[2]/a"));
        if (BTcadastrar.isDisplayed()) {
            // Vou clicar no botão que tem o ID igual a Cadastro
            By.xpath("/html/body/div/section[1]/div/div/div[2]/div/ul/li[2]/a").findElement(navegador).click();
            Thread.sleep(1000);
        }else {
            Thread.sleep(1000);
            By.xpath("/html/body/div/section[1]/div/div/div[2]/div/ul/li[2]/a").findElement(navegador).click();
        }

        // Vou digitar o nome no campo com ID igual a user
        navegador.findElement(By.id("user")).sendKeys("kaiquedemucio");

        // Vou digitar o login no campo com ID igual a email
        navegador.findElement(By.id("email")).sendKeys("1234567A2342342$#%#$@#$");

        // Vou digitar a senha no campo com ID igual a password
        navegador.findElement(By.id("password")).sendKeys("teste123");

        // Vou clicar no botão Cadastrar com o ID igual a btnRegister
        navegador.findElement(By.id("btnRegister")).click();
    }
}