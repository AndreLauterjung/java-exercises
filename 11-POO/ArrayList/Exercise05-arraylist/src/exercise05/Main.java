/* Enunciado do exercício:

Cadastro de livros.

- Crie uma classe Livro com os atributos: titulo (String), autor (String), anoPublicacao (int). Crie o construtor  que
recebe os três, e os respectivos getters. 

- No main, crie um ArrayList<Livro> chamado biblioteca. 

- Adicione 4 livros diferentes, usando new Livro(...) direto dentro do .add()

- Percorra a lista com um for (usando .size() e .get(i)), imprimindo pra cada livro uma linha tipo: 
"Título - Autor (Ano)". */

package exercise05;

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
        
        biblioteca.add(new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881));
        biblioteca.add(new Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956));
        biblioteca.add(new Livro("Vidas Secas", "Graciliano Ramos", 1938));
        biblioteca.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        
        for(int i = 0; i < biblioteca.size(); i++)
        {
            System.out.println("**************************************************************");
            System.out.println(biblioteca.get(i).retornarLivro());
        }
        
    }
}
