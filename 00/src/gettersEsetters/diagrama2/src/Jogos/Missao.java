package Jogos;

import java.time.LocalDate;

public class Missao {
    private int nivelRequerido;
    private String descricao;
    private String status;
    private LocalDate dataLimite;
    private int recompensa;

    public int getNivelRequerido() {
        return nivelRequerido;
    }
    public void setNivelRequerido(int nivelRequerido) {
        this.nivelRequerido = nivelRequerido;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }
    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public int getRecompensa() {
        return recompensa;
    }
    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }
}
