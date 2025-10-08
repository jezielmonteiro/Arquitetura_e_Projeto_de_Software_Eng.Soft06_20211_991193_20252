package decorator;

public class Pesquisa extends AlunoDecorator {

    public Pesquisa(Aluno aluno) {
        super(aluno);
    }

    public float getPercentualHorasComplementares() {
        return 5.0f;
    }
}