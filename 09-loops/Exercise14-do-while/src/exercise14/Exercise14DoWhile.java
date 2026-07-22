package exercise14;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise14DoWhile
{

    public static void main(String[] args)
    {
        /* Coleta de Nome Não-Vazio: Crie uma rotina que peça o nome do usuário. Utilize o
        do-while para impedir que o sistema avance enquanto o texto digitado for vazio ou
        tiver zero caracteres. */
        
        Scanner sc = new Scanner(System.in);
        
        boolean isRunning = true;
        String nome = "";
        
        
        do
        {
            System.out.println("============== FICHA ==============="); 
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
            System.out.println("====================================");
            
            if(nome.isEmpty() || nome.isBlank())
            {
                System.out.println("ERRO!");
                System.out.println("Não pode enviar vazio ou sem caracteres!");
            }
            else
            {
                System.out.println("PROGRAMA ENCERRADO!");
                System.out.println("====================================");
                isRunning = false;
            }
                
        }
        while(isRunning);
  
    }
    
}
