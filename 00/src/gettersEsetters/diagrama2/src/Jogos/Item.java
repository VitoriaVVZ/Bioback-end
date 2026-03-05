package Jogos;

public class Item {
    private String nome;
    private String descricao;
    private String tipoItem;
    private int durabildadeItem;
    private int quantidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoItem() {
        return tipoItem;
    }
    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public int getDurabildadeItem() {
        return durabildadeItem;
    }
    public void setDurabildadeItem(int durabildadeItem) {
        this.durabildadeItem = durabildadeItem;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
