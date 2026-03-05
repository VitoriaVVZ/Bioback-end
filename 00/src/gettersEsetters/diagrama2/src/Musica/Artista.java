package Musica;

import java.time.LocalDate;

public class Artista {
    private String nome;
    private String pais;
    private LocalDate nasc;
    private String generoPrincipal;
    private int numeroAlbuns;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getNasc() {
        return nasc;
    }
    public void setNasc(LocalDate nasc) {
        this.nasc = nasc;
    }

    public String getGeneroPrincipal() {
        return generoPrincipal;
    }
    public void setGeneroPrincipal(String generoPrincipal) {
        this.generoPrincipal = generoPrincipal;
    }

    public int getNumeroAlbuns() {
        return numeroAlbuns;
    }
    public void setNumeroAlbuns(int numeroAlbuns) {
        this.numeroAlbuns = numeroAlbuns;
    }
}
