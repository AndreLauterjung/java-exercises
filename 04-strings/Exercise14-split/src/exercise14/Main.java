/* Enunciado do exercício:

O Relógio Digital

- Objetivo: Manipular dados de horário estruturados.
- O que fazer: Receba uma string representando um horário no formato HH:MM:SS (ex: 14:35:50). Utilize o split(":")
para isolar a hora, o minuto e o segundo em posições separadas do array, e imprima-os individualmente.

Exemplo de saída:

- Entrada: 09:15:42

- Saída:
      Hora: 09
      Minuto: 15
      Segundo: 42 */

package exercise14;
import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] horaSplit;
        
        System.out.println("====================================");
        System.out.println("Digite uma hora no formato HH:MM:SS :");
        String hora = sc.nextLine();
        
        horaSplit = hora.split(":");
        
        System.out.println("\nResultado: ");
        for(int i = 0; i < horaSplit.length; i++) {
            System.out.println(horaSplit[i]);
        }
        
        System.out.println("\n====================================");
        System.out.println("Programa encerrado!");
        System.out.println("====================================");
        
        
    }
}
