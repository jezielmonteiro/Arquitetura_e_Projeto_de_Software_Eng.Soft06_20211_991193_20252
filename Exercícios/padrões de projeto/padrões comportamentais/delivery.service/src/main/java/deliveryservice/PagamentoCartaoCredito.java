package deliveryservice;

public class PagamentoCartaoCredito implements Pagamento {

    public double efetuarPagamento(double valor) {
        return valor - (valor * 0.05); // 5% de desconto
    }
}