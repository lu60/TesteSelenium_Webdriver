$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/desconto.feature");
formatter.feature({
  "name": "Receber o cupom de desconto da QAzando",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@cenarioCompleto"
    }
  ]
});
formatter.scenario({
  "name": "Visualizar código de desconto",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@cenarioCompleto"
    },
    {
      "name": "@desconto"
    }
  ]
});
formatter.step({
  "name": "que estou no site da Qazando",
  "keyword": "Dado "
});
formatter.match({
  "location": "DescontoStep.acessoSiteQazando()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho email",
  "keyword": "Quando "
});
formatter.match({
  "location": "DescontoStep.preenchoEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em ganhar cupom",
  "keyword": "E "
});
formatter.match({
  "location": "DescontoStep.clicoGanharCupom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo o código de desconto",
  "keyword": "Então "
});
formatter.match({
  "location": "DescontoStep.visualizoCodigoDesconto()"
});
formatter.result({
  "status": "passed"
});
});