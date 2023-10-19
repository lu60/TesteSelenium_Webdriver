package Pages;

import Runner.RunBase;
import Runner.RunCucumberTeste;
import Suporte.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static Suporte.Comandos.*;

public class InformacaoFaturamentoPage extends RunCucumberTeste {

    String URL = "https://automationpratice.com.br/checkout-one";
    private final By firstName = By.id("fname");
    private final By lastName = By.id("lname");
    private final By companyName = By.id("cname");
    private final By emailName = By.id("email");
    private final By nomePais = By.id("country");
    private final By nomeCidade = By.id("city");
    private final By cep = By.id("zip");
    private final By endereco = By.id("faddress");
    private final By mensagem = By.id("messages");
    private final By checkBox = By.id("materialUnchecked");
    private final By botaoSalvar = By.cssSelector("#checkout_one > div > div > div:nth-child(1) > div > button");
    private final By mensagemEsperada = By.cssSelector("#checkout_one > div > div > div:nth-child(1) > div > div:nth-child(2)");

    public void acessarAplicacao() {
        getDriver().get(URL);
        getDriver().manage().window().maximize();
        esperarElementoEstarClicavel (By.id("fname"), 10);
    }

    public void preencherCampoPrimeiroNome(final String fName) {
        preencherElemento(firstName, fName);
    }

    public void preencherCampoUltimoNome(final String lName) {
        preencherElemento(lastName, lName);
    }

    public void preencherCampoEmpresa(final String empresa) {
        preencherElemento(companyName, empresa);
    }

    public void preencherCampoEmail(final String email) {
        preencherElemento(emailName, email);
    }

    public void preencherCampoPais(final int selecaoPais) {
        final Select pais = new Select(RunBase.getDriver().findElement(this.nomePais));
        pais.selectByIndex(selecaoPais);
    }

    public void preencherCampoCidade(final int selecaoCidade) {
        final Select cidade = new Select(RunBase.getDriver().findElement(this.nomeCidade));
        cidade.selectByIndex(selecaoCidade);
    }

    public void preencherCep(final String codigoCep) {
        preencherElemento(cep, codigoCep);
    }

    public void preencherEndereco(final String enderecoRua) {
        preencherElemento(endereco, enderecoRua);
    }

    public void preencherMensagem(final String incluirMensagem) throws InterruptedException{
        preencherElemento(mensagem, incluirMensagem);
    }

    public void marcarCheck() {
        clicarElemento(checkBox);
    }

    public void clicarBotaoSalvar() {
        clicarElemento(botaoSalvar);
    }

    public void visualizarMensagem() {
        final String mensagemAtual = RunBase.getDriver().findElement(this.mensagemEsperada).getText();
        Assert.assertEquals("Billings Information registred with success!", mensagemAtual);
    }
}
