package chainofresponsability;

public class TipoPermissaoSilenciar implements TipoPermissao {

    private static TipoPermissaoSilenciar tipoPermissaoSilenciar = new TipoPermissaoSilenciar();

    private TipoPermissaoSilenciar() {};

    public static TipoPermissaoSilenciar getTipoPermissaoSilenciar() {
        return tipoPermissaoSilenciar;
    }
}