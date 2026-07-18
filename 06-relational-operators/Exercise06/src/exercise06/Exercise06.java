package exercise06;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise06
{

    public static void main(String[] args)
    {
        /* Idade Mínima: Receba o ano de nascimento de um usuário, 
        calcule sua idade atual baseada no ano vigente e verifique se
        ele possui idade maior ou igual a 18 anos */
        
        Scanner sc = new Scanner(System.in);
        
        int anoAtual = 2026;
        int anoNascimento;
        boolean isMaiorIdade;
        
        System.out.println("********************************");
        System.out.println("Digite o ano de seu nascimeto: ");
        anoNascimento = sc.nextInt();
        
        sc.close();
        System.out.println("*********************************");
        
        isMaiorIdade = anoAtual - anoNascimento >= 18;
        
        
        System.out.println("*********************************");
        System.out.println("Essa pessoa é maior de idade? ");
        System.out.println("Resposta do programa: "+isMaiorIdade);
        System.out.println("**********************************");
        
    }
    
}
