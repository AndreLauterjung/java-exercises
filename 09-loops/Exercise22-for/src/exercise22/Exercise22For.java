package exercise22;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise22For
{

    public static void main(String[] args)
    {
        /* Múltiplos de um Intervalo: Peça dois números inteiros (Início e Fim). Percorra
        esse intervalo e conte quantos números ali dentro são múltiplos de 3.  */
        
        Scanner sc = new Scanner(System.in);
        
        int inicio = 0;
        int fim = 0;
        
        
        System.out.println("============ PERCORRENDO INTERVALO ==============");
        System.out.println("Digite um número inteiro para o início do loop: ");
        inicio = sc.nextInt();
        
        System.out.println("Digite um número inteiro para o fim do loop: ");
        fim = sc.nextInt();
        sc.close();
        System.out.printf("\n");
        
        for(int i = inicio ; i <= fim ; i++)
        {
            if(i == 1 || i % 3 == 0)
            {
                System.out.printf("O número %d é múltiplo de 3.\n", i);
            }
        }        
        
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");
        
    }
    
}
