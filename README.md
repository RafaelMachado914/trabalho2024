# trabalho2024

Estou fazendo esse projeto para desafiar meus conhecimentos, este é um projeto que foi elaborado no ano de 2024 para o 
curso de ciencia da computação do instituto federal de Santa Catarina (IFSC).
Comecei no curso a menos de 1 mês e gostaria de testar meus cinhecimento até o momento, o trabalho consiste em:

 O trabalho deve ser realizado em duplas, é permitida a consulta a materiais disponíveis na
 Internet, contudo não é permitido utilizar sistemas de inteligência artificial generativa, tais como
 ChatGPT, entre outros. A identificação de trabalhos produzidos com o auxílio deste tipo de
 ferramenta levará à atribuição de nota 0.0 aos membros da dupla, assim como o encaminhamento
 dos alunos envolvidos à coordenação do curso para aplicação das punições previstas no
 Regulamento Didático Pedagógico do IFSC.
 Faça um programa que simule o sistema de vendas de uma loja. Este programa deve apresentar
 as funções apresentadas a seguir.


 • Ao ser executado, o sistema deve solicitar que o usuário cadastre os dez produtos
 comercializados por esta loja. Para cada produto deve-se informar o seu nome e preço de
 custo.


 • Após cadastrar todos os produtos, o programa deve apresentar um menu para o usuário
 com as seguintes abaixo: 

1 – Venda de produto.
 2 – Reposição de estoque.
 3 – Relatório de estoque.
 4 – Relatório de vendas.
 5 – Sair.
 
 • Após o usuário selecionar uma das opções, ela deve ser executada e, em seguida, o menu
 deve ser apresentado novamente, até que o usuário selecione a opção 5 - Sair.

 • Ao selecionar a opção 1 – Venda de produto, o programa deve:


 ◦ Solicitar que o usuário digite o nome do produto a ser vendido. 
▪ Caso o usuário digite o nome de um produto que não existe na loja, o programa
 deve apresentar uma mensagem informando e solicitar que o usuário digite o nome
 do produto novamente.
 ◦ Apresentar a quantidade em estoque do produto e seu preço de venda. 

▪ O preço de venda é dado pelo preço de custo mais a margem de lucro da loja que
 é de 50%.
 ◦ Solicitar que o usuário digite a quantidade vendida.

 ▪ Se o usuário digitar uma quantidade maior que a existente no estoque, o sistema
 deve apresentar uma mensagem e solicitar que o usuário digite a quantidade
 vendida novamente.

 ◦ Apresentar o valor da venda e perguntar se o usuário quer pagar à vista ou a prazo.
 Caso o usuário opte por pagar à vista, deve-se conceder um desconto de 10% no valor
 da venda.
 ◦ Apresentar uma mensagem de finalização da venda com as seguintes informações:
 ▪ Nome do produto.
 ▪ Quantidade vendida.
 ▪ Valor pago.
 ◦ Perceba que em cada venda só pode ser vendido um único tipo de produto.


• Ao selecionar a opção 2 – Reposição de Estoque, o programa deve:
 ◦ Solicitar que o usuário digite o nome do produto.

 ▪ Caso o usuário digite o nome de um produto que não existe na loja, o programa
 deve apresentar uma mensagem e solicitar que o usuário digite o nome do produto
 novamente. 

◦ Apresentar a quantidade em estoque do produto. 

◦ Solicitar que o usuário digite a quantidade a ser reposta (quantidade comprada pela
 loja).

 ◦ Apresentar uma mensagem de finalização da reposição com as seguintes informações:
 ▪ Nome do produto.
 ▪ Nova quantidade em estoque.


 • Ao selecionar a opção 3 – Relatório de estoque, o programa deve:
 ◦ Apresentar uma lista com o nome dos produtos comercializados pela loja, seu preço de
 custo e a quantidade em estoque de cada um deles.


 • Ao selecionar a opção 4 – Relatório de vendas, o programa deve:
 ◦ Apresentar uma lista com as vendas realizadas pela loja, com os seguintes dados:
 ▪ Nome do produto vendido.
 ▪ Quantidade vendida.
 ▪ Valor da venda.


 • Ao selecionar a opção 5 – Sair, o programa deve:
 ◦ Apresentar o valor total das vendas da loja.
 ◦ Encerrar a execução
