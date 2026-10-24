/* Enunciado do exercício:

Horários de ônibus (int e Scanner)

- Crie um NavigableSet<Integer> chamado horarios com as horas de saída: 6, 8, 10, 14, 18, 22. 
- Peça ao usuário uma hora, com Scanner. 
- Imprima o próximo ônibus a partir dessa hora, que pode ser na própria hora. Se não houver, imprima Não há
mais ônibus hoje. 
- Imprima o ônibus anterior a essa hora, sem contar a própria. Se não houver, imprima Nenhum ônibus saiu ainda. 
- Teste com 6, 9, 10, 22 e 23.
 */
package exercise16;

import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        NavigableSet<Integer> horarios = new TreeSet<>();
        
        horarios.add(6);
        horarios.add(8);
        horarios.add(10);
        horarios.add(14);
        horarios.add(18);
        horarios.add(22);
        
        System.out.println("Digite uma hora: ");
        int hora = sc.nextInt();
        sc.close();
        
        System.out.println("O próximo ônibus aparece em: "+ (horarios.ceiling(hora) != null ? horarios.ceiling(hora): "Não há mais ônibus hoje!"));
        System.out.println("Ônibus anterior à essa hora: "+(horarios.lower(hora) != null ? horarios.lower(hora) : "Nenhum ônibus saiu ainda!"));
        
    }
}
