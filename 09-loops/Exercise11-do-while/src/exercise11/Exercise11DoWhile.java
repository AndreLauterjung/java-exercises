package exercise11;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise11DoWhile
{

    public static void main(String[] args)
    {
        /* Simulador de Caixa Eletrônico (Tentativas de PIN): Solicite o PIN de segurança
        ao usuário. Permita a tentativa e valide; se estiver errado, repita a solicitação até
        acertar ou atingir no máximo 3 tentativas (usando o controle do ciclo do-while) */
        
        Scanner sc = new Scanner(System.in);
        
        
        boolean isRunning = true;
        String passwordSystem = "asdf123";
        String passwordUser = "";
        int attemps = 0;
        
        do
        {
            System.out.println("========= LOGIN ==========");
            System.out.println("Password: ");
            passwordUser = sc.nextLine();
            
            
            if(!passwordUser.equals(passwordSystem))
            {
                System.out.println("\nX ! X ! X ! X ! X !");
                System.out.println("ERROR! WRONG PASSWORD!");
                System.out.println("TRY AGAIN!");
                System.out.println("X ! X ! X ! X ! X !\n");
                attemps++;
            }
            else
            {
                System.out.println("LOGIN AUTHORIZED!");
                System.out.println("==========================");
                isRunning = false;
            }
            
            if(attemps == 3)
            {
                System.out.println("\nMAX. ATTEMPS!");
                System.out.println("TRY AGAIN LATER!\n");
                isRunning = false;
                
            }
        } 
        while(isRunning);
          
    }
    
}
