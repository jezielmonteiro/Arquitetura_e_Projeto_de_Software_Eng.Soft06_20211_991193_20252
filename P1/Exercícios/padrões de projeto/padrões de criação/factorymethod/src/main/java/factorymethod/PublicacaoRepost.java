package factorymethod;

public class PublicacaoRepost implements Publicacao {

    public String postar() {
        return "Repost feito";
    }

    public String excluir() {
        return "Repost desfeito";
    }
}