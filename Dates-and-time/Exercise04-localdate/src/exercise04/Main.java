/* Enunciado do exercício:

Somando dias e meses

- Método novo: plusDays(n) e plusMonths(n) devolvem uma nova data com n dias ou meses a mais. A LocalDate é
imutável, como a String: o hoje.plusDays(1) não altera o hoje, então você precisa guardar o resultado numa
variável.

- Crie LocalDate hoje = LocalDate.now();.
- Crie amanha com hoje.plusDays(1).
- Crie daquiA7Dias com hoje.plusDays(7).
- Crie mesQueVem com hoje.plusMonths(1).

- Imprima as quatro datas, cada uma com uma frase na frente (por exemplo, Amanhã: ...).

Esperado, se hoje for 2026-11-06: 2026-11-07, 2026-11-13, 2026-12-06, e o hoje continua 2026-11-06. */

package exercise04;

import java.time.LocalDate;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1);
        LocalDate daquiA7Dias = hoje.plusDays(7);
        LocalDate mesQueVem = hoje.plusMonths(1);
        
        System.out.println("Datas: ");
        System.out.println("Hoje: "+hoje);
        System.out.println("Amanhã: "+amanha);
        System.out.println("Daqui a 7 dias: "+daquiA7Dias);
        System.out.println("Mês que vem: "+mesQueVem);
    }
}
