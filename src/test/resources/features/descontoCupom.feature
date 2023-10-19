# language: pt

@descontoCupom
Funcionalidade: Receber o cupom de desconto da QAzando

  Cenário: Visualizar código de desconto
    Dado que estou no site da Qazando
    Quando preencho email
    E clico em ganhar cupom
    Então visualizo o código de desconto