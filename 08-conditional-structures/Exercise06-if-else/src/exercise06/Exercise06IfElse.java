package exercise06;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise06IfElse
{

    public static void main(String[] args)
    {
        /*Comparador de Grandeza: Solicite dois números inteiros distintos e utilize
        condicionais para descobrir e exibir qual deles é o maior valor digitado. */ 
        
        Scanner sc = new Scanner(System.in);
        
        
        int num1 = -1;
        int num2 = -1;
        
        
        System.out.println("- - - Verificando Número Maior - - -");
        System.out.println("Digite um número inteiro: ");
        num1 = sc.nextInt();
        
        System.out.println("Digite outro número inteiro: ");
        num2 = sc.nextInt();
        
        sc.close();
        
        
        if(num1 == num2)
        {
            System.out.println("=====================================================================");
            System.out.printf("O primeiro número (%d) é igual ao segundo número (%d)!\n", num1, num2);
            System.out.println("=====================================================================");
        }
        else if(num1 > num2)
        {
            System.out.println("=====================================================================");
            System.out.printf("O primeiro número (%d) é maior do que o segundo número (%d)!\n", num1, num2);
            System.out.println("=====================================================================");
        }
        else
        {
            System.out.println("=====================================================================");
            System.out.printf("O segundo número (%d) é maior do que o primeiro número (%d)!\n", num2, num1);
            System.out.println("=====================================================================");
        }
        
    }
    
}
