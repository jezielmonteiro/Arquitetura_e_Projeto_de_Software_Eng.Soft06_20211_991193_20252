package state;

public class MaquinaEstadoDesligada extends MaquinaEstado {

    private MaquinaEstadoDesligada() {};
    private static MaquinaEstadoDesligada instance = new MaquinaEstadoDesligada();
    public static MaquinaEstadoDesligada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Desligada";
    }

    public boolean ligar(MaquinaCafe maquina) {
        maquina.setEstado(MaquinaEstadoLigada.getInstance());
        return true;
    }
}