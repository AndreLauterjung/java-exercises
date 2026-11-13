/* Enunciado do exercício:

Carrinho de Compras

Objetivo: Combinar Scanner, multiplicação e soma.

Enunciado: Peça ao usuário para digitar o preço de um produto (como texto) e a quantidade desejada (como
inteiro). Calcule o valor total desse item multiplicando o preço pela quantidade. Em seguida, adicione uma taxa
fixa de entrega de "12.50" ao total e exiba o valor final do pedido. */

package exercise05;

import java.util.Scanner;
import java.math.BigDecimal;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BigDecimal taxaEntrega = new BigDecimal("12.50");
        BigDecimal valorTotal;
        
        System.out.println("Digite o preço de um produto: ");
        String precoProduto = sc.nextLine();
        
        System.out.println("Qual a quantidade de produtos? ");
        String quantidadeProduto = sc.nextLine();
        sc.close();
        
        BigDecimal preco = new BigDecimal(precoProduto);
        BigDecimal quantidade = new BigDecimal(quantidadeProduto);
        
        valorTotal = (preco.multiply(quantidade)).add(taxaEntrega);
        
        System.out.println("====================================");
        
        System.out.println("Preço do produto: R$ "+preco);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Valor total da compra: R$ "+valorTotal);
        
        System.out.println("\n====================================");
        System.out.println("Programa encerrado!");
        System.out.println("====================================");
    }
}
