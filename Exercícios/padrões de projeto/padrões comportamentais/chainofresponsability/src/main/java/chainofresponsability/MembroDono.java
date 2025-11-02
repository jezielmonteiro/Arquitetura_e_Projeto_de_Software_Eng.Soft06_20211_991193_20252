package chainofresponsability;

public class MembroDono extends Membro {

    public MembroDono(Membro superior) {
        listaPermissoes.add(TipoPermissaoBloquear.getTipoPermissaoBloquear());
        listaPermissoes.add(TipoPermissaoSilenciar.getTipoPermissaoSilenciar());
        listaPermissoes.add(TipoPermissaoExpulsar.getTipoPermissaoExpulsar());
        listaPermissoes.add(TipoPermissaoBanir.getTipoPermissaoBanir());
        listaPermissoes.add(TipoPermissaoExcluirServidor.getTipoPermissaoExcluirServidor());
        setMembroSuperior(superior);
    }

    public String getCargo() {
        return "Dono";
    }
}