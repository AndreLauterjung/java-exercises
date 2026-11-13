/* Enunciado do exercício:

Multiplicação Simples

Objetivo: Fixar a sintaxe do .multiply().

Enunciado: Um produto custa "19.90" (BigDecimal precoUnitario). Calcule quanto custará comprar 4 unidades
desse produto (dica: você pode criar o 4 usando new BigDecimal("4") ou BigDecimal.valueOf(4)). */

package exercise04;

import java.math.BigDecimal;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        BigDecimal precoUnitario = new BigDecimal("19.90");
        BigDecimal quantidade = new BigDecimal("4");
        
        BigDecimal totalCompra = precoUnitario.multiply(quantidade);
        
        System.out.println("\n====================================");
        
        System.out.println("Preço unitário do produto: R$ "+precoUnitario);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Total compra: R$ "+totalCompra);
        
        System.out.println("\n====================================");
        System.out.println("Programa encerrado!");
        System.out.println("====================================");
    }
}
