/* Enunciado do exercício:

Tirando da fila

- Crie a classe Cliente com nome (String) e pontos (int), construtor e getters.
- Faça-a implementar Comparable<Cliente>, com o compareTo comparando os pontos..
- Na Main, crie NavigableSet<Cliente> ranking = new TreeSet<>();.
- Adicione Ana 120, Bruno 80 e Carla 200.

- Imprima o tamanho do conjunto. 
- Use pollFirst(), que remove e devolve o menor. Imprima o nome do cliente removido. 
- Imprima o novo tamanho e o novo primeiro. 

Esperado: tamanho 3, removido Bruno, tamanho 2 e novo primeiro Ana. */

package exercise20;

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
        
        
        System.out.println("Tamanho do conjunto: "+ranking.size());
        
        Cliente clienteRemovido = ranking.pollFirst();
        
        System.out.println("Cliente removido: "+clienteRemovido.getNome());
        
        System.out.println("Novo tamanho do conjunto: "+ranking.size());
        
        System.out.println("Novo primeiro: "+ranking.getFirst().getNome());
        
    }
}
