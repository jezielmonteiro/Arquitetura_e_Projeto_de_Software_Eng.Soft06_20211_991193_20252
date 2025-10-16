package state;

public class MaquinaEstadoCafePreparado extends MaquinaEstado {

    private MaquinaEstadoCafePreparado() {}
    private static MaquinaEstadoCafePreparado instance = new MaquinaEstadoCafePreparado();
    public static MaquinaEstadoCafePreparado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Café Preparado";
    }

    public boolean desligar(MaquinaCafe maquina) {
        maquina.setEstado(MaquinaEstadoDesligada.getInstance());
        return true;
    }
}