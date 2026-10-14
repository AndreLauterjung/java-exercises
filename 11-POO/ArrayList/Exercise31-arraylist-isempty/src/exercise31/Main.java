/* Enunciado do exercício:

- Crie a classe Livro (atributos: String titulo).

- Mostre estatísticas da biblioteca apenas se .isEmpty() for falso. */

package exercise31;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Livro> biblioteca = new ArrayList<>();
        
        biblioteca.add(new Livro("Livro de culinária"));
        biblioteca.add(new Livro("Poemas brasileiros"));
        biblioteca.add(new Livro("Ficção Científica"));
        biblioteca.add(new Livro("Geografia do Brasil"));
        
        boolean isBibliotecaVazia = biblioteca.isEmpty();
        
        if(!isBibliotecaVazia)
        {
            System.out.println("Estatísticas da biblioteca: ");
            System.out.println("Primeiro livro: "+biblioteca.getFirst().getTitulo());
            System.out.println("Último livro: "+biblioteca.getLast().getTitulo());
            System.out.println("Total de livros: "+biblioteca.size());
        }
        else
        {
            System.out.println("Não há livros na biblioteca!");
        }
    }
}
