package com.example.authsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String senha;
    private String email;
    private String nome;
    private LocalDate dtCriacao;

    public Usuario(String senha, String email, String nome, LocalDate dtCriacao) {
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.dtCriacao = dtCriacao;
    }

    public Usuario(long id, String senha, String email, String nome, LocalDate dtCriacao) {
        this.id = id;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.dtCriacao = dtCriacao;
    }
    public Usuario() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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