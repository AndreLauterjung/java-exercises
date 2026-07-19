package exercise01.pkgif.pkgelse;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise01IfElse {

    public static void main(String[] args)
    {
        /* Sinais Numéricos: Receba um número inteiro e utilize uma estrutura
        condicional para avaliar e imprimir se ele é "Positivo", "Negativo" ou "Zero".*/
    
        Scanner sc = new Scanner(System.in);
    
        int num = 0;
    
        System.out.println("- - - - - Verificando número inteiro - - - - -");
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        
        sc.close();
    
        if (num>0) 
        {
            System.out.println("========================");
            System.out.printf("O número %d é positivo!\n", num);
            System.out.println("========================");
        } 
        else if(num<0)
        {
            System.out.println("========================");
            System.out.printf("O número %d é negativo!\n", num);
            System.out.println("========================");
        }
        else
        {
            System.out.println("===============");
            System.out.printf("O número é 0!\n");
            System.out.println("===============");
        }

    
    }
    
}
