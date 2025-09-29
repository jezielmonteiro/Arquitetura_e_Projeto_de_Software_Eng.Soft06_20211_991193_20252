package bridge;

public class Gerente extends Funcionario {

    public String definirBeneficio() {
        return this.beneficio.obterBeneficio();
    }
}