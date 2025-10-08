package factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PublicacaoFactoryTest {

    @Test
    void deveRetornarExcecaoParaPublicacaoInexistente() {
        try {
            Publicacao publicacao = PublicacaoFactory.obterPublicacao("Jogar");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Publicação inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPublicacaoInvalida() {
        try {
            Publicacao publicacao = PublicacaoFactory.obterPublicacao("ItemSalvo");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Publicação inválida", e.getMessage());
        }
    }
}