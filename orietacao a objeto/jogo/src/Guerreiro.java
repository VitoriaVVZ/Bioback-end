public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 90, 80, 15);
    }

    public void golpePesado(Personagem oponente) {
        System.out.println(this.getNome() + " usou Golpe Pesado!");
        oponente.receberDano(120);
    }
}