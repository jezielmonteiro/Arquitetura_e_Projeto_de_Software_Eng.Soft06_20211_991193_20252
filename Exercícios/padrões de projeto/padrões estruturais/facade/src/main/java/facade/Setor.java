package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Manutencao> manutencoesComPendencia = new ArrayList<Manutencao>();

    public void addManutencaoPendente(Manutencao manutencao) {
        this.manutencoesComPendencia.add(manutencao);
    }

    public boolean verificarManutencaoComPendencia(Manutencao manutencao) {
        return this.manutencoesComPendencia.contains(manutencao);
    }
}