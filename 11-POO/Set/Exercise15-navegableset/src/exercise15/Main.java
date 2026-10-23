/* Enunciado do exercício:

Vendo os vizinhos (Integer)

- Crie um NavigableSet<Integer> chamado numeros com 10, 20, 30, 40, 50.

- Imprima o resultado de cada chamada, com uma frase na frente (por exemplo, higher(30) = ...):

first() e last()
higher(30), lower(30), ceiling(30) e floor(30)
higher(35), lower(35), ceiling(35) e floor(35)
higher(50), lower(10), ceiling(51) e floor(9)

Nas quatro últimas, imprima null como Sem vizinho!, usando um ternário ou um if */

package exercise15;

import java.util.TreeSet;
import java.util.NavigableSet;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        NavigableSet<Integer> numeros = new TreeSet<>();
        
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        
        System.out.println("\nLista de números: ");
        for(Integer num : numeros)
        {
            System.out.println(num);
        }
        
        
        System.out.println("\nfirst(): "+numeros.first());
        System.out.println("\nlast(): "+numeros.last());
        
        System.out.println("\nhigher(30): "+numeros.higher(30)+" | lower(30): "+numeros.lower(30)+
                " | ceiling(30): "+numeros.ceiling(30)+" | floor(30): "+numeros.floor(30));
        
        System.out.println("\nhigher(35): "+numeros.higher(35)+" | lower(35): "+numeros.lower(35)+
                " | ceiling(35): "+numeros.ceiling(35)+" | floor(35): "+numeros.floor(35));
        
        
        System.out.println("\nhigher(50): "+ (numeros.higher(50) != null ? numeros.higher(50) : "Sem vizinho"));
        System.out.println("\nlower(10): "+ (numeros.lower(10) != null ? numeros.lower(10) : "Sem vizinho"));
        System.out.println("\nceiling(51): "+ (numeros.ceiling(51) != null ? numeros.higher(51) : "Sem vizinho"));
        System.out.println("\nfloor(9): "+ (numeros.floor(9) != null ? numeros.higher(9) : "Sem vizinho"));
        
    }
}
