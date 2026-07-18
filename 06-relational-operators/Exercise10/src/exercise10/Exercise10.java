package exercise10;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise10
{

    public static void main(String[] args)
    {
        /* Validador de Resto Zerado: Receba um número inteiro qualquer. Extraia o módulo
        desse número por 2 e verifique diretamente se o resultado é igual a zero. */
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        boolean isIgualZero;
        
        System.out.println("*******************************");
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        
        sc.close();
        System.out.println("*******************************");
        
        isIgualZero = num % 2 == 0;
        
        System.out.println("***********************************************************");
        System.out.println("Após extrais o módulo do número digitado, o resultado é 0? ");
        System.out.println("Resposta do programa: "+isIgualZero);
        System.out.println("***********************************************************"); 
        
    }
    
}
