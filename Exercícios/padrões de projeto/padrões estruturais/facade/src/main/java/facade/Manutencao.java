package facade;

public class Manutencao {

    public boolean aprovarManutencao() {
        return ManutencaoFacade.verificarPendencias(this);
    }
}