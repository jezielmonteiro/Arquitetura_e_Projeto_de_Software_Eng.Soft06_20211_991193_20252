package factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PublicacaoComentarioTest {

    @Test
    void devePostarComentario() {
        Publicacao publicacao = PublicacaoFactory.obterPublicacao("Comentario");
        assertEquals("Comentário enviado", publicacao.postar());
    }

    @Test
    void deveExcluirComentario() {
        Publicacao publicacao = PublicacaoFactory.obterPublicacao("Comentario");
        assertEquals("Comentário excluído", publicacao.excluir());
    }
}