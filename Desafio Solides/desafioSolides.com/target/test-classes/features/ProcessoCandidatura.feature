#language:pt
#Author:wagnerdix@gmail.com

Funcionalidade: Candidatar a vaga na Solides e validar a candidatura

  Cenário: Canditatura de vaga
    Dado que o usuário está no site solides "https://jobs.solides.com/jack5"
    E realiza uma busca por vaga "teste"
    Então realiza o login com a conta já criada
    E verifica as informações para a vaga desejada
    E confirma candidatura
    
 #Aqui ocorre a descricao do caso de teste a ser executado - 
 #este método é conhecido como BDD e escrito/executado pelo Cucumber
 