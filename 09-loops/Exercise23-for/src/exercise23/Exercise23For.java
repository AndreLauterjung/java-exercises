package exercise23;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise23For
{

    public static void main(String[] args)
    {
        /* Termos da Sequência de Fibonacci: Desenvolva um programa que imprima os
        primeiros termos da sequência de Fibonacci, onde o valor de termos é informado pelo
        usuário. */
        
        Scanner sc = new Scanner(System.in);
        
        int qtdTermos = 1;
        int num1 = 0;
        int num2 = 1;
        int resultado = 0;
        
        System.out.println("============= SEQUÊNCIA DE FIBONACCI ===============");

        for(int i = 1; i <= 35; i++)
        {
            resultado = num1 + num2;
            
            System.out.printf("TERMO Nº: %d  | Valor: %d\n", qtdTermos, resultado);
            qtdTermos++;
            
            num1 = num2;
            num2 = resultado;
         
        }
        
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");
        
    }
    
}
