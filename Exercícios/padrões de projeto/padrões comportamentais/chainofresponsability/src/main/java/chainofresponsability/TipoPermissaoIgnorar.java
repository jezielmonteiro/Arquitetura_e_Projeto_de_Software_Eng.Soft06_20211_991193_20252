package chainofresponsability;

public class TipoPermissaoIgnorar implements TipoPermissao {

    private static TipoPermissaoIgnorar tipoPermissaoIgnorar = new TipoPermissaoIgnorar();

    private TipoPermissaoIgnorar() {};

    public static TipoPermissaoIgnorar getTipoPermissaoIgnorar() {
        return tipoPermissaoIgnorar;
    }
}