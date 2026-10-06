/* Enunciado do exercício:

Crie uma classe Livro com os atributos titulo (String) e autor (String). Crie o construtor que recebe os dois, e os
respectivos getters.

No main, crie um ArrayList<Livro> chamado biblioteca, e adicione 3 livros (pode reaproveitar os do exercício 5, 
ou criar novos).

Escolha manualmente uma posição da lista (por exemplo, a posição 1). Crie um novo objeto Livro, e use 
.set(posicao, novoLivro) para substituir o livro que estava naquela posição pelo novo.

Percorra a lista de novo (com for + .size() + .get(i)), para confirmar que o livro da posição escolhida realmente
mudou, e os outros continuam iguais.

*/
package exercise07;

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
        
        biblioteca.add(new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis"));
        biblioteca.add(new Livro("Grande Sertão: Veredas", "João Guimarães Rosa"));
        biblioteca.add(new Livro("Vidas Secas", "Graciliano Ramos"));
        
        System.out.println("ArrayList antes da alteração: ");
        for(int i = 0; i < biblioteca.size(); i++)
        {
            System.out.println("Livro: "+biblioteca.get(i).getTituloLivro());
        }
        
        Livro novoLivro = new Livro("A Hora da Estrela", "Clarice Lispector");
        
        biblioteca.set(2, novoLivro);
        
        System.out.println("\nArrayList depois da alteração: ");
        for(int i = 0; i < biblioteca.size(); i++)
        {
            System.out.println("Livro: "+biblioteca.get(i).getTituloLivro());
        }
    }
}
