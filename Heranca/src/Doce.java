public class Doce {
    String nome;
    String cor;
    double peso;

    Doce(String nome, double peso, String cor) {
        this.nome = nome;
        this.peso = peso;
        this.cor = cor;
    }

    void Cobertura() {
        System.out.println(nome + " tem cobertura de cor: " + cor);
    }

    void Massa() {
        System.out.println(nome + " tem massa de: " + cor);
    }
}

