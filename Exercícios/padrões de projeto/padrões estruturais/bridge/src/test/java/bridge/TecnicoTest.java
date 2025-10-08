package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TecnicoTest {

    @Test
    void deveRetornarBeneficioTecnicoComValeTransporte() {
        Beneficio beneficio = new ValeTransporte();
        Tecnico tecnico = new Tecnico();
        tecnico.setBeneficio(beneficio);
        assertEquals("Vale Transporte obtido", tecnico.definirBeneficio());
    }

    @Test
    void deveRetornarBeneficioTecnicoComPlanoSaude() {
        Beneficio beneficio = new PlanoSaude();
        Tecnico tecnico = new Tecnico();
        tecnico.setBeneficio(beneficio);
        assertEquals("Plano de Saúde obtido", tecnico.definirBeneficio());
    }

    @Test
    void deveRetornarBeneficioTecnicoComAuxilioEducacao() {
        Beneficio beneficio = new AuxilioEducacao();
        Tecnico tecnico = new Tecnico();
        tecnico.setBeneficio(beneficio);
        assertEquals("Auxílio Educação obtido", tecnico.definirBeneficio());
    }
}