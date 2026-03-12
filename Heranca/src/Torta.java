public class Torta extends Doce {

    Torta(String nome, double peso, String cor) {
        super(nome, peso, cor);
    }

    @Override
    void Cobertura() {
        System.out.println(nome + " tem cobertura de: merengue");
    }

    @Override
    void Massa() {
        System.out.println(nome + " tem massa de: massa podre");
    }
}
