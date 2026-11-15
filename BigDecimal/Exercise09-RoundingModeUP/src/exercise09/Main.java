/* Enunciado do exercício:

UP contra DOWN e HALF_UP

Crie "5.671" e "5.678".

- Para cada um, imprima o valor com escala 2 nos três modos: UP, DOWN e HALF_UP, com uma frase na frente.

Esperado:

Valor	UP	DOWN	HALF_UP
5.671	5.68	5.67	5.67
5.678	5.68	5.67	5.68 */
package exercise09;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        BigDecimal valor1 = new BigDecimal("5.671");
        BigDecimal valor2 = new BigDecimal("5.678");

        System.out.println("=== Valor 1: 5.671 ===");
        System.out.println("UP:      " + valor1.setScale(2, RoundingMode.UP));
        System.out.println("DOWN:    " + valor1.setScale(2, RoundingMode.DOWN));
        System.out.println("HALF_UP: " + valor1.setScale(2, RoundingMode.HALF_UP));
        
        System.out.println();

        System.out.println("=== Valor 2: 5.678 ===");
        System.out.println("UP:      " + valor2.setScale(2, RoundingMode.UP));
        System.out.println("DOWN:    " + valor2.setScale(2, RoundingMode.DOWN));
        System.out.println("HALF_UP: " + valor2.setScale(2, RoundingMode.HALF_UP));
    
        System.out.println("\n============================================");
        System.out.println("Programa encerrado! ");
        System.out.println("============================================");
    }
}
