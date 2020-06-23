package com.jornadajava;

public final class UsuarioBuilder {
    private Usuario usuario;

    private UsuarioBuilder() {
        usuario = new Usuario();
    }

    public static UsuarioBuilder of() {
        return new UsuarioBuilder();
    }

    public UsuarioBuilder id(String id) {
        usuario.setId(id);
        return this;
    }

    public UsuarioBuilder nome(String nome) {
        usuario.setNome(nome);
        return this;
    }

    public UsuarioBuilder telefone(String telefone) {
        usuario.setTelefone(telefone);
        return this;
    }

    public Usuario build() {
        return usuario;
    }
}
