public abstract class Conta {
    private int numero;
    private String agencia;
    private String titular;
    private double saldo;

    public Conta(int numero, String agencia, String titular, double saldoInicial) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Agência: " + agencia + " | Saldo: " + saldo);
    }

    public int getNumero(){
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract double calcularTarifaMensal();
}
