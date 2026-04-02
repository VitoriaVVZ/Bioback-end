// Conta Pessoa Jurídica
public class PJ extends Conta{
   
        public PJ() {
    }

    public PJ(int numero, int agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }
    
    @Override
    public void calcularTarifaMensal(){
        setSaldo(getSaldo()-20);
        System.out.println("Houve um desconto de R$20 da tarifa");
        exibirSaldo();
    }
}
