package facade;

public class ManutencaoFacade {

    public static boolean verificarPendencias(Manutencao manutencao) {
        if (Eletrica.getInstancia().verificarManutencaoComPendencia(manutencao)) {
            return false;
        }
        if (Hidraulica.getInstancia().verificarManutencaoComPendencia(manutencao)) {
            return false;
        }
        if (Seguranca.getInstancia().verificarManutencaoComPendencia(manutencao)) {
            return false;
        }
        return true;
    }
}