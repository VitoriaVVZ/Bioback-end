package Jogos;

public class Inimigo {
    private String nome;
    private String raca;
    private int poderAtaque;
    private String armaInimigo;
    private int vidaInimigo;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }
    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public String getArmaInimigo() {
        return armaInimigo;
    }
    public void setArmaInimigo(String armaInimigo) {
        this.armaInimigo = armaInimigo;
    }

    public int getVidaInimigo() {
        return vidaInimigo;
    }
    public void setVidaInimigo(int vidaInimigo) {
        this.vidaInimigo = vidaInimigo;
    }
}
