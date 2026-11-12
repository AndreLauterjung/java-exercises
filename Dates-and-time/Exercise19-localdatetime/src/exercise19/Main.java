/* Enunciado do exercício:

Data e hora digitadas

- Crie DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");. O espaço entre yyyy
e HH faz parte do molde. 
- Peça Digite data e hora (dd/MM/yyyy HH:mm): com Scanner, lendo com nextLine(). 
- Transforme em LocalDateTime com LocalDateTime.parse(texto, formato). 
- Imprima a data e hora formatadas com .format(formato). 
- Crie um segundo formatador, "HH:mm dd/MM/yyyy", e imprima a mesma data e hora com ele. 
- Imprima Daqui a 3 dias: ..., com plusDays(3) e o primeiro formatador. 

Esperado, para 05/12/2026 14:30: 05/12/2026 14:30, 14:30 05/12/2026 e Daqui a 3 dias: 08/12/2026 14:30. */

package exercise19;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
        
        System.out.println("\n=========================================");
        System.out.println("Digite a data e a hora: ");
        String dataHora = sc.nextLine();
        sc.close();
        
        LocalDateTime horaFormatada = LocalDateTime.parse(dataHora, formato);
        
        System.out.println(horaFormatada.format(formato));
        System.out.println(horaFormatada.format(formato2));
        System.out.println("Daqui a 3 dias: "+horaFormatada.plusDays(3).format(formato));
        
        System.out.println("\n=========================================");
        System.out.println("Programa encerrado!");
        System.out.println("=========================================");
    }
}
