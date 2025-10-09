package flyweight;

public class Leitor {

    private String nome;
    private Livro livro;

    public Leitor(String nome, Livro livro) {
        this.nome = nome;
        this.livro = livro;
    }

    public String obterLeitor() {
        return "Leitor{" +
                "nome='" + this.nome + '\'' +
                ", livro='" + livro.getTitulo() + '\'' +
                ", autor='" + livro.getAutor() + '\'' +
                ", genero='" + livro.getGenero() + '\'' +
                '}';
    }
}