// Conta Corrente
public class CC extends Conta{
  @Override
    public void calcularTarifaMensal(){
      setSaldo(getSaldo()-12);
      System.out.println("Houve um desconto de R$12 da tarifa");
      exibirSaldo();
  }
}
