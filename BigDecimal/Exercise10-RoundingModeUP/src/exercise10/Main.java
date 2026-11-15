/* Enunciado do exercício:

Dividindo com UP

- Divida 10 por 3 com escala 2 em UP, DOWN e HALF_UP, e imprima.
- Divida 100 por 3 com escala 2 em UP, guarde em cadaUm, imprima e multiplique por 3. Imprima o total.
- Divida 10 por 4 com escala 2 em UP e imprima.

Esperado: 3.34, 3.33 e 3.33. Depois 33.34 e 100.02. Por último 2.50. */

package exercise10;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        BigDecimal valor1 = new BigDecimal("10");
        BigDecimal valor2 = new BigDecimal("100");
        
        BigDecimal num3 = new BigDecimal("3");
        BigDecimal divisor4 = new BigDecimal("4");

        System.out.println("\n============================================");
        System.out.println("\nResultado 1: ");
        System.out.println("UP: "+valor1.divide(num3, 2, RoundingMode.UP));
        System.out.println("DOWN: "+valor1.divide(num3, 2, RoundingMode.DOWN));
        System.out.println("HALF_UP: "+valor1.divide(num3, 2, RoundingMode.HALF_UP));
        
        System.out.println("\nResultado 2: ");
        System.out.println("UP: "+valor2.divide(num3, 2, RoundingMode.UP));
        
        BigDecimal cadaUm = valor2.divide(num3, 2, RoundingMode.UP).multiply(num3);
        
        System.out.println("Resultado multiplicado: "+cadaUm);
        
        System.out.println("\nResultado 4: ");
        System.out.println("UP: "+valor1.divide(divisor4, 2, RoundingMode.UP));
        
        System.out.println("\n============================================");
        System.out.println("Programa encerrado! ");
        System.out.println("============================================");
    }
}
