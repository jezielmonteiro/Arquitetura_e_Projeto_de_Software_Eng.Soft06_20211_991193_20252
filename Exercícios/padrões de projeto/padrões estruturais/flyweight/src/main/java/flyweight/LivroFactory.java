package flyweight;

import java.util.HashMap;
import java.util.Map;

public class LivroFactory {

    private static Map<String, Livro> livros = new HashMap<>();

    public static Livro getLivro(String titulo, String autor, String genero) {
        Livro livro = livros.get(titulo);
        if (livro == null) {
            livro = new Livro(titulo, autor, genero);
            livros.put(titulo, livro);
        }
        return livro;
    }

    public static int getTotalLivros() {
        return livros.size();
    }
}