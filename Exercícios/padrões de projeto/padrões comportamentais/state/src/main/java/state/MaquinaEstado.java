package state;

public abstract class MaquinaEstado {

    public abstract String getEstado();

    public boolean ligar(MaquinaCafe maquina) {
        return false;
    }

    public boolean desligar(MaquinaCafe maquina) {
        return false;
    }

    public boolean cancelar(MaquinaCafe maquina) {
        return false;
    }

    public boolean escolherCafe(MaquinaCafe maquina) {
        return false;
    }

    public boolean prepararCafe(MaquinaCafe maquina) {
        return false;
    }
}