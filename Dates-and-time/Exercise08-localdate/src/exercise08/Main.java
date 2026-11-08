/* Enunciado do exercício:

Do texto para a data

- Crie DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");.
- Peça com Scanner: Digite uma data (dd/MM/yyyy):, lendo com nextLine().
- Transforme o texto em LocalDate com LocalDate.parse(texto, formato).
- Imprima a LocalDate sem formatar, direto no println.

Teste com 07/11/2026 e com 25/12/2026.

Esperado: 2026-11-07 e 2026-12-25. Repare que a data digitada no formato brasileiro sai no formato padrão do
Java. */

package exercise08;

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
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("\n=========================================");
        System.out.println("Digite uma data no formato (dd/MM/yyyy): ");
        String data = sc.nextLine();
        sc.close();
        
        LocalDate dataFormatada = LocalDate.parse(data, formato);
        
        System.out.println(dataFormatada);
        System.out.println("\n=========================================");
        System.out.println("Programa encerrado!");
        System.out.println("=========================================");
    }
}
