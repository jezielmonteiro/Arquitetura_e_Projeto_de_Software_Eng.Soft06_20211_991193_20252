package factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PublicacaoCompartilhamentoTest {

    @Test
    void devePostarCompartilhamento() {
        Publicacao publicacao = PublicacaoFactory.obterPublicacao("Compartilhamento");
        assertEquals("Compartilhamento enviado", publicacao.postar());
    }

    @Test
    void deveExcluirCompartilhamento() {
        Publicacao publicacao = PublicacaoFactory.obterPublicacao("Compartilhamento");
        assertEquals("Compartilhamento excluído", publicacao.excluir());
    }
}