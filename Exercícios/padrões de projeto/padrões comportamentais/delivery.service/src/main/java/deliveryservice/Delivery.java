package deliveryservice;

import java.util.Observable;

public class Delivery extends Observable {

    private String nome;

    public Delivery(String nome) {
        this.nome = nome;
    }

    public void notificarEstado(Pedido pedido) {
        setChanged();
        notifyObservers(" O pedido no momento está -> "
                + pedido.getEstado().getEstado()
        );
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "nome=" + nome +
                '}';
    }
}