package singleton;

public class Cantina {

    private Cantina() {};
    private static Cantina instance = new Cantina();
    public static Cantina getInstance() {
        return instance;
    }

    private String nomeCantina;
    private String clienteCantina;
    private String produtoComprado;

    public String getNomeCantina() {
        return nomeCantina;
    }

    public void setNomeCantina(String nomeCantina) {
        this.nomeCantina = nomeCantina;
    }

    public String getClienteCantina() {
        return clienteCantina;
    }

    public void setClienteCantina(String clienteCantina) {
        this.clienteCantina = clienteCantina;
    }

    public String getProdutoComprado() {
        return produtoComprado;
    }

    public void setProdutoComprado(String produtoComprado) {
        this.produtoComprado = produtoComprado;
    }
}