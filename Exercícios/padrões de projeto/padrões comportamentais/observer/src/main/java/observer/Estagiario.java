package observer;

import java.util.Observable;
import java.util.Observer;

public class Estagiario implements Observer {

    private String nome;
    private String cpf;
    private String ultimaNotificacao;

    public Estagiario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void contratar(Empresa empresa) {
        empresa.addObserver(this);
    }

    public void update(Observable empresa, Object arg1) {
        this.ultimaNotificacao = this.nome + ", Bolsa-auxílio enviada pela " + empresa.toString();
    }
}