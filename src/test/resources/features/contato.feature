#language: pt

@validacaoContato
Funcionalidade: Validação dos campos e botão da tela de Contato
Contexto: Acesso tela contato
  Dado que estou na tela de contato

    @camposValidos
    Esquema do Cenário: Validação dos <Nomes> preenchidos corretamente
      Quando preencho os campos "<Nome>", "<Email>", "<Phone>", "<Subject>" e "<Message>"
      E clico no botão submit
      Então apresentar mensagem "<Mensagem>"

      Exemplos:
        | Nome    | Email                | Phone   | Subject | Message              | Mensagem  | Nomes
        | Luciane | lu.pocebon@gmail.com | 9924444 | Carlos  | Oi Carlos, tudo bem? | Thank You | preenchimento correto


