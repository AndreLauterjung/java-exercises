/* Enunciado do exercício:

Criando BigDecimal

Import: java.math.BigDecimal. A classe fica em java.math, e não em java.util.

Crie BigDecimal preco = new BigDecimal("19.90"); e imprima.
Crie BigDecimal quantidade = new BigDecimal("3"); e imprima.
Crie BigDecimal dinheiroErrado = new BigDecimal(0.1);, com o número sem aspas, e imprima.
Crie BigDecimal dinheiroCerto = new BigDecimal("0.1");, com aspas, e imprima.
Crie BigDecimal porValueOf = BigDecimal.valueOf(0.1); e imprima.
Imprima também o BigDecimal.ZERO e o BigDecimal.TEN, que são constantes prontas da classe. */

package exercise01;

import java.math.BigDecimal;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        BigDecimal preco = new BigDecimal("19.90");
        BigDecimal quantidade = new BigDecimal("3");
        BigDecimal dinheiroErrado = new BigDecimal(0.1);
        BigDecimal dinheiroCerto = new BigDecimal("0.1");
        BigDecimal porValueOf = BigDecimal.valueOf(0.1);
        
        System.out.println("============================================");
        System.out.println("Preço: "+preco);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Dinheiro errado: "+dinheiroErrado);
        System.out.println("Dinheiro certo: "+dinheiroCerto);
        System.out.println("Por valueOf: "+porValueOf);
        System.out.println("BigDecimal.ZERO: "+BigDecimal.ZERO);
        System.out.println("BigDecimal.TEN: "+BigDecimal.TEN);
        
        System.out.println("\n============================================");
        System.out.println("Programa encerrado! ");
        System.out.println("============================================");
    }
}
