#language: pt
Funcionalidade: Fazer um teste que pesquisa algum produto na lupa

  Contexto: Dado que clica no aplicativo

  @tag5
  Cenario: 
    Quando clicar na lupa
    Quando Digitar no campo de pesquisa
    Quando clicar nos produtos
    Entao entao escolher produto

  @tag6
  Cenario: 
    Quando clicar na lupa
    Quando Digitar no campo de pesquisa um produto que nao existe
    Entao entao produto nao  existe
