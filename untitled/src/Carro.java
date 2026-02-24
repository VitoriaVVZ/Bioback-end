public class Carro {
    public String modelo;
    private int velocidade;

    public void acelerar() {
        System.out.println("VRUUUUM");
    }

    public Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
    public Carro() {

    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
