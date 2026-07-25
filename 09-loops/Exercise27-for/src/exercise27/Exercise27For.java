package exercise27;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise27For
{

    public static void main(String[] args)
    {
        /* Receba um número inteiro N. Utilizando dois laços for (um dentro do outro), 
        imprima um quadrado de asteriscos com dimensão N × N. */
        
        int dimensao = -1;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("============= imprimir quadrado ================");
        System.out.println("Digite um número para determinar a dimensão do quadrado: ");
        dimensao = sc.nextInt();
        sc.close();
        System.out.print("\n");
        
        for(int i = 0 ; i < dimensao ; i++) // a linha
        {
            System.out.printf("X ");
            
            for(int j = 1 ; j < dimensao ; j++) // a variável recomeça quando inicia novamente o loop
            {
                System.out.printf("X ");
            }
            System.out.print("\n");
        }
        
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");
    }
    
}
