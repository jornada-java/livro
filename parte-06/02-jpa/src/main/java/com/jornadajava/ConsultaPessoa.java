package com.jornadajava;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConsultaPessoa {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory(null);

        EntityManager em = factory.createEntityManager();

        String jpql = "SELECT p FROM Pessoa p WHERE " +
                "p.nome = :nomePesquisa";

        var query = em.createQuery(jpql, Pessoa.class);
        query.setParameter("nomePesquisa", "Fulano Pessoa");

        for (var pessoa : query.getResultList()) {
            System.out.println("O nome da pessoa é: " + pessoa.getNome());
        }

        em.close();
        factory.close();
    }
}
