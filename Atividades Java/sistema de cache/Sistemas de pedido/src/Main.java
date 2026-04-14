//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(1, "Luisa Guimarães", StatusPedido.AGUARDANDO_PAGAMENTO);
        Pedido pedido2 = new Pedido(2, "Emanuel Santiago", StatusPedido.PROCESSANDO);

        System.out.println("Status do Pedido: " + pedido.getStatusPedido());

        pedido.avancarStatus();
        System.out.println("Atualização da Entrega: " + pedido.getStatusPedido());

        pedido.avancarStatus();
        System.out.println("Atualização da Entrega: " + pedido.getStatusPedido());

        pedido.cancelarPedido();
        System.out.println("Situação da Entrega: " + pedido.getStatusPedido());

        System.out.println("===========");

        System.out.println("Status do Pedido: " + pedido2.getStatusPedido());

        pedido2.avancarStatus();
        System.out.println("Atualização da Entrega: " + pedido2.getStatusPedido());

        pedido2.avancarStatus();
        System.out.println("Atualização da Entrega: " + pedido2.getStatusPedido());

        pedido2.cancelarPedido();
        System.out.println("Situação da Entrega: " + pedido2.getStatusPedido());
    }
}