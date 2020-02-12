#language: pt
Funcionalidade: Fazer um teste de cadastro positivo e negativo

  Contexto: 
    Dado que clica no menu do app
    E clicar no login do app
    E criar uma nova conta no app

  @tag3
  Cenario: Cadastrar usuario com sucesso
    Quando digitar o nome do usuario
    Quando digitar o email do usuario
    Quando digitar senha do usuario
    Quando confirma senha do usuario
    Quando digitar o primeiro nome do usuario
    Quando digitar o ultimo nome do usuario
    Quando digitar o telefone do usuario
    Quando escolher o pais do usuario
    Quando digitar o estado do usuario
    Quando digitar o endereco do usuario
    Quando digitar o cep do usuario
    Quando clicar em registrar
    Entao registrar cadastro do usuario com sucesso

  @tag4
  Cenario: Cadastrar usuario sem sucesso
    Quando digitar o nome 
    Quando digitar o email 
    Quando digitar senha
    Quando confirma senha
    Quando digitar o primeiro nome 
    Quando digitar o ultimo nome
    Quando digitar o telefone
    Quando escolher o pais 
    Quando digitar o estado 
    Quando digitar o endereco
    Quando digitar o cep 
    Quando clicar em registrar o usuario
    Entao registrar nome sem sucesso
