/* Enunciado do exercício:

Métodos novos: isBefore(outra) e isAfter(outra) devolvem true ou false, e servem direto no if.

- Crie LocalDate hoje = LocalDate.now(); e LocalDate natal = LocalDate.of(2026, 12, 25);.

Use if / else if / else:

    - se hoje.isBefore(natal), imprima O Natal ainda vai chegar!;
    - se hoje.isAfter(natal), imprima O Natal já passou!;
    - senão, imprima Hoje é Natal!.

Rode de novo trocando a data do Natal por LocalDate.of(2026, 1, 1).

Rode mais uma vez trocando por LocalDate.now(), que é a data de hoje.

Esperado: O Natal ainda vai chegar!, depois O Natal já passou!, e por último Hoje é Natal! */

package exercise05;

import java.time.LocalDate;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
        LocalDate natal = LocalDate.of(2026, 12, 25);
        
        System.out.println("\n======================================");
        if(hoje.isBefore(natal)) {
            System.out.println("O Natal ainda vai chegar!");
        }
        else if(hoje.isAfter(natal)) {
            System.out.println("O Natal já passou!");
        }
        else {
            System.out.println("Hoje é Natal!");
        }
        
        System.out.println("\n======================================");
        System.out.println("Programa encerrado!");
        System.out.println("======================================");
    }
}
