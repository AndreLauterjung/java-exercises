package exercise29;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise29
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Determine uma comissão de 10% sobre uma venda de R$ 1500,00.
        
        double valorVenda = 1500.00, comissaoBonus = 10, valorComissao;
        
        valorComissao = valorVenda * (comissaoBonus/100);
        
        System.out.println("Venda realizada!");
        System.out.printf("Valor da comissão: R$ %.2f !\n", valorComissao);
        
    }
    
}
