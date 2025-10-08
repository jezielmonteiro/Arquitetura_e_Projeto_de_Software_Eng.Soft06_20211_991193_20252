package bridge;

public abstract class Funcionario {

    protected Beneficio beneficio;

    public Beneficio getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(Beneficio beneficio) {
        this.beneficio = beneficio;
    }

    public abstract String definirBeneficio();
}