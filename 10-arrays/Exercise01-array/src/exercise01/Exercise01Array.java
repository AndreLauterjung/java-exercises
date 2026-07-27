package exercise01;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise01Array
{

    public static void main(String[] args)
    {
        /* xercício 01: Declaração e Acesso por Índice
        Objetivo: Criar um array fixo, atribuir valores e percorrer com um laço for.

        O que fazer:

        Declare um array de inteiros (int[]) chamado numeros com 5 posições.

        Preencha manualmente cada índice (de 0 a 4) com valores de sua escolha (ex: 10, 25, 30, 42, 50).

        Use um laço for tradicional com numeros.length para exibir no console a mensagem no formato:

        "Posição [i]: valor". */
        
        Scanner sc = new Scanner(System.in);
        
        int []numSeq = new int[5];
        
        
        for(int i = 0; i < numSeq.length; i++)
        {
            System.out.println("Digite um número para a posição "+i);
            numSeq[i] = sc.nextInt();
        }
        
        for(int i = 0; i<numSeq.length; i++)
        {
            System.out.println("Números digitados: ");
            System.out.println(numSeq[i]);
        }
        
        
    }
    
}
