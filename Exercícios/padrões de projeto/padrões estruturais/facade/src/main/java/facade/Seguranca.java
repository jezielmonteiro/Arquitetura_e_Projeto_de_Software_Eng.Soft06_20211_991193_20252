package facade;

public class Seguranca extends Setor {

    private static Seguranca seguranca = new Seguranca();

    private Seguranca() {};

    public static Seguranca getInstancia() {
        return seguranca;
    }
}