# DesafioACT
 
## Negócio
 
Este projeto é uma aplicação Java que utiliza **JUnit 5.11.0** para testes Funcionais em uma  aplicação que é responsável por realizar um Cadastro, Login e Loggout. O gerenciamento de dependências e a automação de build são feitos com **Maven**. O projeto inclui testes de criação de um novo cadastro, teste inválido e loggout do sistema.
 
## Documentação Para o Desafio
 
https://altranbr-my.sharepoint.com/personal/leticia_costa_actdigital_com/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fleticia%5Fcosta%5Factdigital%5Fcom%2FDocuments%2FArquivos%20de%20Chat%20do%20Microsoft%20Teams%2FQuality%20Analyst%2Epdf&parent=%2Fpersonal%2Fleticia%5Fcosta%5Factdigital%5Fcom%2FDocuments%2FArquivos%20de%20Chat%20do%20Microsoft%20Teams&ga=1
 
 
## Plano de testes
 
**Autenticação:**
 
Realizar o cadastro no site QAZANDO com credenciais válidas.  
Realizar o login no site QAZANDO com credencias válidas.
Testar se o sistema lida corretamente com credenciais inválidas.
 
**Adição de Produtos:**
 
Validar se credenciais inválidas podem ser adicionados com sucesso.  
Testar o cadastro com dados inválidos ou incompletos.
 
**Validação de Usuários:**
 
A estratégia de testes envolve a execução de testes funcionais que cobrem a maioria dos casos de uso e cenários de borda. Os testes são automatizados e executados durante o processo de build.
 
## Como executar
**0** - instalar todos os items obrigatórios na maquina ( JDK, maven, Selenium, Git) e configurar o ambiente  
**1** - realizar clone do projeto  
**2** - no caminho src/test/java/Runnner executar classe runnerTest.java  
**3** - Os testes serão executados em ordem conforme documentação
 
**Executar via terminal com Maven**
 
Abrir terminal na pasta do projeto
executar o comando **mvn test**
 
## BUGS Encontrados
 
    **CT001 - Validar envio de dados invalidos para a criação de cadastro**  
 
Request
 
    {  
    "nome": "kaiquedemucio"
    "email": "1234567A2342342$#%#$@#$",  
    "username": "Teste123"  
    }
 
SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
