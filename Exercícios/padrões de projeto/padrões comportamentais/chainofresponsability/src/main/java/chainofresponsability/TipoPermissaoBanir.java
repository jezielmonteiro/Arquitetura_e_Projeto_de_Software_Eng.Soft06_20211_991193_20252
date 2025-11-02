package chainofresponsability;

public class TipoPermissaoBanir implements TipoPermissao {

    private static TipoPermissaoBanir tipoPermissaoBanir = new TipoPermissaoBanir();

    private TipoPermissaoBanir() {};

    public static TipoPermissaoBanir getTipoPermissaoBanir() {
        return tipoPermissaoBanir;
    }
}