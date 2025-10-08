package singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CantinaTest {

    @Test
    public void deveRetornarNomeCantina() {
        Cantina.getInstance().setNomeCantina("Cantina Univassouras");
        assertEquals("Cantina Univassouras", Cantina.getInstance().getNomeCantina());
    }

    @Test
    public void deveRetornarClienteCantina() {
        Cantina.getInstance().setClienteCantina("Jeziel");
        assertEquals("Jeziel", Cantina.getInstance().getClienteCantina());
    }

    @Test
    public void deveRetornarProdutoComprado() {
        Cantina.getInstance().setProdutoComprado("Coca-Cola Zero Açúcar 350ml Lata");
        assertEquals("Coca-Cola Zero Açúcar 350ml Lata", Cantina.getInstance().getProdutoComprado());
    }
}