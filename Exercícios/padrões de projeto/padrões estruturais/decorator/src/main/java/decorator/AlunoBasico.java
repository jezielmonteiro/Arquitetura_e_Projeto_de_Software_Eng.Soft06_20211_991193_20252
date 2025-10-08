package decorator;

public class AlunoBasico implements Aluno {

    public float horasComplementares;

    public AlunoBasico() {
    }

    public AlunoBasico(float horasComplementares) {
        this.horasComplementares = horasComplementares;
    }

    public float getHorasComplementares() {
        return horasComplementares;
    }
}