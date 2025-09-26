package abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveEmitirMatriculaEstado() {
        FabricaAbstrata fabrica = new FabricaEstado();
        Professor professor = new Professor(fabrica);
        assertEquals("Matrícula do Estado", professor.emitirMatricula());
    }

    @Test
    void deveEmitirMatriculaMunicipio() {
        FabricaAbstrata fabrica = new FabricaMunicipio();
        Professor professor = new Professor(fabrica);
        assertEquals("Matrícula do Município", professor.emitirMatricula());
    }

    @Test
    void deveEmitirCargaHorariaEstado() {
        FabricaAbstrata fabrica = new FabricaEstado();
        Professor professor = new Professor(fabrica);
        assertEquals("Carga Horária do Estado", professor.emitirCargaHoraria());
    }

    @Test
    void deveEmitirCargaHorariaMunicipio() {
        FabricaAbstrata fabrica = new FabricaMunicipio();
        Professor professor = new Professor(fabrica);
        assertEquals("Carga Horária do Município", professor.emitirCargaHoraria());
    }
}