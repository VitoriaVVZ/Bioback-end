public class Farmaceutico extends Funcionario {

    private String crf;

    public Farmaceutico(String nome, double salario, String rg) {
        super(nome, salario, rg);
    }

    @Override
    public double calcularSalario(double valor) {
        return valor - (valor * 0.15);
    }

    public Farmaceutico(String nome, double salario, String rg, String crf) {
        super(nome, salario, rg);
        this.crf = crf;
    }
}
