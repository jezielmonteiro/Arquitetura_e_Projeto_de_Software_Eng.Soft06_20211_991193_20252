package chainofresponsability;

public class MembroModerador extends Membro {

    public MembroModerador(Membro superior) {
        listaPermissoes.add(TipoPermissaoBloquear.getTipoPermissaoBloquear());
        listaPermissoes.add(TipoPermissaoSilenciar.getTipoPermissaoSilenciar());
        setMembroSuperior(superior);
    }

    public String getCargo() {
        return "Moderador";
    }
}