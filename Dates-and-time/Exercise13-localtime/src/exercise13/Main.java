/* Enunciado do exercício:

Alarme e meia-noite

- Crie LocalTime alarme = LocalTime.of(7, 30);.
- Crie soneca com alarme.plusMinutes(45) e antes com alarme.minusHours(1).
- Imprima o alarme, a soneca e o antes, cada um com uma frase na frente.
- Crie LocalTime noite = LocalTime.of(23, 30); e imprima noite.plusHours(2).

Esperado: 07:30, 08:15 e 06:30, e o alarme continua 07:30. Depois, 01:30, porque a hora dá a volta no relógio, sem
mudar de dia. */

package exercise13;

import java.time.LocalTime;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        LocalTime alarme = LocalTime.of(7, 30);
        LocalTime soneca = alarme.plusMinutes(45);
        LocalTime antesAlarme = alarme.minusHours(1);
        LocalTime noite = LocalTime.of(23, 30);
        
        System.out.println("\n=========================================");
        System.out.println("\nAlarme: "+alarme.getHour()+"h"+alarme.getMinute()+"min");
        System.out.println("Soneca: "+soneca.getHour()+"h"+soneca.getMinute()+"min");
        System.out.println("Antes do alarme: "+antesAlarme.getHour()+"h"+antesAlarme.getMinute()+"min");
        
        System.out.println("Noite: "+noite.plusHours(2));
        
        System.out.println("\n=========================================");
        System.out.println("Programa encerrado!");
        System.out.println("=========================================");
    }
    
    
}
