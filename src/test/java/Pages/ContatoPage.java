package Pages;

import Runner.RunCucumberTeste;
import org.junit.Assert;
import org.openqa.selenium.By;
import static Runner.RunBase.getDriver;
import static Suporte.Comandos.*;

public class ContatoPage extends RunCucumberTeste {
    private By name = By.name("name");
    private By email = By.name("email");
    private By phone = By.name("phone");
    private By subject = By.name("subject");
    private By message = By.name("message");
    private By submitBotao = By.xpath("//*[@id=\"contact_area\"]/div/div/div[1]/div/form/div/div[5]/div[2]/button");
    private By mensagemTela = By.xpath("//*[@id=\"swal2-title\"]");

    public void acessarTelaContato() {
        getDriver().manage().window().maximize();
        getDriver().get("https://automationpratice.com.br/contact-two");
    }

    public void preencherCampos(String nome, String Email, String fone, String assunto, String mensagem) {
        preencherElemento(name, nome);
        preencherElemento(email, Email);
        preencherElemento(phone, fone);
        preencherElemento(subject, assunto);
        preencherElemento(message, mensagem);
    }

    public void clicarBotaoSubmit() {
        clicarElemento(submitBotao);
    }

    public void apresentarMensagem(String mensagemEsperada) {
        checkMensagemSucesso(mensagemTela, mensagemEsperada);
    }
}
