package com.jornadajava.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Este projeto usa banco de dados, caso já tenha o mysql instalado na máquina,
 * pode utiliza-lo alterando as configurações existentes no arquivo application.properties.
 *
 * Para inicializar um container docker com mysql (com toda a configuração necessária), utilize o comando abaixo:
 * docker run --name mysql57 -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_USER=user -e MYSQL_PASSWORD=user1234 -e MYSQL_DATABASE=demo_app -d mysql/mysql-server:5.7
 *
 * (Opcional) Caso queira acessar o container para fazer alguma consulta:
 * docker exec -it mysql57 bash
 * e faça o login na instância do mysql:
 * mysql -h localhost -u root -p
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
