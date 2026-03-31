// Conta Corrente
public class CC extends Conta {

    public CC(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
        saldo = saldo - 12;
    }

    @Override
    public double calcularTarifaMensal() {
        return 12.0;
    }
}
