/* Enunciado do exercício:

Soma Simples

Objetivo: Fixar a sintaxe do .add() e a criação via String.

Enunciado: Crie duas variáveis BigDecimal: precoCafe com o valor "4.75" e precoPaoDeQueijo com o valor "6.50".
Some os dois valores e exiba o total a pagar no console. */

package exercise02;

import java.math.BigDecimal;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        BigDecimal precoCafe = new BigDecimal("4.75");
        BigDecimal precoPaoDeQueijo = new BigDecimal("6.50");
        
        BigDecimal valorTotal = precoCafe.add(precoPaoDeQueijo);
        
        System.out.println("====================================");
        System.out.println("Preço do café: R$ "+precoCafe);
        System.out.println("Preço do pão de queijo: R$ "+precoPaoDeQueijo);
        System.out.println("Valor total: R$ "+valorTotal);
        
        System.out.println("\n====================================");
        System.out.println("Programa encerrado!");
        System.out.println("====================================");
    }
}
