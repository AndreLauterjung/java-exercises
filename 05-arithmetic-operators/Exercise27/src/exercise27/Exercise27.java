package exercise27;

import java.util.Scanner;

/**
 *
 * @author andrelauterjung
 */
public class Exercise27
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Converta um valor em Reais para Dólar (valor / cotação).
        
        double dolarAmericanoHoje = 5.12, valor, conversao;
        
        System.out.println("Convertendo de valores.");
        System.out.println("Digite a quantidade em reais que você deseja converter para dólar americano: ");
        valor = sc.nextDouble();
        
        conversao = valor / dolarAmericanoHoje;
        
        System.out.printf("Você converteu R$ %.2f para dólar!\n", valor);
        System.out.printf("SALDO (DÓLAR AMERICANO): US$ %.2f\n", conversao);
    }
    
}
