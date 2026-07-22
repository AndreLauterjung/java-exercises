package exercise16;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise16DoWhile
{

    public static void main(String[] args)
    {
        /* Pesquisa de Opinião Pública: Desenvolva um coletor de notas (1 a 5). O
        programa deve processar a nota digitada e perguntar se deseja registrar um novo
        entrevistado, encerrando somente mediante resposta negativa. */
        
        Scanner sc = new Scanner(System.in);
        
        boolean isRunning = true;
        int nota = -1;
        
        
        do
        {
            System.out.println("======= COLETOR DE NOTAS =======");
            System.out.println("Digite uma nota: ");
            nota = sc.nextInt();
            
            if(nota < 0)
            {
                System.out.println("PROGRAMA ENCERRADO! ");
                System.out.println("=========================");
                isRunning = false;
            }
 
        }
        while(isRunning);
        
    }
    
}
