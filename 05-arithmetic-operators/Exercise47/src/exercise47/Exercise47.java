package exercise47;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise47
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Lucro da Loja: Calcule o faturamento total de 4 filiais e subtraia
        // um custo fixo de R$ 2000,00 de cada uma para achar o lucro.
    
        double custo = 2000.0, loja1, loja2, loja3, loja4, lucro;
    
        System.out.println("Digite o faturamento da loja 1: ");
        loja1 = sc.nextDouble();
    
        System.out.println("Digite o faturamento da loja 2: ");
        loja2 = sc.nextDouble();
        
        System.out.println("Digite o faturamento da loja 3: ");
        loja3 = sc.nextDouble();
        
        System.out.println("Digite o faturamento da loja 4: ");
        loja4 = sc.nextDouble();
    
        
        lucro = (loja1 - custo) + (loja2 - custo) + (loja3 - custo) + (loja4 - custo);
        
        System.out.printf("Lucro total: R$ %.2f\n", lucro);
        
    }
    
}
