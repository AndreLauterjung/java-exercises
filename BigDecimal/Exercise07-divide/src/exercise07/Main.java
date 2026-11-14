/* Enunciado do exercício:

Dividindo BigDecimal

Imports: java.math.BigDecimal e java.math.RoundingMode.

O divide tem duas versões. A simples, a.divide(b), só funciona quando o resultado termina (como 10 / 4 = 2.5).
Quando não termina (como 10 / 3), ela lança um erro. A segunda versão resolve isso: a.divide(b, escala,
arredondamento), em que a escala é quantas casas decimais você quer, e o RoundingMode.HALF_UP é o
arredondamento da escola (de 5 para cima sobe).

- Crie BigDecimal a = new BigDecimal("10"); e BigDecimal b = new BigDecimal("4");. Imprima a.divide(b). 
- Imprima c.divide(d, 2, RoundingMode.HALF_UP). 
- Imprima c.divide(d, 5, RoundingMode.HALF_UP). 
- Crie BigDecimal e = new BigDecimal("20"); e imprima e.divide(d, 2, RoundingMode.HALF_UP) e e.divide(d, 2,
RoundingMode.DOWN), cada um com uma frase na frente. 
- Divida uma conta de 100.00 entre 3 pessoas, com escala 2 e HALF_UP, e imprima quanto cada um paga. Depois
multiplique esse valor por 3 com multiply e imprima. */

package exercise07;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        BigDecimal a = new BigDecimal("10");
        BigDecimal b = new BigDecimal("4");
        BigDecimal c = new BigDecimal("10");
        BigDecimal d = new BigDecimal("3");
        BigDecimal e = new BigDecimal("20");
        BigDecimal conta = new BigDecimal("100");
        BigDecimal pessoas = new BigDecimal("3");
        
        System.out.println("\n===================================================");
        System.out.println(a.divide(b));
        
        System.out.println(c.divide(d, 2, RoundingMode.HALF_UP));
        System.out.println(c.divide(d, 5, RoundingMode.HALF_UP));
        
        System.out.println("Divisão + HALF_UP: "+e.divide(d, 2, RoundingMode.HALF_UP));
        System.out.println("Divisão + DOWN: "+e.divide(d, 2, RoundingMode.DOWN));
        
        System.out.println("\nConta para cada pessoa: R$ "+conta.divide(pessoas, 2, RoundingMode.HALF_UP));
        System.out.println("Calculando novamente a conta: "+(conta.divide(pessoas, 2, RoundingMode.HALF_UP)).multiply(pessoas));
        
        System.out.println("\n===================================================");
        System.out.println("Programa encerrado!");
        System.out.println("===================================================");
    }
}
