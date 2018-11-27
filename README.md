# VectorLogin

Para testar o funcionamento da aplicação siga os seguintes passos:
 
1)Disponibilize um servidor de banco de dados MySQL para o seguinte schema:
  
  mysql://127.0.0.1:3306/vector

2)Clone a aplicação em um repositório de sua escolha;

3)Após, importe a aplicação como Maven Project na IDE Eclipse;

4)Altere as variáveis de usuário e senha para acesso ao banco, de acordo com a sua necessidade, no arquivo application.properties
  nos seguintes campos:
    db.username: "seu usuario"
    db.password: "sua senha"
    
5)Inicie a aplicação executando a classe principal 'WebAppInitializer'. A aplicação fará a criação das tabelas no banco de dados informado na configuração;

6)Realizar a inserção na tabela utilizando o seguinte script:
  INSERT INTO `usuario`(`login`, `senha`) VALUES ('usuarioT', 'senha')

7)Acessar no navegador, com o a aplicação inciada, o endereço: 
  localhost:8080/

8)Realizar o login com os dados:
  login: usuarioT
  senha: senha
