package chainofresponsability;

import java.util.ArrayList;

public abstract class Membro {

    protected ArrayList listaPermissoes = new ArrayList();
    private Membro membroSuperior;

    public Membro getMembroSuperior() {
        return membroSuperior;
    }

    public void setMembroSuperior(Membro membroSuperior) {
        this.membroSuperior = membroSuperior;
    }

    public abstract String getCargo();

    public String aplicarPermissao(Permissao permissao) {
        if (listaPermissoes.contains(permissao.getTipoPermissao())) {
            return getCargo();
        }
        else {
            if (membroSuperior != null) {
                return membroSuperior.aplicarPermissao(permissao);
            }
            else
            {
                return "Permissão dispensada";
            }
        }
    }
}