package Steps;

import Pages.ContatoPage;
import Suporte.Screenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class ContatoStep {
    ContatoPage contato = new ContatoPage();

    @Dado("que estou na tela de contato")
    public void acessaTelaContato() {
        contato.acessarTelaContato();
    }

    @Quando("preencho os campos {string}, {string}, {string}, {string} e {string}")
    public void preencheCampos(String nome, String Email, String fone, String assunto, String mensagem) {
        contato.preencherCampos(nome, Email, fone, assunto, mensagem);
    }

    @E("clico no botão submit")
    public void clicaBotaoSubmit() {
        contato.clicarBotaoSubmit();
    }

    @Então("apresentar mensagem {string}")
    public void apresentaMensagem(String mensagemEsperada) {
        contato.apresentarMensagem(mensagemEsperada);
    }
    @After
    public static void printScreenQuandoFalhar(Scenario cenario) {
        Screenshot.addScreenshotOnSecenario(cenario);
    }
}
