#language: pt

@login
Funcionalidade: Validar os campos e botão na tela de Login

  Contexto:
    Dado que estou na tela de login

  @login-sucesso
  Cenário: Preencher campos da tela de Login com sucesso
    Quando preencho os campos "lu.pocebon@gmail.com" e "123456"
    E clico no botão login
    Então visualizo mensagem "Login realizado" de sucesso

  @campoEmail-invalido
  Esquema do Cenário: Validação <Nome>
    Quando preencho os campos "<Email>" e "<Senha>"
    E clico no botão login
    Então visualizo mensagem "<Mensagem>" de campo com email inválido

    Exemplos:
      | Email | Senha  | Mensagem         | Nome            |
      | lu    | 123456 | E-mail inválido. | E-mail inválido |
      |       | 123456 | E-mail inválido. | E-mail vazio    |

  @campoSenha-invalida
  Esquema do Cenário: Validação <Nome>
    Quando preencho os campos "<Email>" e "<Senha>"
    E clico no botão login
    Então visualizo mensagem "<Mensagem>" de campo com senha inválida

    Exemplos:
      | Email                | Senha | Mensagem        | Nome           |
      | lu.pocebon@gmail.com | 12    | Senha inválida. | Senha inválida |
      | lu.pocebon@gmail.com |       | Senha inválida. | Senha vazia    |

