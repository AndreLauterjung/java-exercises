package exercise03;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise03IfElse
{

    public static void main(String[] args)
    {
        /* Paridade por Texto: Solicite um número inteiro ao usuário. Utilizando o operador de
        resto e a estrutura condicional, exiba se o número é "Par" ou "Ímpar". */ 
        
        
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        
        
        System.out.println("- - - Verificano se é PAR ou ÍMPAR - - - ");
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        
        sc.close();
        
        if(num % 2 == 0)
        {
            System.out.println("======================");
            System.out.printf("O número %d é par!\n", num);
            System.out.println("======================");
        }
        else
        {
            System.out.println("=====================");
            System.out.printf("O número %d é ímpar!\n", num);
            System.out.println("=====================");
        }
        
    }
    
}
