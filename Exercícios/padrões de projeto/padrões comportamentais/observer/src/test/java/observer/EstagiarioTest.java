package observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EstagiarioTest {

    @Test
    void deveNotificarUmEstagiario() {
        Empresa empresa = new Empresa("Empresa A", "12.345.678/0001-90");
        Estagiario estagiario = new Estagiario("Estagiário 1", "521.819.962-10");
        estagiario.contratar(empresa);
        empresa.enviarRemuneracao();
        assertEquals("Estagiário 1, Bolsa-auxílio enviada pela Empresa{nome='Empresa A', cnpj='12.345.678/0001-90'}", estagiario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarEstagiarios() {
        Empresa empresa = new Empresa("Empresa A", "12.345.678/0001-90");
        Estagiario estagiario1 = new Estagiario("Estagiário 1", "521.819.962-10");
        Estagiario estagiario2 = new Estagiario("Estagiário 2", "867.406.480-93");
        estagiario1.contratar(empresa);
        estagiario2.contratar(empresa);
        empresa.enviarRemuneracao();
        assertEquals("Estagiário 1, Bolsa-auxílio enviada pela Empresa{nome='Empresa A', cnpj='12.345.678/0001-90'}", estagiario1.getUltimaNotificacao());
        assertEquals("Estagiário 2, Bolsa-auxílio enviada pela Empresa{nome='Empresa A', cnpj='12.345.678/0001-90'}", estagiario2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarEstagiario() {
        Empresa empresa = new Empresa("Empresa A", "12.345.678/0001-90");
        Estagiario estagiario = new Estagiario("Estagiário 1", "521.819.962-10");
        empresa.enviarRemuneracao();
        assertEquals(null, estagiario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarEstagiarioEmpresaA() {
        Empresa empresaA = new Empresa("Empresa A", "12.345.678/0001-90");
        Empresa empresaB = new Empresa("Empresa B", "11.121.314/0001-50");
        Estagiario estagiario1 = new Estagiario("Estagiário 1", "521.819.962-10");
        Estagiario estagiario2 = new Estagiario("Estagiário 2", "867.406.480-93");
        estagiario1.contratar(empresaA);
        estagiario2.contratar(empresaB);
        empresaA.enviarRemuneracao();
        assertEquals("Estagiário 1, Bolsa-auxílio enviada pela Empresa{nome='Empresa A', cnpj='12.345.678/0001-90'}", estagiario1.getUltimaNotificacao());
        assertEquals(null, estagiario2.getUltimaNotificacao());
    }
}