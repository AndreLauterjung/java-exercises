package exercise15;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise15DoWhile
{

    public static void main(String[] args)
    {
        /* Acúmulo de Experiência (XP): Crie uma rotina para um jogo onde o jogador
        ganha uma quantidade de XP por rodada. Continue solicitando a quantidade de XP
        ganha e somando ao total até que a meta de 1000 pontos seja atingida. */
        
        Scanner sc = new Scanner(System.in);
        
        boolean isRunning = true;
        int xp = 0;
        
        do
        {
            System.out.println("====== SOMANDO XP ========");
            System.out.println("Quanto XP você ganhou na rodada? ");
            xp += sc.nextInt();
            
            if(xp <  0 || xp > 1000)
            {
                System.out.println("PROGRAMA ENCERRADO! ");
                System.out.println("XP TOTAL: "+xp);
                System.out.println("===========================");
                isRunning = false;
            }
            
                
        }
        while(isRunning);
  
    }
    
}
