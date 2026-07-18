package exercise56;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise56
{

    public static void main(String[] args)
    {
        /* Validador de Ano Comum: Receba um ano qualquer do teclado. Crie uma lógica
        puramente matemática que retorne um valor boolean verdadeiro apenas se o ano
        informado for divisível por 4. */
        
        Scanner sc = new Scanner(System.in);
        
        int ano;
        boolean isAnoDivisivel;
        
        System.out.println("*************************************");
        System.out.println("Digite o ano (número inteiro): ");
        ano = sc.nextInt();
        
        sc.close();
        System.out.println("*************************************");
        
        isAnoDivisivel = ano % 4 == 0;
        
        System.out.println("**********************************************************");
        System.out.println("O número inteiro correspondente ao ano é divisível por 4? ");
        System.out.println("Resposta do programa: "+isAnoDivisivel);
        System.out.println("**********************************************************");
        
    }
    
}
