/* Enunciado do exercício:

Soma de idades.

Crie um programa que utilize um ArrayList do tipo Integer para armazenar 5 idades. Utilize um laço for com .size()
e .get() para percorrer a lista, somando todas as idades numa variável double total, e ao final, imprima a soma
total e a média (total dividido pela quantidade de idades, usando .size()). */
package exercise03;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
       ArrayList<Integer> idades = new ArrayList<>();
       double totalSomaIdade = 0;
       double mediaIdade;
       
       idades.add(25);
       idades.add(45);
       idades.add(59);
       idades.add(32);
       idades.add(18);
       
       for(int i = 0; i < idades.size(); i++)
       {
           totalSomaIdade += idades.get(i);
       }
        System.out.println("Soma total das idades: "+totalSomaIdade);
       
        mediaIdade = totalSomaIdade / idades.size();
        
        System.out.println("Média das idades: "+mediaIdade);
    }
}
