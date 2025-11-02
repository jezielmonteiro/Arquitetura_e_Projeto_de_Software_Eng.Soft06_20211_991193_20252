package chainofresponsability;

public class MembroAdministrador extends Membro {

    public MembroAdministrador(Membro superior) {
        listaPermissoes.add(TipoPermissaoBloquear.getTipoPermissaoBloquear());
        listaPermissoes.add(TipoPermissaoSilenciar.getTipoPermissaoSilenciar());
        listaPermissoes.add(TipoPermissaoExpulsar.getTipoPermissaoExpulsar());
        listaPermissoes.add(TipoPermissaoBanir.getTipoPermissaoBanir());
        setMembroSuperior(superior);
    }

    public String getCargo() {
        return "Administrador";
    }
}