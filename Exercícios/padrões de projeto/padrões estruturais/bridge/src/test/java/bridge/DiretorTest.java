package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveRetornarBeneficioDiretorComValeTransporte() {
        Beneficio beneficio = new ValeTransporte();
        Diretor diretor = new Diretor();
        diretor.setBeneficio(beneficio);
        assertEquals("Vale Transporte obtido", diretor.definirBeneficio());
    }

    @Test
    void deveRetornarBeneficioDiretorComPlanoSaude() {
        Beneficio beneficio = new PlanoSaude();
        Diretor diretor = new Diretor();
        diretor.setBeneficio(beneficio);
        assertEquals("Plano de Saúde obtido", diretor.definirBeneficio());
    }

    @Test
    void deveRetornarBeneficioDiretorComAuxilioEducacao() {
        Beneficio beneficio = new AuxilioEducacao();
        Diretor diretor = new Diretor();
        diretor.setBeneficio(beneficio);
        assertEquals("Auxílio Educação obtido", diretor.definirBeneficio());
    }
}