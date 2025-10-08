package decorator;

public class Estagio extends AlunoDecorator {

    public Estagio(Aluno aluno) {
        super(aluno);
    }

    public float getPercentualHorasComplementares() {
        return 20.0f;
    }
}