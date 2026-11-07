/* Enunciado do exercício:

Quantos dias faltam

Método novo: ChronoUnit.DAYS.between(inicio, fim) devolve quantos dias existem entre duas datas, como um
long. Funciona também com ChronoUnit.MONTHS e ChronoUnit.YEARS.

- Crie LocalDate hoje = LocalDate.now(); e LocalDate natal = LocalDate.of(2026, 12, 25);. 
- Calcule long dias = ChronoUnit.DAYS.between(hoje, natal); e imprima Faltam X dias para o Natal. 

Esperado, se hoje for 2026-11-06: Faltam 49 dias para o Natal.  */

package exercise07;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        LocalDate dataHoje = LocalDate.now();
        LocalDate natal = LocalDate.of(2026, 12, 25);
        
        long dias = ChronoUnit.DAYS.between(dataHoje, natal);
        
        System.out.println("\n======================================");
        System.out.println("Faltam "+dias+" dias para o natal!");
        
        System.out.println("\n======================================");
        System.out.println("Programa encerrado!");
        System.out.println("======================================");
    }
}
