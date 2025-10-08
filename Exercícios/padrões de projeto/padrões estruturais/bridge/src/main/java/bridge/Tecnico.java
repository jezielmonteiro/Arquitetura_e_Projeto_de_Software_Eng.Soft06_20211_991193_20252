package bridge;

public class Tecnico extends Funcionario {

    public String definirBeneficio() {
        return this.beneficio.obterBeneficio();
    }
}