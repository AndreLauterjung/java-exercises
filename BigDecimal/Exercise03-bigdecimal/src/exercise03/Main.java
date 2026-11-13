/* Enunciado do exercício:

Subtração Simples

Objetivo: Fixar a sintaxe do .subtract().

Enunciado: Você tem um saldo inicial de "150.00" (BigDecimal saldo) e fez uma compra no débito de "47.85"
(BigDecimal compra). Calcule o saldo restante e imprima o resultado. */

package exercise03;

import java.math.BigDecimal;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        BigDecimal saldoInicial = new BigDecimal("150.00");
        BigDecimal valorCompra = new BigDecimal("47.85");
        
        BigDecimal saldoRestante = saldoInicial.subtract(valorCompra);
        
        System.out.println("\n====================================");
        System.out.println("Saldo inicial: R$ "+saldoInicial);
        System.out.println("Valor compra: R$ "+valorCompra);
        System.out.println("Saldo restante: R$ "+saldoRestante);
        
        System.out.println("\n====================================");
        System.out.println("Programa encerrado!");
        System.out.println("====================================");
    }
}
