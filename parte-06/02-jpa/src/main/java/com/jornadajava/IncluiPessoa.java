package com.jornadajava;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class IncluiPessoa {
    public static void main(String[] args) {
        var pessoa = new Pessoa();
        pessoa.setCpf("333.222.000-24");
        pessoa.setIdade(24);
        pessoa.setNome("Fulano Pessoa");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jornada");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin(); // Inicia uma transação com o Banco de dados

        manager.persist(pessoa); // Cria o registro no banco de dados
        System.out.println("Pessoa incluida!");

        pessoa.setNome("Nome da Pessoa Alterado");

        manager.merge(pessoa); // Altera o registro anteriormente criado

        // Abaixo o registro de Pessoa é carregado do banco de dados a partir
        // do valor de sua chave primária
        Pessoa pessoaEncontrada = manager.find(Pessoa.class, "333.222.000-24");
        System.out.println("pessoaEncontrada = " + pessoaEncontrada.getNome());

        manager.remove(pessoa); // Exclui o registro do banco de dados

        manager.getTransaction().commit(); // Finaliza a transação no banco de dados

        manager.close();
        factory.close();
    }
}
