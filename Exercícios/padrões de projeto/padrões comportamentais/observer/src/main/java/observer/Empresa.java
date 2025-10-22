package observer;

import java.util.Observable;

public class Empresa extends Observable {

    private String nome;
    private String cnpj;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void enviarRemuneracao() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}