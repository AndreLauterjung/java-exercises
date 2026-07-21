package exercise04;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise04While
{

    public static void main(String[] args)
    {
        /* Gerador de Tabuada Dinâmica: Solicite um número ao usuário e, utilizando o laço
        while, imprima a tabuada completa desse valor (multiplicando de 1 a 10). */
        
        Scanner sc = new Scanner(System.in);
        
        
        int num = -1;
        int multiplicador = 0;
        
        System.out.println("========= GERADOR DE TABUADA ============");
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        sc.close();
        System.out.print("\n");
        
        while(multiplicador <= 10)
        {
            
            System.out.printf("%d x %d = %d\n", num, multiplicador, num*multiplicador);
            System.out.println("---------------");
            multiplicador++;
        }
        
           
    }
    
}
