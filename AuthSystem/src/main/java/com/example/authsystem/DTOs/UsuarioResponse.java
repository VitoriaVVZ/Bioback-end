package com.example.authsystem.DTOs;

import com.example.authsystem.entities.Usuario;

import java.time.LocalDate;

public class UsuarioResponse {

    private long id;
    private String email;
    private String nome;
    private LocalDate dtCriacao;

    public UsuarioResponse(){}

    public UsuarioResponse(long id, String email, String nome, LocalDate dtCriacao) {
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.dtCriacao = dtCriacao;
    }

    public UsuarioResponse(Usuario usuario) {
        id = Long.parseLong(usuario.getNome());
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
