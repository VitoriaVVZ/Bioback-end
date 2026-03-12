public class Engenheiro extends Funcionario{

    private String numCrea;

    public Engenheiro(String nome, double salario, String rg) {
        super(nome, salario, rg);
    }

    @Override
    public double calcularSalario(double valor) {
        return valor - (valor * 0.27);
    }

    public Engenheiro(String nome, double salario, String rg, String numCrea) {
        super(nome, salario, rg);
        this.numCrea = numCrea;
    }
}
