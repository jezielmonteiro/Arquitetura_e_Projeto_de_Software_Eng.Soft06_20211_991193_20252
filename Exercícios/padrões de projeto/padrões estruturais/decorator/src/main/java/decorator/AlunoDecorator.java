package decorator;

public abstract class AlunoDecorator implements Aluno {

    private Aluno aluno;

    public AlunoDecorator(Aluno aluno) {
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public abstract float getPercentualHorasComplementares();

    public float getHorasComplementares() {
        return this.aluno.getHorasComplementares() * (1 + (this.getPercentualHorasComplementares() / 100));
    }
}