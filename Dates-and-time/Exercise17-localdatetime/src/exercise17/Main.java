/* Enunciado do exercício:

Data e hora, e seus pedaços

- Crie LocalDateTime consulta = LocalDateTime.of(2026, 12, 5, 14, 30); e imprima.
- Imprima o dia, o mês, o ano, a hora e os minutos em linhas separadas, com getDayOfMonth(), getMonthValue(),
getYear(), getHour() e getMinute().
- Crie LocalDateTime agora = LocalDateTime.now(); e imprima só a data e a hora com minutos, usando os getters,
sem as frações de segundo.

Esperado: 2026-12-05T14:30, depois Dia: 5, Mês: 12, Ano: 2026, Hora: 14 e Minuto: 30, e em seguida a data e a hora
do seu relógio.

Repare no T entre a data e a hora, e que os segundos não aparecem, porque são zero. */

package exercise17;

import java.time.LocalDateTime;
import java.time.LocalTime;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        LocalDateTime consulta = LocalDateTime.of(2026, 12, 5, 14, 30);
        LocalDateTime agora = LocalDateTime.now();
        
        System.out.println("\n=========================================");
        System.out.println(consulta);
        
        System.out.println("\nDia: "+consulta.getDayOfMonth());
        System.out.println("Mês: "+consulta.getMonthValue());
        System.out.println("Ano: "+consulta.getYear());
        System.out.println("\nHora: "+consulta.getHour());
        System.out.println("Minutos: "+consulta.getMinute());
        
        System.out.println(agora.getDayOfMonth()+"/"+agora.getMonthValue()+"/"+agora.getYear()+" Hora: "
                +agora.getHour()+":"+agora.getMinute());
        
        System.out.println("\n=========================================");
        System.out.println("Programa encerrado!");
        System.out.println("=========================================");
    }
}
