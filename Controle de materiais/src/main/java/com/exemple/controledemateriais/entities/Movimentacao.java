package com.exemple.controledemateriais.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_movimentacao")
public class Movimentacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long materialId;
    private String materialNome;
    private String tipo;
    private int quantidade;
    private double valorTotal;
    private LocalDate data;

    public Movimentacao(Long id, Long materialId, String materialNome, String tipo, int quantidade, double valorTotal, LocalDate data) {
        this.id = id;
        this.materialId = materialId;
        this.materialNome = materialNome;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.data = data;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {

        this.id = id;
    }

    public Long getMaterialId() {

        return materialId;
    }
    public void setMaterialId(Long materialId) {

        this.materialId = materialId;
    }

    public String getMaterialNome() {

        return materialNome;
    }
    public void setMaterialNome(String materialNome) {

        this.materialNome = materialNome;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantity) {
        this.quantidade = quantity;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
}


