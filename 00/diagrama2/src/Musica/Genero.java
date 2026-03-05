package Musica;

public class Genero {
    private String nome;
    private String origem;
    private int anoCriacao;
    private int popularidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }
    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public int getPopularidade() {
        return popularidade;
    }
    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }
}
