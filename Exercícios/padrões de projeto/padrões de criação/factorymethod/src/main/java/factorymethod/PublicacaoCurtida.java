package factorymethod;

public class PublicacaoCurtida implements Publicacao {

    public String postar() {
        return "Curtida feita";
    }

    public String excluir() {
        return "Curtida desfeita";
    }
}