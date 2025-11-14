package deliveryservice;

public class PedidoEstadoSelecionado extends PedidoEstado {

    private PedidoEstadoSelecionado() {};
    private static PedidoEstadoSelecionado instance = new PedidoEstadoSelecionado();
    public static PedidoEstadoSelecionado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Selecionado";
    }

    public boolean preparar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPreparado.getInstance());
        return true;
    }

    public boolean entregar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}