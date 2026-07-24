package exercise19;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise19For
{

    public static void main(String[] args)
    {
        /* Somatório dos Primeiros Números: Peça um valor int ao usuário. Calcule
        e exiba a soma de todos os números inteiros de 1 até o número digitado. */
        
        
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        int valorTotal = 0;
        
        
        System.out.println("============== LOOP SOMADOR ====================");
        System.out.println("Digite um número inteiro qualquer: ");
        num = sc.nextInt();
        sc.close();
        
        
        for(int i = 1 ; i <= num ; i++)
        {
            
            valorTotal += i;

        }
        
        System.out.printf("\nValor após todos os números serem somados\n"
                + "em sequência até o número %d: %d .\n", num, valorTotal);
        System.out.println("\n================================================");
        System.out.println("============= PROGRAMA ENCERRADO ===============");
        System.out.println("================================================");
    }
    
}
