package exercise09;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise09DoWhile
{

    public static void main(String[] args) 
    {
        /* Confirmação Obrigatória de Leitura: Peça ao usuário para digitar uma resposta
        específica de confirmação (ex: digitar a palavra "OK"). O programa deve continuar
        solicitando enquanto o texto for diferente do esperado. */
        
        Scanner sc = new Scanner(System.in);
        
        boolean isRunning = true;
        String respostaUsuario = "";
        
        
        do
        {
            System.out.println("===============================");
            System.out.println("Você quer encerrar o programa? ");
            System.out.println("Digite \"OK\" para prosseguir");
            respostaUsuario = sc.nextLine().toUpperCase();
            
            if(respostaUsuario.equals("OK"))
            {
                System.out.println("\nPROGRAMA ENCERRADO!");
                System.out.println("===============================");
                isRunning = false;
            }
            else
            {
                System.out.println("\nX ! X ! X ! X ! X ! X ! X ! X");
                System.out.println("ERRO! VOCÊ DIGITOU ERRADO");
                System.out.println("TENTE NOVAMENTE!");
                System.out.printf("X ! X ! X ! X ! X ! X ! X ! X\n\n");
            }
            
        }
        while(isRunning );
        
    }
    
}
