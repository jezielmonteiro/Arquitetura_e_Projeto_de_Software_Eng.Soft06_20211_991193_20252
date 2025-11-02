package chainofresponsability;

public class MembroComum extends Membro {

    public MembroComum(Membro superior) {
        listaPermissoes.add(TipoPermissaoBloquear.getTipoPermissaoBloquear());
        setMembroSuperior(superior);
    }

    public String getCargo() {
        return "Membro";
    }
}