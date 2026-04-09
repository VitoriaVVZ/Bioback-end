public class Main2 {
    public static void main(String[] args) {

    Pedido pedido = new Pedido(1, "Luisa", Status.AGUARDANDO_PAGAMENTO);

    System.out.println(pedido);

    pedido.setStatus(Status.CANCELADO);
    
    System.out.println(pedido);
    }
}