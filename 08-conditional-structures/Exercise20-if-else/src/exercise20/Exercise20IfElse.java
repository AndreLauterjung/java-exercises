package exercise20;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise20IfElse
{

    public static void main(String[] args)
    {
        /* Mapeador de Dias da Semana: Receba um número inteiro de 1 a 7 e exiba o dia
        correspondente por extenso (1 para Domingo, 2 para Segunda-feira, etc.). Caso o número
e       steja fora desse escopo, exiba "Dia inválido". */
        
        Scanner sc = new Scanner(System.in);
        
        int dia = -1;
        
        
        System.out.println("- - - ORDEM DOS DIAS DA SEMANA - - - -");
        System.out.println("Digite um número para o dia da semana: ");
        dia = sc.nextInt();
        
        sc.close();
        
        if(dia == 1)
        {
            System.out.println("Domingo.");
        }
        else if(dia == 2)
        {
            System.out.println("Segunda-feira.");
        }
        else if(dia == 3)
        {
            System.out.println("Terça-feira.");
        }
        else if(dia == 4)
        {
            System.out.println("Quarta-feira.");
        }
        else if(dia == 5)
        {
            System.out.println("Quinta-feira.");
        }
        else if(dia == 6)
        {
            System.out.println("Sexta-feira.");
        }
        else if(dia == 7)
        {
            System.out.println("Sábado.");
        }
        else
        {
            System.out.println("Dia inválido!");
        }
       
        System.out.println("--------------------------------------");
    }
    
}
