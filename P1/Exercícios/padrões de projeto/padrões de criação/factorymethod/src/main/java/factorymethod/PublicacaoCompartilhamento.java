package factorymethod;

public class PublicacaoCompartilhamento implements Publicacao {

    public String postar() {
        return "Compartilhamento enviado";
    }

    public String excluir() {
        return "Compartilhamento excluído";
    }
}