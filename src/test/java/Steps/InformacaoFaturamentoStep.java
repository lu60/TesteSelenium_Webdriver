package Steps;

import Runner.RunBase;
import Runner.RunCucumberTeste;
import Suporte.Screenshot;
import Suporte.Utils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import Pages.InformacaoFaturamentoPage;

public class InformacaoFaturamentoStep extends RunCucumberTeste {
    InformacaoFaturamentoPage informacaoPage = new InformacaoFaturamentoPage();

    @Dado("acesso a tela de checkout-one")
    public void acessoTelaCheckoutOne() {

        //  LIMPA A TELA E EXECUTA NOVAMENTE //
        //getDriver(Browser.CHROME);
        informacaoPage.acessarAplicacao();
    }

    @Quando("preencho os campos do formulário: Billings Information")
    public void preenchoCamposFormularioBillingsInformation() throws InterruptedException{
        informacaoPage.preencherCampoPrimeiroNome("Luciane");
        informacaoPage.preencherCampoUltimoNome("Papers");
        informacaoPage.preencherCampoEmpresa("Cacau");
        informacaoPage.preencherCampoEmail("cacau@teste.com");
        informacaoPage.preencherCampoPais(1);
        informacaoPage.preencherCampoCidade(2);
        informacaoPage.preencherCep("92425270");
        informacaoPage.preencherEndereco("Rua Esperança, 28");
        informacaoPage.preencherMensagem("Testando campo");
        informacaoPage.marcarCheck();
    }

    @E("clico no botao salvar")
    public void clicoNoBotaoSalvar() {
        informacaoPage.clicarBotaoSalvar();
    }

    @Então("visualizo mensagem:")
    public void visualizoMensagem() {
        informacaoPage.visualizarMensagem();
    }
    @After
    public static void printScreenQuandoFalhar(Scenario cenario) {
        Screenshot.addScreenshotOnSecenario(cenario);
    }
}
