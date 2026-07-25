package exercise34;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise34ForBreak
{

    public static void main(String[] args)
    {
        /* Limite de Tentativas Atingido: Crie um loop de validação que permita até 5
        tentativas de login. Caso o usuário acerte o código antes das 5 chances, utilize o
        break para sair da repetição na hora sem rodar as tentativas restantes. */
        
        
        Scanner sc = new Scanner(System.in);
        
        String senha = "abc123";
        String senhaVerifica = "";
        int tentativas = 5;
        
        for(int i = 1; i <= tentativas; i++)
        {
            System.out.println("Digite a senha: ");
            senhaVerifica = sc.nextLine();
            
            if(senhaVerifica.equals(senha))
            {
                System.out.println("LOGIN AUTORIZADO!");
                break;
            }
            else
            {
                if(i == 5)
                {
                    System.out.println("NÚMERO MÁXIMO DE TENTATIVAS ALCANÇADO!");
                    break;
                }
                else
                {
                    System.out.println("TENTE NOVAMENTE!");
                }
            }
            
            
        }
        
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");

    }
    
}
