package facade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ManutencaoTest {

    @Test
    void deveRetornarPendenciaEletrica() {
        Manutencao manutencao = new Manutencao();
        Eletrica.getInstancia().addManutencaoPendente(manutencao);
        assertEquals(false, manutencao.aprovarManutencao());
    }

    @Test
    void deveRetornarPendenciaHidraulica() {
        Manutencao manutencao = new Manutencao();
        Hidraulica.getInstancia().addManutencaoPendente(manutencao);
        assertEquals(false, manutencao.aprovarManutencao());
    }

    @Test
    void deveRetornarPendenciaSeguranca() {
        Manutencao manutencao = new Manutencao();
        Seguranca.getInstancia().addManutencaoPendente(manutencao);
        assertEquals(false, manutencao.aprovarManutencao());
    }

    @Test
    void deveRetornarManutencaoSemPendencia() {
        Manutencao manutencao = new Manutencao();
        assertEquals(true, manutencao.aprovarManutencao());
    }
}