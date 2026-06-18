package com.exemple.controledemateriais.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String unidadeMedida;
    private int quantidade;
    private double valorUnitario;
    private long categoriaId;
    private String categoriaNome;

    public Material() {
    }

    public Material(Long id, String nome, String unidadeMedida, int quantidade, double valorUnitario, Long categoriaId, String categoriaNome) {
        this.id = id;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.categoriaId = categoriaId;
        this.categoriaNome = categoriaNome;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }
    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getCategoriaNome() {
        return categoriaNome;
    }
    public void setCategoriaNome(String categoriaNome) {
        this.categoriaNome = categoriaNome;
    }
}