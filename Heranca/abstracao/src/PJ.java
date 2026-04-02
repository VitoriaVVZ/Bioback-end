// Conta Pessoa Jurídica
public class PJ extends Conta{
    @Override
    public void calcularTarifaMensal(){
        setSaldo(getSaldo()-20);
        System.out.println("Houve um desconto de R$20 da tarifa");
        exibirSaldo();
    }
}
