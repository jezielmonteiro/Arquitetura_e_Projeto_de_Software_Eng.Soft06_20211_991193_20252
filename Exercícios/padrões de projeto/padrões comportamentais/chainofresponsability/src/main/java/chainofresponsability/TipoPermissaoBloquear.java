package chainofresponsability;

public class TipoPermissaoBloquear implements TipoPermissao {

    private static TipoPermissaoBloquear tipoPermissaoBloquear = new TipoPermissaoBloquear();

    private TipoPermissaoBloquear() {};

    public static TipoPermissaoBloquear getTipoPermissaoBloquear() {
        return tipoPermissaoBloquear;
    }
}