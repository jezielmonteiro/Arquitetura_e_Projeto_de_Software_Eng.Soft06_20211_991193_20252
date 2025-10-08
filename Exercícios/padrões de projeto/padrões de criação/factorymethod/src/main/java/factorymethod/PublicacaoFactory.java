package factorymethod;

public class PublicacaoFactory {

    public static Publicacao obterPublicacao(String publicacao) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factorymethod.Publicacao" + publicacao);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Publicação inexistente");
        }
        if (!(objeto instanceof Publicacao)) {
            throw new IllegalArgumentException("Publicação inválida");
        }
        return (Publicacao) objeto;
    }
}