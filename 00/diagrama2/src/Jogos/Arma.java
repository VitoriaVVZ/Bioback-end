package Jogos;

public class Arma {
    private String nome;
    private int poder;
    private String tipoArma;
    private int durabilidade;
    private int stamina;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }
    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getTipoArma() {
        return tipoArma;
    }
    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    public int getDurabilidade() {
        return durabilidade;
    }
    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    public int getStamina() {
        return stamina;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
