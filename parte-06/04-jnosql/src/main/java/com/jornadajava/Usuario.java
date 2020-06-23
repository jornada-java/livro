package com.jornadajava;

import java.io.Serializable;

import jakarta.nosql.mapping.Entity;
import jakarta.nosql.mapping.Id;

@Entity
public class Usuario implements Serializable {

    @Id
    private String id;
    private String nome;
    private String telefone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Usuario{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", telefone='").append(telefone).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
