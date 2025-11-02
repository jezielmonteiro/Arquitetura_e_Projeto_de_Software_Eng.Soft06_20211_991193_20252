package strategy;

public class Cliente {

    private double valor;

    public double getValor() {
        return valor;
    }

    public void comprarComDinheiro(double valor) {
        Loja loja = new Loja(valor);
        this.valor = loja.efetuarPagamento(new PagamentoDinheiro());
    }

    public void comprarComPix(double valor) {
        Loja loja = new Loja(valor);
        this.valor = loja.efetuarPagamento(new PagamentoPix());
    }

    public void comprarComCartaoCredito(double valor) {
        Loja loja = new Loja(valor);
        this.valor = loja.efetuarPagamento(new PagamentoCartaoCredito());
    }

    public void comprarComCartaoDebito(double valor) {
        Loja loja = new Loja(valor);
        this.valor = loja.efetuarPagamento(new PagamentoCartaoDebito());
    }

    public void comprarComBoleto(double valor) {
        Loja loja = new Loja(valor);
        this.valor = loja.efetuarPagamento(new PagamentoBoleto());
    }
}