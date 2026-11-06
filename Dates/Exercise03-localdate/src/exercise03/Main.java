/* Enunciado do exercício:

Idade aproximada

- Crie uma LocalDate com a data de nascimento de um personagem inventado, usando LocalDate.of(2000, 5, 15).

- Crie outra com LocalDate.now().

- Imprima as duas datas.

- Calcule a idade aproximada subtraindo os anos: hoje.getYear() - nascimento.getYear(). Guarde num int e imprima
Idade aproximada: X anos.

Esperado, se hoje for 2026-11-06: as duas datas e Idade aproximada: 26 anos. */

package exercise03;

import java.time.LocalDate;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        LocalDate nascimento = LocalDate.of(2000, 5, 15);
        LocalDate dataHoje = LocalDate.now();
        
        System.out.println("\n======================================");
        System.out.println("Data de nascimento: "+nascimento);
        System.out.println("Data de hoje: "+dataHoje);
        
        int idadeAproximada = dataHoje.getYear() - nascimento.getYear();
        
        System.out.println("\nIdade aproximada: "+idadeAproximada+" anos.");
        
        System.out.println("\n======================================");
        System.out.println("Programa encerrado!");
        System.out.println("======================================");
    }
}
