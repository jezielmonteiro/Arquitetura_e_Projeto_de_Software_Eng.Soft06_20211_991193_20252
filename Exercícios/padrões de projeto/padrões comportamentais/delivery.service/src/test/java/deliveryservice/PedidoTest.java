package deliveryservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido(0);
    }

    // Pedido Selecionado

    @Test
    public void devePrepararPedidoSelecionado() {
        pedido.setEstado(PedidoEstadoSelecionado.getInstance());
        assertTrue(pedido.preparar());
        assertEquals(PedidoEstadoPreparado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveEntregarPedidoSelecionado() {
        pedido.setEstado(PedidoEstadoSelecionado.getInstance());
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoSelecionado() {
        pedido.setEstado(PedidoEstadoSelecionado.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveSelecionarPedidoSelecionado() {
        pedido.setEstado(PedidoEstadoSelecionado.getInstance());
        assertFalse(pedido.selecionar());
    }

    // Pedido Preparado

    @Test
    public void deveEntregarPedidoPreparado() {
        pedido.setEstado(PedidoEstadoPreparado.getInstance());
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoPreparado() {
        pedido.setEstado(PedidoEstadoPreparado.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveSelecionarPedidoPreparado() {
        pedido.setEstado(PedidoEstadoPreparado.getInstance());
        assertFalse(pedido.selecionar());
    }

    @Test
    public void naoDevePrepararPedidoPreparado() {
        pedido.setEstado(PedidoEstadoPreparado.getInstance());
        assertFalse(pedido.preparar());
    }

    // Pedido Entregue

    @Test
    public void naoDeveSelecionarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.selecionar());
    }

    @Test
    public void naoDevePrepararPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveEntregarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveCancelarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.cancelar());
    }

    // Pedido Cancelado

    @Test
    public void naoDeveSelecionarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.selecionar());
    }

    @Test
    public void naoDevePrepararPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveEntregarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveCancelarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.cancelar());
    }

    // Comprar com Opções de Pagamento

    @Test
    void deveComprarComDinheiro() {
        Pedido pedido = new Pedido(200.0);
        pedido.comprarComDinheiro(200.0);
        assertEquals(180.0, pedido.getValor());
    }

    @Test
    void deveComprarComPix() {
        Pedido pedido = new Pedido(400.0);
        pedido.comprarComPix(400.0);
        assertEquals(320.0, pedido.getValor());
    }

    @Test
    void deveComprarComCartaoCredito() {
        Pedido pedido = new Pedido(600.0);
        pedido.comprarComCartaoCredito(600.0);
        assertEquals(570.0, pedido.getValor());
    }

    @Test
    void deveComprarComCartaoDebito() {
        Pedido pedido = new Pedido(800.0);
        pedido.comprarComCartaoDebito(800.0);
        assertEquals(800.0, pedido.getValor());
    }

    @Test
    void deveComprarComBoleto() {
        Pedido pedido = new Pedido(1000.0);
        pedido.comprarComBoleto(1000.0);
        assertEquals(1000.0, pedido.getValor());
    }
}