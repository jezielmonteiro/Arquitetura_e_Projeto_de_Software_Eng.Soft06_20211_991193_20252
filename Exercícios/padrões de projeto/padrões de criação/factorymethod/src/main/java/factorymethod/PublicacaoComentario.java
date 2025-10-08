package factorymethod;

public class PublicacaoComentario implements Publicacao {

    public String postar() {
        return "Comentário enviado";
    }

    public String excluir() {
        return "Comentário excluído";
    }
}