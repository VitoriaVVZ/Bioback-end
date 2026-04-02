public class PagamentoCartaoCredito implements MetodoPagamento{

    @Override
    public void processar (double valor){

        System.out.println("Verificicando dados do cartao de crédito");
        System.out.println("Pagamento de R$ " + valor + " no cartao de credito aprovado com sucesso");
    }
}
