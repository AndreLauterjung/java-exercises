package exercise10;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise10DoWhile
{

    public static void main(String[] args)
    {
        /* Leitor de Idade Válida: Crie um programa que solicite a idade de uma pessoa. O
        programa não pode aceitar idades menores ou iguais a zero; caso a idade seja
        inválida, a solicitação deve se repetir. */
        
        
        Scanner sc = new Scanner(System.in);
        
        boolean isRunning = true;
        int idade = -1;
        
        
        do
        {
            System.out.println("===== LEITOR DE IDADES =====");
            System.out.println("Digite a sua idade: ");
            idade = sc.nextInt();
            
            if(idade <= 0)
            {
                System.out.println("\nX ! X ! X ! X ! X !");
                System.out.println("IDADE INVÁLIDA!");
                System.out.println("TENTE NOVAMENTE!");
                System.out.println("X ! X ! X ! X ! X !\n");
            }
            else
            {
                System.out.println("\nIDADE: "+idade);
                System.out.println("PROGRAMA ENCERRADO!");
                System.out.println("==========================");
                
                isRunning = false;
            }
        }
        while(isRunning);  
        
    }
    
}
