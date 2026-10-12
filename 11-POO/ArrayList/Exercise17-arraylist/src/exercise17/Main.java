/* Enunciado do exercício:

- Crie a classe Livro (atributos: String titulo).

= Adicione 3 livros e utilize .set(1, novoLivro) para atualizar o título do livro na posição 1. */

package exercise17;

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
        
        biblioteca.add(new Livro("Receitas"));
        biblioteca.add(new Livro("Chocolate com pimenta"));
        biblioteca.add(new Livro("Histórias sobre os dinossauros"));
        
        System.out.println("\nLista antes da alteração: ");
        for(Livro livro : biblioteca)
        {
            System.out.println(livro.getTituloLivro());
        }
        
        biblioteca.set(1, new Livro("História sobre aves"));
        System.out.println("\nLista após a alteração: ");
        for(Livro livro : biblioteca)
        {
            System.out.println(livro.getTituloLivro());
        }
        
        
    }
}
