/* Enunciado do exercício:

Hora e seus pedaços

- Crie LocalTime reuniao = LocalTime.of(14, 30, 45); e imprima.
- Imprima a hora, os minutos e os segundos em linhas separadas, com getHour(), getMinute() e getSecond().
- Crie LocalTime agora = LocalTime.now(); e imprima a hora e os minutos de agora.

Esperado: 14:30:45, depois Hora: 14, Minuto: 30 e Segundo: 45, e em seguida a hora e os minutos do seu relógio. */

package exercise12;

import java.time.LocalTime;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        LocalTime horaAgora = LocalTime.now();
        LocalTime reuniao = LocalTime.of(14, 30, 45);
        
        System.out.println("\n=========================================");
        System.out.println("Hora agora: "+horaAgora);
        
        System.out.println("\nHorário Reunião: ");
        System.out.println("Hora: "+reuniao.getHour());
        System.out.println("Minuto: "+reuniao.getMinute());
        System.out.println("Segundo: "+reuniao.getSecond());
        
        System.out.println("\n=========================================");
        System.out.println("Programa encerrado!");
        System.out.println("=========================================");
    }
}
