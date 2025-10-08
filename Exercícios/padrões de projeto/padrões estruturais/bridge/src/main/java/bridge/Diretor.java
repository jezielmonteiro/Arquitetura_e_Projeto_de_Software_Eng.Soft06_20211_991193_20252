package bridge;

public class Diretor extends Funcionario {

    public String definirBeneficio() {
        return this.beneficio.obterBeneficio();
    }
}