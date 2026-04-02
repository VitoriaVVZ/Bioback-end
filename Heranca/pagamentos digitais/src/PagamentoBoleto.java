public class PagamentoBoleto implements MetodoPagamento{

    @Override
    public void processar (double valor){

        System.out.println("Gerando boleto bancário");
        System.out.println("Boleto de R$ " + valor + " emitido com sucesso");
    }
}
