package strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveComprarComDinheiro() {
        Cliente cliente = new Cliente();
        cliente.comprarComDinheiro(200);
        assertEquals(180, cliente.getValor());
    }

    @Test
    void deveComprarComPix() {
        Cliente cliente = new Cliente();
        cliente.comprarComPix(400);
        assertEquals(320, cliente.getValor());
    }

    @Test
    void deveComprarComCartaoCredito() {
        Cliente cliente = new Cliente();
        cliente.comprarComCartaoCredito(600);
        assertEquals(570, cliente.getValor());
    }

    @Test
    void deveComprarComCartaoDebito() {
        Cliente cliente = new Cliente();
        cliente.comprarComCartaoDebito(800);
        assertEquals(800, cliente.getValor());
    }

    @Test
    void deveComprarComBoleto() {
        Cliente cliente = new Cliente();
        cliente.comprarComBoleto(1000);
        assertEquals(1000, cliente.getValor());
    }
}