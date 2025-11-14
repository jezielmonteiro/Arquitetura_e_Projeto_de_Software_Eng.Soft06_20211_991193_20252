package deliveryservice;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private double valor;
    private String ultimaNotificacao;

    public Cliente(double valor) {
        this.valor = valor;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void registrar(Delivery delivery) {
        delivery.addObserver(this);
    }

    public double efetuarPagamento(Pagamento pagamento) {
        return pagamento.efetuarPagamento(valor);
    }

    public void update(Observable delivery, Object arg1) {
        this.ultimaNotificacao = "Notificação para " + this.nome + " por " + delivery.toString() + ":" + arg1;
    }
}