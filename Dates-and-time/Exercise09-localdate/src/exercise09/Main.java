/* Enunciado do exercício:

Ida e volta

- Leia uma data no formato dd/MM/yyyy.
- Imprima a data no formato brasileiro (data.format(formato)).
- Crie um segundo formatador, "dd-MM-yyyy", e imprima a mesma data com ele.
- Crie LocalDate daqui30 = data.plusDays(30); e imprima no formato brasileiro, com a frase Daqui a 30 dias: ....

Esperado, para 07/11/2026: 07/11/2026, 07-11-2026 e Daqui a 30 dias: 07/12/2026.

Antes de rodar, pense: por que o plusDays devolve uma data nova, e não altera a variável data? */

package exercise09;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma data: ");
        String dataUsuario = sc.nextLine();
        sc.close();
        
        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        LocalDate dataBrasil = LocalDate.parse(dataUsuario, formatoBrasileiro);
        LocalDate daqui30dias = dataBrasil.plusDays(30);
        
        System.out.println("\n=========================================");
        System.out.println("Data no formato Brasileiro: "+dataBrasil.format(formatoBrasileiro));
        System.out.println("Daqui 30 dias: "+daqui30dias.format(formatoBrasileiro));
        System.out.println("Data 2: "+dataBrasil.format(formato2));
        
        System.out.println("\n=========================================");
        System.out.println("Programa encerrado!");
        System.out.println("=========================================");
    }
}
