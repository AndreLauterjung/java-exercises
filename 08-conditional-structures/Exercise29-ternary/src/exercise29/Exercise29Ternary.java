package exercise29;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise29Ternary
{

    public static void main(String[] args)
    {
        /* Paridade Direta: Solicite um número inteiro. Atribua o texto "Par" ou "Ímpar" a uma
        variável do tipo String avaliando a expressão matemática do módulo diretamente dentro do
        operador ternário. */ 
        
        Scanner sc = new Scanner(System.in);
        
        int num = -1;
        
        
        System.out.println("- - - - - PAR ou ÍMPAR - - - - - - ");
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        
        sc.close();
        
        
        String resultado = (num % 2==0) ? "É número par!": "É número ímpar!";
        
        System.out.println("===================");
        System.out.println(resultado);
        System.out.println("===================");
        
    }
    
}
