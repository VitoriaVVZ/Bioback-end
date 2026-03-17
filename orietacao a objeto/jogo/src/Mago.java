public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 80, 25, 5);
    }

    public void lancarMagia(Personagem oponente) {
        System.out.println(getNome() + " lançou Raio Paralisante!");
        oponente.receberDano(getVida() > 0 ? 35 : 0);
    }
}
