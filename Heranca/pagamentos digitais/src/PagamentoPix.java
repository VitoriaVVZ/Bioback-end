public class PagamentoPix implements MetodoPagamento {

    @Override
    public void processar (double valor) {

        System.out.println("Gerando o QRCode");
        System.out.println("Processando R$ " + valor + " via Pix");
    }

}