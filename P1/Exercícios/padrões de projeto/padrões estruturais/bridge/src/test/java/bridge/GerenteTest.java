package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveRetornarBeneficioGerenteComValeTransporte() {
        Beneficio beneficio = new ValeTransporte();
        Gerente gerente = new Gerente();
        gerente.setBeneficio(beneficio);
        assertEquals("Vale Transporte obtido", gerente.definirBeneficio());
    }

    @Test
    void deveRetornarBeneficioGerenteComPlanoSaude() {
        Beneficio beneficio = new PlanoSaude();
        Gerente gerente = new Gerente();
        gerente.setBeneficio(beneficio);
        assertEquals("Plano de Saúde obtido", gerente.definirBeneficio());
    }

    @Test
    void deveRetornarBeneficioGerenteComAuxilioEducacao() {
        Beneficio beneficio = new AuxilioEducacao();
        Gerente gerente = new Gerente();
        gerente.setBeneficio(beneficio);
        assertEquals("Auxílio Educação obtido", gerente.definirBeneficio());
    }
}