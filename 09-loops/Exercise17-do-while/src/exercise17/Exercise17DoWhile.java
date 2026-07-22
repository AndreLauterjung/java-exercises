package exercise17;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise17DoWhile
{

    public static void main(String[] args)
    {
        /* Validador de Seleção do Menu: Exiba um menu numérico com as opções 1, 2 e
        3. Se o usuário digitar qualquer número diferente desses três, o programa deve
        informar o erro e refazer a pergunta imediatamente. */
        
        
        Scanner sc = new Scanner(System.in);
        
        boolean isRunning = true;
        int opcaoUsuario;
        
        
        do
        {
            System.out.println("====================================");
            System.out.println("Escolhe uma opção: ");
            System.out.println("1: água");
            System.out.println("2: café: ");
            System.out.println("3: suco de limão");
            opcaoUsuario = sc.nextInt();
            
            System.out.println("====================================");
            
            if(!(opcaoUsuario >=1 && opcaoUsuario <= 3))
            {
                System.out.println("ERRO! DIGITE UMA OPÇÃO VÁLIDA!");
            }
            else
            {
                isRunning = false;
            }
        }
        while(isRunning);

        
    }
    
}
