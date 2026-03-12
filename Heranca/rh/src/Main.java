
public class Main {
    public static void main(String[] args) {
        Farmaceutico farmaceutico = new Farmaceutico("nome", 0.0, "123");
        System.out.println(farmaceutico.calcularSalario(7000));

        Engenheiro engenheiro = new Engenheiro("nome2", 0.0, "456");
        System.out.println(engenheiro.calcularSalario(7000));
    }
}