package chainofresponsability;

public class TipoPermissaoExcluirServidor implements TipoPermissao {

    private static TipoPermissaoExcluirServidor tipoPermissaoExcluirServidor = new TipoPermissaoExcluirServidor();

    private TipoPermissaoExcluirServidor() {};

    public static TipoPermissaoExcluirServidor getTipoPermissaoExcluirServidor() {
        return tipoPermissaoExcluirServidor;
    }
}