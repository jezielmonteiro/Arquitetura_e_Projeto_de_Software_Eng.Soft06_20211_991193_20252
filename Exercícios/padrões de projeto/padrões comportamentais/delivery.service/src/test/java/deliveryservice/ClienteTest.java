package deliveryservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    // Notificar Clientes

    @Test
    void deveNotificarUmCliente() {
        Delivery delivery = new Delivery("Delivery 1");
        Cliente cliente = new Cliente(75.0);
        cliente.setNome("Cliente 1");
        cliente.registrar(delivery);
        Pedido pedido = new Pedido(75.0);
        pedido.setCliente(cliente);
        pedido.setEstado(PedidoEstadoPreparado.getInstance());
        delivery.notificarEstado(pedido);
        assertEquals("Notificação para Cliente 1 por Delivery{nome=Delivery 1}: O pedido no momento está -> Preparado", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientes() {
        Delivery delivery1 = new Delivery("Delivery 1");
        Delivery delivery2 = new Delivery("Delivery 2");
        Cliente cliente1 = new Cliente(100.0);
        cliente1.setNome("Cliente 1");
        Cliente cliente2 = new Cliente(42.0);
        cliente2.setNome("Cliente 2");
        cliente1.registrar(delivery1);
        cliente2.registrar(delivery2);
        Pedido pedido1 = new Pedido(100.0);
        pedido1.setCliente(cliente1);
        pedido1.setEstado(PedidoEstadoPreparado.getInstance());
        Pedido pedido2 = new Pedido(42.0);
        pedido2.setCliente(cliente2);
        pedido2.setEstado(PedidoEstadoEntregue.getInstance());
        delivery1.notificarEstado(pedido1);
        delivery2.notificarEstado(pedido2);
        assertEquals("Notificação para Cliente 1 por Delivery{nome=Delivery 1}: O pedido no momento está -> Preparado", cliente1.getUltimaNotificacao());
        assertEquals("Notificação para Cliente 2 por Delivery{nome=Delivery 2}: O pedido no momento está -> Entregue", cliente2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarCliente() {
        Delivery delivery = new Delivery("Delivery 1");
        Cliente cliente = new Cliente(120.0);
        cliente.setNome("Cliente 1");
        Pedido pedido = new Pedido(120.0);
        pedido.setCliente(cliente);
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        delivery.notificarEstado(pedido);
        assertEquals(null, cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClienteDeliveryA() {
        Delivery deliveryA = new Delivery("Delivery A");
        Delivery deliveryB = new Delivery("Delivery B");
        Cliente cliente1 = new Cliente(87.0);
        cliente1.setNome("Cliente 1");
        Cliente cliente2 = new Cliente(68.0);
        cliente2.setNome("Cliente 2");
        cliente1.registrar(deliveryA);
        cliente2.registrar(deliveryB);
        Pedido pedido1 = new Pedido(87.0);
        pedido1.setCliente(cliente1);
        pedido1.setEstado(PedidoEstadoSelecionado.getInstance());
        Pedido pedido2 = new Pedido(68.0);
        pedido2.setCliente(cliente2);
        pedido2.setEstado(PedidoEstadoEntregue.getInstance());
        deliveryA.notificarEstado(pedido1);
        assertEquals("Notificação para Cliente 1 por Delivery{nome=Delivery A}: O pedido no momento está -> Selecionado", cliente1.getUltimaNotificacao());
        assertEquals(null, cliente2.getUltimaNotificacao());
    }
}