/* Enunciado do exercício:

O UP com setScale

- Crie "2.341", "2.349", "2.340" e "2.301".
- Imprima cada um com setScale(2, RoundingMode.UP).
- Crie "7.01" e "7.00" e imprima cada um com setScale(0, RoundingMode.UP).

Esperado: 2.35, 2.35, 2.34, 2.31, 8 e 7. */

package exercise08;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        BigDecimal valor1 = new BigDecimal("2.341");
        BigDecimal valor2 = new BigDecimal("2.349");
        BigDecimal valor3 = new BigDecimal("2.340");
        BigDecimal valor4 = new BigDecimal("2.301");
        BigDecimal valor5 = new BigDecimal("7.01");
        BigDecimal valor6 = new BigDecimal("7.00");
        
        valor1 = valor1.setScale(2, RoundingMode.UP);
        valor2 = valor2.setScale(2, RoundingMode.UP);
        valor3 = valor3.setScale(2, RoundingMode.UP);
        valor4 = valor4.setScale(2, RoundingMode.UP);
        valor5 = valor5.setScale(0, RoundingMode.UP);
        valor6 = valor6.setScale(0, RoundingMode.UP);
        
        System.out.println("\n============================================");
        System.out.println("Valor 1: "+valor1);
        System.out.println("Valor 2: "+valor2);
        System.out.println("Valor 3: "+valor3);
        System.out.println("Valor 4: "+valor4);
        System.out.println("Valor 5: "+valor5);
        System.out.println("Valor 6: "+valor6);
        
        System.out.println("\n============================================");
        System.out.println("Programa encerrado! ");
        System.out.println("============================================");
    }
}
