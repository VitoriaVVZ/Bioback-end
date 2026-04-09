public class Pedido {

    private int id;
    private String NomeCliente;
    private Status status;

    public Pedido(){}

    public Pedido(int id, String nomeCliente, Status status) {
        this.id = id;
        NomeCliente = nomeCliente;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", NomeCliente='" + NomeCliente + '\'' +
                ", status=" + status +
                '}';
    }
}
