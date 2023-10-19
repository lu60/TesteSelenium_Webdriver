#language: pt

@informacaoFaturamento
Funcionalidade: Salvar informações de faturamento

  @informacaoFaturamento_sucesso
  Cenário: Preencher campos para registrar dados de um faturamento
    Dado acesso a tela de checkout-one
    Quando preencho os campos do formulário: Billings Information
    E clico no botao salvar
    Então visualizo mensagem:

