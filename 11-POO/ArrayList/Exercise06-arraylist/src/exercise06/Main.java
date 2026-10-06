/* Enunciado do exercício:

- Crie uma classe Livro com os atributos titulo (String) e autor (String). Crie o construtor que recebe os dois, e os 
respectivos getters.

- No main, crie um ArrayList<Livro> chamado biblioteca, e adicione 4 livros (pode reaproveitar os do exercício 5,
ou criar novos).

- Crie um segundo ArrayList<String> chamado titulosExistentes. Usando um for (com .size() e .get(i)), percorra a
biblioteca e, pra cada livro, pegue o título dele (com o getter) e adicione nesse novo ArrayList<String>.

- Peça pro usuário (usando Scanner) digitar um título de livro.

- Use .contains() no ArrayList<String> (titulosExistentes) pra verificar se o título digitado já existe. Imprima 
"Esse livro já está cadastrado!" ou "Livro não encontrado, pode cadastrar!", dependendo do resultado.  */

package exercise06;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Livro> biblioteca = new ArrayList<>();
        ArrayList<String> titulosExistentes = new ArrayList<>();
        
        biblioteca.add(new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis"));
        biblioteca.add(new Livro("Grande Sertão: Veredas", "João Guimarães Rosa"));
        biblioteca.add(new Livro("Vidas Secas", "Graciliano Ramos"));
        biblioteca.add(new Livro("Dom Casmurro", "Machado de Assis"));
        
        for(int i = 0; i < biblioteca.size(); i++)
        {
            titulosExistentes.add(biblioteca.get(i).getTituloLivro());
        }
        
        
        System.out.println("Digite um titulo de livro: ");
        String tituloUsuario = sc.nextLine();
        sc.close();
        
        if(titulosExistentes.contains(tituloUsuario))
        {
            System.out.println("Esse livro já está cadastrado!");
        }
        else
        {
            System.out.println("Livro não encontrado, pode cadastrar!");
        }

    }
}
