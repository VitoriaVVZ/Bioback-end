package Jogos;

import java.time.LocalDate;

public class Jogador {
    private String nome;
    private int idade;
    private LocalDate dataregis;
    private int nivel;
    private double experiencia;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataregis() {
        return dataregis;
    }
    public void setDataregis(LocalDate dataregis) {
        this.dataregis = dataregis;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }
}
