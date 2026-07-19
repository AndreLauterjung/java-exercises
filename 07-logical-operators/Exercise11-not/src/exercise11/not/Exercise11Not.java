package exercise11.not;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise11Not
{

    public static void main(String[] args)
    {
        /*  Filtro de Valores Positivos: Receba um número inteiro. Utilizando obrigatoriamente o
        operador de negação (!), monte uma expressão que valide a afirmação de que o número
        informado não é negativo. */
        
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        
        System.out.println("- - - Verificação de números positivos - - -");
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        
        sc.close();
        
        boolean isEhNegativo = !(num >= 0);
        
        System.out.println("============================");
        System.out.println("O número é negativo? ");
        System.out.println("Resposta do programa? "+isEhNegativo);
        System.out.println("============================");
         
    }
    
}
