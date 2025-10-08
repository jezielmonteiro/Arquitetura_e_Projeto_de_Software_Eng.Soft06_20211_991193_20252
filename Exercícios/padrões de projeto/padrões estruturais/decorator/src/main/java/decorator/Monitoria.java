package decorator;

public class Monitoria extends AlunoDecorator {

    public Monitoria(Aluno aluno) {
        super(aluno);
    }

    public float getPercentualHorasComplementares() {
        return 10.0f;
    }
}