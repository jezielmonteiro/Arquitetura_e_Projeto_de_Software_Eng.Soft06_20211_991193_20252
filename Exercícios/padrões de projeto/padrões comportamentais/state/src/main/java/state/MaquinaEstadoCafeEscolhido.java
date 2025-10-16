package state;

public class MaquinaEstadoCafeEscolhido extends MaquinaEstado {

    private MaquinaEstadoCafeEscolhido() {};
    private static MaquinaEstadoCafeEscolhido instance = new MaquinaEstadoCafeEscolhido();
    public static MaquinaEstadoCafeEscolhido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Café Escolhido";
    }

    public boolean prepararCafe(MaquinaCafe maquina) {
        maquina.setEstado(MaquinaEstadoCafePreparado.getInstance());
        return true;
    }

    public boolean cancelar(MaquinaCafe maquina) {
        maquina.setEstado(MaquinaEstadoCancelada.getInstance());
        return true;
    }
}