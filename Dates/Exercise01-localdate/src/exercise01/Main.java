/* Enunciado do exercício:

- crie uma variável LocalDate hoje guardando a data atual com LocalDate.now().
- Imprima a variável com System.out.println();
- Imprima também o dia, o mês e o ano em linhas separadas, usando os métodos getDayOfMonth(),
- getMonthValue() e getYear(). */

package exercise01;

import java.time.LocalDate;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        LocalDate data = LocalDate.now();
        
        System.out.println(data);
        System.out.println("Dia: "+data.getDayOfMonth());
        System.out.println("Mês: "+data.getMonthValue());
        System.out.println("Ano: "+data.getYear());
    }
}
