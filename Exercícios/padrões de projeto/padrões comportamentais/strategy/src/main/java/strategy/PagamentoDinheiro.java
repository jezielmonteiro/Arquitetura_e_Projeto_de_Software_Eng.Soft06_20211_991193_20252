package strategy;

public class PagamentoDinheiro implements Pagamento {

    public double efetuarPagamento(double valor) {
        return valor - (valor * 0.1); // 10% de desconto
    }
}