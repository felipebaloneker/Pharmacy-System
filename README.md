# Sistema-Farmacia
Um projeto feito em Java e Sql

## **_O que foi Criado:_**
1.Sql:
- Criado Banco de Dados "Farmacia"
- Criado Tabela de Medicamento com id, descrição, quantidade, preço 
- Criado Tabela de Funcionario com id, nome, telefone, endereço, login e senha para o acesso ao sistema

2. Java
- Telas de Login, Menu, Cadastro de Medicamentos, Sobre.
- Na tela de login eventos keypressed ao apertar enter após digitar o login sem precissar clicar com o mouse,
e a chamada da função para verificação do login.
- Na tela de menu card para apresentaçåo da tela cadastro como filha, botões Medicamento(para chamda da tela cadastro),
Relatorio (chama outro card com botoes para impressão do mesmo), sobre(chamada para tela sobre).
- A conexão com o banco e feita atraves do arquivo ConnectionFactory.java.
- O arquivo FuncionarioDao.java contém a funcão para verificação do login.
- O arquivo MedicamentoDao.java contém todas as funções para Inserir, Excluir, Autalizar, Listar e Excluir os dados na tabela Medicamento.

<img src="https://github.com/felipebaloneker/Sistema-Farmacia/blob/main/farmacia.gif">
