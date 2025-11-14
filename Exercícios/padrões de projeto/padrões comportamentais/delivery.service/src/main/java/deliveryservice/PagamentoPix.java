package deliveryservice;

public class PagamentoPix implements Pagamento {

    public double efetuarPagamento(double valor) {
        return valor - (valor * 0.2); // 20% de desconto
    }
}