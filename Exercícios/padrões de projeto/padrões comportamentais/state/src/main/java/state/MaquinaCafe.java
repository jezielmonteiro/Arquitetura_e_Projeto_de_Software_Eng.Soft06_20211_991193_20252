package state;

public class MaquinaCafe {

    private MaquinaEstado estado;

    public MaquinaCafe() {
        this.estado = MaquinaEstadoDesligada.getInstance();
    }

    public void setEstado(MaquinaEstado estado) {
        this.estado = estado;
    }

    public MaquinaEstado getEstado() {
        return estado;
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public boolean ligar() {
        return estado.ligar(this);
    }

    public boolean desligar() {
        return estado.desligar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean escolherCafe() {
        return estado.escolherCafe(this);
    }

    public boolean prepararCafe() {
        return estado.prepararCafe(this);
    }
}