public class Main {
    public static void main(String[] args) {

        Mago mago = new Mago ("Aethros");
        Guerreiro guerreiro = new Guerreiro("Drakarion");
        Arqueiro arqueiro = new Arqueiro("Lythiriel");

        System.out.println("=== STATUS INICIAIS ===");
        mago.mostrarStatus();
        guerreiro.mostrarStatus();
        arqueiro.mostrarStatus();
        System.out.println("-------------------------");

        System.out.println("|| INÍCIO DA BATALHA ||");

        arqueiro.disparoPreciso(guerreiro);
        guerreiro.mostrarStatus();

        System.out.println("-------------------------");

        guerreiro.golpePesado(arqueiro);
        arqueiro.mostrarStatus();

        System.out.println("|| FIM DA SIMULAÇÃO ||");
    }
}
