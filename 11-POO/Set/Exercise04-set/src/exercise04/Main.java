/* Enunciado do exercício:

Notas repetidas

Um professor digitou as notas de uma prova numa List<Integer>: 7, 5, 9, 7, 10, 5, 8, 9, 7.

Descubra:

Quantas notas foram digitadas no total.
Quantas notas diferentes existem (dica: crie um Set a partir da lista).
Imprima as notas diferentes. */

package exercise04;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        List<Integer> notasDigitadas = new ArrayList<>();
        Set<Integer> notas = new HashSet<>();
        
        notasDigitadas.add(7);
        notasDigitadas.add(5);
        notasDigitadas.add(9);
        notasDigitadas.add(7);
        notasDigitadas.add(10);
        notasDigitadas.add(5);
        notasDigitadas.add(8);
        notasDigitadas.add(9);
        notasDigitadas.add(7);
        
        notas.addAll(notasDigitadas);
        
        System.out.println("Notas digitadas: "+notasDigitadas.size());
        System.out.println("Notas diferentes: "+notas.size());
        
        System.out.println("\nImprimindo notas diferentes: ");
        for(Integer nota : notas)
        {
            System.out.println(nota);
        }
    }
}
