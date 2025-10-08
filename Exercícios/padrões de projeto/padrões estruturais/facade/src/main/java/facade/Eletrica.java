package facade;

public class Eletrica extends Setor {

    private static Eletrica eletrica = new Eletrica();

    private Eletrica() {};

    public static Eletrica getInstancia() {
        return eletrica;
    }
}