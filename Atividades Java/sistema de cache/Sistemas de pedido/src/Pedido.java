public class Pedido {
    private int id;
    private String cliente;
    private StatusPedido statusPedido;

    public Pedido(int id, String cliente, StatusPedido statusPedido) {
        this.id = id;
        this.cliente = cliente;
        this.statusPedido = statusPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", statusPedido=" + statusPedido +
                '}';
    }

    public void avancarStatus() {
        if (this.statusPedido == StatusPedido.AGUARDANDO_PAGAMENTO) {
            this.statusPedido = StatusPedido.PROCESSANDO;
        } else if (this.statusPedido == StatusPedido.PROCESSANDO) {
            this.statusPedido = StatusPedido.ENVIADO;
        } else if (this.statusPedido == StatusPedido.ENVIADO) {
            this.statusPedido = StatusPedido.ENTREGUE;
        }
    }

    public void cancelarPedido() {
        if (this.statusPedido != StatusPedido.ENTREGUE) {
            this.statusPedido = StatusPedido.CANCELADO;
            System.out.println("Pedido " + id + " foi cancelado.");
        } else {
            System.out.println("Não é possível cancelar um pedido já entregue.");
        }
    }
}