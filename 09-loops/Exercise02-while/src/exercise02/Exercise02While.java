package exercise02;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise02While
{

    public static void main(String[] args)
    {
        /* Somatório Indeterminado: Desenvolva um algoritmo que peça números inteiros
        ao usuário e vá somando-os. O laço deve parar de rodar imediatamente no
        momento em que o usuário digitar um número negativo. */
        
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        int cofre = 0;
        
        
        while(!(num < 0))
        {
            System.out.println("===================================");
            System.out.println("Digite um número inteiro:  ");
            num = sc.nextInt();
            
            if(!(num < 0))
            {
                cofre += num;
                System.out.println("Somando com número anterior: "+cofre);
                System.out.println("===================================");
            }
            else
            {
                System.out.println("Programa encerrado!");
                System.out.println("Você digitou um número negativo!");
            }
        }

        
    }
    
}
