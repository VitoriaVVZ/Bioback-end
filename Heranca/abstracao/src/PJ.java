// Conta Pessoa Jurídica
public class PJ extends Conta {

    public PJ(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public double calcularTarifaMensal() {
        return 20.0;
    }

    @Override
    public void sacar(double valor) {
        super.setSaldo(getSaldo() - valor - 1.50);
        super.setSaldo(super.getSaldo() - 20.0);
    }
}
