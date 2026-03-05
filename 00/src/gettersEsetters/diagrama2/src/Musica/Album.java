package Musica;

public class Album {
    private String titulo;
    private int anoLancamento;
    private int numeroFaixas;
    private String gravadora;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getNumeroFaixas() {
        return numeroFaixas;
    }
    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

    public String getGravadora() {
        return gravadora;
    }
    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }
}


