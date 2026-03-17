public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 65, 49, 55);
    }

    public void disparoPreciso(Personagem oponente) {
        System.out.println(getNome() + " efetuou um Disparo Preciso!");
        oponente.receberDano(50);
    }
}