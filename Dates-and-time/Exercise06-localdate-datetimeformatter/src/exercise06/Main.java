/* Enunciado do exercício:

Data no formato brasileiro

- Crie LocalDate data = LocalDate.of(2026, 3, 7);. 
- Crie um formatador DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");. 
- Imprima a data formatada com data.format(formato). 
- Crie mais três formatadores e imprima a mesma data com cada um: "dd-MM-yyyy", "d/M/yyyy" e "dd/MM/yy". 
- Imprima também a data de hoje (LocalDate.now()) no formato dd/MM/yyyy. 

Esperado para o 2026-03-07: 07/03/2026, 07-03-2026, 7/3/2026 e 07/03/26. E a data de hoje no formato brasileiro. */

package exercise06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        LocalDate data = LocalDate.of(2026, 11, 06);
        
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter formato4 = DateTimeFormatter.ofPattern("dd/MM/yy");
        
        System.out.println("Data normal: "+data);
        System.out.println("Data formato brasileiro (v1): "+data.format(formato1));
        System.out.println("Data formato brasileiro (v2): "+data.format(formato2));
        System.out.println("Data formato brasileiro (v3): "+data.format(formato3));
        System.out.println("Data formato brasileiro (v4): "+data.format(formato4));
        
    }
}
