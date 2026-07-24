package exercise25;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise25For
{

    public static void main(String[] args)
    {
        /* Verificador de Número Primo: Receba um número inteiro do usuário. Percorra os
        divisores possíveis com um for e identifique se ele é ou não um número primo. */
        
        Scanner sc = new Scanner(System.in);
        
        int num = -1;
        int resultadoResto;
        
        boolean isPrimo = true;
        
        
        System.out.println("======== VERIFICADOR DE NÚMEROS PRIMOS ==========");
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        sc.close();
        
        for(int i = 2; i < num; i++) // aqui tá correto. 
        {
 
            resultadoResto = num % i;
             
            if(resultadoResto == 0)
            {
                isPrimo = false;
            }
            
        }
        
        if(num == 2)
        {
            System.out.println("2 é primo");      
        }
        
        System.out.println("o número "+num+" é primo? ");
        System.out.println("Resposta do programa: "+isPrimo);
       
        
    }
    
}
