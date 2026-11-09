/* Enunciado do exercício:

Quantos dias faltam

- Leia uma data no formato dd/MM/yyyy.
- Crie LocalDate hoje = LocalDate.now();.

Use if / else if / else:

- se data.isAfter(hoje): imprima Faltam X dias, com ChronoUnit.DAYS.between(hoje, data);
- se data.isBefore(hoje): imprima Passou há X dias, com ChronoUnit.DAYS.between(data, hoje);
- senão: imprima É hoje!. */

package exercise10;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LocalDate dataHoje = LocalDate.now();
        
        System.out.println("\n=========================================");
        System.out.println("Digite uma data: ");
        String dataUsuario = sc.nextLine();
        sc.close();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate dataUsuarioFormatada = LocalDate.parse(dataUsuario, formato);
        
        if(dataUsuarioFormatada.isAfter(dataHoje)) {
            
            System.out.println("\nFaltam: "+ChronoUnit.DAYS.between(dataHoje, dataUsuarioFormatada)+" dias.");
        }
        else if(dataUsuarioFormatada.isBefore(dataHoje)) {
            
            System.out.println("\nJá passaram: "+ChronoUnit.DAYS.between(dataUsuarioFormatada, dataHoje)+" dias.");
        }
        else {
            System.out.println("\nÉ hoje!");
        }
        
        System.out.println("\n=========================================");
        System.out.println("Programa encerrado!");
        System.out.println("=========================================");
    }
}
