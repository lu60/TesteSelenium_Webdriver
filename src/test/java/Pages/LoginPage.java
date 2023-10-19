package Pages;

import Runner.RunCucumberTeste;
import Suporte.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;

import static Suporte.Comandos.*;

public class LoginPage extends RunCucumberTeste {

    private String URL = "https://automationpratice.com.br/login";
    private By campoEmail = By.id("user");
    private By campoSenha = By.id("password");
    private By botaoLogin = By.id("btnLogin");
    private By mensagemLogin = By.id("swal2-title");
    private By mensagemEmailInvalido = By.cssSelector("#login_area > div > div > div > div > div:nth-child(2) > span");
    private By mensagemSenhaInvalida = By.cssSelector("#login_area > div > div > div > div > div:nth-child(3) > span");


    public void acessarTelaLogin() {
        getDriver().manage().window().maximize();
        //getDriver(Browser.CHROME).get(URL);
        getDriver().get("https://automationpratice.com.br/login");
    }

    public void preencherCampoEmail_Senha(String email, String senha) {
        preencherElemento(campoEmail, email);
        preencherElemento(campoSenha, senha);
    }

    public void clicarBotaoLogin() {
        clicarElemento(botaoLogin);
    }

    public void visualizarMensagemLoginRealizado(String mensagemLoginVisualizado) {
        checkMensagemSucesso(mensagemLogin, mensagemLoginVisualizado);
    }

    public void visualizarMensagemEmailInvalido(String mensagemEmailVisualizado) {
        checkMensagemInvalida(mensagemEmailInvalido, mensagemEmailVisualizado);
    }

    public void visualizarMensagemSenhaInvalida(String mensagemSenhaVisualizada) {
        checkMensagemInvalida(mensagemSenhaInvalida, mensagemSenhaVisualizada);
    }
}
