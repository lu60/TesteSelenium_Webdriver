package Steps;

import Pages.CupomDescontoPage;
import Runner.RunCucumberTeste;
import Suporte.Utils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CupomDescontoStep extends RunCucumberTeste {
    CupomDescontoPage descontoPage = new CupomDescontoPage();

    @Dado("que estou no site da Qazando")
    public void acessoSiteQazando() throws InterruptedException {
        descontoPage.acessarSite();
        descontoPage.scrollPage();
    }

    @Quando("preencho email")
    public void preenchoEmail() {
        descontoPage.preencherEmail(Utils.getRandonEmail());
        //descontoPage.preencherEmail("lu.pocebon@gmail.com");
    }

    @E("clico em ganhar cupom")
    public void clicoGanharCupom() {
        descontoPage.clicarBotao();
    }

    @Então("visualizo o código de desconto")
    public void visualizoCodigoDesconto() {
        descontoPage.visualizarCupom();
    }

    public static class CadastroUsuarioStep extends RunCucumberTeste {

        @Dado("acesso o cadastro de usuário")
        public void cadastroUsuario() {
        }

        @Quando("preencho o formulário de cadastro")
        public void preenchoFormularioCadastro() {
        }

        @E("clico em salvar")
        public void clicarRegistrar() {
        }

        @Então("vejo mensagem de cadastro realizado com sucesso")
        public void visualizarMensagemDeSucesso() {
        }
    }
}
