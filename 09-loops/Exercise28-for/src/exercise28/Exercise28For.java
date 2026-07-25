package exercise28;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise28For
{

    public static void main(String[] args)
    {
        /* Receba um número N representando a altura de um triângulo e imprima uma 
        figura onde a primeira linha tem 1 asterisco, a segunda tem 2, e assim por 
        diante até a N-ésima linha. */
        
        
        Scanner sc = new Scanner(System.in);
        
        int altura = -1;
        
        System.out.println("========= GERADOR DE TRIÂNGULOSS ===============");
        System.out.println("Digite um número para a altura do triângulo: ");
        altura = sc.nextInt();
        sc.close();
        System.out.printf("\n");
        
        for(int i = 0 ; i < altura ; i++) // altura = 2;
        {
            System.out.printf("* ");
            
            for(int j = 0 ; j < i ; j++)
            {
                System.out.printf("* ");
            }
            System.out.printf("\n"); // pula linha depois que o segundo for termina.
                
        }
            
        
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");
    }
    
}
