package deliveryservice;

public class Pedido {

    private double valor;
    private PedidoEstado estado;
    private Cliente cliente;

    public Pedido(double valor) {
        this.valor = valor;
        this.estado = PedidoEstadoCancelado.getInstance();
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public boolean selecionar() {
        return estado.selecionar(this);
    }

    public boolean preparar() {
        return estado.preparar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public void comprarComDinheiro(double valor) {
        Cliente cliente = new Cliente(valor);
        this.valor = cliente.efetuarPagamento(new PagamentoDinheiro());
    }

    public void comprarComPix(double valor) {
        Cliente cliente = new Cliente(valor);
        this.valor = cliente.efetuarPagamento(new PagamentoPix());
    }

    public void comprarComCartaoCredito(double valor) {
        Cliente cliente = new Cliente(valor);
        this.valor = cliente.efetuarPagamento(new PagamentoCartaoCredito());
    }

    public void comprarComCartaoDebito(double valor) {
        Cliente cliente = new Cliente(valor);
        this.valor = cliente.efetuarPagamento(new PagamentoCartaoDebito());
    }

    public void comprarComBoleto(double valor) {
        Cliente cliente = new Cliente(valor);
        this.valor = cliente.efetuarPagamento(new PagamentoBoleto());
    }
}