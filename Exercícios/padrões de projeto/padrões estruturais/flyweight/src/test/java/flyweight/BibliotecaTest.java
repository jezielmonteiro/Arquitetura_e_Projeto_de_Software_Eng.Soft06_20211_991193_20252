package flyweight;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    @Test
    void deveRetornarLeitores() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrar("Pedro", "Dom Casmurro", "Machado de Assis", "Romance");
        biblioteca.cadastrar("Matheus", "Dom Casmurro", "Machado de Assis", "Romance");
        biblioteca.cadastrar("Ana", "Dom Casmurro", "Machado de Assis", "Romance");
        biblioteca.cadastrar("Luana", "Memórias Póstumas de Brás Cubas", "Machado de Assis", "Romance");

        List<String> saida = Arrays.asList(
                "Leitor{nome='Pedro', livro='Dom Casmurro', autor='Machado de Assis', genero='Romance'}",
                "Leitor{nome='Matheus', livro='Dom Casmurro', autor='Machado de Assis', genero='Romance'}",
                "Leitor{nome='Ana', livro='Dom Casmurro', autor='Machado de Assis', genero='Romance'}",
                "Leitor{nome='Luana', livro='Memórias Póstumas de Brás Cubas', autor='Machado de Assis', genero='Romance'}");
        assertEquals(saida, biblioteca.obterLeitores());
    }

    @Test
    void deveRetornarTotalLivros() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrar("Pedro", "Dom Casmurro", "Machado de Assis", "Romance");
        biblioteca.cadastrar("Matheus", "Dom Casmurro", "Machado de Assis", "Romance");
        biblioteca.cadastrar("Ana", "Dom Casmurro", "Machado de Assis", "Romance");
        biblioteca.cadastrar("Luana", "Memórias Póstumas de Brás Cubas", "Machado de Assis", "Romance");
        assertEquals(2, LivroFactory.getTotalLivros());
    }
}