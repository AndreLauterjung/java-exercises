/* Enunciado do exercício:

A loja está aberta?

- Crie abertura = LocalTime.of(9, 0) e fechamento = LocalTime.of(18, 0). 
- Crie uma LocalTime chamada hora com LocalTime.of(8, 30). 

- Use if / else if / else: 
        se hora.isBefore(abertura): Ainda não abriu; 
        senão, se hora.isBefore(fechamento): Aberto; 
        senão: Fechado. 

- Rode quatro vezes, trocando a hora por 8:30, 12:00, 18:00 e 20:15. 

Esperado: Ainda não abriu, Aberto, Fechado e Fechado.

Repare no 18:00: ele não está antes do fechamento, então cai no Fechado. Anote por que, quando a hora é exatamente igual, o isBefore dá false.
 */
package exercise14;

import java.time.LocalTime;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        LocalTime abertura = LocalTime.of(9, 0);
        LocalTime fechamento = LocalTime.of(18, 0);
        LocalTime hora = LocalTime.of(20, 15);
        
        System.out.println("\n=========================================");
        if(hora.isBefore(abertura)) {
            System.out.println("Ainda não abriu!");
        }
        else if(hora.isBefore(fechamento)) {
            System.out.println("Aberto!");
        }
        else {
            System.out.println("Fechado!");
        }
        
        System.out.println("\n=========================================");
        System.out.println("Programa encerrado!");
        System.out.println("=========================================");

    }
}
