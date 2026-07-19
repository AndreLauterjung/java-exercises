package exercise02;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise02IfElse
{

    public static void main(String[] args)
    {
       /* Verificação de Escopo Etário: Receba a idade de um cidadão e determine se ele se
        enquadra na categoria de "Maior de Idade" ou "Menor de Idade" conforme a legislação
        vigente. */
        
        Scanner sc = new Scanner(System.in);
        
        int idade = 0;
        
        System.out.println("- - - - Verificando maioridade - - - - -");
        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();
        
        sc.close();
        
        if (idade >= 18) 
        {
            System.out.println("======================");
            System.out.println("Você é maior de idade!");
            System.out.println("======================");
        } 
        else
        {
            System.out.println("======================");
            System.out.println("Você é menor de idade!");
            System.out.println("======================");
        }
         
    }
    
}
