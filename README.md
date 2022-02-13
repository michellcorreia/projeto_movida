# projeto_movida
Projeto teste para simular um serviço similar à um de locação de carros


## Sobre o projeto:  
A tela inicial/home contém apenas um banner do site original para poder ambientar o usuário no seu acesso.  
  
Foram criados três objetos, são eles: Cliente, Carro e Aluguel. Como um sistema de controle de usuário/login não foi implementado, a criação do usuário é realizado somente ao selecionar um carro para fazer a reserva.  
  
Nesse projeto temos uma tela que seria visualizada pelo funcionário da empresa, ela é responsável pelo cadastro dos carros no sistema, especificando seu modelo, cor, ano e fabricante. Assim que cadastrados, os carros já ficam visíveis na tela de catálogo de carros (visto pelo cliente), com todos os seus detalhes e com o link para realizar a reserva do mesmo.  

O funcionário também consegue visualizar a lista de carros (em uma tabela) de forma prática, e pode através dessa view, realizar a visualização, alterações ou deleções de objetos na lista de carros. Também foi implementada a tela com a tabela de reservas/aluguéis realizados, essas informações são apenas para tracking, estas não podem ser alteradas nem apagadas pelo funcionário.  

O cliente consegue visualizar o catálogo de carros, com a respectiva foto do carro, e com suas especificações. Ao clicar no botão para efetuar a reserva, ele é direcionado para uma segunda tela para inserir seus dados, checar se os dados do carro escolhido estão corretos, e por fim, informar a data de inicio e a data fim para a locação.  

Também foi implementado um nível básico de programação defensiva, evitando que o funcionário ou cliente cadastrem objetos com campos vazios.  
  
É importante ressaltar que o projeto teste foi realizado usando Java com Spring, Maven, HTML, CSS, JS, Thymeleaf e BD PostgreSql.  
Todo o projeto foi desenhado e executado para funcionar de forma assíncrona, através do ajax, não sendo necessário que o usuário precise esperar pelo refresh do site após cada solicitação feita ao back.  
  
Caso seja de seu interesse puxar o código, é necessário que o arquivo application.properties seja alterado para receber o url, username e password do banco de dados da pessoa que irá usá-lo. Atualmente o projeto está rodando através de um banco de dados PostgreSQL, e por isso já está com todos os drivers e JARS baixados e configurados.  

Também é importante lembrar que todas as tabelas serão geradas automaticamente ao subir a aplicação, desde que a mesma esteja vinculada à um banco de dados. O Spring já está com todas as configurações para criação de tabelas e colunas necessárias para que o projeto rode corretamente.
