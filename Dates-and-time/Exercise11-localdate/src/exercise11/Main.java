/* Enunciado do exercício:

Idade pela data de nascimento

- Digite uma data de nascimento (dd/MM/yyyy) e leia com Scanner.
- Calcule a idade com ChronoUnit.YEARS.between(nascimento, hoje) e guarde num long. 
- Imprima uma frase como Você nasceu em 15/05/2000 e tem 26 anos., usando a data de nascimento formatada no
padrão brasileiro. 
- Imprima também o dia da semana em que a pessoa nasceu, com nascimento.getDayOfWeek(). 

Esperado, para 15/05/2000 e hoje em 2026-11-07: Você nasceu em 15/05/2000 e tem 26 anos. e MONDAY.

 */

package exercise11;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LocalDate dataHoje = LocalDate.now();
        
        
        System.out.println("Digite sua data de nascimento: ");
        String dataNascimento = sc.nextLine();
        sc.close();
        
        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate dataNascimentoBrasil = LocalDate.parse(dataNascimento, formatoBrasileiro);
        
        long idade = ChronoUnit.YEARS.between(dataNascimentoBrasil, dataHoje);
        
        System.out.println("\n=========================================");
        
        System.out.println("\nVocê nasceu em: "+dataNascimentoBrasil.format(formatoBrasileiro)+" e tem "+idade+" anos.");
        System.out.println("Você nasceu em uma "+dataNascimentoBrasil.getDayOfWeek());
        
        System.out.println("\n=========================================");
        System.out.println("Programa encerrado!");
        System.out.println("=========================================");
    }
}
