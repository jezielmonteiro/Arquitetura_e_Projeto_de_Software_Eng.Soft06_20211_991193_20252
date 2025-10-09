package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Leitor> leitores = new ArrayList<>();

    public void cadastrar(String nomeLeitor, String tituloLivro, String autor, String genero) {
        Livro livro = LivroFactory.getLivro(tituloLivro, autor, genero);
        Leitor leitor = new Leitor(nomeLeitor, livro);
        leitores.add(leitor);
    }

    public List<String> obterLeitores() {
        List<String> saida = new ArrayList<String>();
        for (Leitor leitor : this.leitores) {
            saida.add(leitor.obterLeitor());
        }
        return saida;
    }
}