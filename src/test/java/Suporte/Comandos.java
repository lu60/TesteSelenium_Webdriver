package Suporte;

import Runner.RunCucumberTeste;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Comandos extends RunCucumberTeste {

    //Scroll na tela
    public static void scrollPage() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0,10000)");
        Thread.sleep(2000);
    }

    //Espera Elemento estar clicável
    public static void esperarElementoEstarClicavel(By element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void esperarElementoVisivel(By element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void clicarElemento(By elemento) {
        System.out.println("######################################");

        try {
            //System.out.println("Vai clicar no elemento " + elemento);
            scrollPage();
            esperarElementoEstarClicavel(elemento, 10000);
            getDriver().findElement(elemento).click();
            //System.out.println("Clicou no elemento " + elemento);
        } catch (Exception error) {
            System.out.println("************ Aconteceu um erro ao tentar clicar no " + elemento);
            System.out.println(error);
        }
    }

    public static void preencherElemento(By elemento, String valor) {
        try {
            //System.out.println("Vai preencher o elemento " + elemento);
            esperarElementoVisivel(elemento, 10000);
            getDriver().findElement(elemento).sendKeys(valor);
            //System.out.println("Clicou no elemento " + elemento);
        } catch (Exception error) {
            System.out.println("************ Aconteceu um erro ao tentar no elemento " + elemento);
            System.out.println(error);
        }
    }

    public static void checkMensagemSucesso(By elemento, String mensagemVisualizada) {
        esperarElementoVisivel(elemento,10000);
        String mensagemEsperada = getDriver().findElement(elemento).getText();
        Assert.assertEquals(mensagemEsperada, mensagemVisualizada);
        System.out.println("Mensagem apresentada corretamente! \n" + "Mensagem Esperada: " + mensagemEsperada +
                "\nMensagem Apresentada: " + mensagemVisualizada);
    }

    public static void checkMensagemInvalida(By elemento, String mensagemVisualizada) {
        esperarElementoVisivel(elemento, 10000);
        String mensagemEsperada = getDriver().findElement(elemento).getText();
        Assert.assertEquals(mensagemEsperada, mensagemVisualizada);
        System.out.println("Mensagem apresentada corretamente! " + mensagemEsperada);
    }
}

