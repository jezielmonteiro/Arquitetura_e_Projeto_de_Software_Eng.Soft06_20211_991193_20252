package chainofresponsability;

public class TipoPermissaoExpulsar implements TipoPermissao {

    private static TipoPermissaoExpulsar tipoPermissaoExpulsar = new TipoPermissaoExpulsar();

    private TipoPermissaoExpulsar() {};

    public static TipoPermissaoExpulsar getTipoPermissaoExpulsar() {
        return tipoPermissaoExpulsar;
    }
}