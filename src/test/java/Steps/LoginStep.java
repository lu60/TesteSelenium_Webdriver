package Steps;

import Pages.LoginPage;
import Runner.RunCucumberTeste;
import Suporte.Screenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class LoginStep {
    LoginPage loginPage = new LoginPage();

    @Dado("que estou na tela de login")
    public void acessoTelaLogin() {
        loginPage.acessarTelaLogin();
    }

    @Quando("preencho os campos {string} e {string}")
    public void preenchoCampos(String email, String senha) {
        loginPage.preencherCampoEmail_Senha(email, senha);
    }

    @E("clico no botão login")
    public void clicoBotaoLogin() {
        loginPage.clicarBotaoLogin();
    }

    @Então("visualizo mensagem {string} de sucesso")
    public void visualizoMensagemDeSucesso(String mensagemLoginVisualizado) {
        loginPage.visualizarMensagemLoginRealizado(mensagemLoginVisualizado);
    }

    @Então("visualizo mensagem {string} de campo com email inválido")
    public void visualizoMensagemCampoEmailInvalido(String mensagemEmailInvalido) {
        loginPage.visualizarMensagemEmailInvalido(mensagemEmailInvalido);
    }

    @Então("visualizo mensagem {string} de campo com senha inválida")
    public void visualizoMensagemCampoSenhaInvalida(String mensagemSenhaInvalida) {
        loginPage.visualizarMensagemSenhaInvalida(mensagemSenhaInvalida);
    }

    @After
    public static void printScreenQuandoFalhar(Scenario cenario) {
        Screenshot.addScreenshotOnSecenario(cenario);
    }
}
