package facade;

public class Hidraulica extends Setor {

    private static Hidraulica hidraulica = new Hidraulica();

    private Hidraulica() {};

    public static Hidraulica getInstancia() {
        return hidraulica;
    }
}