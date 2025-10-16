package state;

public class MaquinaEstadoCancelada extends MaquinaEstado {

    private MaquinaEstadoCancelada() {}
    private static MaquinaEstadoCancelada instance = new MaquinaEstadoCancelada();
    public static MaquinaEstadoCancelada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelada";
    }

    public boolean desligar(MaquinaCafe maquina) {
        maquina.setEstado(MaquinaEstadoDesligada.getInstance());
        return true;
    }
}