package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaquinaCafeTest {

    MaquinaCafe maquina;

    @BeforeEach
    public void setUp() {
        maquina = new MaquinaCafe();
    }

    // Máquina Ligada

    @Test
    public void naoDeveLigarMaquinaLigada() {
        maquina.setEstado(MaquinaEstadoLigada.getInstance());
        assertFalse(maquina.ligar());
    }

    @Test
    public void deveDesligarMaquinaLigada() {
        maquina.setEstado(MaquinaEstadoLigada.getInstance());
        assertTrue(maquina.desligar());
        assertEquals(MaquinaEstadoDesligada.getInstance(), maquina.getEstado());
    }

    @Test
    public void deveCancelarMaquinaLigada() {
        maquina.setEstado(MaquinaEstadoLigada.getInstance());
        assertTrue(maquina.cancelar());
        assertEquals(MaquinaEstadoCancelada.getInstance(), maquina.getEstado());
    }

    @Test
    public void deveEscolherCafeMaquinaLigada() {
        maquina.setEstado(MaquinaEstadoLigada.getInstance());
        assertTrue(maquina.escolherCafe());
        assertEquals(MaquinaEstadoCafeEscolhido.getInstance(), maquina.getEstado());
    }

    @Test
    public void devePrepararCafeMaquinaLigada() {
        maquina.setEstado(MaquinaEstadoLigada.getInstance());
        assertTrue(maquina.prepararCafe());
        assertEquals(MaquinaEstadoCafePreparado.getInstance(), maquina.getEstado());
    }

    // Máquina Desligada

    @Test
    public void deveLigarMaquinaDesligada() {
        maquina.setEstado(MaquinaEstadoDesligada.getInstance());
        assertTrue(maquina.ligar());
        assertEquals(MaquinaEstadoLigada.getInstance(), maquina.getEstado());
    }

    @Test
    public void naoDeveDesligarMaquinaDesligada() {
        maquina.setEstado(MaquinaEstadoDesligada.getInstance());
        assertFalse(maquina.desligar());
    }

    @Test
    public void naoDeveCancelarMaquinaDesligada() {
        maquina.setEstado(MaquinaEstadoDesligada.getInstance());
        assertFalse(maquina.cancelar());
    }

    @Test
    public void naoDeveEscolherCafeMaquinaDesligada() {
        maquina.setEstado(MaquinaEstadoDesligada.getInstance());
        assertFalse(maquina.escolherCafe());
    }

    @Test
    public void naoDevePrepararCafeMaquinaDesligada() {
        maquina.setEstado(MaquinaEstadoDesligada.getInstance());
        assertFalse(maquina.prepararCafe());
    }

    // Máquina Cancelada

    @Test
    public void deveDesligarMaquinaCancelada() {
        maquina.setEstado(MaquinaEstadoCancelada.getInstance());
        assertTrue(maquina.desligar());
        assertEquals(MaquinaEstadoDesligada.getInstance(), maquina.getEstado());
    }

    @Test
    public void naoDeveLigarMaquinaCancelada() {
        maquina.setEstado(MaquinaEstadoCancelada.getInstance());
        assertFalse(maquina.ligar());
    }

    @Test
    public void naoDeveCancelarMaquinaCancelada() {
        maquina.setEstado(MaquinaEstadoCancelada.getInstance());
        assertFalse(maquina.cancelar());
    }

    @Test
    public void naoDeveEscolherCafeMaquinaCancelada() {
        maquina.setEstado(MaquinaEstadoCancelada.getInstance());
        assertFalse(maquina.escolherCafe());
    }

    @Test
    public void naoDevePrepararCafeMaquinaCancelada() {
        maquina.setEstado(MaquinaEstadoCancelada.getInstance());
        assertFalse(maquina.prepararCafe());
    }

    // Máquina Café Escolhido

    @Test
    public void devePrepararCafeMaquinaCafeEscolhido() {
        maquina.setEstado(MaquinaEstadoCafeEscolhido.getInstance());
        assertTrue(maquina.prepararCafe());
        assertEquals(MaquinaEstadoCafePreparado.getInstance(), maquina.getEstado());
    }

    @Test
    public void deveCancelarMaquinaCafeEscolhido() {
        maquina.setEstado(MaquinaEstadoCafeEscolhido.getInstance());
        assertTrue(maquina.cancelar());
        assertEquals(MaquinaEstadoCancelada.getInstance(), maquina.getEstado());
    }

    @Test
    public void naoDeveLigarMaquinaCafeEscolhido() {
        maquina.setEstado(MaquinaEstadoCafeEscolhido.getInstance());
        assertFalse(maquina.ligar());
    }

    @Test
    public void naoDeveDesligarMaquinaCafeEscolhido() {
        maquina.setEstado(MaquinaEstadoCafeEscolhido.getInstance());
        assertFalse(maquina.desligar());
    }

    @Test
    public void naoDeveEscolherCafeMaquinaCafeEscolhido() {
        maquina.setEstado(MaquinaEstadoCafeEscolhido.getInstance());
        assertFalse(maquina.escolherCafe());
    }

    // Máquina Café Preparado

    @Test
    public void deveDesligarMaquinaCafePreparado() {
        maquina.setEstado(MaquinaEstadoCafePreparado.getInstance());
        assertTrue(maquina.desligar());
        assertEquals(MaquinaEstadoDesligada.getInstance(), maquina.getEstado());
    }

    @Test
    public void naoDeveLigarMaquinaCafePreparado() {
        maquina.setEstado(MaquinaEstadoCafePreparado.getInstance());
        assertFalse(maquina.ligar());
    }

    @Test
    public void naoDeveCancelarMaquinaCafePreparado() {
        maquina.setEstado(MaquinaEstadoCafePreparado.getInstance());
        assertFalse(maquina.cancelar());
    }

    @Test
    public void naoDeveEscolherCafeMaquinaCafePreparado() {
        maquina.setEstado(MaquinaEstadoCafePreparado.getInstance());
        assertFalse(maquina.escolherCafe());
    }

    @Test
    public void naoDevePrepararCafeMaquinaCafePreparado() {
        maquina.setEstado(MaquinaEstadoCafePreparado.getInstance());
        assertFalse(maquina.prepararCafe());
    }
}