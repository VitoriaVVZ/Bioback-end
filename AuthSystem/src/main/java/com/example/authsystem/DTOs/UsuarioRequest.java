package com.example.authsystem.DTOs;

import java.time.LocalDate;

public class UsuarioRequest {

    private String senha;
    private String email;
    private String nome;
    private LocalDate dtCriacao;

    public UsuarioRequest(String senha, String email, String nome, LocalDate dtCriacao) {
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.dtCriacao = dtCriacao;
    }

    public UsuarioRequest(){}


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(LocalDate dtCriacao) {
        this.dtCriacao = dtCriacao;
    }
}