package deliveryservice;

public abstract class PedidoEstado {

    public abstract String getEstado();

    public boolean selecionar(Pedido pedido) {
        return false;
    }

    public boolean preparar(Pedido pedido) {
        return false;
    }

    public boolean entregar(Pedido pedido) {
        return false;
    }

    public boolean cancelar(Pedido pedido) {
        return false;
    }
}