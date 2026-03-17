public class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void atacar(Personagem oponente) {
        System.out.println(this.nome + " atacou " + oponente.getNome());
        oponente.receberDano(this.ataque);
    }
    public void receberDano(int dano) {

        int danoReal = dano - this.defesa;
        if (danoReal <= 0) {
            danoReal = 10;
        }

        this.vida -= danoReal;
        System.out.println(this.nome + " recebeu " + danoReal + " de dano.");
        System.out.println("Vida atual de " + this.nome + ": " + this.vida);
    }
    public void mostrarStatus() {
        System.out.println("--- " + this.nome + " ---");
        System.out.println("Vida: " + this.vida);
        System.out.println("Forca: " + this.ataque);
        System.out.println("Defesa: " + this.defesa);
    }
    public boolean estaVivo() {
        return this.vida > 0;
    }
}

