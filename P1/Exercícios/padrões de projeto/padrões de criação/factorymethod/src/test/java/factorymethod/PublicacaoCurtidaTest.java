package factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PublicacaoCurtidaTest {

    @Test
    void devePostarCurtida() {
        Publicacao publicacao = PublicacaoFactory.obterPublicacao("Curtida");
        assertEquals("Curtida feita", publicacao.postar());
    }

    @Test
    void deveExcluirCurtida() {
        Publicacao publicacao = PublicacaoFactory.obterPublicacao("Curtida");
        assertEquals("Curtida desfeita", publicacao.excluir());
    }
}