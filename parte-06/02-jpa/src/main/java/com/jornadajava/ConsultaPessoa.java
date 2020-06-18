package com.jornadajava;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConsultaPessoa {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("jornada");

        EntityManager em = factory.createEntityManager();

        var pessoaNova = new Pessoa();
        pessoaNova.setCpf("111.222.000-24");
        pessoaNova.setIdade(24);
        pessoaNova.setNome("Fulano Pessoa");

        em.getTransaction().begin();

        em.persist(pessoaNova); // Cria o registro no banco de dados
        System.out.println("Pessoa incluida!");

        String jpql = "SELECT p FROM Pessoa p WHERE " +
                "p.nome = :nomePesquisa";

        var query = em.createQuery(jpql, Pessoa.class);
        query.setParameter("nomePesquisa", "Fulano Pessoa");

        for (var pessoa : query.getResultList()) {
            System.out.println("O nome da pessoa é: " + pessoa.getNome());
        }

        em.getTransaction().commit();
        em.close();
        factory.close();
    }
}
