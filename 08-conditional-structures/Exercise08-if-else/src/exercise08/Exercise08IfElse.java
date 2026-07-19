package exercise08;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise08IfElse
{

    public static void main(String[] args)
    {
        /* Intervalo Numérico Restrito: Receba um número inteiro e exiba uma mensagem
        confirmando se ele está localizado dentro do intervalo de 10 a 20 (incluindo os limites 10 e
        20). */
        
        
        Scanner sc = new Scanner(System.in);
        
        int numMin = 10;
        int numMax = 20;
        int numVerificar = -1;
        
        System.out.println("- - - Verificando número - - - ");
        System.out.println("Digite um número inteiro: ");
        numVerificar = sc.nextInt();
        
        sc.close();
        
        if(numVerificar >= numMin && numVerificar <= numMax)
        {
            System.out.println("=====================================");
            System.out.printf("O número %d está entre %d e %d!\n", numVerificar, numMin, numMax);
            System.out.println("=====================================");
        }
        else
        {
            System.out.println("=====================================");
            System.out.printf("O número %d não está entre %d e %d!\n", numVerificar, numMin, numMax);
            System.out.println("=====================================");
        }
        
        
        
        
        
        
        
    }
    
}
