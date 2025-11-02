package strategy;

public class Loja {

    private double valor;

    public Loja(double valor) {
        this.valor = valor;
    }

    public double efetuarPagamento(Pagamento pagamento) {
        return pagamento.efetuarPagamento(valor);
    }
}