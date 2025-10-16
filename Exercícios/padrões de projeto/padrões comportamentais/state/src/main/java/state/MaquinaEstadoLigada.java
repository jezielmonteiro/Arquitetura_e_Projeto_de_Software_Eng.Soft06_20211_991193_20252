package state;

public class MaquinaEstadoLigada extends MaquinaEstado {

    private MaquinaEstadoLigada() {};
    private static MaquinaEstadoLigada instance = new MaquinaEstadoLigada();
    public static MaquinaEstadoLigada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ligada";
    }

    public boolean desligar(MaquinaCafe maquina) {
        maquina.setEstado(MaquinaEstadoDesligada.getInstance());
        return true;
    }

    public boolean cancelar(MaquinaCafe maquina) {
        maquina.setEstado(MaquinaEstadoCancelada.getInstance());
        return true;
    }

    public boolean escolherCafe(MaquinaCafe maquina) {
        maquina.setEstado(MaquinaEstadoCafeEscolhido.getInstance());
        return true;
    }

    public boolean prepararCafe(MaquinaCafe maquina) {
        maquina.setEstado(MaquinaEstadoCafePreparado.getInstance());
        return true;
    }
}