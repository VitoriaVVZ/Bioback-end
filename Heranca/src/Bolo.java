public class Bolo extends Doce {

        Bolo(String nome, double peso, String cor) {
            super(nome, peso, cor);
        }

        @Override
        void Cobertura() {
            System.out.println(nome + " tem cobertura de: glace");
        }

        @Override
        void Massa() {
            System.out.println(nome + " tem massa de: massa fofinha");
        }
    }

