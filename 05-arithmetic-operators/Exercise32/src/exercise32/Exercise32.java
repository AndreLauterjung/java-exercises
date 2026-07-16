package exercise32;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise32 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Calcule o valor final de um produto com 15% de desconto.
        
        double desconto = 15, valorProduto, valorFinal;
        
        System.out.println("Pagando compra.");
        System.out.println("Digite o valor do produto: ");
        valorProduto = sc.nextDouble();
        
        System.out.println("Este produto recebeu um desconto de 15%!");
        
        valorFinal = valorProduto -((desconto/100)*valorProduto);
        
        System.out.printf("Valor final do produto: R$ %.2f\n", valorFinal);
        
    }
    
}
