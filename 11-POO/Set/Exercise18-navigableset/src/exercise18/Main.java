/* Enunciado do exercício:

Pontas e inverso

- Crie a classe Cliente com nome (String) e pontos (int), construtor e getters.
- Faça-a implementar Comparable<Cliente>, com o compareTo comparando os pontos..
- Na Main, crie NavigableSet<Cliente> ranking = new TreeSet<>();.
- Adicione Ana 120, Bruno 80 e Carla 200 imprimindo o retorno de cada .add().
- Imprima o primeiro e o último, com first() e last(). 
- Imprima o ranking do maior para o menor, percorrendo ranking.descendingSet(). 

Esperado: primeiro Bruno (80), último Carla (200), e depois Carla, Ana, Bruno. */

package exercise18;

import java.util.NavigableSet;
import java.util.TreeSet;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        NavigableSet<Cliente> ranking = new TreeSet<>();
        
        ranking.add(new Cliente("Ana", 120));
        ranking.add(new Cliente("Bruno", 80));
        ranking.add(new Cliente("Carla", 200));
        
        
        System.out.println("\nPrimeiro: "+ranking.first().getNome()+" | pontos: "+ranking.first().getPontos());
        System.out.println("\nÚltimo: "+ranking.last().getNome()+" | pontos: "+ranking.last().getPontos());
        
        
        System.out.println("\nRanking do maior para o menor pontuador: ");
        for(Cliente cliente : ranking.descendingSet())
        {
            System.out.println(cliente.getNome()+" | Pontos: "+cliente.getPontos());
        }
        
    }
}
