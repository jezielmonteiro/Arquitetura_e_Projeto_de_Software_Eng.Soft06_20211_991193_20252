package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarHorasComplementaresAluno() {
        Aluno aluno = new AlunoBasico(1000.0f);
        assertEquals(1000.0f, aluno.getHorasComplementares());
    }

    @Test
    void deveRetornarHorasComplementaresAlunoComMonitoria() {
        Aluno aluno = new Monitoria(new AlunoBasico(1000.0f));
        assertEquals(1100.0f, aluno.getHorasComplementares());
    }

    @Test
    void deveRetornarHorasComplementaresAlunoComEstagio() {
        Aluno aluno = new Estagio(new AlunoBasico(1000.0f));
        assertEquals(1200.0f, aluno.getHorasComplementares());
    }

    @Test
    void deveRetornarHorasComplementaresAlunoComPesquisa() {
        Aluno aluno = new Pesquisa(new AlunoBasico(1000.0f));
        assertEquals(1050.0f, aluno.getHorasComplementares());
    }

    @Test
    void deveRetornarHorasComplementaresAlunoComMonitoriaMaisEstagio() {
        Aluno aluno = new Monitoria(new Estagio(new AlunoBasico(1000.0f)));
        assertEquals(1320.0f, aluno.getHorasComplementares());
    }

    @Test
    void deveRetornarHorasComplementaresAlunoComPesquisaMaisMonitoria() {
        Aluno aluno = new Pesquisa(new Monitoria(new AlunoBasico(1000.0f)));
        assertEquals(1155.0f, aluno.getHorasComplementares());
    }

    @Test
    void deveRetornarHorasComplementaresAlunoComPesquisaMaisEstagio() {
        Aluno aluno = new Pesquisa(new Estagio(new AlunoBasico(1000.0f)));
        assertEquals(1260.0f, aluno.getHorasComplementares());
    }

    @Test
    void deveRetornarHorasComplementaresAlunoComPesquisaMaisMonitoriaMaisEstagio() {
        Aluno aluno = new Monitoria(new Estagio(new Pesquisa(new AlunoBasico(1000.0f))));
        assertEquals(1386.0f, aluno.getHorasComplementares());
    }
}