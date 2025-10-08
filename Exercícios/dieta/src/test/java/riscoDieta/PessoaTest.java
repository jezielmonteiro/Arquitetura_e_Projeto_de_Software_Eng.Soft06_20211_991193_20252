package riscoDieta;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    private Pessoa pessoa;

    @BeforeEach
    public void setup() {
        pessoa = new Pessoa();
    }

    @Test
    public void testeRiscoMasculinoJovem() {
        pessoa.setSexo("Masculino");
        pessoa.setIdade(25);
        pessoa.setGorduraCorporal(15);
        assertEquals("Baixo risco", pessoa.avaliarRiscoDieta());
    }

    @Test
    public void testeRiscoMasculinoMeiaIdade() {
        pessoa.setSexo("Masculino");
        pessoa.setIdade(40);
        pessoa.setGorduraCorporal(26);
        assertEquals("Risco moderado", pessoa.avaliarRiscoDieta());
    }

    @Test
    public void testeRiscoMasculinoIdoso() {
        pessoa.setSexo("Masculino");
        pessoa.setIdade(65);
        pessoa.setGorduraCorporal(31);
        assertEquals("Alto risco", pessoa.avaliarRiscoDieta());
    }

    @Test
    public void testeRiscoFemininoJovem() {
        pessoa.setSexo("Feminino");
        pessoa.setIdade(22);
        pessoa.setGorduraCorporal(29);
        assertEquals("Risco moderado", pessoa.avaliarRiscoDieta());
    }

    @Test
    public void testeRiscoFemininoMeiaIdade() {
        pessoa.setSexo("Feminino");
        pessoa.setIdade(45);
        pessoa.setGorduraCorporal(33);
        assertEquals("Risco moderado", pessoa.avaliarRiscoDieta());
    }

    @Test
    public void testeRiscoFemininoIdosa() {
        pessoa.setSexo("Feminino");
        pessoa.setIdade(70);
        pessoa.setGorduraCorporal(38);
        assertEquals("Alto risco", pessoa.avaliarRiscoDieta());
    }

    @Test
    public void testeSexoInvalido() {
        pessoa.setSexo("Outro");
        assertEquals(false, pessoa.getSexo());
    }

    @Test
    public void testeIdadeInvalida() {
        pessoa.setIdade(-21);
        assertEquals(false, pessoa.getIdade());
    }

    @Test
    public void testeGorduraCorporal() {
        pessoa.setGorduraCorporal(-15);
        assertEquals(false, pessoa.getGorduraCorporal());
    }

    @Test
    public void testeNivelAtividade() {
        pessoa.setNivelAtividade("Outro");
        assertEquals(false, pessoa.getNivelAtividade());
    }
}