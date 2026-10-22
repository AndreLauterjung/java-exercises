/* Enunciado do exercício:

Notas da turma (Double)

- Crie um ArrayList<Double> chamado notas com 7.5, 4.0, 9.2, 6.8, 10.0, 5.5.
- Ordene com Collections.sort(notas) e imprima a lista.
- Imprima a menor nota com notas.get(0) e a maior com notas.get(notas.size() - 1).
- Inverta com Collections.reverse(notas) e imprima só as 3 primeiras, que formam o top 3. */

package exercise46;

import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Double> notas = new ArrayList<>();
        
        notas.add(7.5);
        notas.add(4.0);
        notas.add(9.2);
        notas.add(6.8);
        notas.add(10.0);
        notas.add(5.5);
        
        Collections.sort(notas);
        
        System.out.println("Menor nota: "+notas.get(0));
        System.out.println("Maior nota: "+notas.get(notas.size() - 1));
        
        Collections.reverse(notas);
        
        System.out.println("\nTop 3 notas: ");
        for(int i = 0; i < 3; i++)
        {
            System.out.println(notas.get(i));
        }
    }
}
