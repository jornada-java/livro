package com.jornadajava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA")
public class Pessoa {

    @Id
    @Column(name = "CPF", length = 14)
    private String cpf;

    @Column(name = "NOME", length = 250)
    private String nome;

    @Column(name = "IDADE", length = 5)
    private Integer idade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
