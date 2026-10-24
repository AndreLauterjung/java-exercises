/* Enunciado do exercício:

- Crie a classe Cliente com nome (String) e pontos (int), construtor e getters.
- Faça-a implementar Comparable<Cliente>, com o compareTo comparando os pontos. A linha é return
Integer.compare(this.pontos, outro.pontos);.

- Na Main, crie NavigableSet<Cliente> ranking = new TreeSet<>();.
- Adicione Ana 120, Bruno 80, Carla 200 e Diego 80, imprimindo o retorno de cada .add().
- Imprima o tamanho e percorra com for-each, imprimindo nome e pontos.

- Esperado: true, true, true, false, tamanho 3, e a lista em ordem de pontos: Bruno, Ana, Carla. O Diego foi recusado
porque o compareTo deu 0 com o Bruno. */

package exercise17;

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
        
        System.out.println("Cliente adicionado? "+ranking.add(new Cliente("Ana", 120)));
        System.out.println("Cliente adicionado? "+ranking.add(new Cliente("Bruno", 80)));
        System.out.println("Cliente adicionado? "+ranking.add(new Cliente("Carla", 200)));
        System.out.println("Cliente adicionado? "+ranking.add(new Cliente("Diego", 80)));
        
        System.out.println("Total de clientes no ranking: "+ranking.size());
        
        System.out.println("\nRanking:");
        for(Cliente cliente : ranking)
        {
            System.out.println(cliente.getNome()+" : "+cliente.getPontos());
        }
    }
}
