//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MetodoPagamento pix = new PagamentoPix();
        MetodoPagamento credito = new PagamentoCartaoCredito();
        MetodoPagamento boleto = new PagamentoBoleto();

    pix.processar(100);
    System.out.println("= = = = = = = = = = =");

    credito.processar(100);
    System.out.println("= = = = = = = = = = =");

    boleto.processar(100);

    }
}