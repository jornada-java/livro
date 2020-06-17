# Parte 06 - Banco de Dados

Para executar os exemplos desta parte, precisamos de uma instancia do banco de dados MySQL. Vamos utilizar o docker
 para iniciar nosso banco de dados. Então será necessário ter ele instalado.
 
## Iniciando o banco de dados
 
Para criar uma instância do MySQL utilizando docker, basta executar o comando abaixo:
 
`docker run --name mysql57 -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_USER=java -e MYSQL_PASSWORD=1234 -e MYSQL_DATABASE=jornada_java_db -d mysql/mysql-server:5.7`

## Criando a tabela

Para criar nossa tabela, vamos acessar o MySQL rodando em nosso container Docker. Execute o comando abaixo:

`docker exec -it mysql57 /bin/sh`

Após acessar o container, vamos conectar no banco de dados:

`mysql -h localhost -u root -p`

Informe a senha 1234

Agora dentro do banco de dados execute o comando abaixo:

`use jornada_java_db`

E depois:

`create table pessoa(nome varchar(100) null);`

Para confirmar se a tabela foi criada, basta executar o comando abaixo:

`show tables;`

Se tudo estiver ok, irá aparecer a mensagem abaixo:

`| Tables_in_jornada_java_db |
+---------------------------+
| pessoa                    |
+---------------------------+
`

Para sair, execute o comando:

`quit;`

E depois um `exit` para sair do container.

Pronto! Agora você já pode executar os exemplos.
