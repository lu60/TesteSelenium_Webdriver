package Pages;

import Runner.RunBase;
import Suporte.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import static Runner.RunBase.getDriver;
import static Suporte.Comandos.clicarElemento;
import static Suporte.Comandos.preencherElemento;

public class CupomDescontoPage {

    private By preencheEmail = By.id("email");
    private By botaoGanharCupom = By.id("button");
    private By cupom = By.cssSelector("#cupom > h2 > span");
    private By createCampoEmail = By.id("email_create");
    private By createBotaoEmail = By.id("SubmitCreate");

    public void acessarSite() {
        RunBase.getDriver().manage().window().maximize();
        RunBase.getDriver().get("https://www.qazando.com.br/curso.html");
    }

    public void preencherEmail(String email) {
        //preencherElemento(preencheEmail, email);   *** Não está funcionando, REVISAR *****
        getDriver().findElement(preencheEmail).sendKeys(email);
    }

    public void clicarBotao() {
        clicarElemento(botaoGanharCupom);
    }

    public void visualizarCupom() {
        String texto_cupom = getDriver().findElement(cupom).getText();
        Assert.assertEquals("Não acessou o cupom corretamente!", "QAZANDO15OFF", texto_cupom);
        System.out.println("Cupom de Desconto: " + texto_cupom);
    }

    public void scrollPage() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0,10000)");
        Thread.sleep(2000);
    }
}
