package exercise07;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise07IfElse
{
     
    public static void main(String[] args)
    {
        /* Triagem de Caracteres: Receba um único caractere do tipo char e determine se ele
        corresponde a uma vogal (considere as variações maiúsculas e minúsculas). */
        
        
        Scanner sc = new Scanner(System.in);
        
        char letra;
        
        
        System.out.println("- - - Verificando se é Vogal - - -");
        System.out.println("Digite uma letra: ");
        letra = sc.nextLine().toLowerCase().charAt(0);
        
        sc.close();
        
        
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
        {
            System.out.println("===========================");
            System.out.printf("A letra %s é uma vogal!\n", letra);
            System.out.println("===========================");
        }
        else
        {
            System.out.println("==============================");
            System.out.printf("A letra %s é uma consoante!\n", letra);
            System.out.println("==============================");
        }
        
    }
    
}