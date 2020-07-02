package com.jornadajava;

public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void matricular() {
        System.out.println("Aluno(a) " + nome + " matriculado(a) com sucesso!");
    }

}
