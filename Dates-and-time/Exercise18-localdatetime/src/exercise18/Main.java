/* Enunciado do exercício:

- Crie LocalDateTime noite = LocalDateTime.of(2026, 12, 31, 23, 30);. 
- Crie daquiA2Horas com noite.plusHours(2), daquiA7Dias com noite.plusDays(7) e antes com
noite.minusMinutes(45). 
- Imprima a noite e as três novas, cada uma com uma frase na frente. 

Esperado: 2027-01-01T01:30, 2027-01-07T23:30 e 2026-12-31T22:45, e a noite continua 2026-12-31T23:30. */

package exercise18;

import java.time.LocalDateTime;

/**
 *
 * @author andrelauterjung
 */
public class Main {
  
    public static void main(String[] args) {
        
        LocalDateTime noite = LocalDateTime.of(2026, 12, 31, 23, 30);
        LocalDateTime daquiA2Horas = noite.plusHours(2);
        LocalDateTime daquiA7Dias = noite.plusDays(7);
        LocalDateTime antes = noite.minusMinutes(45);
        
        System.out.println("\n=========================================");
        System.out.println("Noite: "+noite);
        System.out.println("Daqui a 2 horas: "+daquiA2Horas);
        System.out.println("Daqui a 7 dias: "+daquiA7Dias);
        System.out.println("Antes: "+antes);
        
        System.out.println("\n=========================================");
        System.out.println("Programa encerrado!");
        System.out.println("=========================================");
    }
}
