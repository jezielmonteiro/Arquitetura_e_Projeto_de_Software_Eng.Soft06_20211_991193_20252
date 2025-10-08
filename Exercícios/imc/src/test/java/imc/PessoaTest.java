package imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    void deveCalcularIMC() {
        pessoa.setSexo("Masculino");
        pessoa.setPeso(70f);
        pessoa.setAltura(1.75f);
        assertEquals(22.8f, pessoa.calcularIMC());
    }

    @Test
    void deveCalcularIMC2() {
        pessoa.setSexo("Feminino");
        pessoa.setPeso(60f);
        pessoa.setAltura(1.55f);
        assertEquals(24.9f, pessoa.calcularIMC());
    }

    @Test
    void homemCondicao() {
        pessoa.setSexo("Masculino");
        pessoa.setPeso(70f);
        pessoa.setAltura(1.75f);
        assertEquals("No peso normal.", pessoa.verificarIMC());
    }

    @Test
    void mulherCondicao() {
        pessoa.setSexo("Feminino");
        pessoa.setPeso(60f);
        pessoa.setAltura(1.55f);
        assertEquals("No peso normal.", pessoa.verificarIMC());
    }

    @Test
    void sexoInvalido() {
        pessoa.setSexo("Homem");
        assertEquals(false, pessoa.getSexo());
    }

    @Test
    void sexoInvalido2() {
        pessoa.setSexo("Mulher");
        assertEquals(false, pessoa.getSexo());
    }

    @Test
    void pesoInvalido() {
        pessoa.setPeso(-70f);
        assertEquals(false, pessoa.getPeso());
    }

    @Test
    void pesoInvalido2() {
        pessoa.setPeso(0f);
        assertEquals(false, pessoa.getPeso());
    }

    @Test
    void alturaInvalida() {
        pessoa.setAltura(-1.75f);
        assertEquals(false, pessoa.getAltura());
    }

    @Test
    void alturaInvalida2() {
        pessoa.setAltura(0f);
        assertEquals(false, pessoa.getAltura());
    }

    @Test
    void alturaInvalida3() {
        pessoa.setAltura(3f);
        assertEquals(false, pessoa.getAltura());
    }

    @Test
    void alturaInvalida4() {
        pessoa.setAltura(3.1f);
        assertEquals(false, pessoa.getAltura());
    }
}