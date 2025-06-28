package br.faccat.model;

public class Cliente {
    public String nome;
    public String email;
    private String senha;

    public Cliente(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public void autenticarSenha(String senha) {
    }

    public void auterarSenha(String novaSenha) {
    }
}
