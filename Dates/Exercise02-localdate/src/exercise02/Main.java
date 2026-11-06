/* Enunciado do exercício:

Data de uma ocasião especial

- Crie uma LocalDate com LocalDate.of(...) para uma data que você escolher (aniversário, Natal, o dia de um jogo).
- Imprima a data inteira.
- Imprima o dia, o mês e o ano em linhas separadas. */

package exercise02;

import java.time.LocalDate;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        LocalDate data = LocalDate.of(2000, 10, 1);
        
        System.out.println(data);
        System.out.println("Dia: "+data.getDayOfMonth());
        System.out.println("Mês: "+data.getMonthValue());
        System.out.println("Ano: "+data.getYear());
    }
}
