/* Enunciado do exercício:

Fechamento de Caixa

Objetivo: Combinar leitura de dados, soma e subtração em um fluxo completo.

Enunciado: Crie um pequeno sistema de caixa:

- Peça ao usuário o valor inicial do caixa no começo do dia.
- Peça o valor total de vendas realizadas no dia e some ao valor inicial.
- Peça o valor pago a fornecedores (despesas) e subtraia do montante atual.
- Exiba o saldo final do caixa ao encerrar o expediente. */

package exercise06;

import java.math.BigDecimal;
import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor inicial do caixa no começo do dia: ");
        String valorInicial = sc.nextLine();
        
        System.out.println("Digite o total em vendas realizadas no dia: ");
        String totalVendas = sc.nextLine();
        
        System.out.println("Digite o total pago aos fornecedores: ");
        String despesasFornecedores = sc.nextLine();
        sc.close();
        
        BigDecimal valorInicio = new BigDecimal(valorInicial);
        BigDecimal vendasDia = new BigDecimal(totalVendas);
        BigDecimal despesas = new BigDecimal(despesasFornecedores);
        
        BigDecimal saldoFinal = (valorInicio.add(vendasDia)).subtract(despesas);
        
        System.out.println("==================================================");
        
        System.out.println("Valor do caixa no começo do dia: R$ "+valorInicio);
        System.out.println("Quantidade em vendas no dia: R$ "+vendasDia);
        System.out.println("Total em despesas com fornecedores no dia: R$ "+despesas);
        System.out.println("\nSaldo final: R$ "+saldoFinal);
        
        System.out.println("\n===================================================");
        System.out.println("Programa encerrado!");
        System.out.println("===================================================");
    }
}
