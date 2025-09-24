package factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PublicacaoRepostTest {

    @Test
    void devePostarRepost() {
        Publicacao publicacao = PublicacaoFactory.obterPublicacao("Repost");
        assertEquals("Repost feito", publicacao.postar());
    }

    @Test
    void deveExcluirRepost() {
        Publicacao publicacao = PublicacaoFactory.obterPublicacao("Repost");
        assertEquals("Repost desfeito", publicacao.excluir());
    }
}